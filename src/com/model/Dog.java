package com.model;

public class Dog implements Animal {

	@Override
	public void printAnimal() {
		System.out.println("Animal" + this.getClass().getName().toString());
		
	}
	
	

}
