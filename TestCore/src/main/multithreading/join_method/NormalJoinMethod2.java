package main.multithreading.join_method;

public class NormalJoinMethod2 extends Thread {
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
		NormalJoinMethod2 t1 = new NormalJoinMethod2();
		NormalJoinMethod2 t2 = new NormalJoinMethod2();
		NormalJoinMethod2 t3 = new NormalJoinMethod2();
		t1.start();
		try {
			// t1 run လို႔ millisecond 1500 ၿပည့္ရင္ t2 က auto ၀င္ join လိမ့္မယ္
			t1.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}
