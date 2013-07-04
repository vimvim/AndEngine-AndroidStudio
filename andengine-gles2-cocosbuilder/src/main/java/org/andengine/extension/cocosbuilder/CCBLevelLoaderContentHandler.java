package org.andengine.extension.cocosbuilder;

import java.util.HashMap;

import org.andengine.util.level.IEntityLoader;
import org.andengine.util.level.LevelLoaderContentHandler;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 15:25:56 - 19.04.2012
 */
public class CCBLevelLoaderContentHandler extends LevelLoaderContentHandler<CCBEntityLoaderData, ICCBEntityLoaderListener, CCBLevelLoaderResult> {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public CCBLevelLoaderContentHandler(final HashMap<String, IEntityLoader<CCBEntityLoaderData>> pCCBEntityLoaders, final IEntityLoader<CCBEntityLoaderData> pDefaultCCBEntityLoader, final CCBEntityLoaderData pCCBEntityLoaderData, final ICCBEntityLoaderListener pCCBEntityLoaderListener) {
		super(pDefaultCCBEntityLoader, pCCBEntityLoaders, pCCBEntityLoaderData, pCCBEntityLoaderListener);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public CCBLevelLoaderResult getLevelLoaderResult() {
		return new CCBLevelLoaderResult(this.mRootEntity);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
