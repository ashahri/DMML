package relation;
import environment.Actor;
import environment.Task;
import relation.enumTypes.TaskActorType;

public class TaskActor extends Relation {
	public Actor ac;
	public Task t;
	public TaskActorType rel;

	public TaskActor(Actor ac, Task t, TaskActorType rel) {
		this.ac = ac;
		this.t = t;
		this.rel = rel;
	}
}
