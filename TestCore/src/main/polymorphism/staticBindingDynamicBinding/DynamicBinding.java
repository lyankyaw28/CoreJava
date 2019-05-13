package main.polymorphism.staticBindingDynamicBinding;

class DynamicBindingParent {
	void eat() {
		System.out.println("animal is eating...");
	}
}

public class DynamicBinding extends DynamicBindingParent {
	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		DynamicBindingParent a = new DynamicBinding();
		a.eat();
	}
}
