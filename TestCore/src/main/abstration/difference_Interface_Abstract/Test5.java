package main.abstration.difference_Interface_Abstract;

//Creating interface that has 4 methods  
interface A {
	// by default, public and abstract
	void a();

	void b();

	void c();

	void d();
}

//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A {
	public void c() {
		System.out.println("I am C");
	}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
//java class á€€ abstract á€€á€­á€¯ extend á€œá€¯á€•á€¹á€‘á€¬á€¸á€�á€²á€·á€¡á€�á€¼á€€á€¹ interface á€€á€­á€¯ implement á€œá€¯á€•á€¹á€…á€›á€¬á€™á€œá€­á€¯á€±á€�á€¬á€·á€˜á€² á€žá€°á‚•á€‘á€²á€€ abstract
// method á€™á€ºá€¬á€¸á€€á€­á€¯ á€šá€°á€žá€¶á€¯á€¸á€œá€­á€¯á‚”á€›á€�á€šá€¹ abstract class á€€á€±á€�á€¬á€· interface á€€á€­á€¯ implement á€œá€¯á€•á€¹á€‘á€¬á€¸á€�á€¬á€€á€­á€¯ á€±á€�á€¼á‚•á€›á€™á€šá€¹
// interface á€‘á€²á€™á€½á€¬á€±á€�á€¬á€· abstract method á€™á€ºá€¬á€¸á€±á�¾á€€á�¿á€„á€¬á€‘á€¬á€¸á€�á€¬á€€á€­á€¯ á€±á€�á€¼á‚•á‚�á€­á€¯á€„á€¹á€�á€šá€¹
class M extends B {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

public class Test5 {
	public static void main(String args[]) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
