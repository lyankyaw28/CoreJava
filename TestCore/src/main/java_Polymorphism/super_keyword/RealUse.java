package main.java_Polymorphism.super_keyword;

class PersonRealSuperUsage {
	int id;
	String name;

	PersonRealSuperUsage(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class EmpRealSuperUsage extends PersonRealSuperUsage {
	float salary;

	EmpRealSuperUsage(int id, String name, float salary) {
		super(id, name);// reusing parent constructor
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class RealUse {
	public static void main(String[] args) {
		EmpRealSuperUsage e1 = new EmpRealSuperUsage(1, "ankit", 45000f);
		e1.display();
	}
}
