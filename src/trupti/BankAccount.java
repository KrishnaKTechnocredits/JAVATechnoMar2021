package trupti;
/*Assignment 3 : Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber */

class BankAccount{
	String username;
	String password;
	int accountNumber;
	
	void setDetails(String name,String pwd,int acctnum){
		username=name;
		password=pwd;
		accountNumber=acctnum;
	}
	
	void updatePassword(String pwd){
		password=pwd;
	}
	
	void displayInfo(){
		System.out.println("Username is: "+username);
		System.out.println("Password is: "+password);
		System.out.println("Account number is :"+accountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankaccount=new BankAccount();
		bankaccount.setDetails("Trupti","Wadkar",263546765);
		bankaccount.displayInfo();
		System.out.println("\nPassword changed. Please find updated information as below.\n");
		bankaccount.updatePassword("Wadkar@123");
		bankaccount.displayInfo();
	}
}