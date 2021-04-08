//Assignment3

package ravindra_V;

public class BankAccount{
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
		System.out.println("Account Number is " + accountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Ravi","Ravi2118", 2323212);
		bankAccount.displayInfo();
		bankAccount.updatePassword("shri12");
		bankAccount.displayInfo();
	}
}
	