package main.string_methods.concat;

public class NormalConcat {
	public static void main(String args[]) {
		String s1 = "java string";
		s1.concat("is immutable");
		//ဒါဆိုရင္ မဆက္ရေသးတဲ့ s1 တန္ဖိုးအတိုင္းပဲထြက္လာလိမ့္မယ္
		System.out.println(s1);
		//s1 ထဲကို ၿပန္ထည့္ေပးမွ ဆက္ထားတဲ့ စာသားအၿပည့္အစံုပါလာလိမ့္မယ္
		s1 = s1.concat(" is immutable so assign it explicitly");
		System.out.println(s1);
	}
}
