package main.java_Polymorphism.overriding.exception;

class SuperClassDeclareSameExceptionParent {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

public class SuperClassDeclareSameException extends SuperClassDeclareSameExceptionParent {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		SuperClassDeclareSameException p = new SuperClassDeclareSameException();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
