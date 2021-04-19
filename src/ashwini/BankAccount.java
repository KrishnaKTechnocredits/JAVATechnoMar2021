//Assignment number-2
package ashwini;

class BankAccount{
	String userName ;
	String passward , updatedPassward;
	int bankAccountNumber;
	
	void setDetails(String name , String passward1 , int accountNumber){
		userName = name;
		passward = passward1;
		bankAccountNumber = accountNumber;
	}
	
	void updatePassward(String passward){
		updatedPassward = passward;
		
	}
	void displayInfo(){
		System.out.println("Account holder name is "+ userName);
		System.out.println("Account passward is "+ passward);
		System.out.println("Account number is "+ bankAccountNumber);
		System.out.println("updated Passward is "+ updatedPassward);
	}
	public static void main( String args[]){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Ashwini Jadhav" , "Ash#123" , 123456789);
		bankAccount.updatePassward("Ash@123");
		bankAccount.displayInfo();
	}
}

