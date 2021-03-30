package gaurav;

//Create a class called BankAccount, which has 3 methods.
//Assignment 3

 class BankAccount{
	 	String username;
		String password;
		int bankaccountno;
  
	void setDetails(String name,String pass,int accountno){
		username = name;
		password = pass;
		bankaccountno = accountno;
    }
  
	void updatepassword(String pass){
		password=pass;
    }
	void displayInfo(){
		System.out.println("Bank account holder name :- " +username);
		System.out.println("Bank password is :- " +password);
		System.out.println("Bank account no is :- "+bankaccountno);
    }
	public static void main(String[]args){
		BankAccount bankaccount1 = new BankAccount();
		bankaccount1.setDetails("gaurav","gaurav@123",13164);
		bankaccount1.displayInfo();
		bankaccount1.updatepassword("gaurav@1234");
		bankaccount1.displayInfo();
	}
 }   

     
     
   