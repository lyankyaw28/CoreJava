package main.polymorphism.instanceOfOperator;

class ExampleInstanceof2Parent {
}

public class ExampleInstanceof2 extends ExampleInstanceof2Parent {
	public static void main(String args[]) {
		ExampleInstanceof2 d = new ExampleInstanceof2();
		System.out.println(d instanceof ExampleInstanceof2Parent);// true
	}
}