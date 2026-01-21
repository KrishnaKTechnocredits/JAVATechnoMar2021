package amrutaM.javaBasics;
/*Assignment -5 : 5th Aug’21
1. Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer [for example : 13164]
*/
public class Assignment5_BankAccount {
	static String username, password;
	static int bankAccountNumber;
	
	void setDetails(String username, String password, int bankAccountNumber) {
		this.username = username;
		this.password = password;
		this.bankAccountNumber = bankAccountNumber;
		
	}
	
	void updatePassword(String password) {
		this.password = password;
	}
	
	void displayInfo() {
		System.out.println("Username is - "+username);
		System.out.println("Updated password is - "+password);
		System.out.println("Bank Account Number is - "+bankAccountNumber);
	}
	
	public static void main(String[] args) {
		Assignment5_BankAccount bankAccount = new Assignment5_BankAccount();
		bankAccount.setDetails("Amruta", "abc@123", 112215);
		bankAccount.updatePassword("123456");
		bankAccount.displayInfo();
	}
}
