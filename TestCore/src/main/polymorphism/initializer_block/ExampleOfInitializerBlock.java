package main.polymorphism.initializer_block;

public class ExampleOfInitializerBlock {
	int speed;

	ExampleOfInitializerBlock() {
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
	}

	public static void main(String args[]) {
		ExampleOfInitializerBlock b1 = new ExampleOfInitializerBlock();
		ExampleOfInitializerBlock b2 = new ExampleOfInitializerBlock();
	}
}
