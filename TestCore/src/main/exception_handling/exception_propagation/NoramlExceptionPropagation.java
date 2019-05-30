package main.exception_handling.exception_propagation;

//ဒီ exception က unchecked exception မို႔လို႔ throws keyword မသံုးပဲနဲ႔ propagated လုပ္လို႔ရတာ
public class NoramlExceptionPropagation {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		NoramlExceptionPropagation obj = new NoramlExceptionPropagation();
		obj.p();
		System.out.println("normal flow...");
	}
}
