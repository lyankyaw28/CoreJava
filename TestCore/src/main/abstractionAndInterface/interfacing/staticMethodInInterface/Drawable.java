package main.abstractionAndInterface.interfacing.staticMethodInInterface;

public interface Drawable {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}
