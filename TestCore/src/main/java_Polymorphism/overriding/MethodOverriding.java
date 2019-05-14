package main.java_Polymorphism.overriding;

class MethodOverridingParent {
	void run() {
		System.out.println("Vehicle is running");
	}
}

public class MethodOverriding extends MethodOverridingParent {
	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();// creating object
		obj.run();// calling method
	}
}
