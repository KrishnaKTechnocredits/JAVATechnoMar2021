package kangan.assignments.assignment_27;

public class Class6 {

	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		ClassA b1 = new ClassB();
		b1=a1;
		//ClassA b1 = new ClassA();
		//Same as Case1

		System.out.println(b1.x);
		//10
		System.out.println(b1.y);
		//12
		//System.out.println(b1.z);---compilation error as A don't have variable z
		b1.m1();
		//A m1
		b1.m2();
		//A m2
		//b1.m3();--------------------compilation error as A don't have method m3()
		
	}
}
