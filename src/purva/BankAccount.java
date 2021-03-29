/*
 * Assignment 3  bank account class with setdetails,updatePassword and displayInfo method
 */
package purva;
 
class BankAccount{
    String userName;
	String password;
	int bankAccountNumber;
	
	void setDetails(String name, String pswd, int accountNo){
		userName = name;
		password = pswd;
		bankAccountNumber = accountNo;
	}
	
	void updatePassword(String pwd){
		password = pwd;
	}
	
	void displayInfo(){
		System.out.println("User name is "+userName);
		System.out.println("user account number is "+bankAccountNumber);
		System.out.println("User password is "+password);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Purva","purva@21",12345);
		bankAccount.updatePassword("Sharma@93");
		bankAccount.displayInfo();
	}
}
		
		
		
	
