package main.java_Polymorphism.static_Binding_And_Dynamic_Binding;

public class StaticBinding {
	private void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) {
		StaticBinding d1 = new StaticBinding();
		d1.eat();
	}
}
