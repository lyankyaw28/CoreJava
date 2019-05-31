package main.multithreading.demon_thread;

public class ExceptionDemonThread extends Thread {
	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Daemon: " + Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		ExceptionDemonThread t1 = new ExceptionDemonThread();
		ExceptionDemonThread t2 = new ExceptionDemonThread();
		t1.start();
		t1.setDaemon(true);// will throw exception here
		t2.start();
	}
}
