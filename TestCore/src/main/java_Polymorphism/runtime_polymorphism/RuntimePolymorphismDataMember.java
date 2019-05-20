package main.java_Polymorphism.runtime_polymorphism;
//Runtime polymorphism can't be achieved by data members.

class RuntimePolymorphismDataMemberParent {
	int speedlimit = 90;
}

public class RuntimePolymorphismDataMember extends RuntimePolymorphismDataMemberParent {
	int speedlimit = 150;

	public static void main(String args[]) {
		RuntimePolymorphismDataMemberParent obj = new RuntimePolymorphismDataMember();
		System.out.println(obj.speedlimit);// 90
	}
}
