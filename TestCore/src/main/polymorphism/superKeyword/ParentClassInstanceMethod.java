package main.polymorphism.superKeyword;

class AnimalMethod {
	void eat() {
		System.out.println("eating...");
	}
}

class DogMethod extends AnimalMethod {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		eat();
		bark();
	}
}

public class ParentClassInstanceMethod {
	public static void main(String args[]) {
		DogMethod d = new DogMethod();
		d.work();
	}
}
