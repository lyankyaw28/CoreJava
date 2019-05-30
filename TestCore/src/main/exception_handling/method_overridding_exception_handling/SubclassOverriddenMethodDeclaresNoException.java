package main.exception_handling.method_overridding_exception_handling;

//parent class က parent exception ကို declare လုပ္ထားမယ္
class SubclassOverriddenMethodDeclaresNoExceptionParent {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

public class SubclassOverriddenMethodDeclaresNoException extends SubclassOverriddenMethodDeclaresNoExceptionParent {
	// child class က ဘယ္exception ကိုမွ declare မလုပ္ထားဘူးဆိုရင္
	// child class ရဲ႕ method ကို အလုပ္လုပ္လိမ့္မယ္
	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		SubclassOverriddenMethodDeclaresNoExceptionParent p = new SubclassOverriddenMethodDeclaresNoException();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
