package sandesh.Assignment_3;

public class BankAccount {
	String usernameInstance;
	String passwordInstance;
	int accountNumberInstance;
	
	void setDetails(String uname, String pwd, int bankAccNo) {
		usernameInstance = uname;
		passwordInstance = pwd;
		accountNumberInstance = bankAccNo;
	}
	
	void updatePassword(String pwd) {
		passwordInstance = pwd;
	}
	
	void displayInfo() {
		System.out.println("Username is :- " + usernameInstance);
		System.out.println("Password is :- " + passwordInstance);
		System.out.println("Bank Account Number is :- " + accountNumberInstance);
	}
	
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		String username = "Sandesh";
		String password = "Royal--";
		int bankAccountNumber = 99899;
		ba1.setDetails(username, password, bankAccountNumber);
		ba1.displayInfo();
		ba1.updatePassword("NewRoyal--");
		ba1.displayInfo();
	}
}
