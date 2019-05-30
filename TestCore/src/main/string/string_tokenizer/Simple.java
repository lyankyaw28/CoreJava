package main.string.string_tokenizer;

import java.util.StringTokenizer;

public class Simple {
	public static void main(String args[]) {
		//space ေတြ႕ရင္ ေနာက္တစ္လိုင္းဆင္းမယ္
		//hasMoreTokens method ကေနာက္ထပ္ token ရွိေသးလား မရွိေတာ့ဘူးလား check တဲ့ method
		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
