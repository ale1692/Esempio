package com.model;

public class DVD implements Comparable<DVD> {

	String title;
	String genre;
	double price;

	public DVD(String title, String genre, double price) {
		super();
		this.title = title;
		this.genre = genre;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[title=" + this.title + ", genre=" + this.genre + ", price="

				+ this.price + "]";

	}

	@Override
	public int compareTo(DVD object1) {

		int firstCompare = this.getGenre().compareTo(object1.getGenre());

		if (firstCompare != 0) {
			return firstCompare;
		}

		else {

			int secondCompare = ((int) this.getPrice()) - ((int) object1.getPrice());

			if (secondCompare != 0) {
				return secondCompare;
			}

		}
		return 0;

	}

}
