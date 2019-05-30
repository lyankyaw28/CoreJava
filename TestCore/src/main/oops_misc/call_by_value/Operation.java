package main.oops_misc.call_by_value;

public class Operation {
	int data = 50;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	// parameter ကို value ကိုေပးလိုက္လို႔ value နဲ႔ operation လုပ္တဲ့အတြက္
	// တန္ဖိုးေၿပာင္းလဲၿခင္းမရွိ
	void change(int data) {
		data = data + 100;// method အတြင္းက local variable ပဲေၿပာင္းလဲတယ္
	}

	public static void main(String args[]) {
		Operation op = new Operation();
		System.out.println("before change " + op.data);
		op.change(500);
		// method မွာ data value ကိုေၿပာင္းလိုက္ေပမယ့္ call by value ၿဖစ္လို႔
		// တန္ဖိုးမေၿပာင္း ဘာလုိ႔လဲဆိုေတာ့ value အေသၿဖစ္ေနလို႔ reference ဆို
		// တန္ဖိုးကအရွင္ၿဖစ္ေနလိမ့္မယ္
		System.out.println("after change " + op.data);

	}
}
