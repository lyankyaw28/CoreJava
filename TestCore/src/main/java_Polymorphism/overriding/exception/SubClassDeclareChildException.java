package main.java_Polymorphism.overriding.exception;

class SubClassDeclareChildExceptionParent {
	// parent method with parent exception
	void msg() throws Exception {
		System.out.println("parent");
	}
}

public class SubClassDeclareChildException extends SubClassDeclareChildExceptionParent {
	// sub method with sub exception
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		SubClassDeclareChildException p = new SubClassDeclareChildException();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
