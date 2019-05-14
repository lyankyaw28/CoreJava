package main.java_Polymorphism.final_Keyword;

class ExampleOfFinalMethodParent {
	final void run() {
		System.out.println("running");
	}
}

/* ၿပင္လို႔ မရတဲ့ method ကို သြားၿပင္လို႔ compile time error တက္ */
public class ExampleOfFinalMethod extends ExampleOfFinalMethodParent {
	/*
	 * void run() { System.out.println("running safely with 100kmph"); }
	 */

	public static void main(String args[]) {
		ExampleOfFinalMethod honda = new ExampleOfFinalMethod();
		honda.run();
	}
}
