package main.abstractionAndInterface.interfacing.staticMethodInInterface;

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class TestInterfaceStatic {

	public static void main(String args[]) {
		//class ကို interface မွတစ္ဆင့္ object ေဆာက္နည္း
		Drawable d = new Rectangle();
		d.draw();
		//static method ၿဖစ္တ့ဲအတြက္ေၾကာင့္ class name ကတစ္ဆင့္လွမ္းေခၚလို႔ရတယ္
		System.out.println(Drawable.cube(3));
	}
}
