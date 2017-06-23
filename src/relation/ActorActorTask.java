package relation;
import environment.Actor;
import environment.Task;
import relation.enumTypes.CompetitionType;

public class ActorActorTask extends Relation {
public Actor ac1;
public Actor ac2;
public Task t;
public CompetitionType rel;

public ActorActorTask(Actor ac1, Actor ac2, Task t, CompetitionType rel){
	this.ac1=ac1;
	this.ac2=ac2;
	this.t=t;
	this.rel=rel;
}
}
