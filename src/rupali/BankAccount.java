//Assignment 3 

package rupali;
class BankAccount{

	int bankAccountNumber;
	String username;
	String password;
	
	void setDetails(int number,String name,String pwd){
		bankAccountNumber=number;
		password=pwd;
		username=name;
	}
	
	void upadatePassword(String pwd){
		password=pwd;
	}
	
	void display(){
		System.out.println("Account number is:"+bankAccountNumber);
		System.out.println("Username is:"+username);
		System.out.println("password is:"+password);
	}
	
	public static void main(String[] args){
	
	BankAccount bankaccount= new BankAccount();
	bankaccount.setDetails(13121,"Rupali","java");
	bankaccount.display();
	bankaccount.upadatePassword("java2");
	bankaccount.display();
	}
}