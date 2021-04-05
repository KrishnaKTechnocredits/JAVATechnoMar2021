package kangan.assignments.assignment2;

public class BankAccount {

	 String username;
	 String password;
	 int bankAccountNumber;
	 
	void setDetails(String uname, String oldpassword, int AccountNumber) {
		username = uname;
		password = oldpassword;
		bankAccountNumber = AccountNumber;
	}
	
	void updatePassword(String newpassword) {
		password = newpassword;
	}
	
	void displayInfo() {
	    System.out.println("Username is " + username);
	    System.out.println("Password is " + password);
	    System.out.println("bank account number is " + bankAccountNumber);
	}
	
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Kangan", "kangan234", 1234);
		bankAccount.updatePassword("kangan678");
		bankAccount.displayInfo();
	}
}
