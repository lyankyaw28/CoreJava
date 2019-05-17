package main.java_string.reverse_string.by_reverse_iteration;

// reverse string ကို string class မွတစ္ဆင့္ေၿပာင္းလဲပံု
public class StringFormatter {
	public static String reverseString(String str) {
		//parameter မွလာေသာ string ကို char array ေၿပာင္း
		char ch[] = str.toCharArray();
		String rev = "";
		//looping ကိုေၿပာင္းၿပန္ပတ္ၿပီး char တစ္လံုးခ်င္းရိုက္ထုတ္
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}
}
