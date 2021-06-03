package monika.Practise1.Revision2;

import java.lang.Thread;

public class MultiThreading {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		Employee2 e2 = new Employee2();
		
		e1.m1();
		e2.m1();
		e1.start();
		e2.start();
	}
}
