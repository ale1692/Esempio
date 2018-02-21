package com.generics;

public class BraccioAutomatico {

	private Bottiglia<? extends Bevanda> bottiglia;

	public BraccioAutomatico(Bottiglia<? extends Bevanda> bottiglia) {
		super();
		this.bottiglia = bottiglia;
	}

	public void versaBevanda() {
		if (bottiglia != null)
			System.out.println("Versa " + bottiglia.getContenuto().toString());
		else
			System.out.println("Bottiglia vuota");
	}

	public void prendiBottiglia(Bottiglia<? extends Bevanda> bottiglia) {
		System.out.println("Ho preso" + bottiglia.getContenuto());
	}

}
