/*Assignment no 3
 1. Create a class called BankAccount, which has 3 methods.
a) setDetails() method to set username, password, bankAccountNumber.
b) updatePassword(String password) method to update password
c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer [for example : 13164]*/
package pravin.Assignment3; 
class BankAccount {
	String username,password;
	int bankAccountNumber;

	void setDetails(String use,String pwd,int ban){
		username = use;
		password = pwd;
		bankAccountNumber = ban;
	}
	void updatePassword(String pwd){
		password = pwd;
	}
	void displayInfo(){
		System.out.println("User name is :" +username);
		System.out.println("Password is: " +password);
		System.out.println("bankAccountNumber is: " +bankAccountNumber);
	}
	public static void main (String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("pravin","gawali",1234);
		bankAccount.displayInfo();
		bankAccount.updatePassword("ashwini");
		bankAccount.displayInfo();
	}
}
