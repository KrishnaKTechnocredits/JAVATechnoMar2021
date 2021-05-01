//Create a class called BankAccount, which has 3 methods.
package shilpa.Assignment_3;

class BankAccount {
	String username;
	String password;
	int accountnumber;

	void SetDetails(String name, String pwd, int accno) {
		username = name;
		password = pwd;
		accountnumber = accno;

	}

	void UpdatePassword(String pwd1) {
		password = pwd1;
	}

	void displayInfo() {

		System.out.println("Username is        : " + username);
		System.out.println("Password is        : " + password);
		System.out.println("Bank Account No is : " + accountnumber);
	}

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.SetDetails("Shilpa", "Shilpa123", 111001);
		bank.UpdatePassword("Shilpa@123");
		bank.displayInfo();
	}
}
