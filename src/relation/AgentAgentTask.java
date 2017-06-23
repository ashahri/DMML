package relation;
import environment.Agent;
import environment.Task;

public class AgentAgentTask extends Relation {
	public Agent ag1;
	public Agent ag2;
	public Task t;
	public final String rel = "Delegated";

	public AgentAgentTask(Agent ag1, Agent ag2, Task t) {
		this.ag1 = ag1;
		this.ag2 = ag2;
		this.t = t;
	}

}
