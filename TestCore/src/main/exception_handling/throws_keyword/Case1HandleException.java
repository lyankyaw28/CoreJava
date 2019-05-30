package main.exception_handling.throws_keyword;

import java.io.IOException;

class M {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

public class Case1HandleException {
	public static void main(String args[]) {
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}
