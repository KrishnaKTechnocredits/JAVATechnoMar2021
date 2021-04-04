package amruta.communicationBtwnClasses;

public class BankClient {
	void m1(){
		System.out.println("Bank Account details as below :");
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setdetails(1000, "Amruta");
		bank.displayInfo();
		
		Bank bank2 = new Bank();
		bank2.setdetails(1000, "Priyanka");
		bank2.displayInfo();
		
	}

}
