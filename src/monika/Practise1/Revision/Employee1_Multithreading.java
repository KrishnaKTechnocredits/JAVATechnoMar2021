package monika.Practise1.Revision;

public class Employee1_Multithreading extends Thread{
	
	@Override
	public void run() {
		m1(5);
	}
	
	public void m1(int input) {
	int i = input;
		System.out.println("Hello_employee1 loop");
		do{
			System.out.println("Print once _employee1 loop");
			System.out.println("Printing in employee1 loop : "+i);
			i--;
		}while(i >0 && i <= input);
		
		for(int index=0;index<10;index++) {
			System.out.println("Print employee1 loop : "+index);
		}
	}
	
	
	
}
