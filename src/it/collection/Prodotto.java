package it.collection;

public class Prodotto {

	protected String description;
	protected float price;

	public Prodotto(String description, float price){
        this.description = description;
        this.price=price;
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
}
