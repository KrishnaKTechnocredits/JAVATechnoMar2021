package monika.Practise1.Revision;

public class Manager_Multithreading {

	public static void main(String[] args) {
		Employee1_Multithreading e1 = new Employee1_Multithreading();
		Employee2_Multithreading e2 = new Employee2_Multithreading();
		System.out.println("Hi");
		e1.start();
		System.out.println("In Middle ");
		e2.start();
		//e1.start();
		System.out.println("End");
	}

}
