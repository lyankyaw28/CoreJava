package main.java_string.string.immutable_string;

public class Teststringcomparison4 {
	public static void main(String args[]) {
		String s1 = "Cfaf";
		String s2 = "Cfaf";
		String s3 = "Afdasfsafsfas";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
	}
}
