package monika.Practise1.Revision;

public class Employee2_Multithreading extends Thread {

	@Override
	public void run() {
		m1(3);
	}
	
	void m1(int input) {
		System.out.println("Yes");
		int i = input;
		do{
			System.out.println("Print once");
			System.out.println("Printing in while loop : "+i);
			i--;
		}while(i >0 && i <= input);
	
	}
}
