package main.string_methods.replace_all;

public class ReplaceCharacter {
	public static void main(String args[]) {
		String s1 = "javatpoint is a very good website";
		String replaceString = s1.replaceAll("a", "e");// replaces all occurrences of "a" to "e"
		System.out.println(replaceString);
	}
}
