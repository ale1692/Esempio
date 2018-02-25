package it.pattern.singleton;

public class EnumToString {
    
	
	private enum Weekdays {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	private int numberEnum;
	private String day;
	private String drink;
	
	public EnumToString(String drink) {
		day=String.valueOf(Weekdays.WEDNESDAY);
		this.drink=drink;
		this.numberEnum=searchEnum(drink);
	}
	
	private int searchEnum(String drink) {
		
		ColdDrink [] vector=ColdDrink.values();
		
		return vector.length;
	}
	
	@Override
	public String toString() {
		
		return ("Value WeekDay: " + day + " Drink: " + drink + " Size: " + numberEnum);
	}	
	
	
	
}
