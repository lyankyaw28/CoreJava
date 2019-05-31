package main.inner_class.nested_interface;

class A {
	interface Message {
		void msg();
	}
}

public class DeclaredWithinClassNestedInterface implements A.Message {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		A.Message message = new DeclaredWithinClassNestedInterface();// upcasting here
		message.msg();
	}
}
