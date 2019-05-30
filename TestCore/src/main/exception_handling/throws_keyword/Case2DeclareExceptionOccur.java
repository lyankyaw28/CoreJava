package main.exception_handling.throws_keyword;

import java.io.IOException;

//B)Program if exception occurs
class M3 {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class Case2DeclareExceptionOccur {
	public static void main(String args[]) throws IOException {// declare exception
		M3 m = new M3();
		m.method();

		System.out.println("normal flow...");
	}
}
