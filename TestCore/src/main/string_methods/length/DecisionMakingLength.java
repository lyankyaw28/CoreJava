package main.string_methods.length;

public class DecisionMakingLength {
	public static void main(String[] args) {
		String str = "Javatpoint";
		if (str.length() > 0) {
			System.out.println("String is not empty and length is: " + str.length());
		}
		str = "";
		if (str.length() == 0) {
			System.out.println("String is empty now: " + str.length());
		}
	}
}
