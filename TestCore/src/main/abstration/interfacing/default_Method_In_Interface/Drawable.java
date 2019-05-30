package main.abstration.interfacing.default_Method_In_Interface;

public interface Drawable {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}
