// Assignment 3 : 23rd March 2021
// 
// Create a class called BankAccount, which has 3 methods.
//     a) setDetails() method to set username, password, bankAccountNumber.
//     b) updatePassword(String password) method to update password
//     c) displayInfo() method will print username, password & bankAccountNumber
// 
// NOTE : consider bank account number as Integer [for example : 13164]

package anubhav;

class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String name, String pwd, int acn){
		username= name;
		password= pwd;
		bankAccountNumber= acn;
	}
	
	void updatePassword (String pwd){
		password= pwd;
	}	
	
	void showInfo(){
		System.out.println("Customer name = " + username);
		System.out.println("Customer's password = " + password);
		System.out.println("Customer's Account number = " + bankAccountNumber);
	}
		
	public static void main(String [] args){
		BankAccount bankAccount= new BankAccount();
		bankAccount.setDetails("Anubhav Baiswar","OldPassword@1234",33004755);
		bankAccount.showInfo();
		bankAccount.updatePassword("NewPassword@5678");
		bankAccount.showInfo();
	}
} 
