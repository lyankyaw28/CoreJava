package main.java_Polymorphism.runtime_Polymorphism;

class AnimalPolymorphism {
	void eat() {
		System.out.println("eating...");
	}
}

class DogPolymorphism extends AnimalPolymorphism {
	void eat() {
		System.out.println("eating bread...");
	}
}

class CatPolymorphism extends AnimalPolymorphism {
	void eat() {
		System.out.println("eating rat...");
	}
}

class LionPolymorphism extends AnimalPolymorphism {
	void eat() {
		System.out.println("eating meat...");
	}
}

public class AnimalOfJavaRuntimePolymorphism {
	public static void main(String[] args) {
		AnimalPolymorphism a;
		a = new DogPolymorphism();
		a.eat();
		a = new CatPolymorphism();
		a.eat();
		a = new LionPolymorphism();
		a.eat();
	}
}
