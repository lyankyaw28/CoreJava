package main.polymorphism.static_binding_and_dynamic_binding;

public class StaticBinding {
	private void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		StaticBinding d1 = new StaticBinding();
		d1.eat();
	}
}
