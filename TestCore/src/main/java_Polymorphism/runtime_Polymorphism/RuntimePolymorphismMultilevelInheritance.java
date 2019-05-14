package main.java_Polymorphism.runtime_Polymorphism;

class AnimalRuntimePolymorphismMultilevelInheritance {
	void eat() {
		System.out.println("eating");
	}
}

class DogRuntimePolymorphismMultilevelInheritance extends AnimalRuntimePolymorphismMultilevelInheritance {
	void eat() {
		System.out.println("eating fruits");
	}
}

class RuntimePolymorphismMultilevelInheritance extends DogRuntimePolymorphismMultilevelInheritance {
	void eat() {
		System.out.println("drinking milk");
	}

	public static void main(String[] args) {
		AnimalRuntimePolymorphismMultilevelInheritance a1, a2, a3;
		a1 = new AnimalRuntimePolymorphismMultilevelInheritance();
		a2 = new DogRuntimePolymorphismMultilevelInheritance();
		a3 = new RuntimePolymorphismMultilevelInheritance();
		a1.eat();
		a2.eat();
		a3.eat();
	}
}
