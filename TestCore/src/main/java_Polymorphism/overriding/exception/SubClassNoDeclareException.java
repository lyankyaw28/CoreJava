package main.java_Polymorphism.overriding.exception;

class SubClassNoDeclareExceptionParent {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

public class SubClassNoDeclareException extends SubClassNoDeclareExceptionParent {
	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		SubClassNoDeclareException p = new SubClassNoDeclareException();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
