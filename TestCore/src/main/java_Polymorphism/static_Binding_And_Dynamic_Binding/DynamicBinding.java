package main.java_Polymorphism.static_Binding_And_Dynamic_Binding;

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
