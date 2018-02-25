package it.pattern.singleton;

public enum ColdDrink {
	PEPSI("Pepsi"), COKE("Coca Cola"), SPRITE("Sprite");
	
	private String brandname;

	private ColdDrink(String brand) {
		this.brandname = brand;
	}

	@Override
	public String toString() {
		return "Brand Name is: " + brandname;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
}
