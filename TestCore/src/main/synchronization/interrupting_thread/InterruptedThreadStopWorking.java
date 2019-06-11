package main.synchronization.interrupting_thread;

public class InterruptedThreadStopWorking extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);// second step က sleep တယ္
			System.out.println("task");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted..." + e);
		}

	}

	public static void main(String args[]) {
		InterruptedThreadStopWorking t1 = new InterruptedThreadStopWorking();
		t1.start(); //first setp က စတယ္
		try {
			t1.interrupt();// ေနာက္ဆံုး interrupt လုပ္လိုက္ေတာ့ exception ပစ္သြားလိမ့္မယ္
		} catch (Exception e) {
			System.out.println("Exception handled " + e);
		}

	}
}
