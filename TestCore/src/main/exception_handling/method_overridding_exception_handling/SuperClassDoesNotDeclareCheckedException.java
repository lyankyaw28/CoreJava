package main.exception_handling.method_overridding_exception_handling;

class Parent {
	//super class က exception ကို declare မလုပ္ခဲ့ဘူးဆိုရင္
	void msg() {
		System.out.println("parent");
	}
}


public class SuperClassDoesNotDeclareCheckedException extends Parent {
	//sub class ရဲ႕ overridden method ကလည္း declare လုပ္လို႔မရႏိုင္ဘူး
	//IO Exception ဆိုတာ checked exception ၿဖစ္ေနလို႔ unchecked exception ဆိုရင္ declare လုပ္လို႔ရတယ္
	/*
	 * void msg() throws IOException { System.out.println("TestExceptionChild"); }
	 */

	public static void main(String args[]) {
		Parent p = new SuperClassDoesNotDeclareCheckedException();
		p.msg();
	}
}
