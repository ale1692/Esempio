package it.shape;


import java.util.ArrayList;
import java.util.List;

public class Canvas {

	List<Forma> forme;
	
	public Canvas() {
		forme = new ArrayList<>();
	}
	
	public int size() {		
		// Obvious Implementation
		return forme.size();
	}

	public void add(Forma f) {
		forme.add(f);
	}

	public boolean contains(Forma f) {		
		return forme.contains(f);
	}

	public int calcolaArea() {
	
		// NOt obvious implementation
		
		int totalArea = 0;
		
		for(Forma f : forme) {
			totalArea += f.calcolaArea();
		}
		
		/*
		return forme.stream()
				.collect(Collectors.summingInt(Forma::calcolaArea));
		*/
		
		return totalArea;
	}

}
