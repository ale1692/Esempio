package it.generics;

public class Demo {

	/*
	 * l’implementazione in Java dei Generics viene realizzata attraverso la tecnica
	 * nota con il nome di Erasure. Quando viene compilato il codice sorgente, tutti
	 * i parametri di tipo vengono sostituiti dal loro tipo limite che in mancanza
	 * di una specifica diversa è Object.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Bottiglia<Acqua> bottiglia1 = new Bottiglia<Acqua>(new Acqua());
		Bottiglia<Vino> bottiglia2 = new Bottiglia<Vino>(new Vino());
		
		//Errore perchè T extends Bevande
		//Bottiglia<String> bottiglia3 = new Bottiglia<String>(new String());

		BraccioAutomatico braccio = new BraccioAutomatico(bottiglia1);
		braccio.prendiBottiglia(bottiglia1);
		braccio.versaBevanda();
		braccio.prendiBottiglia(bottiglia2);
		braccio.versaBevanda();
		
	}

}
