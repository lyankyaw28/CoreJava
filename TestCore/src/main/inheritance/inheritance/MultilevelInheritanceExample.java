package main.inheritance.inheritance;

class Human {
	void eat() {
		System.out.println("eating...");
	}
}

class Student extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class Male extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}

public class MultilevelInheritanceExample {
	public static void main(String[] args) {
		Male d = new Male();
		d.weep();
		d.bark();
		d.eat();

	}
}
