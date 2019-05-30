package main.string.reverse_string.by_string_builder;

//reverse string ကို builder or buffer class မွတစ္ဆင့္ေၿပာင္းလဲပံ
public class StringFormatter {
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
}
