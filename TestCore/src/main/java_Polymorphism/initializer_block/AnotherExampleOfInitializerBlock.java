package main.java_Polymorphism.initializer_block;

class AnotherExampleOfInitializerBlockParent {
	AnotherExampleOfInitializerBlockParent() {
		System.out.println("parent class constructor invoked");
	}
}

public class AnotherExampleOfInitializerBlock extends AnotherExampleOfInitializerBlockParent {
	AnotherExampleOfInitializerBlock() {
		super();
		System.out.println("child class constructor invoked");
	}

	AnotherExampleOfInitializerBlock(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		AnotherExampleOfInitializerBlock b1 = new AnotherExampleOfInitializerBlock();
		AnotherExampleOfInitializerBlock b2 = new AnotherExampleOfInitializerBlock(10);
	}
}
