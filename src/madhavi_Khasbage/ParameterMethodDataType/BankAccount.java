package madhavi_Khasbage.ParameterMethodDataType;

class BankAccount
{
	String userName;
	String password;
	int bankAccountNumber;
	
	void setDetails(String userName1,String password1,int bankAccountNumber1){
		userName=userName1;
		password=password1;
		bankAccountNumber=bankAccountNumber1;
	}
	
	void updatePassword(String newPassword){
		password= newPassword;
	}
	
	void displayInfo(){
		System.out.println("UserName = " + userName);
		System.out.println("Password = " + password);		
		System.out.println("Bank account number = " + bankAccountNumber);
	}
	
	public static void main(String[] agrs){
		BankAccount objBank=new BankAccount();
		objBank.setDetails("Madhavi","test123",1234567);
		objBank.displayInfo();
		objBank.updatePassword("Madhavi123");
		objBank.displayInfo();
	}
	
}