package bhushan;
class BankAccount{
	String username,password;
	int bankAccountNumber;
	void setDetails(String uname,String pwd,int acno){
		username = uname;
		password = pwd;
		bankAccountNumber = acno;
	}
	void updatePassword(String psword){
		password = psword;
	}
	void displayInfo(){
		System.out.println("Username is: " +username);
		System.out.println("Password is: " +password);
		System.out.println("BankAccountNumber is: " +bankAccountNumber);
	} 
	public static void main(String [] a){
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setDetails("Bhushan","BB123",100);
		bankAccount1.updatePassword("Bhushan123");
		bankAccount1.displayInfo();
	}
}