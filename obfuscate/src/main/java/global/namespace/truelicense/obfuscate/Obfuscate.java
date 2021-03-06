/*
 * Copyright (C) 2005 - 2019 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package global.namespace.truelicense.obfuscate;

import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated string should get obfuscated at compile time.
 * It is an error if the annotated element does not yield a constant string
 * value.
 *
 * @see    ObfuscatedString
 */
@Target(FIELD)
public @interface Obfuscate { }
