//Create a class called BankAccount, which has 3 methods.
//     a) setDetails() method to set username, password, bankAccountNumber.
//      b) updatePassword(String password) method to update password
//      c) displayInfo() method will print username, password & bankAccountNumber

//NOTE : consider bank account number as Integer [for example : 13164]
package komal;
class BankAccount{
	String username;
	String password;
	int accountNumber;

	void setDetails(String name, String pwd, int bankAccountNumber){
	username = name;
	password = pwd;
	accountNumber = bankAccountNumber;
	}
	
	void updatePassword(String newpwd){
		password = newpwd;
	}
	
	void displayInfo(){
		System.out.println("Username : " +username);
		System.out.println("Password : " +password);
		System.out.println("BankAccountNumber : " +accountNumber);
	}
	public static void main(String[] args){
		BankAccount ba_1 = new BankAccount();
		ba_1.setDetails("komal","unlockme",12345);
		ba_1.displayInfo();
		ba_1.updatePassword("Admin@123");
		ba_1.displayInfo();
	}
}