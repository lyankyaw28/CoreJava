package main.java_string.string.immutable_string;

public class Testimmutablestring1 {
	public static void main(String args[]) {
		String s = "Sachin";
		// s ဆိုတဲ့ variable ထဲကို ၿပန္ထည့္ေပးလိုက္တယ္
		// Testimmutablestring ထဲမွာဆိုရင္ s ဆိုတဲ့ variable ထဲကို ၿပန္ထည့္မေပးထားဘူး
		s = s.concat(" Tendulkar");
		System.out.println(s);
	}
}
