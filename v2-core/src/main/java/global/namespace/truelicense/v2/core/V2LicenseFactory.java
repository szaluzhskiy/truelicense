/*
 * Copyright (C) 2005 - 2019 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package global.namespace.truelicense.v2.core;

import global.namespace.truelicense.api.License;
import global.namespace.truelicense.api.LicenseFactory;

/**
 * A license factory for V2/* format license keys.
 */
final class V2LicenseFactory implements LicenseFactory {

    @Override
    public License license() {
        return new License();
    }

    @Override
    public Class<? extends License> licenseClass() {
        return License.class;
    }
}
