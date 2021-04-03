/*Java Assignment 3: 23rd March 2021

1. Create a class called BankAccount, which has 3 methods.
a) setDetails() method to set username, password, bankAccountNumber.
b) updatePassword(String password) method to update password
c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer [for example : 13164]

 */

package vaibhav.Assignment_3;

class BankAccount{
	String userName;
	String userPassword;
	int bannkAccountNumber;
		
	void setDetatils(String uName, String uPassword, int uAccountNumber){
		userName = uName;
		userPassword = uPassword;
		bannkAccountNumber = uAccountNumber;	
	}
	
	void updatePassword(String newPassword){
		userPassword = newPassword;
		System.out.println("Account updated password is : " + newPassword);
	}

	void displayInfo(){
		System.out.println("Account holder name is : " + userName);
		System.out.println("Account Number is : " + bannkAccountNumber);
		System.out.println("Account password is : " + userPassword);
	} 
	
	public static void main (String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetatils("Vaibhav Tati", "TechnoCredits" , 1111111111 );
		bankAccount.displayInfo();
		bankAccount.updatePassword("NewTechnoCredits");
	}
}