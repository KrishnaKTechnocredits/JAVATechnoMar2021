package kangan.assignments.assignment_27;

public class Case7 {

	public static void main(String[] args) {
		//ClassB b1 = new ClassA();--- CE as we cannot assign parent into child
		ClassB b2 = new ClassB();
		//Alone statement is Same as Case 2
		
		System.out.println(b2.x);
		//10
		System.out.println(b2.y);
		//30
		System.out.println(b2.z);
		//40
		b2.m1();
		//A m1
		b2.m2();
		//B m2
		b2.m3();
		//B m3
	}
}
