package main.java_Polymorphism.super_keyword;

class AnimalVariable {
	String color = "white";
}

class DogVariable extends AnimalVariable {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}

public class ParentClassInstanceVariable {
	public static void main(String args[]) {
		DogVariable d = new DogVariable();
		d.printColor();
	}
}
