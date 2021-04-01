/* Assignment 3- Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber
*/

package radha;

class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String uname, String pwd, int account){
		username = uname;
		password = pwd;
		bankAccountNumber = account;
	}
	
	void updatePassword(String updtpwd){
		password = updtpwd;
	}
	
	void displayInfo(){
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
		System.out.println("Bank Account number is: " + bankAccountNumber);
	}

	public static void main(String[] args){
		BankAccount bank1 = new BankAccount();
		bank1.setDetails("Radha","abc@123",13164);
		bank1.displayInfo();
		bank1.updatePassword("newpassWord");
		bank1.displayInfo();
	}
}