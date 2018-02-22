package it.multithread;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		CubbyHole cubbyHole = new CubbyHole();

		Producer producer = new Producer(cubbyHole);
		Consumer consumer = new Consumer(cubbyHole);

		producer.start();
		consumer.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		producer.interrupt();
		consumer.interrupt();
		
		
		//Il metodo join() consente di far attendere al Thread principale la terminazione di Producer e Consumer
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
