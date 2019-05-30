package main.exception_handling.method_overridding_exception_handling;

class SubclassOverriddenMethodDeclaresParentExceptionParent {
	//parent class ထဲမွာေတာ့ child exception ကိုေၾကညာထားၿပီးေတာ့ 
	void msg() throws ArithmeticException {
		System.out.println("parent");
	}
}

public class SubclassOverriddenMethodDeclaresParentException
		extends SubclassOverriddenMethodDeclaresParentExceptionParent {
	//sub class ထဲမွာက parent exception ကိုေၾကညာထားတဲ့အတြက္ compile time error တက္လိမ့္မယ္
	/*
	 * void msg() throws Exception { System.out.println("child"); }
	 */

	public static void main(String args[]) {
		SubclassOverriddenMethodDeclaresParentExceptionParent p = new SubclassOverriddenMethodDeclaresParentException();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
