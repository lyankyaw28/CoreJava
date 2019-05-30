package main.exception_handling.method_overridding_exception_handling;
//parent class ကလည္း exception ကို declare လုပ္ထားတယ္
class SubclassOverriddenMethodDeclaresSameExceptionParent {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

public class SubclassOverriddenMethodDeclaresSameException extends SubclassOverriddenMethodDeclaresSameExceptionParent {
	//child class ကလည္း same level exception ကို declare လုပ္ထားတယ္ဆိုရင္ child class ရဲ႕ method က
	// အလုပ္လုပ္လိမ့္မယ္
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		SubclassOverriddenMethodDeclaresSameExceptionParent p = new SubclassOverriddenMethodDeclaresSameException();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
