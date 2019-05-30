package main.exception_handling.try_catch_block;

public class CatchParentClassException {
	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
		}
		// handling the exception by using Exception class
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}