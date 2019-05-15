package main.java_OOPs_misc.recursion.infinite_times;

//အဲ့လိုဆို အဆံုးမသတ္ေအာင္ run ေနပါလိမ့္မယ္
public class RecursionExample1 {
	static void p() {
		System.out.println("hello");
		p();
	}

	public static void main(String[] args) {
		p();
	}
}
