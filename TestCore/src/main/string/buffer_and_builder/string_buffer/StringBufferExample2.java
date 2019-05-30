package main.string.buffer_and_builder.string_buffer;

//Insert
public class StringBufferExample2 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(2, "Java");// now original string is changed
		System.out.println(sb);// prints HJavaello
	}
}
