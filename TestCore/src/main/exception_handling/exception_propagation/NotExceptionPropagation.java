package main.exception_handling.exception_propagation;

public class NotExceptionPropagation {
	void m() {
		/*
		 * throw new java.io.IOException("device error");// checked exception
		 */	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		NotExceptionPropagation obj = new NotExceptionPropagation();
		obj.p();
		System.out.println("normal flow");
	}
}
