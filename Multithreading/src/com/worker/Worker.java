package com.worker;

public class Worker extends Thread{
	private String msg;
	private int numIter;
	
	public Worker(String msg, int numIter) {
		this.msg = msg;
		this.numIter = numIter;
	}
	
	public void run() {
		for (int i = 0; i <= numIter; i++) {
			System.out.println(getName() + " - " + msg + " (" + i + ")");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " Interrupted");
			}
		} 
	}
}
