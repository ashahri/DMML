package relation;
import environment.Task;

public class TaskTask extends Relation {
	public Task t1, t2;
	public final String rel = "Dependency";

	public TaskTask(Task t1, Task t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
}
