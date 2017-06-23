package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import environment.Actor;
import environment.Environment;
import environment.Task;
import motive.CapturedInformation;
import motive.Motive;
import motive.Reward;
import motive.Technique;
import motive.capturedInformationElements.WhatIsStored;
import motive.enumTypes.ChanceOfWinningType;
import motive.enumTypes.ElementsType;
import motive.enumTypes.FrequencyTypes;
import motive.enumTypes.NatureType;
import motive.enumTypes.PerformanceType;
import motive.enumTypes.PointsType;
import motive.enumTypes.PolicyType;
import motive.enumTypes.ReinforcementType;
import motive.enumTypes.ValueType;
import motive.enumTypes.VisibilityType;
import motive.enumTypes.WorkInformationType;
import motive.rewardElements.Policy;
import motive.rewardElements.Strategy;

public class App {

	public static void main(String[] args) {
		System.out.println("Please choose analysis");
		System.out.println(
				"This application is designed to analyse a given environment and "
				+ "\nthe digital motivation you are planning to add to the environment.");
		System.out.println("Please choose action:\n1: Analysis for workplace intimidation");
		
		Scanner reader = new Scanner(System.in);

		int tmp = reader.nextInt();
		reader.close();

		// create the list of actors
		List<Actor> actorsList = new ArrayList<Actor>();
		// create list of tasks
		List<Task> taskList = new ArrayList<Task>();

		
		Environment itDepartement = new Environment();

		itDepartement.valueSet.add("Collaboration");
		
		/* Here is the built of the motive */
		Policy leadPolicy = new Policy(ValueType.HIGH, PolicyType.COMPETITION, PerformanceType.GROUP);
		Strategy leadStrategy = new Strategy(true, ValueType.LOW, ChanceOfWinningType.LOW, PointsType.PREDEFINED,
				ReinforcementType.POSITIVE);
		WhatIsStored wis = new WhatIsStored(false, FrequencyTypes.HIGH, WorkInformationType.DETAILED);
		CapturedInformation ci = new CapturedInformation(VisibilityType.RELEVANT, wis);

		Reward leadReward = new Reward(leadPolicy, NatureType.INTANGIBLE, leadStrategy,
				ElementsType.SOCIAL_RECOGNITION);

		Technique tech = new Technique(false, false, false, true, true, true, false);

		Motive m = new Motive(leadReward, tech, ci);



		// System.out.println(itDepartement.valueSet.get(0).toString());

		if (tmp == 1 && itDepartement.valueSet.get(0) == "Collaboration") {

			if (m.reward.rewardPolicy.performanceType.equals(PerformanceType.GROUP)
					&& m.capturedInformation.whatIsStored.workInformation.equals(WorkInformationType.DETAILED)
					&& m.capturedInformation.visibility.equals(VisibilityType.RELEVANT)) {
				System.out.println("Based on the given environment and the motives "
						+ "you have decided to add,\nThere is a risk of workplace intimidation");
			}

		} else {
			System.out.println("No Risk Found");
		}

		
		
		
		
		
		
		// Actor teacher = new Actor("Ali");
		//
		// // Task teaching = new Task("class",true, true, false, teacher);
		// taskList.add(addTask("teaching", true, true, false, teacher));
		//
		// if (taskList.get(0).measurability == true) {
		// System.out.println("success");
		// } else {
		// System.out.println("fail");
		// }

		// Scanner reader = new Scanner(System.in);
		//
		// actorsList.add(addActor(reader.next()));
		// reader.close();
		//
		// System.out.println(actorsList.get(0).name);
		//
		// System.out.println("done");

	}

	// method for adding an actor
	public static Actor addActor(String name) {
		Actor n = new Actor(name);
		return n;
	}

	// method for adding a task
	public static Task addTask(String name, Boolean uniformity, Boolean measurability, Boolean quality, Actor player) {
		Task t = new Task(name, uniformity, measurability, quality, player);

		return t;
	}

}
