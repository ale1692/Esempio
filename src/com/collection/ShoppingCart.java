package com.collection;

import java.util.List;

public abstract class ShoppingCart<T> {

	protected List<T> products;

	public abstract void add(T product);

	public abstract void delete(T product);

	public abstract int getNumberOfProducts();

	public abstract List<T> getProducts();

}