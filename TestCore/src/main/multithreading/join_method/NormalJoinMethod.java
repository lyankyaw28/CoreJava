package main.multithreading.join_method;

public class NormalJoinMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		NormalJoinMethod t1 = new NormalJoinMethod();
		NormalJoinMethod t2 = new NormalJoinMethod();
		NormalJoinMethod t3 = new NormalJoinMethod();
		t1.start();
		t2.start();
		t3.start();
	}
}
