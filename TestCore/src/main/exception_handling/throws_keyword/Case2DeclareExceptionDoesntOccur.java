package main.exception_handling.throws_keyword;

import java.io.IOException;
//A)Program if exception does not occur
class M2 {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

public class Case2DeclareExceptionDoesntOccur {

	public static void main(String args[]) throws IOException {// declare exception
		M2 m = new M2();
		m.method();

		System.out.println("normal flow...");
	}
}
