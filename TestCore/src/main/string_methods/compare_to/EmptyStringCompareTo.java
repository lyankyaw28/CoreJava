package main.string_methods.compare_to;

//output ေတြက empty မၿဖစ္တဲ့ string ရဲ႕ character count ေတြကို return ၿပန္လိမ့္မယ္
public class EmptyStringCompareTo {
	public static void main(String args[]) {
		String s1 = "hello";
		String s2 = "";
		String s3 = "me";
		//second string က empty ၿဖစ္တဲ့အတြက္ positive ၿဖစ္တယ္
		System.out.println(s1.compareTo(s2));
		//first string က empty ၿဖစ္တဲ့အတြက္ negative ၿဖစ္တယ္
		System.out.println(s2.compareTo(s3));
	}
}
