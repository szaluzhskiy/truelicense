/*
 * Copyright (C) 2005-2017 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package net.java.truelicense.core.auth;

/**
 * Provides authentication parameters.
 *
 * @author Christian Schlichtherle
 */
public interface AuthenticationParametersProvider {

    /** Returns the authentication parameters. */
    AuthenticationParameters parameters();
}
