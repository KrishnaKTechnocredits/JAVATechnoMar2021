/*Create a class called BankAccount, which has 3 methodsa) setDetails() method to set username, password, BankAccountNumber.b) updatePassword(String Password) method to update password. c) displayInfo() method will print username, password & bankAccountNumber.
 */ 
package sangeeta;

class BankAccount{
	String username;
	String password;
	String bankAccountNumber;
	
	void setDetails(String uname, String pass, String bankAccNumber){
		username = uname;
		pass = password;
		bankAccountNumber = bankAccNumber;
	}
	
	void updatePassword(String newpas){
		password = newpas;
	}
	
	void displayInfo(){
		System.out.println(" Username is " +username);
		System.out.println(" Password is " +password);
		System.out.println(" Bank Account number is " +bankAccountNumber);
	}
	
	public static void main(String[] a){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("SangeetaB","123456", "12365478952");
		bankAccount.updatePassword("654321");
		bankAccount.displayInfo();
	}
}
