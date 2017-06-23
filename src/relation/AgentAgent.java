package relation;
import environment.Agent;
import relation.enumTypes.VisibilityType;

public class AgentAgent extends Relation {
	public Agent ag1;
	public Agent ag2;
	VisibilityType rel;

	public AgentAgent(Agent ag1, Agent ag2, VisibilityType rel) {
		this.ag1 = ag1;
		this.ag2 = ag2;
		this.rel = rel;
	}

}
