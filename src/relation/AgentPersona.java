package relation;
import environment.Actor;
import environment.Agent;
import environment.Persona;

public class AgentPersona extends Relation {

	public Agent ag;
	public Actor ac;
	public Persona p;
	public final String rel = "Has";

	public AgentPersona(Agent ag, Actor ac, Persona p) {
		this.ag = ag;
		this.ac = ac;
		this.p = p;
	}

	@Override
	public String toString() {
		return ag + " " + ac + " " + p + " " + rel;
	}

}
