package sourabh;

class BankAccount{
	String username;
	String pwd;
	long accNo;
	
	void setDetails(String username1, String pwd1, long accNo1 ){
		username= username1;
		pwd= pwd1;
		accNo= accNo1;
	//	System.out.println()
	}
	void displayInfo(){
		System.out.println("Username is: "+username);
		System.out.println("Password is: "+pwd);
		System.out.println("Bank Account Number is: "+accNo);
	}
	void updatePassword(String pwd1){
		pwd= pwd1;
		System.out.println("New Password is: "+pwd);
	}
	public static void main(String[] args){
		BankAccount bankaccount= new BankAccount();
		bankaccount.setDetails("Sourabh","sourabh123",12345);
		bankaccount.displayInfo();
		bankaccount.updatePassword("test123");
		
	}
}