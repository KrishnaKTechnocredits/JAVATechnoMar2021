package rikin.assignment3;

class BankAccount{
	String userName;
	String password;
	int bankAccountNumber;
	
	void setDetails(String customerName, String customerPwd, int customerBankAccountNumber){
		userName = customerName;
		password = customerPwd;
		bankAccountNumber = customerBankAccountNumber;
	}
	
	void updatePassword(String customerPwd){
		password = customerPwd;
		System.out.println("Customer updated password is " + password);
	}	
	
	void displayinfo(){
		System.out.println("Customer name is " + userName);
		System.out.println("Customer password is " + password);
		System.out.println("Customer Bank account number is " + bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Rikin", "*RRR*", 1234);
		bankAccount.displayinfo();
		bankAccount.updatePassword(" #rrr# ");
	}
}
