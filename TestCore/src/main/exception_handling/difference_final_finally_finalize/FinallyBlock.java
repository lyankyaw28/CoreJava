package main.exception_handling.difference_final_finally_finalize;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int x = 300;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is executed");
		}
	}
}
