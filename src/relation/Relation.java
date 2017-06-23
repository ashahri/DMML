package relation;

public class Relation {

	public String name;

	public Relation() {

		name = this.toString().substring(0, this.toString().indexOf("@")); //Setting the name of the instance object to the name variable
	}

}
