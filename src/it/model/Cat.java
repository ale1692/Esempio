package it.model;

public class Cat implements Animal {

	@Override
	public void printAnimal() {
		System.out.println("Animal" + this.getClass().getName().toString());

	}

}
