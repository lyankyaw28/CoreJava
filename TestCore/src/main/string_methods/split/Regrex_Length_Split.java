package main.string_methods.split;

public class Regrex_Length_Split {
	public static void main(String args[]) {
		String s1 = "welcome to split world";
		System.out.println("returning words:");
		//ေနာက္က parameter က ဘယ္နံပိုင္းၿဖတ္မလဲလို႔ ဆိုလိုတာ
		//ေတြ႕တိုင္းၿဖတ္ထုတ္မယ္ဆိုရင္ parameter ကို 0 ေပးလိုက္လို႔ရတယ္
		for (String w : s1.split("\\s", 0)) {
			System.out.println(w);
		}
		System.out.println("returning words:");
		for (String w : s1.split("\\s", 1)) {
			System.out.println(w);
		}
		System.out.println("returning words:");
		for (String w : s1.split("\\s", 2)) {
			System.out.println(w);
		}

	}
}
