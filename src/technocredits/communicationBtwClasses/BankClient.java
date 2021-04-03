package technocredits.communicationBtwClasses;

public class BankClient {

	void m1() {
		System.out.println("This is BankClient M1 method");
	}
	
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.setDetails(10000, "Harsh");
		bank1.printInfo();
		
		Bank bank2 = new Bank();
		bank2.setDetails(25000, "Maulik");
		bank2.printInfo();
	}
}
