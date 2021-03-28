package priyanka_Kamble;

/**Assignment 3 : 23rd March 2021

1. Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber 
	 NOTE : consider bank account number as Integer [for example : 13164]
***/
class BankAccount{
	String username,password;
	int bankAccountNumber;
	
	void setDetails(String name, String pwd, int number){
		username=name;
		password=pwd;
		bankAccountNumber=number;
	}
	
	void updatePassword(String pwd){
		password = pwd;
	}
	
	void displayInfo(){
		System.out.println("Customer Name =" +username);
		System.out.println("Customer Password =" +password);
		System.out.println("Customer Account Number =" +bankAccountNumber);
	}
	
	public static void main(String Args[]){
		BankAccount b = new BankAccount();
		b.setDetails("Priyanka","P123",987654);
		b.displayInfo();
		b.setDetails("Alex","As123",987676);
		b.updatePassword("j123");
		b.displayInfo();
	}	
}