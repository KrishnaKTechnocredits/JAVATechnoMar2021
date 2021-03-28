/*
 * Assignment 3_1
 * Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber
 */
package neha_Rathi;

class BankAccount {
	String userName;
	String password;
	int bankAccountNumber;

	void setDetails(String name, String pwd, int accno) {
		userName = name;
		password = pwd;
		bankAccountNumber = accno;
	}

	void updatePassword(String pwd) {
		password = pwd;
	}

	void displayInfo() {
		System.out.println("UserName of account holder is: " + userName);
		System.out.println("Password of account holder is: " + password);
		System.out.println("Bank acccount Number of account holder is: " + bankAccountNumber);
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Neha", "Test@123", 916854444);
		bankAccount.displayInfo();
		System.out.println("--------After changing password-------");
		bankAccount.updatePassword("Neha@123");
		bankAccount.displayInfo();
	}
}