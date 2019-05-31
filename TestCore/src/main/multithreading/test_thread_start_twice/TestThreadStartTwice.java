package main.multithreading.test_thread_start_twice;

public class TestThreadStartTwice extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		TestThreadStartTwice t1 = new TestThreadStartTwice();
		t1.start();
		t1.start();
	}
}
