package main.java_Polymorphism.overriding;

class NonMethodOverridingParent {
	void run() {
		System.out.println("Vehicle is running");
	}
}

/*
 * ဒီ example မွာဆိုရင္ overriding method မလုပ္ထားတဲ့အတြက္ child class ရဲ႕
 * method က သူ႕parent ကေရးထားတဲ့အတိုင္း ပဲအလုပ္လုပ္တယ္
 */
public class NonMethodOverriding extends NonMethodOverridingParent {
	public static void main(String[] args) {
		// creating an instance of child class
		NonMethodOverriding obj = new NonMethodOverriding();
		// calling the method with child class instance
		obj.run();
	}
}
