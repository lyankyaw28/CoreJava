package main.java_Polymorphism.final_keyword;

/*final method က inherited လားဆိုရင္ ဟုတ္တယ္
  ဒါေပမယ့္ override လုပ္ၿပီး ေရးလို႔မရဘူး*/
class FinalMethodInheritedParent {
	final void run() {
		System.out.println("running...");
	}
}

public class FinalMethodInherited extends FinalMethodInheritedParent {
	public static void main(String args[]) {
		new FinalMethodInherited().run();
	}
}
