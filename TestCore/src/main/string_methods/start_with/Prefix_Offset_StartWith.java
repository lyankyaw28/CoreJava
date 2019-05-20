package main.string_methods.start_with;

public class Prefix_Offset_StartWith {
	public static void main(String[] args) {
		String str = "Javatpoint";
		System.out.println(str.startsWith("J")); // True
		System.out.println(str.startsWith("a")); // False
		//1 ခန္းထဲမွာ a နဲ႔ဟုတ္လားစစ္
		System.out.println(str.startsWith("a", 1)); // True
	}
}
