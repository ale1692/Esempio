package it.pattern.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObject objectTest = SingleObject.getInstance();

		objectTest.showMessage();
	}
}
