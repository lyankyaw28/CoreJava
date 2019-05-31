package main.multithreading.run_method_instead_of_start_method;

public class RunMethodInstadOfStartMethod extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		RunMethodInstadOfStartMethod t1 = new RunMethodInstadOfStartMethod();
		t1.run();// fine, but does not start a separate call stack
	}

}
