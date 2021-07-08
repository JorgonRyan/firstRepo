package com.hcl.javaexercises.concurrency;

public class DemoThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Running Child Thread In Loop:");
		for (int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		DemoThread1 d1 = new DemoThread1(), d2 = new DemoThread1(), d3 = new DemoThread1();
		Thread t1 = new Thread(d1, "t1");
		Thread t2 = new Thread(d2, "t2");
		Thread t3 = new Thread(d3, "t3");
		t1.start();
		t2.start();
		t3.start();
	}

}
