package krati_Shukla;

class BankAccount
{
	String username;
	int bankAccountNumber;
	String password;
	
	void setDetails(String uName, String pass, int bankAccNo){
		username = uName;
		password = pass;
		bankAccountNumber = bankAccNo;
	}
	void updatePassword (String pass){
		password = pass;
	}
	void displayInfo(){
		System.out.println("Username = "+username);
		System.out.println("Password = "+password);
		System.out.println("BankAccountNumber = "+bankAccountNumber);
	}
	public static void main (String[] a)
	{
			BankAccount bankAccount = new BankAccount();
			bankAccount.setDetails("Krati","Techno",555555);
			bankAccount.updatePassword("credit");
			bankAccount.displayInfo();
	}
}
			