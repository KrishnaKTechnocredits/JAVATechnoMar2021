package krishna;

class BankAccount{
	String username;
	String password;
	int accountNumber;
		
	void setDetails(String name,String passcode,int bankAccountNumber){
		username=name;
		password=passcode;
		accountNumber=bankAccountNumber;
	}
	void updatePassword(String newPassword){
		password=newPassword;
	}
	void displayInfo(){
		System.out.println("User name is :"+username);
		System.out.println("Password is :"+password);
		System.out.println("Account number is :"+accountNumber);
	}
	public static void main(String[] args){
		BankAccount bankAccount= new BankAccount();
		bankAccount.setDetails("krishna@","Sawner",123456);
		bankAccount.updatePassword("Beersheba");
		bankAccount.displayInfo();
	}
}