package main.java_Polymorphism.overriding.exception;

/*parent method က child exception ကို ဖမ္းထားၿပီးေတာ့ child class က parent method ထက္
 * ၿမင့္တဲ့ exception ကို ဖမ္းရင္ compile error တက္လိမ့္မယ္*/

class SuperClassDeclareChildExceptionParent {
	void msg() throws ArithmeticException {
		System.out.println("parent");
	}
}

public class SuperClassDeclareChildException extends SuperClassDeclareChildExceptionParent {
	/*
	 * void msg() throws Exception { System.out.println("child"); }
	 */

	public static void main(String args[]) {
		SuperClassDeclareChildException p = new SuperClassDeclareChildException();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
