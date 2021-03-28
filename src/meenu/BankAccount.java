package meenu;

/* Assignment_3 -> Program_1: Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber
*/

class BankAccount{
	String username;
	String password;
	int accountNumber;
	
	void setdetails(String name, String passcode, int bankAccountNumber){
		username = name;
		password = passcode;
		accountNumber = bankAccountNumber;
	}
	
	void updatePassword(String newPasscode){
		password = newPasscode;
		
	}
	
	void display(){
		System.out.println("Username          : "+ username);
		System.out.println("Password          : "+ password);
		System.out.println("BankAccountNumber : "+ accountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setdetails("Meenu", "Pune@1234",123456);
		bankAccount1.updatePassword("Mumbai@321");
		bankAccount1.display();
	}
}	
      