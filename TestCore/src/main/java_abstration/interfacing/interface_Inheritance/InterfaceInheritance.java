package main.java_abstration.interfacing.interface_Inheritance;

// class တစ္ခုက interface တစ္ခုကို implements လုပ္ထားတယ္
// အဲ့ interface က ေနာက္ interface တစ္ခုကို extends လုပ္ထားတယ္

public class InterfaceInheritance implements Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		InterfaceInheritance obj = new InterfaceInheritance();
		obj.print();
		obj.show();
	}
}
