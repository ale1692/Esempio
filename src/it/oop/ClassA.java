package it.oop;

public class ClassA {

	private int a;

	public ClassA() {
        
        this.a = 333;
	}

	public void setA(int value) {
		a = value;
	}

	public int getA() {
		return a;
	}
	
	public String stampa() {
		
		return ("Stampa " + getClass().getName());
	}

}
