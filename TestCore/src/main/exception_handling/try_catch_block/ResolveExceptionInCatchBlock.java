package main.exception_handling.try_catch_block;

public class ResolveExceptionInCatchBlock {
	public static void main(String[] args) {
		int i = 50;
		int j = 0;
		int data;
		try {
			data = i / j; // may throw exception
		}
		// handling the exception
		catch (Exception e) {
			// resolving the exception in catch block
			System.out.println(i / (j + 2));
		}
	}
}
