package main.string_methods.char_at;

public class StringIndexOutOfBoundExceptionCharAt {
	public static void main(String args[]) {
		String name = "javatpoint";
		char ch = name.charAt(10);// 10 index ေနရာဆိုတာ မရွိတဲ့အတြက္ေၾကာင့္
		System.out.println(ch);
	}
}
