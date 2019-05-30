package main.encapsulation.encapsulation.wirte_Only_Class;

public class Student {
	// private data member
	private String college;

	// getter method for college
	public void setCollege(String college) {
		this.college = college;
	}
}
//System.out.println(s.getCollege());//Compile Time Error, because there is no such method  
//System.out.println(s.college);//Compile Time Error, because the college data member is private.   
//So, it can't be accessed from outside the class 