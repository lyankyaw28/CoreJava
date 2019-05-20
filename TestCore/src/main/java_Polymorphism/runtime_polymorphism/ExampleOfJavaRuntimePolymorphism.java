package main.java_Polymorphism.runtime_polymorphism;

class ExampleOfJavaRuntimePolymorphismParent {
	void run() {
		System.out.println("running");
	}
}

public class ExampleOfJavaRuntimePolymorphism extends ExampleOfJavaRuntimePolymorphismParent {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		ExampleOfJavaRuntimePolymorphismParent b = new ExampleOfJavaRuntimePolymorphism();// upcasting
		b.run();
	}
}
