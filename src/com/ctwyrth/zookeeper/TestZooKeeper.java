package com.ctwyrth.zookeeper;

public class TestZooKeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla paulie = new Gorilla("Paulie", 100);
		
		System.out.println(paulie.throwSomething());
		System.out.println(paulie.throwSomething());
		System.out.println(paulie.throwSomething());
		
		System.out.println(paulie.eatBananas());
		System.out.println(paulie.eatBananas());
		
		System.out.println(paulie.climb());
		
		paulie.displayEnergy();
	}

}
