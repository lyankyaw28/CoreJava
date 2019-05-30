package main.string.buffer_and_builder.string_buffer;

//replace
public class StringBufferExample3 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(1, 2, "Java");
		System.out.println(sb);// prints HJavalo
	}
}
