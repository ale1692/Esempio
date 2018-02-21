package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImpl extends ShoppingCart<Prodotto> {

	

	public ShoppingCartImpl() {
		products = new ArrayList<Prodotto>();
	}

	@Override
	public void add(Prodotto product) {
		products.add(product);

	}

	@Override
	public void delete(Prodotto product) {
		products.remove(product);

	}

	@Override
	public int getNumberOfProducts() {
		
		return products.size();
	}

	@Override
	public List<Prodotto> getProducts() {
		
		return products;
	}

}
