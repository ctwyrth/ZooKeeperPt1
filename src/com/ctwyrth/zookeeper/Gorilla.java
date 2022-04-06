package com.ctwyrth.zookeeper;

public class Gorilla extends Mammal {
	// MEMBER VARIABLES
	private String gorillaName = new String();
	
	// CONSTRUCTORS
	public Gorilla(String name, int energy) {
		super(energy);
		gorillaName = name;
	}
	
	// GETTERS & SETTERS
	public String getGorillaName() {
		return gorillaName;
	}
	
	public void setGorillaName(String name) {
		gorillaName = name;
	}
	
	// METHODS
	public String throwSomething() {
		super.setEnergyLevel(super.getEnergyLevel() - 5);
		return String.format("%s picks up some questionable material from the enclosure floor and flings it at you.", this.getGorillaName());
	}
	
	public String eatBananas() {
		super.setEnergyLevel(super.getEnergyLevel() + 10);
		return String.format("%s eats a few ripe bananas and seems satisfied.", this.getGorillaName());
	}
	
	public String climb() {
		super.setEnergyLevel(super.getEnergyLevel() - 10);
		return String.format("%s climbs up a tree in the enclosure.", this.getGorillaName());
	}
}
