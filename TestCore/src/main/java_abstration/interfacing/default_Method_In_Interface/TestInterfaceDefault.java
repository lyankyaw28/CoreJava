package main.java_abstration.interfacing.default_Method_In_Interface;

//interface ေတြထဲမွာ method body နဲ႔ default method ေရးလို႔ရတယ္
class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class TestInterfaceDefault {
	public static void main(String args[]) {
		Drawable d = new Rectangle();
		d.draw();
		d.msg();
	}
}
