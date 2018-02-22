package it.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReentrantLockDemo {

	public static void main(String[] args) {

		Hole hole = new Hole();

		ProducerEvolution producer = new ProducerEvolution(hole);
		ConsumerEvolution consumer = new ConsumerEvolution(hole);

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(producer);
		executor.submit(consumer);

		// Evidenziamo la registrazione degli oggetti producer e consumer, la loro
		// esecuzione per 10 ms, e lo shutdown dell’Executor che arresta i Thread
		// coinvolti. L’esecuzione della classe demo mostrerà in console lo stesso
		// risultato visto nel precedente capitolo.

		try {
			Thread.sleep(10);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		executor.shutdownNow();
		System.out.println("Shutdown completato");
		
		
		
	}

}
