package relation;
import environment.Actor;

public class ActorActor extends Relation{
public Actor ac1, ac2;
public String rel;

public ActorActor(Actor ac1, Actor ac2, String rel){
	this.ac1=ac1;
	this.ac2=ac2;
	this.rel=rel;
	}
}
