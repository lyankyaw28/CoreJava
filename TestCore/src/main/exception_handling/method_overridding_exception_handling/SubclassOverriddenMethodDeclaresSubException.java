package main.exception_handling.method_overridding_exception_handling;

//parent class မွာက parent exception ကိုေၾကညာထားမယ္
class SubclassOverriddenMethodDeclaresSubExceptionParent {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

public class SubclassOverriddenMethodDeclaresSubException extends SubclassOverriddenMethodDeclaresSubExceptionParent {
	//child class မွာက child exception ကို declare လုပ္ထားမယ္ဆိုရင္
	//parent method က အလုပ္လုပ္လိမ့္မယ္
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		SubclassOverriddenMethodDeclaresSubExceptionParent p = new SubclassOverriddenMethodDeclaresSubExceptionParent();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
