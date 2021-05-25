package monika.Practise1.Revision;

import monika.Practise1.Revision2.Employee1;
import monika.Practise1.Revision2.Employee2;

public class Manager_Multithreading {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		Employee2 e2 = new Employee2();
		System.out.println("Hi");
		e1.start();
		System.out.println("In Middle ");
		e2.start();
		e1.start();
		System.out.println("End");
	}

}
