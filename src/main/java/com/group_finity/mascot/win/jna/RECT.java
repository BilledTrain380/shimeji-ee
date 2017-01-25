package com.group_finity.mascot.win.jna;

import com.sun.jna.Structure;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Original Author: Yuki Yamada of Group Finity (http://www.group-finity.com/Shimeji/)
 * Currently developed by Shimeji-ee Group.
 */

public class RECT extends Structure {

	public int left;
	public int top;
	public int right;
	public int bottom;
	public int Width() {
		return this.right-this.left;
	}
	public int Height() {
		return this.bottom-this.top;
	}
	public void OffsetRect(final int dx, final int dy) {
		this.left += dx;
		this.right += dx;
		this.top += dy;
		this.bottom += dy;		
	}

	/**
	 * Return this Structure's field names in their proper order.  For
	 * example,
	 * <pre><code>
	 * protected List getFieldOrder() {
	 *     return Arrays.asList(new String[] { ... });
	 * }
	 * </code></pre>
	 * <strong>IMPORTANT</strong>
	 * When deriving from an existing Structure subclass, ensure that
	 * you augment the list provided by the superclass, e.g.
	 * <pre><code>
	 * protected List getFieldOrder() {
	 *     List fields = new ArrayList(super.getFieldOrder());
	 *     fields.addAll(Arrays.asList(new String[] { ... }));
	 *     return fields;
	 * }
	 * </code></pre>
	 * <p>
	 * Field order must be explicitly indicated, since the
	 * field order as returned by {@link Class#getFields()} is not
	 * guaranteed to be predictable.
	 *
	 * @return ordered list of field names
	 */
	@Override
	protected List<String> getFieldOrder() {
		return Stream.of(
				"left",
				"top",
				"right",
				"bottom"
		).collect(Collectors.toList());
	}
}
