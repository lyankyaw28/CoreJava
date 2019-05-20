package main.java_Polymorphism.runtime_polymorphism;

class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw(int i) {
		System.out.println("drawing rectangle..." + i);
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class ShapeOfJavaRuntimePolymorphism {
	public static void main(String args[]) {
		Shape s [] = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		s[0].draw();
		s[1].draw();
		s[2].draw();
	}
}
