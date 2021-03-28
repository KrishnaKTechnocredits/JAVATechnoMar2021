package ankit;
/*
1. Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer [for example : 13164]

*/ 

class BankAccount{
	String username, password;
	int bankAccountNumber; 
	
	void setDetails(String uname, String pwd, int accNo){
		username = uname;
		password = pwd;
		bankAccountNumber = accNo;
		System.out.println("Current Password is  " + password);
	}
  
	void updatePassword(String pwd1){
		password = pwd1;
		
	}
	void displayInfo(){
		System.out.println("Account # is " + bankAccountNumber);
		System.out.println("Username is " + username);
		System.out.println("Updated Password is  " + password);
		
	}
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Ankit", "ABC123", 999999);
		bankAccount.updatePassword("NEW123");
		bankAccount.displayInfo();
		
	}
}