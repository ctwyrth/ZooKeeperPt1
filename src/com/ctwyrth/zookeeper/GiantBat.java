package com.ctwyrth.zookeeper;

public class GiantBat extends Mammal {
	// MEMBER VARIABLES
	private String batName;
	
	// CONSTRUCTORS
	public GiantBat(String name) {
		super(300);
		batName = name;
	}
	
	// SETTERS & GETTERS
	public String getBatName() {
		return batName;
	}

	public void setBatName(String batName) {
		this.batName = batName;
	}

	// MEMBER METHODS
	public String fly() {
		super.setEnergyLevel(super.getEnergyLevel() - 50);
		return String.format("%s spreads its massive wings and leaps into the air.", this.getBatName());
	}
	
	public String eatHumans() {
		super.setEnergyLevel(super.getEnergyLevel() + 25);
		return String.format("%s careens down from the sky, grasps a villager with its taloned feet and sinks its fangs into their neck.", this.getBatName());
	}
	
	public String attackTown() {
		super.setEnergyLevel(super.getEnergyLevel() - 100);
		return String.format("%s decimates a small water front town with aerial bombardments of gargantuan gauno.", this.getBatName());
	}
	
}
