//Assignment3_Program_1

package prachi;

//Assignment 3 : 23rd March 2021
//1. Create a class called BankAccount, which has 3 methods.
//     a) setDetails() method to set username, password, bankAccountNumber.
//     b) updatePassword(String password) method to update password
//     c) displayInfo() method will print username, password & bankAccountNumber
//NOTE : consider bank account number as Integer [for example : 13164]


class BankAcount{
	String username;
	String password;
	int acount;
	
	void setDetails(String uname, String pwd, int acc){
		username=uname;
		password=pwd;
		acount=acc;

	}
	  
	void updatePassword(String NewPassword){
		password=NewPassword;
	}
	
	void displayInfo(){
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Account Number: "+acount);
	}
	
	public static void main(String[] args){
		BankAcount bankacount = new BankAcount();
		bankacount.setDetails("Prachi_Lonkar", "Prachi_1234", 12345);
		bankacount.displayInfo();
		bankacount.updatePassword("Lonkar@100");
		bankacount.displayInfo();
	}
}