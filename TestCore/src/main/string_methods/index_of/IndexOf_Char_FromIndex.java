package main.string_methods.index_of;

public class IndexOf_Char_FromIndex {
	public static void main(String[] args) {
		String s1 = "This is indexOf method";
		// Passing char and index from
		int index = s1.indexOf('e', 12); //12 ေနာက္ပိုင္းက e ရွိတဲ့အခန္းနံပါတ္ကိုၿပန္မယ္
		System.out.println("index of char " + index);
	}
}
