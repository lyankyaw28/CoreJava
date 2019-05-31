package main.multithreading.run_method_instead_of_start_method;

public class ProblemRunMethodInstadOfStartMethod extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ProblemRunMethodInstadOfStartMethod t1 = new ProblemRunMethodInstadOfStartMethod();
		ProblemRunMethodInstadOfStartMethod t2 = new ProblemRunMethodInstadOfStartMethod();

		t1.run();
		t2.run();
	}
}
