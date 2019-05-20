package main.java_Polymorphism.super_keyword;

/*java compiler က ပံုမွန္အားၿဖင့္ကို class တစ္ခုေဆာက္တိုင္း default constructor နဲ႔ super ဆိုၿပီး
 * constructor 2 ခုကို auto ထည့္ေပး*/
class AnimalConstructor {
	AnimalConstructor() {
		System.out.println("animal is created");
	}
}

class DogConstructor extends AnimalConstructor {
	DogConstructor() {
		super();
		System.out.println("dog is created");
	}
}

public class ParentClassInstanceConstructor {
	public static void main(String args[]) {
		DogConstructor d = new DogConstructor();
	}
}
