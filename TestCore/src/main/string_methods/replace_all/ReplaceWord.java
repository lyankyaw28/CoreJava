package main.string_methods.replace_all;

public class ReplaceWord {
	public static void main(String args[]) {
		String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString = s1.replaceAll("is", "was");// replaces all occurrences of "is" to "was"
		System.out.println(replaceString);
	}
}
