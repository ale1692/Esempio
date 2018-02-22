package it.multithread;

public class Producer extends Thread {

	private final CubbyHole cubbyHole;

	public Producer(CubbyHole cubbyHole) {
		this.cubbyHole = cubbyHole;
	}

	@Override
	public void run() {
		while (!isInterrupted()) {
			synchronized (cubbyHole) {
				if (cubbyHole.isEmpty()) {
					cubbyHole.setEmpty(false);
					System.out.println("Producer: Inserisco qualcosa nel contenitore");
				}

				// si cambia il valore della variabile booleana empty per simulare un
				// inserimento, si invoca notifyAll() per notificare il rilascio imminente del
				// lock ai Thread in attesa
				cubbyHole.notifyAll();
				try {

					// passa allo stato di waiting
					cubbyHole.wait();
				} catch (InterruptedException ex) {
					interrupt();
				}
			}
		}
		System.out.println("Producer: interruzione");
	}

}
