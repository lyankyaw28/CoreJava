package main.java_abstration.interfacing.multiple_Inheritance;

class MultipleInheritance1 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		MultipleInheritance1 obj = new MultipleInheritance1();
		obj.print();
		obj.show();
	}
}
