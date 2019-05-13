package main.polymorphism.overloading;

class ChangingDataTypeOfArguments1 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

public class ChangingDataTypeOfArguments {
	public static void main(String[] args) {
		System.out.println(ChangingDataTypeOfArguments1.add(11, 11));
		System.out.println(ChangingDataTypeOfArguments1.add(12.3, 12.6));
	}
}
