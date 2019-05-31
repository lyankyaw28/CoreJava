package main.multithreading.demon_thread;

public class NormalDemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		NormalDemonThread t1 = new NormalDemonThread();// creating thread
		NormalDemonThread t2 = new NormalDemonThread();
		NormalDemonThread t3 = new NormalDemonThread();

		t1.setDaemon(true);// now t1 is daemon thread

		t1.start();// starting threads
		t2.start();
		t3.start();
	}
}
