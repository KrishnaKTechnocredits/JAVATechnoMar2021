package upasana.assignment_1_5;

class BankAccount{
	String username,password;
	int bankAccountNumber;
	
	void setDetails(String uName,String pwd,int bankAccount){
		username = uName;
		password = pwd;
		bankAccountNumber = bankAccount;
	}
	
	void updatePassword(String pwd){
		password = pwd;
	}
	
	void displayInfo(){
		System.out.println("Username is "+username);
		System.out.println("Password is "+password);
		System.out.println("BankAccountNumber is "+bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Upasana","passwo",1233223);
		bankAccount.updatePassword("pass");
		bankAccount.displayInfo();
	}
}