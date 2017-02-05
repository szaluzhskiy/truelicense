/*
 * Copyright (C) 2005-2017 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package net.java.truelicense.core;

import java.security.GeneralSecurityException;

/**
 * Indicates an issue when
 * {@linkplain LicenseVendorManager#create creating},
 * {@linkplain LicenseConsumerManager#install installing},
 * {@linkplain LicenseConsumerManager#view viewing},
 * {@linkplain LicenseConsumerManager#verify verifying} or
 * {@linkplain LicenseConsumerManager#uninstall uninstalling} a license key.
 *
 * @author Christian Schlichtherle
 */
public class LicenseManagementException extends GeneralSecurityException {

    private static final long serialVersionUID = 1L;

    public LicenseManagementException() { }

    public LicenseManagementException(Throwable cause) { super(cause); }

    /**
     * Returns {@code true} if this exception is considered confidential and
     * should not be shared with users.
     * <p>
     * The implementation in the class {@code LicenseManagementException}
     * returns {@code true}.
     *
     * @since TrueLicense 2.3
     */
    public boolean isConsideredConfidential() { return true; }
}
