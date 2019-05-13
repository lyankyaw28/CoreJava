package main.polymorphism.initializerBlock;

/*parent constructor အလုပ္လုပ္
 * ၿပီးေတာ့ initializer block လုပ္
 * ေနာက္ဆံုး default constructor အလုပ္လုပ္တယ္*/
class ItializerBlockAfterSuperParent {
	ItializerBlockAfterSuperParent() {
		System.out.println("parent class constructor invoked");
	}
}

public class ItializerBlockAfterSuper extends ItializerBlockAfterSuperParent {
	ItializerBlockAfterSuper() {
		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		ItializerBlockAfterSuper b = new ItializerBlockAfterSuper();
	}
}
