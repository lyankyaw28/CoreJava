package main.java_Encapsulation.encapsulation.read_Only_Class;

public class Student {
	// private data member
	private String college = "AKG";

	// getter method for college
	public String getCollege() {
		return college;
	}
}

//s.setCollege("KITE");//will render compile time error  
