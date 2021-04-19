/* Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer [for example : 13164]*/


package simmi.assignment_1_5;

class BankAccount{
	String userName;
	String password;
	int bankAccountNumber;
	
	void setDetails(String s_userName, String s_password, int s_bankAccountNumber){
		userName = s_userName;
		password = s_password;
		bankAccountNumber = s_bankAccountNumber;
	}
	
	void updatePassword(String s_password){
		password = s_password;
	}
	
	void displayInfo(){
		System.out.println("Username is :" + userName);
		System.out.println("Password is :" + password);
		System.out.println("Bank account number is :" + bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount ba = new BankAccount();
		ba.setDetails("Simmi","Simmi217",9836922);
		ba.displayInfo();
		ba.updatePassword("217Simmi");
		ba.displayInfo();
	}
}
		
		