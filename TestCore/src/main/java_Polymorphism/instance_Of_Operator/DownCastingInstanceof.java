package main.java_Polymorphism.instance_Of_Operator;

class DownCastingInstanceofParent {
}

public class DownCastingInstanceof extends DownCastingInstanceofParent {
	static void method(DownCastingInstanceofParent a) {
		if (a instanceof DownCastingInstanceof) {
			DownCastingInstanceof d = (DownCastingInstanceof) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}

	public static void main(String[] args) {
		DownCastingInstanceofParent a = new DownCastingInstanceof();
		DownCastingInstanceof.method(a);
	}
}
