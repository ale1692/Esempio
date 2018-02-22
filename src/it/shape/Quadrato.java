package it.shape;



public class Quadrato implements Forma {

	int lato;
	
	public Quadrato() {}
	
	public Quadrato(int lato) {
		this.lato = lato;
	}
	
	public int calcolaArea() {		
		return lato*lato;
	}

	@Override
	public int calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
