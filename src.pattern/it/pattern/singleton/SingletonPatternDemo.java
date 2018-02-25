package it.pattern.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		SingleObject objectTest = SingleObject.getInstance();
		int a=SingleObject.CONSTANT;
		System.out.println("Value: " + a);
		String day=String.valueOf(SingleObject.Giorno.GIOVEDI);
		System.out.println("Value: " + day);
		objectTest.showMessage();
		
		ColdDrink drink=ColdDrink.SPRITE;
		String value=drink.getBrandname();
		EnumToString test= new EnumToString(value);
		System.out.println(test.toString());
		
	}
}
