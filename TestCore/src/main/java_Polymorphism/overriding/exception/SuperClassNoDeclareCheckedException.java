package main.java_Polymorphism.overriding.exception;

/*compile time error တက္မယ္ ဘာလို႔လဲဆိုေတာ့ checked exception ၿဖစ္ေနလို႔*/
class SuperClassNoDeclareExceptionParent {
	void msg() {
		System.out.println("parent");
	}
}

public class SuperClassNoDeclareCheckedException extends SuperClassNoDeclareExceptionParent {
	/*
	 * void msg() throws IOException { System.out.println("TestExceptionChild"); }
	 */

	public static void main(String args[]) {
		SuperClassNoDeclareCheckedException p = new SuperClassNoDeclareCheckedException();
		p.msg();
	}
}
