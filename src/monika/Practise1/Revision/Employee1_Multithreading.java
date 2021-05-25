package monika.Practise1.Revision;

public class Employee1_Multithreading extends Thread{
	
	@Override
	public void run() {
		m1(5);
	}
	
	public void m1(int input) {
		int i = input;
		System.out.println("Hello");
		do{
			System.out.println("Print once");
			System.out.println("Printing in while loop : "+i);
			i--;
		}while(i >0 && i <= input);
	
	}
}
