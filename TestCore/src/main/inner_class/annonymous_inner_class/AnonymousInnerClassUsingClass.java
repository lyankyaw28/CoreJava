package main.inner_class.annonymous_inner_class;

abstract class AnonymousInnerClassUsingClassAbstract {
	abstract void eat();
}

public class AnonymousInnerClassUsingClass {
	public static void main(String args[]) {
		AnonymousInnerClassUsingClassAbstract p = new AnonymousInnerClassUsingClassAbstract() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}
