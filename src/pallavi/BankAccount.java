package pallavi;

class BankAccount{
	String username; 
	String password;
	int bankAccountNumber;
	
	void setDetails(String userName,String pwd,int bankAccountNum){
		username=userName;
		password=pwd;
		bankAccountNumber=bankAccountNum;
	}
	
	void updatePassword(String pwd){
	password=pwd;
	
	}

	void display(){
	System.out.println("Username is " + username);
	System.out.println("Password is " + password);
	System.out.println("AccountNumber is " + bankAccountNumber);
	
	}
	
	public static void main(String args[]){
	BankAccount bankAccount= new BankAccount();
	bankAccount.setDetails("Pallavi","Pal1234",990514);
	bankAccount.updatePassword("Monika");
	bankAccount.display();
	
	}

}