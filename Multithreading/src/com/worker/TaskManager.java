package com.worker;

public class TaskManager implements Runnable{
	private int limit;
	
	public TaskManager(int limit) {
		this.limit = limit;
	}
	
	public void run() {
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of even numbers from 1 to " + limit + " is: "  + sum);
	}
}
