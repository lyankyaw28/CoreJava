package main.string_methods.substring;

public class NormalSubString2 {
	public static void main(String[] args) {
		String s1 = "Javatpoint";
		String substr = s1.substring(0); // Starts with 0 and goes to end
		System.out.println(substr);
		String substr2 = s1.substring(5, 10); // Starts from 5 and goes to 10
		System.out.println(substr2);
		String substr3 = s1.substring(5, 15); // မရွိတဲ့ index ကို သြားေထာက္တဲ့အတြက္ exception တက္ၿခင္းၿဖစ္တယ္
	}
}
