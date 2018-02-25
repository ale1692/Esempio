package it.pattern.singleton;

public class SingleObject {

	private static SingleObject instance = new SingleObject();
	public static final int CONSTANT=10;
	public enum Giorno { LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA };
	
	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

}
