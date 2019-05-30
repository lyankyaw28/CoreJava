package main.exception_handling.try_catch_block;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionHandling {
	public static void main(String[] args) {

		PrintWriter pw;
		try {
			pw = new PrintWriter("jtp.txt"); // may throw exception
			pw.println("saved");
		}
// providing the checked exception handler  
		catch (FileNotFoundException e) {

			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}
}
