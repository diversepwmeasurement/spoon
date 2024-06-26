/*
 * SPDX-License-Identifier: (MIT OR CECILL-C)
 *
 * Copyright (C) 2006-2023 INRIA and contributors
 *
 * Spoon is available either under the terms of the MIT License (see LICENSE-MIT.txt) or the Cecill-C License (see LICENSE-CECILL-C.txt). You as the user are entitled to choose the terms under which to adopt Spoon.
 */
package spoon.testing;

import spoon.reflect.declaration.CtElement;

public class CtElementAssert extends AbstractCtElementAssert<CtElementAssert> {
	protected CtElementAssert(CtElement actual) {
		super(actual, CtElementAssert.class);
	}
}
