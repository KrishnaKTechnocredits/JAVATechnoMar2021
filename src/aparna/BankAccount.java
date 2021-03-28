/*
1. Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer [for example : 13164]
*/
package aparna;

class BankAccount {

	String username;
	String password;
	int bankAccountNumber;

	void setDetails(String name, String bankPassword, int accountNumber) {
		username = name;
		password = bankPassword;
		bankAccountNumber = accountNumber;
	}

	void updatePassword(String bankPassword) {
		password = bankPassword;

	}

	void displayInfo() {
		System.out.println("Bank Account User Name is:->" + username);
		System.out.println("Bank Account User Password is:->" + password);
		System.out.println("Bank Account Number is:->" + bankAccountNumber);
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Jyoti", "Jyoti@123", 12345);
		bankAccount.displayInfo();
		bankAccount.updatePassword("Jyoti_AB@1234567890");
		bankAccount.displayInfo();
	}
}