package main.polymorphism.finalKeyword;

/*final parameter ကို ခ်ိန္းလို႔မရလို႔ compile time error တက္သြားလိမ့္မယ္*/
public class FinalParameter {
	/*
	 * int cube(final int n) { n = n + 2;// can't be changed as n is final }
	 */
	public static void main(String[] args) {
		FinalParameter b = new FinalParameter();
		/* b.cube(5); */
	}
}
