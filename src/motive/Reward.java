package motive;

import motive.enumTypes.ElementsType;
import motive.enumTypes.NatureType;
import motive.rewardElements.Policy;
import motive.rewardElements.Strategy;

public class Reward {

	public Policy rewardPolicy;
	public NatureType rewardNature;
	public Strategy rewardStrategy;
	public ElementsType rewardElement;

	public Reward(Policy rewardPolicy, NatureType rewardNature, Strategy rewardStretegy, ElementsType rewardElement) {
		this.rewardPolicy = rewardPolicy;
		this.rewardNature = rewardNature;
		this.rewardStrategy = rewardStretegy;
		this.rewardElement = rewardElement;
		
	}

}
