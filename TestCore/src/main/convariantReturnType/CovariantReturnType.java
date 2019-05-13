package main.convariantReturnType;

class CovariantReturnTypeParent {
	CovariantReturnTypeParent get() {
		return this;
	}
}

public class CovariantReturnType extends CovariantReturnTypeParent {
	CovariantReturnType get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		new CovariantReturnType().get().message();
	}
}
