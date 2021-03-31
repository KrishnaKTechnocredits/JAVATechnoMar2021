package sai;

class BankAccount{
	String name, pwd;
	int bankAccount;

	void setDetails(String username, String password, int bankAccountNumber){
		name = username;
		pwd = password;
		bankAccount = bankAccountNumber;
	}
	
	void updatePassword(String updatePassword){
		pwd = updatePassword;
	}
	
	void displayInfo(){
		System.out.println("User name is : " + name);
		System.out.println("Password is : " + pwd);
		System.out.println("Bank account number is : " + bankAccount);	
	}
	
	public static void main(String[] args){
		BankAccount banckAccount  = new BankAccount();
		banckAccount.setDetails("Sai Krishna","Admin123",123456);
		banckAccount.displayInfo();
		banckAccount.updatePassword("Sunny123");
		banckAccount.displayInfo();
	}
}