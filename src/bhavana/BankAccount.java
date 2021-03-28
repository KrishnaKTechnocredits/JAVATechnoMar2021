package bhavana;
class BankAccount{
	String username;
	String password;
	int BankAccountNumber;
	
	void setDetails(String uname,String pwd, int bankaccnumber){
		username=uname;
		password=pwd;
		BankAccountNumber=bankaccnumber;
	}
	
	void updatePassword(String pwd){
		password=pwd;
	}
	
	void displayInfo(){
		System.out.println("Username is:" +username);
		System.out.println("Password is:" +password);
		System.out.println("Bank account number is:" +BankAccountNumber);
	}
	
	public static void main(String [] args){
		BankAccount bankaccount= new BankAccount();
		bankaccount.setDetails("Bhavana","hhh12",431212);
		bankaccount.displayInfo();
		bankaccount.updatePassword("bhav123");
		bankaccount.displayInfo();
	}
}