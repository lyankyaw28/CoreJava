package main.exception_handling.try_catch_block;

public class CatchWrongGeneratedException {
	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception

		}
		// try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
