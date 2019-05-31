package main.multithreading.creating_thread;

public class ImplementatingRunnableInterface implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		ImplementatingRunnableInterface m1 = new ImplementatingRunnableInterface();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
