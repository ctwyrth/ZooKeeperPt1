package com.ctwyrth.zookeeper;

public class Mammal {
	// MEMBER VARIABLES
	private int energyLevel = 50;
	
	// CONSTRUCTORS
	public Mammal() {}
	
	public Mammal(int energy) {
		energyLevel = energy;
	}
	
	// GETTERS & SETTERS
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energy) {
		energyLevel = energy;
	}
	
	public int displayEnergy() {
		System.out.printf("This mammal's energy level is %d.\n", this.getEnergyLevel());
		return this.getEnergyLevel();
	}
}
