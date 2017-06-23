package motive;

import motive.capturedInformationElements.WhatIsStored;
import motive.enumTypes.VisibilityType;

public class CapturedInformation {
	public VisibilityType visibility;
	public WhatIsStored whatIsStored;

	public CapturedInformation(VisibilityType visibility, WhatIsStored whatIsStored) {
		this.visibility = visibility;
		this.whatIsStored = whatIsStored;
	}
}
