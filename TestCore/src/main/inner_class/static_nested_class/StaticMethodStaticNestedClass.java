package main.inner_class.static_nested_class;

public class StaticMethodStaticNestedClass {
	static int data = 30;

	static class Inner {
		static void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		StaticMethodStaticNestedClass.Inner.msg();// no need to create the instance of static nested class
	}
}
