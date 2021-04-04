//1. Create a class called BankAccount, which has 3 methods.
//      a) setDetails() method to set username, password, bankAccountNumber.
//      b) updatePassword(String password) method to update password
//      c) displayInfo() method will print username, password & bankAccountNumber

//NOTE : consider bank account number as Integer [for example : 13164]

/*
Assignment 3 - Program 1 - Program Statement : Create a class called BankAccount, which has 3 methods.
*/

package paras.Assignment_3;

class BankAccount{
	
	String username;
	String password;
	int accountNumber;
	
	void setDetails(String uname, String pwd, int bankAccountNumber){
		username = uname;
		password = pwd;
		accountNumber = bankAccountNumber;
	}

	void updatePassword(String pwd){
		password = pwd;
		
	}

	void displayInfo(){
		System.out.println("Account Username is " + username);
		System.out.println("Account Password is " + password);
		System.out.println("Account number is " + accountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Paras","Paras@123456", 5860123);
		bankaccount.displayInfo();
		bankaccount.updatePassword("Paras@6328");
		bankaccount.displayInfo();
	}
}