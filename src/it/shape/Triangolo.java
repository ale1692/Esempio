package it.shape;



public class Triangolo implements Forma {

	int base;
	int altezza;
	
	public Triangolo() {}
	
	public Triangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public int calcolaArea() {		
		return this.base*this.altezza/2;
	}

	@Override
	public int calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
