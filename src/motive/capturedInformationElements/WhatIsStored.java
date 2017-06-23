package motive.capturedInformationElements;

import motive.enumTypes.FrequencyTypes;
import motive.enumTypes.WorkInformationType;

public class WhatIsStored {
	public Boolean personalInformation;
	public FrequencyTypes frequency;
	public WorkInformationType workInformation;

	public WhatIsStored(Boolean personalInforamtion, FrequencyTypes frequency, WorkInformationType workInformation) {
		this.personalInformation = personalInforamtion;
		this.frequency = frequency;
		this.workInformation = workInformation;
	}
}
