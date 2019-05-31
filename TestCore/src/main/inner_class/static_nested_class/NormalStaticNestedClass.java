package main.inner_class.static_nested_class;

public class NormalStaticNestedClass {
	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		NormalStaticNestedClass.Inner obj = new NormalStaticNestedClass.Inner();
		obj.msg();
	}
}
/*
 * ဒီ example မွာဆိုရင္ static nested class ရဲ႕ instance ကို create
 * လုပ္ဖို႔ရန္လိုတယ္ ဘာလို႔လဲဆိုေတာ့ သူ႕မွာ instance method msg() ဆိုတာ ရွိလို႔
 * ဒါေပမယ့္ outer class ကို object ေဆာက္ေပးစရာမလို ဘာလို႔လဲဆိုေတာ့ nested class
 * က static ၿဖစ္တဲ့အတြက္ေၾကာင့္ object ေဆာက္စရာမလိုဘဲတန္ၿပီး access လုပ္ႏိုင္တယ္
 */
