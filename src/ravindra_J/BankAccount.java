/*	1. Create a class called BankAccount, which has 3 methods.
   a) setDetails() method to set username, password, bankAccountNumber.
   b) updatePassword(String password) method to update password
   c) displayInfo() method will print username, password & bankAccountNumber
	NOTE : consider bank account number as Integer [for example : 13164] 
 */
package ravindra_J;

class BankAccount{
	String std_username;
	String std_password;
	int std_bankAccountNumber;

	void setDetails(String username,String password,int bankAccountNumber){
		std_username = username;
		std_password = password;
		std_bankAccountNumber = bankAccountNumber;
	}
	void updatePassword(String password){
		std_password = password;
	}
	void displayInfo(){
		System.out.println("Bank Account details are -> "+std_username+"   " +std_password +"  "+std_bankAccountNumber);
	}

	public static void main(String []args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Techno","RAV@23",987456);
		bankaccount.updatePassword("Jadhav@23");
		bankaccount.displayInfo();
	}
} 