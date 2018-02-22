package it.shape;


public class Cerchio implements Forma {

	int raggio;
	
	public Cerchio() {}
	
	public Cerchio(int raggio) {
		this.raggio = raggio;
	}
	
	public int calcolaArea() {
		return raggio*raggio*3;
	}

	@Override
	public int calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
