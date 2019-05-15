package main.java_OOPs_misc.wrapper_clsss.primitive_to_wrapper;

public class WrapperExample1 {
	public static void main(String args[]) {
		// Converting int into Integer
		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

		System.out.println(a + " " + i + " " + j);
	}
}
