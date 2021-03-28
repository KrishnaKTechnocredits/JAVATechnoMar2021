package aashay;
/*
 * Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber
      NOTE : consider bank account number as Integer [for example : 13164]
 */
class BankAccount{
	
	String username, password;
	int bankAccountNumber;
	
	void setDetails(String name,String pwd,int accntnum){
		username = name;
		password = pwd;
		bankAccountNumber = accntnum;
	}
	void updatePassword(String pwd){
		password = pwd;
	}
	void displayInfo(){
		System.out.println("Username: "+username+"\nPassword: "+password+"\nBank Account Number: "+bankAccountNumber);
	}
	
	public static void main(String [] args){
		BankAccount accnt = new BankAccount();
		accnt.setDetails("Aashay Pilivkar","ABC@!23DEF",1000989);
		accnt.displayInfo();
		accnt.updatePassword("Updated*&Password_1");
		System.out.println("\n");
		accnt.displayInfo();	
	}
	
}