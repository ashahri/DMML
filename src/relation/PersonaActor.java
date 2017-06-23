package relation;
import environment.Actor;
import environment.Persona;

public class PersonaActor extends Relation{
	public Actor ac;
	public Persona p;
	public String rel;
	
	public PersonaActor(Actor ac, Persona p, String rel){
		this.ac=ac;
		this.p=p;
		this.rel=rel;
	}

	
	
	
}
