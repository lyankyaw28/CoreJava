package main.java_array.class_name_of_array;

public class Testarray4 {
	public static void main(String args[]) {
		// declaration and initialization of array
		int arr[] = { 4, 4, 5 };
		// getting the class name of Java array
		Class c = arr.getClass();
		String name = c.getName();
		// printing the class name of Java array
		System.out.println(name);
	}
}
