
package ro.volution.tools.transcript.tests;


import ro.volution.tools.transcript.core.EventCategory;


public enum Categories
			implements
				EventCategory
{
	A (),
	B (),
	C (),
	D ();
	@Override
	public final String identifier () {
		return (this.name ());
	}
}
