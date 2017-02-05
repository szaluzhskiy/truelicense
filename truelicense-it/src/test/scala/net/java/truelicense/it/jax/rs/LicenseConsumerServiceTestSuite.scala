/*
 * Copyright (C) 2005-2017 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package net.java.truelicense.it.jax.rs

import net.java.truelicense.it.core.TestContext
import net.java.truelicense.ws.rs.{LicenseConsumerService, LicenseConsumerServiceException}
import org.scalatest.Matchers._
import org.scalatest.WordSpec

/** @author Christian Schlichtherle */
abstract class LicenseConsumerServiceTestSuite
extends WordSpec { this: TestContext =>

  "A license consumer service" when {
    "using a license consumer manager" when {
      lazy val manager = consumerManager
      lazy val reference = new LicenseBeanAndKeyHolder(vendorManager, license)
      lazy val service = new LicenseConsumerService(manager)

      "no license key is installed" should {
        "return its subject" in {
          service.subject should be (manager.subject)
        }

        "return its subject encoded as JSON" in {
          service.subjectAsJson should be ('"' + manager.subject + '"')
        }

        "return its subject encoded as XML" in {
          service.subjectAsXml.getValue should be (manager.subject)
        }

        "fail to view the license key in" in {
          intercept[LicenseConsumerServiceException] (service view false)
        }

        "fail to verify and view the license key in" in {
          intercept[LicenseConsumerServiceException] (service view true)
        }
      }

      "installing a license key" should {
        "install the license key" in {
          service install reference.key
        }

        "view the license key in" in {
          (service view false) should equal (reference.bean)
        }

        "verify and view the license key in" in {
          (service view true) should equal (reference.bean)
        }
      }

      "uninstalling the license key again" should {
        "uninstall the license key" in {
          service uninstall ()
        }

        "fail to view the license key in" in {
          intercept[LicenseConsumerServiceException] (service view false)
        }

        "fail to verify and view the license key in" in {
          intercept[LicenseConsumerServiceException] (service view true)
        }
      }
    }
  }
}
