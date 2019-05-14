package main.abstractionAndInterface.interfacing.differenceInterfaceAbstract;

//Creating interface that has 4 methods  
interface A {
	void a();// bydefault, public and abstract

	void b();

	void c();

	void d();
}

//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A {
	public void c() {
		System.out.println("I am C");
	}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
//java class က abstract ကို extend လုပ္ထားတဲ့အတြက္ interface ကို implement လုပ္စရာမလိုေတာ့ဘဲ သူ႕ထဲက abstract
// method မ်ားကို ယူသံုးလို႔ရတယ္ abstract class ကေတာ့ interface ကို implement လုပ္ထားတာကို ေတြ႕ရမယ္
// interface ထဲမွာေတာ့ abstract method မ်ားေၾကၿငာထားတာကို ေတြ႕ႏိုင္တယ္
class M extends B {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

public class Test5 {
	public static void main(String args[]) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
