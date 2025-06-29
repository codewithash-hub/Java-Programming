package com.worker;

public class Main {
	public static void main(String[] args) {
		Worker wrk1 = new Worker("Processing A", 5);
		Worker wrk2 = new Worker("Processing", 3);
		
		// Create TaskManager threat
		Thread taskManagerThread = new Thread(new TaskManager(1000));
		
		// Start all threads
		wrk1.start();
		wrk2.start();
		taskManagerThread.start();
		
		// Wait for all threadds to finish using joins
		try {
			wrk1.join();
			wrk2.join();
			taskManagerThread.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrpted: " + e.getMessage());
		}
		System.out.println("All threads have completed. Main thread exiting.");
	}
}
