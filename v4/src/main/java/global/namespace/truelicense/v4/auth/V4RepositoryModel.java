/*
 * Copyright (C) 2005 - 2019 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package global.namespace.truelicense.v4.auth;

/**
 * A repository model for use with V4 format license keys.
 */
@SuppressWarnings("WeakerAccess")
public final class V4RepositoryModel {

    public String algorithm, artifact, signature;
}
