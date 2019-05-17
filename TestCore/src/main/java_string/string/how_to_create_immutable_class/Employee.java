package main.java_string.string.how_to_create_immutable_class;

public final class Employee {
	final String pancardNumber;

	public Employee(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}
