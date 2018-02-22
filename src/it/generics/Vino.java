package it.generics;

public class Vino implements Bevanda<Vino> {
	
	@Override
	public String toString() {
		
		return " una bottiglia di vino";
	}

}
