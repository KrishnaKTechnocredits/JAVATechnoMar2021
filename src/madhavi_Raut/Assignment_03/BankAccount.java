/*Assignment 03
 Program 01
 Create a class called BankAccount, which has 3 methods.
	a) setDetails() method to set username, password, bankAccountNumber.
	b) updatePassword(String password) method to update password
	c) displayInfo() method will print username, password & bankAccountNumber
	NOTE : consider bank account number as Integer [for example : 13164]*/

package madhavi_Raut.Assignment_03;

class BankAccount {

	String userName, userPassword;
	int bankAccountNumber;

	void setDetails(String uName, String uPassword, int ubankAccountNumber) {
		userName = uName;
		userPassword = uPassword;
		bankAccountNumber = ubankAccountNumber;
	}

	void updatePassword(String updatedPwd) {
		userPassword = updatedPwd;
	}

	void displayInfo() {
		System.out.println("User Name: " + userName + "\n" + "User password: " + userPassword + "\n"
				+ "Bank Account Number: " + bankAccountNumber);
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Daniel", "Pass@123", 123456);
		bankAccount.displayInfo();
		System.out.println("-----After updating Password-----");
		bankAccount.updatePassword("EditPass@123");
		bankAccount.displayInfo();
	}
}