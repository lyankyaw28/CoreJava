package main.multithreading.runtime_class;

//ဒီ example ရဲ႕ ပံုစံက instance 10000 ေဆာက္လိုက္တယ္ အဲ့ခါက်ေတာ့ memory က မေဆာက္ခဲ့ကထက္ေတာ့ နည္းသြားေရာ
//ဒါေပမယ့္ gc method ကို လွမ္းေခၚလိုက္တဲ့ေနာက္မွာေတာ့ memory က ပိုတိုးလာတဲ့ သေဘာကိုၿပထားတဲ့ example တစ္ခုၿဖစ္တယ္
public class MemoryTest {
	public static void main(String args[]) throws Exception {
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Free Memory: " + r.freeMemory());

		for (int i = 0; i < 10000; i++) {
			new MemoryTest();
		}
		System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());
	}
}
