package it.multithread;

public class Consumer extends Thread {

	private final CubbyHole cubbyHole;

	public Consumer(CubbyHole cubbyHole) {
		this.cubbyHole = cubbyHole;
	}

	@Override
	public void run() {
		while (!isInterrupted()) {
			synchronized (cubbyHole) {
				if (!cubbyHole.isEmpty()) {
					cubbyHole.setEmpty(true);
					System.out.println("Consumer: Prelevo qualcosa dal contenitore");
				}
				cubbyHole.notifyAll();
				try {
					cubbyHole.wait();
				} catch (InterruptedException ex) {
					if (!cubbyHole.isEmpty()) {
						cubbyHole.setEmpty(true);
					}
					interrupt();
				}
			}
		}
		System.out.println("Consumer: interruzione");
	}

}
