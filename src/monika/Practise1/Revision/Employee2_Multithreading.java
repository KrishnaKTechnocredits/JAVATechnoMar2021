package monika.Practise1.Revision;

public class Employee2_Multithreading extends Thread {

	@Override
	public void run() {
		m1(30);
	}
	
	void m1(int input) {
		System.out.println("Yes_employee2 loop");
		int i = input;
		do{
			System.out.println("Print once _employee2 loop");
			System.out.println("Printing in while loop_employee2 loop : "+i);
			i--;
		}while(i >0 && i <= input);
		
		for(int index=0;index<10;index++) {
			System.out.println("Print employee2 loop : "+index);
		}
	
	}
}
