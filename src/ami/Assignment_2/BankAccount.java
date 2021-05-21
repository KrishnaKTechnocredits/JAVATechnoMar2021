package ami.Assignment_2;

public class BankAccount {
	String User;
	String Pass;
	int AccNum;

	void setDetails(String username,String password,int bankAccountNumber) {
		 User = username;
		 Pass = password;
		 AccNum = bankAccountNumber;	
	}
	
	void updatePassword(String Password) {
		 //Pass = Password;
		 System.out.println("New password :" + (Pass = Password));
		
	}
	
	void displayInfo() {
		System.out.println("Customer Name :" + User);
		//System.out.println("Old Password :" + Pass);
		System.out.println("BankAccountNumber :" + AccNum);
	}
	
	public static void main(String[] a) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Ami","Lakkad",12345);
		bankAccount.displayInfo();	
		bankAccount.updatePassword("patel");	
	}
}


