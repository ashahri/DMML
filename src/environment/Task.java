package environment;

public class Task {
	public String name;
	public Boolean uniformity;
	public Boolean measurability;
	public Boolean quality;
	public Actor player;

	public Task(String name, Boolean uniformity, Boolean measurability, Boolean quality, Actor player) {
		// Setting the name of the instance object to the name variable
		// name = this.toString().substring(0, this.toString().indexOf("@"));
		this.name = name;
		this.uniformity = uniformity;
		this.measurability = measurability;
		this.quality = quality;
		this.player = player;
	}
}
