/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package net.java.truelicense.it.json

import net.java.truelicense.it.{CodecTestSuite, PreferencesStoreITContext}
import org.junit.runner._
import org.scalatest.junit._

/** @author Christian Schlichtherle */
@RunWith(classOf[JUnitRunner])
class V2JsonPreferencesStoreIT
extends CodecTestSuite
   with V2JsonTestContext
   with PreferencesStoreITContext