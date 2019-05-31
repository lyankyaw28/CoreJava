package main.inner_class.nested_interface;

interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

public class NormalNestedInterface implements Showable.Message {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		Showable.Message message = new NormalNestedInterface();// upcasting here
		message.msg();
	}
}
