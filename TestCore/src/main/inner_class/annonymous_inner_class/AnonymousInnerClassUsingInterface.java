package main.inner_class.annonymous_inner_class;

interface AnonymousInnerClassUsingInterfaceInterface {
	void eat();
}

public class AnonymousInnerClassUsingInterface {
	public static void main(String args[]) {
		AnonymousInnerClassUsingInterfaceInterface e = new AnonymousInnerClassUsingInterfaceInterface() {
			public void eat() {
				System.out.println("nice fruits");
			}
		};
		e.eat();
	}
}
