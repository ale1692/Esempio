package it.collection;

import java.util.List;

public class DemoCart {

	public static void main(String[] args) {

		ShoppingCartImpl implCart = new ShoppingCartImpl();
		Prodotto p1 = new Prodotto("aaa", 20);
		Prodotto p2 = new Prodotto("bbb", 10);
		implCart.add(p1);
		implCart.add(p2);
		List<Prodotto> list = implCart.getProducts();

//		Iterator<Prodotto> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			Prodotto product = iterator.next();
//			System.out.println(product.getDescription());
//			System.out.println(product.getPrice());
//
//		}
		
		System.out.println("Size lista: " + implCart.getNumberOfProducts());

		for (Prodotto prodotto : list) {
			System.out.println("Prodotto: " + prodotto.getDescription() + " " + prodotto.getPrice());
			
		}
		
		implCart.delete(p1);
		
		System.out.println("Size lista: " + implCart.getNumberOfProducts());
		
		
		
	}

}
