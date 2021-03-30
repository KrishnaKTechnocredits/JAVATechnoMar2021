package dipali;

public class BankAccount{
	String userName , password;
	int bankAccountNo;
	
	void setDetails(String userName,String password,int bankAccountNo){
		 this.userName=userName;
		this.password=password;
		this.bankAccountNo=bankAccountNo;
	}
	
	void updatePassword(String password){
		this.password=password;
	}
	
	void displayInfo(){
		System.out.println("Bank user name is ["+userName+"]");
		System.out.println("Bank user password is ["+password+"]");
		System.out.println("Bank user account number is ["+bankAccountNo+"]");
	}
	
	public static void main(String args[]){
		BankAccount ba=new BankAccount();
		ba.setDetails("Dipali","password123",87654);
		ba.updatePassword("pass_123$");
		ba.displayInfo();
	}
}