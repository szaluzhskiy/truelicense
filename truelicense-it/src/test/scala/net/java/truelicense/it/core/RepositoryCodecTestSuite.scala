/*
 * Copyright (C) 2005-2017 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package net.java.truelicense.it.core

import net.java.truelicense.core.auth.Repository

/** @author Christian Schlichtherle */
abstract class RepositoryCodecTestSuite
extends CodecTestSuite { this: TestContext =>
  override def artifact: AnyRef = {
    val l = license
    val c = managementContext.codec
    val p = vendorManager.parameters
    val a = p.authentication
    val r = p.repository
    a sign (c, r, l)
    r
  }
}
