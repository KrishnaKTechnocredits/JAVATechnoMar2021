//Create a class called BankAccount, which has 3 methods.*
//    a) setDetails() method to set username, password, bankAccountNumber.
//  b) updatePassword(String password) method to update password
//c) displayInfo() method will print username, password & bankAccountNumber
//NOTE : consider bank account number as Integer [for example : 13164]

package krati_Jain;

class BankAccount{
	
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String name, String oldPassword, int accNumber) {
	username = name;
	bankAccountNumber = accNumber;
	password = oldPassword;
	}
	
	void updatePassword(String newPassword) {
	password = newPassword;
	}
	
	void displayInfo() {
	System.out.println("Account Holder's username : " + username);
	System.out.println("Account Holder's Bank Account Number : " + bankAccountNumber);
	System.out.println("Account Holder's Password : " + password);
	}
	
	public static void main(String[] a) {
	BankAccount bankAccount = new BankAccount();
	bankAccount.setDetails("Krati Jain","oldpassword#123", 34346678);
	bankAccount.updatePassword("Password#123");
	bankAccount.displayInfo();
	}
}