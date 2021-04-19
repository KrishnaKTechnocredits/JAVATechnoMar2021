/*
 * 1. Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber
 */

package amruta.Assignment_3;

class BankAccount{
	String username;
	String password;
	int bankAccountnumber;
	
	void setDetails(String name, String passwd, int accountnumber){
		username = name;
		password = passwd;
		bankAccountnumber =accountnumber;
	}
	void updatePassword(String passwd){
		password = passwd;
	}
	void display(){
		System.out.println("Name of User : "+username);
		System.out.println("Account number of user : "+bankAccountnumber);
		System.out.println("Password of User : "+password);
	}
	public static void main(String[] args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Amruta","Amu123",125463987);
		bankaccount.updatePassword("Amruta@97");
		bankaccount.display();
	}
}