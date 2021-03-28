package priyanka_Panat;

/*
 Assignment 3
 */

class BankAccount{
	String username;
	String password;
	int accountno;
	
	void setDetails(String name,String pwd,int accno){
		username=name;
		password=pwd;
		accountno=accno;
	}
	
	void updatePassword(String upassword){
		password=upassword;
	}
	
	void displayInfo(){
		System.out.println("Username is "+ username);
		System.out.println("Password is "+ password);
		System.out.println("Account Number is "+ accountno);
	}
	
	public static void main(String[] args){
		BankAccount b1=new BankAccount();
		b1.setDetails("priyanka30","Star123",457896);
		b1.displayInfo();
		b1.updatePassword("Hope89");
		b1.displayInfo();
	}
}
		