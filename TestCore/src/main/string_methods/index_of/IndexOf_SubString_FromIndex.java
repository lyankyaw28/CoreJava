package main.string_methods.index_of;

public class IndexOf_SubString_FromIndex {
	public static void main(String[] args) {
		String s1 = "This is indexOf method";
		// Passing substring and index
		int index = s1.indexOf("method", 10); // index 10 ရဲ႕ေနာက္ပိုင္းကစၿပီး ရွာ
		System.out.println("index of substring " + index);
		index = s1.indexOf("method", 20); // index 20 ရဲ႕ေနာက္ပိုင္းကစၿပီး ရွာ မေတြ႕လို႔ -1 ထြက္လာ
		System.out.println("index of substring " + index);
	}
}
