package technocredits.multiThreading;

public class Client {
	
	public static void main(String[] args) throws InterruptedException {
		Employee1 e1 = new Employee1();
		Employee2 e2 = new Employee2();
		System.out.println("Start");
		Thread.sleep(3000);
		System.out.println("Lets run");
		e1.start();
		e2.start();
		Thread.sleep(15000);
		e1.run();
		e1.run();
		System.out.println("End");
	}
}
