package environment;
import java.util.ArrayList;
import java.util.List;

import relation.Relation;


public class Environment {

	public List<String> valueSet = new ArrayList<String>();
	public List<Task> taskSet;
//	public List<Role> roleSet;
	public List<Goal> goalSet;
	public List<Relation> relationSet;
	public List<Persona> personaSet;
	public List<Agent> agentSet;
	public List<Actor> actorSet;
	
	public Environment(){
//		taskSet = new ArrayList<Task>();
//		actorSet = new ArrayList<Actor>();
//		goalSet = new ArrayList<Goal>();
		
	}
	
	public void addTask(Task task){
		taskSet.add(task);
	}
	
	
	
}
