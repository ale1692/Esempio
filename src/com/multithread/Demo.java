package com.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Demo {

	/*
	 * L’invocazione del metodo start() non comporta l’immediata esecuzione del
	 * Thread, ma la richiesta di registrazione del Thread presso il Thread
	 * Scheduler, il quale può essere parte della JVM oppure del sistema operativo.
	 * Invocare il metodo start() equivale quindi a rendere il Thread eleggibile per
	 * l’esecuzione.
	 * 
	 * Due metodi per creare un Thread. JAva 8: Executor come strato di più alto
	 * livello nella gestione dei Thread. Gli Executor consentendo l’esecuzione di
	 * task asincroni e pool di Thread.
	 * 
	 */

	public static void main(String[] args) {
		Test5();
	}

	private void Test1() {

		ThreadA threadA = new ThreadA();
		threadA.start();

		Thread threadb = new Thread(new ThreadB());
		threadb.start();

	}

	private static void Test2() {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(new Runnable() {
			public void run() {
				String nomeThread = Thread.currentThread().getName();
				System.out.println("Executor con un solo Thread: " + nomeThread);
			}
		});

		/*
		 * Avvia un arresto ordinato in cui vengono eseguite le attività precedentemente
		 * inviate, ma non verranno accettate nuove attività. L'invocazione non ha alcun
		 * effetto aggiuntivo se è già stata chiusa. Questo metodo non attende che le
		 * attività inviate in precedenza completino l'esecuzione. Usa WaitTermination
		 * per farlo.
		 * 
		 */

		try {
			System.out.println("Tentativo shutdown executor");
			executor.shutdown();
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("Shutdown normale non riuscito nel tempo stabilito");
				System.err.println("Invocazione shutdownNow()");
			}
			executor.shutdownNow();
			System.out.println("Shutdown completato");
		}

	}

	private static void Test3() {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(new Runnable() {
			public void run() {
				String threadName = Thread.currentThread().getName();
				System.out.println("Executor Thread A: " + threadName);
			}
		});
		executor.submit(new Runnable() {
			public void run() {
				String threadName = Thread.currentThread().getName();
				System.out.println("Executor Thread B: " + threadName);
			}
		});

		try {
			System.out.println("Tentativo shutdown executor");
			executor.shutdown();
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("Shutdown normale non riuscito nel tempo stabilito");
				System.err.println("Invocazione shutdownNow()");
			}
			executor.shutdownNow();
			System.out.println("Shutdown completato");
		}

	}

	private static void Test4() {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		ScheduledFuture<?> future = executor.schedule(new Runnable() {
			public void run() {
				System.out.println("Scheduling " + Thread.currentThread().getName());
			}
		}, 3, TimeUnit.SECONDS);

		long tempoRimanente = 0;
		while ((tempoRimanente = future.getDelay(TimeUnit.MILLISECONDS)) > 0) {
			System.out.printf("Tempo rimanente all'esecuzione: %sms ", tempoRimanente);
			System.out.println();
		}

	}

	private static void Test5() {

		/*
		 * Un Executor, oltre a riferimenti Runnable, è in grado di utilizzare anche
		 * riferimenti di tipo Callable. La differenza rispetto a Runnable è che
		 * l’interfaccia Callable ha un metodo che ritorna una valore L’aspetto
		 * interessante dell’utilizzo di Callable è la possibilità di monitorare lo
		 * stato di esecuzione di un Thread in un modo semplice ed elegante sfruttando
		 * il metodo isDone() dell’oggetto Future restituito dal submit() dell’Executor.
		 */

		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Integer> future = executor.submit(new Callable<Integer>() {

			public Integer call() throws Exception {
				String threadName = Thread.currentThread().getName();
				System.out.println("Executor con un solo Thread utilizzando Callable: " + threadName);
				TimeUnit.SECONDS.sleep(1);
				return 1;
			}

		});

		while (!future.isDone()) {
			System.out.println("Polling sul Thread: " + future.isDone());
		}

		try {
			System.out.println("Il Thread ha completato il suo lavoro: " + future.get());
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}

	}

}
