package main.polymorphism.final_keyword;

/*blank final variable ဆိုတာ variable ေၾကၿငာထားၿပီး assign မလုပ္ထားရေသးတဲ့ဟာေတြကို ဆိုလိုတယ္
 * တကယ္လို႔ assign လုပ္ခ်င္တယ္ဆိုရင္ constructor ထဲမွာပဲ assign လုပ္လို႔ရတယ္*/
public class BlankFinalVariable {
	final int speedlimit;

	BlankFinalVariable() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		new BlankFinalVariable();
	}
}
