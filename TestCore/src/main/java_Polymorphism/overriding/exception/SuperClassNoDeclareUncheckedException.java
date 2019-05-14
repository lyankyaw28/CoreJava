package main.java_Polymorphism.overriding.exception;

class SuperClassNoDeclareUncheckedExceptionParent {
	void msg() {
		System.out.println("parent");
	}
}

public class SuperClassNoDeclareUncheckedException extends SuperClassNoDeclareUncheckedExceptionParent {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		SuperClassNoDeclareUncheckedException p = new SuperClassNoDeclareUncheckedException();
		p.msg();
	}
}
