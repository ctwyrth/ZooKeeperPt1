package com.ctwyrth.zookeeper;

public class TestZooKeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla paulie = new Gorilla("Paulie", 100);
		GiantBat guillermo = new GiantBat("Guillermo");
		
		System.out.println("\n--------------- GORILLA --------------- \n");
		
		System.out.println(paulie.throwSomething());
		System.out.println(paulie.eatBananas());
		System.out.println(paulie.throwSomething());
		System.out.println(paulie.throwSomething());
		System.out.println(paulie.climb());
		System.out.println(paulie.eatBananas());
		
		paulie.displayEnergy();
		
		System.out.println("\n--------------- GIANT BAT --------------- \n");
		
		System.out.println(guillermo.attackTown());
		System.out.println(guillermo.eatHumans());
		System.out.println(guillermo.fly());
		System.out.println(guillermo.attackTown());
		System.out.println(guillermo.fly());
		System.out.println(guillermo.eatHumans());
		System.out.println(guillermo.attackTown());
		guillermo.displayEnergy();
	}

}
