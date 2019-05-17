package main.java_string.buffer_and_builder.string_buffer;

//delete
public class StringBufferExample4 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.delete(0, 4);
		System.out.println(sb);// prints Hlo
	}
}
