package main.polymorphism.finalKeyword;

/*ၿပင္လို႔ မရတာကို သြားၿပင္ထားတို႔ compile time error တက္*/
public class ExampleOfFianlKeyword {
	final int speedlimit = 90;// final variable

	/*
	 * void run() { speedlimit = 400; }
	 */

	public static void main(String args[]) {
		ExampleOfFianlKeyword obj = new ExampleOfFianlKeyword();
		/* obj.run(); */
	}
}
