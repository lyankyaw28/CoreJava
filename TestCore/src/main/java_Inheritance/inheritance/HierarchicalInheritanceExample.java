package main.java_Inheritance.inheritance;

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal1 {
	void meow() {
		System.out.println("meowing...");
	}
}

public class HierarchicalInheritanceExample {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
	}
}
