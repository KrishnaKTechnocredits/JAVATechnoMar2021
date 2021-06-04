/*Assignment 3 : Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber */
package prashant.Assignment_3_8;

public class BankAccount {
	static String username = "";
	static String password = "";
	static int accountNumber = 0;

	void setDetails(String name, String pwd, int acnum) {
		username = name;
		password = pwd;
		accountNumber = acnum;
	}

	void updatePassword(String pwd) {
		password = pwd;
	}

	void displayInfo() {
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
		System.out.println("Account number is :" + accountNumber);
	}

	public static void main(String[] args) {
		new BankAccount().setDetails("Techno", "Credit", 1234567);
		System.out.println("\nPassword changed \n");
		new BankAccount().updatePassword("techno@123");
		new BankAccount().displayInfo();
	}
}
