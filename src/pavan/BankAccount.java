/*
 Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer for example : 13164
 */
package pavan;
class BankAccount{
	String username;
	String password;
	int accountNumber;
	
	void setDetails(String uname, String paswd, int accNum){
		username = uname;
		password= paswd;
		accountNumber=accNum;
	}
	
	void updatePassword (String pwd){
		password= pwd;	
	}
	
	void displayInfo(){
		System.out.println("Account Holder username: "+username);
		System.out.println("User Password :"+ password);
		System.out.println("Account Number :"+ accountNumber);
	}
	
	public static void main(String[]args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Mohan","ramayan",123);
		bankaccount.displayInfo();
		bankaccount.setDetails("sohan","mahabharat",123);
		bankaccount.updatePassword("Nayomi");
		bankaccount.displayInfo();
	}
}
	
