package main.java_string.to_string_method;

public class Student_No_ToString {
	int rollno;
	String name;
	String city;

	Student_No_ToString(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public static void main(String args[]) {
		Student_No_ToString s1 = new Student_No_ToString(101, "Raj", "lucknow");
		Student_No_ToString s2 = new Student_No_ToString(102, "Vijay", "ghaziabad");

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}
}
