package main.oops_misc.call_by_value;

public class Operation2 {
	int data = 50;

	// parameter ကို obj လုိက္ေပးလိုက္တယ္ ဒါေၾကာင့္ တန္ဖိုးက အရွင္ၿဖစ္ေနတယ္
	void change(Operation2 op) {
		op.data = op.data + 100;// intstance variable ရဲ႕တန္ဖိုးေၿပာင္းလဲသြားၿပီ
	}

	public static void main(String args[]) {
		Operation2 op = new Operation2();
		System.out.println("before change " + op.data);
		op.change(op);// passing object
		System.out.println("after change " + op.data);

	}
}
