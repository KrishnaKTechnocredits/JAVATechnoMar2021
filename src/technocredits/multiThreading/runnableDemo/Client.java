package technocredits.multiThreading.runnableDemo;

public class Client {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		Employee2 emp2 = new Employee2();
		
		Thread thread1 = new Thread(emp1);
		thread1.setName("Thread - Emp1");
		thread1.start();
		
		Thread thread2 = new Thread(emp2);
		thread2.setName("Thread - Emp2");
		thread2.start();
	}
}
