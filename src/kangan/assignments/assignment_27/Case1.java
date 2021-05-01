package kangan.assignments.assignment_27;

public class Case1 {

	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		
		System.out.println(a1.x);
		//10
		System.out.println(a1.y);
		//12
		//System.out.println(a1.z);---compilation error as A don't have variable z
		a1.m1();
		//A m1
		a1.m2();
		//A m2
		//a1.m3();--------------------compilation error as A don't have method m3()
		
		
	}
}
