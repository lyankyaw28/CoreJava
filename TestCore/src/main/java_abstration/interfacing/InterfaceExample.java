package main.java_abstration.interfacing;

interface printable {
	void print();
}

public class InterfaceExample implements printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		InterfaceExample obj = new InterfaceExample();
		obj.print();
	}
}
