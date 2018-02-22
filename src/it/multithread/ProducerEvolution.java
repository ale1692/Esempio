package it.multithread;

public class ProducerEvolution implements Runnable {
	
	private final Hole hole;

	public ProducerEvolution(Hole hole){
           this.hole = hole;
    }

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			hole.lock();
			try {
				if (hole.isEmpty()) {
					hole.setEmpty(false);
					System.out.println("Producer: Inserisco qualcosa nel contenitore");
				}
			} finally {
				hole.unlock();
			}
		}
		System.out.println("Producer: interruzione");
	}

}
