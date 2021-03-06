/*******************************************************************************
 * Copyright (c) 2016 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui.text;

import com.googlecode.goclipse.tooling.tools.GoFindDocOperation;
import com.googlecode.goclipse.ui.actions.GoOpenDefinitionOperation;

import melnorme.lang.ide.ui.editor.hover.AbstractDocDisplayInfoSupplier;
import melnorme.lang.tooling.LANG_SPECIFIC;
import melnorme.lang.tooling.common.ISourceBuffer;
import melnorme.lang.tooling.toolchain.ops.AbstractToolOperation;

@LANG_SPECIFIC
public class DocDisplayInfoSupplier extends AbstractDocDisplayInfoSupplier {
	
	public DocDisplayInfoSupplier(ISourceBuffer sourceBuffer, int offset) {
		super(sourceBuffer, offset);
	}
	
	@Override
	protected AbstractToolOperation<String> getFindDocOperation(ISourceBuffer sourceBuffer, int offset) {
		return new GoFindDocOperation(
			GoOpenDefinitionOperation.getFindDefinitionOperation(sourceBuffer, offset));
	}
	
}