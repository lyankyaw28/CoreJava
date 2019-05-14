package main.java_Polymorphism.final_Keyword;

/*static final variable ေတြကို assign လုပ္ခ်င္တယ္ဆိုရင္ static block ေတြထဲမွာပဲ initialized လုပ္လို႔ရမယ္*/
public class StaticBlankFinalVariable {
	static final int data;// static blank final variable
	static {
		data = 50;
	}

	public static void main(String args[]) {
		System.out.println(StaticBlankFinalVariable.data);
	}
}
