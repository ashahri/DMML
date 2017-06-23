package motive.rewardElements;

import motive.enumTypes.ChanceOfWinningType;
import motive.enumTypes.PointsType;
import motive.enumTypes.ReinforcementType;
import motive.enumTypes.ValueType;

public class Strategy {
	public Boolean transparency;
	public ValueType value;
	public ChanceOfWinningType chanceOfWinning;
	public PointsType points;
	public ReinforcementType reinforcement;

	public Strategy(Boolean transparency, ValueType value, ChanceOfWinningType chanceOfWinning, PointsType points, ReinforcementType reinforcement){
		this.transparency=transparency;
		this.value=value;
		this.chanceOfWinning=chanceOfWinning;
		this.points=points;
		this.reinforcement=reinforcement;
		
	}
	
	
}
