package main.exception_handling.throws_keyword;

import java.io.IOException;

public class NormalThrowsKeyword {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		NormalThrowsKeyword obj = new NormalThrowsKeyword();
		obj.p();
		System.out.println("normal flow...");
	}
}
