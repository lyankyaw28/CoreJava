package main.exception_handling.method_overridding_exception_handling;

class Parent1 {
	
	//parent class က exception ကို declare မလုပ္ထားဘူး
	
	void msg() {
		System.out.println("parent");
	}
}

public class SuperClassDoesNotDeclareUncheckedException extends Parent1 {
	// child class ကေတာ့ exception ကို declare လုပ္လိုက္တယ္ အဆင္ေၿပသြားတယ္ ဘာလို႔လဲဆိုေတာ့ unchecked 
	//exception ၿဖစ္ေနလို႔
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent1 p = new SuperClassDoesNotDeclareUncheckedException();
		p.msg();
	}
}
