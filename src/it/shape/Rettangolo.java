package it.shape;



public class Rettangolo implements Forma {

	int larghezza;
	int lunghezza;
	
	public Rettangolo() {}
	
	public Rettangolo(int larghezza, int lunghezza) {
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
	}
	
	public int calcolaArea() {	
		return this.larghezza*this.lunghezza;
	}

	@Override
	public int calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
