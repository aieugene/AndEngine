package org.anddev.andengine.util.spatial;

import org.anddev.andengine.util.spatial.adt.bounds.source.IBoundsSource;


/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 20:23:12 - 07.10.2011
 */
public interface ISpatialItem<S extends IBoundsSource> {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public S getBoundsSource();
}
