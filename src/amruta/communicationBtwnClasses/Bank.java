package amruta.communicationBtwnClasses;

public class Bank {
	int balance;
	String custname;
	
	void setdetails(int accountbal, String name) {
		balance = accountbal;
		custname = name;
	}
	void displayInfo() {
		System.out.println("Customer Name is : "+custname);
		System.out.println("Account Balance is : "+balance);
	}
	
}
