package adwait;

class BankAccount{
	String username;
	String password;
	int bankaccountnumber;
	
	void setDetails(String userName, String passWord, int bankAccountNumber){
		username=userName;
		password=passWord;
		bankaccountnumber=bankAccountNumber;
		
		System.out.println("Details in Set method");
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankaccountnumber);
	}
	
	void updatePassword (String updatedPassword){
		password=updatedPassword;
	}
	
	void displayInfo(){
		System.out.println("Details after updating password");
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankaccountnumber);		
	}
	
	public static void main (String [] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Adwait","dummypassword",123456);
		bankAccount.updatePassword("updatedpassword");
		bankAccount.displayInfo();
	}
		
}