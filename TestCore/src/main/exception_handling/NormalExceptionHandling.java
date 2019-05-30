package main.exception_handling;

public class NormalExceptionHandling {
	public static void main(String args[]) {
		try {
			// ေအာက္က code က exception တက္လိမ့္မယ္
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}
