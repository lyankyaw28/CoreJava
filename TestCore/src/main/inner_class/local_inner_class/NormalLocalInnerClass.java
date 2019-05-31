package main.inner_class.local_inner_class;

public class NormalLocalInnerClass {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		NormalLocalInnerClass obj = new NormalLocalInnerClass();
		obj.display();
	}
}
