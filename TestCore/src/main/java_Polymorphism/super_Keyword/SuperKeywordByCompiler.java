package main.java_Polymorphism.super_Keyword;

class AnimalCompiler {
	AnimalCompiler() {
		System.out.println("animal is created");
	}
}

class DogCompiler extends AnimalCompiler {
	DogCompiler() {
		System.out.println("dog is created");
	}
}

public class SuperKeywordByCompiler {
	public static void main(String args[]) {
		DogCompiler d = new DogCompiler();
		/*
		 * ဘာမွေဆာင္ ေခၚစရာမလိုဘူး new object ေဆာက္လိုက္တာနဲ႔ constructor ေတြကို auto
		 * call သြားတယ္
		 */
	}
}
