package it.multithread;

public class ConsumerEvolution implements Runnable {
	
	   private final Hole hole;
	   
	    public ConsumerEvolution( Hole hole){
	       this.hole = hole;
	      }
	 
	    @Override
	    public void run() {
	        while (!Thread.currentThread().isInterrupted()) {
	            hole.lock();
	            try {
	                if (!hole.isEmpty()) {
	                        hole.setEmpty(true);
	                        System.out.println("Consumer: Prelevo qualcosa dal contenitore");
	                }
	            } finally {
	                hole.unlock(); 
	            }
	        }
	        System.out.println("Consumer: interruzione");
	    }
}
