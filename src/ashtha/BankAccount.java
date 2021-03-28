package ashtha;

class BankAccount {
	
	int bankAccountNumber;
	String username;
	String password;
	
	void setDetails (int accNo, String name, String pwd) {
		bankAccountNumber = accNo;
		username = name;
		password = pwd;
	}

	void updatePassword (String upadtedPassword) {
		password = upadtedPassword;
	}

	void displayInfo(){
		System.out.println("The bank account number is "+bankAccountNumber);
		System.out.println("The username is "+username);
		System.out.println("The password of the user is "+password);
	}
	
	public static void main (String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails(12345678,"Astha Prakash","password123");
		bankAccount.updatePassword("Password321");
		bankAccount.displayInfo();
	}
}
		
	
	