package surabhi;
/*
 * 
 * Assignment num 2
 * */
class BankAccount{
	String username, password;
	int bankAccountNumber;

	void setDetails(String name, String pwd, int accNumber){
		username=name;
		password=pwd;
		bankAccountNumber=accNumber;
	}

	void updatePassword(String pwd){
		password=pwd;
	}
	
	void displayInfo(){
		System.out.println("User name is :" +username);
		System.out.println("Password is :" +password);
		System.out.println("Account number is :" +bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount=new BankAccount();
		bankAccount.setDetails("Surabhi", "sur@123", 103);
		bankAccount.updatePassword("sur#123");
		bankAccount.displayInfo();
	
	}

}