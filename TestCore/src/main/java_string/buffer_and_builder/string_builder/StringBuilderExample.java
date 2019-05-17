package main.java_string.buffer_and_builder.string_builder;

//append
public class StringBuilderExample {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
	}
}
