package main.abstration.interfacing.static_Method_In_Interface;

public interface Drawable {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}
