package com.hcl.javaexercises.concurrency;

public class ThreadingObj implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is about to sleep.");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is waking up.");
	}

	public static void main(String[] args) {
		ThreadingObj t1 = new ThreadingObj();
		Thread thread = new Thread(t1, "t1");
		thread.setName("MyThread");
		long startTime = System.currentTimeMillis();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		long executionTime = (endTime - startTime) / 1000;
		System.out.println("Execution Time: " + executionTime + "s");
	}

}
