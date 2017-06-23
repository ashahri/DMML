package relation;
import environment.Actor;
import environment.Agent;

public class AgentActor extends Relation {
	public Agent ag;
	public Actor ac;
	public final String rel = "Has";

	public AgentActor(Agent ag, Actor ac) {
		this.ag = ag;
		this.ac = ac;
	}

	@Override
	public String toString() {
		return ag + " " + ac + " " + rel;
	}

}
