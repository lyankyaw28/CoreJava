package main.inner_class.member_inner_class;

public class NormalInnerClass {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		NormalInnerClass obj = new NormalInnerClass();
		NormalInnerClass.Inner in = obj.new Inner();
		in.msg();
	}
}
