package main.exception_handling.difference_final_finally_finalize;

public class FinalizeMethod {
	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		FinalizeMethod f1 = new FinalizeMethod();
		FinalizeMethod f2 = new FinalizeMethod();
		f1 = null;
		f2 = null;
		System.gc();
	}
}
