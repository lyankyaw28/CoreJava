package main.synchronization.synchronized_method;
//ဒါက ရိုးရိုး thread ပဲ synchronization method ကို မသံုးထားေသး
class Table {
	void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);//output တစ္ခါထုတ္ၿပီးတိုင္း 400 နား
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread1 extends Thread {
	Table t;//အေပၚက class

	MyThread1(Table t) {//constructor
		this.t = t;
	}

	public void run() {
		t.printTable(5);//အေပၚက output method ကို လွမ္းေခၚလိုက္တာ
	}

}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class NoSnychronizedMethod {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
