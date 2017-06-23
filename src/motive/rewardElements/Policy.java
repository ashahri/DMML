package motive.rewardElements;

import motive.enumTypes.PerformanceType;
import motive.enumTypes.PolicyType;
import motive.enumTypes.ValueType;

public class Policy {
	public ValueType value;
	public PolicyType type;
	public PerformanceType performanceType;

	public Policy(ValueType value, PolicyType type, PerformanceType performanceType) {
		this.value = value;
		this.type = type;
		this.performanceType = performanceType;
	}
}
