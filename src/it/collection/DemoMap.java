package it.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class DemoMap {

	public static void main(String[] args) {

		HashMap<Integer, String> classifica1 = new HashMap<Integer, String>();
		classifica1.put(1, "Juventus");
		classifica1.put(2, "Napoli");
		classifica1.put(3, "Roma");
		classifica1.put(4, "Inter");

		for (Integer key : classifica1.keySet()) {
			System.out.println(classifica1.get(key));
		}

		TreeMap<Integer, String> classifica2 = new TreeMap<Integer, String>();
		classifica2.put(1, "Juventus");
		classifica2.put(2, "Napoli");
		classifica2.put(3, "Roma");
		classifica2.put(4, "Inter");

		for (Integer key : classifica2.keySet()) {
			System.out.println(classifica2.get(key));
		}

	}

}
