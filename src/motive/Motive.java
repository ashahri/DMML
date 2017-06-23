package motive;

import java.util.List;

import environment.Task;

public class Motive {
	public Reward reward;
	public Technique technique;
	public CapturedInformation capturedInformation;
	public List<Task> task;

	public Motive(Reward reward, Technique technique, CapturedInformation capturedInformation) {
		this.reward = reward;
		this.technique = technique;
		this.capturedInformation = capturedInformation;
	}
}
