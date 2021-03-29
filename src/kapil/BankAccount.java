package kapil;

class BankAccount{
      
	String username ;
	String password ;
	String  bankAccountNumber ;
	
	
	void setDetails( String cusName, String cusPassword, String cusAccountNumber){     
       username = cusName;
       password = cusPassword;
	   bankAccountNumber = cusAccountNumber;
    	   
	}
	
	void updatepassword(String updatepassword){
		password = updatepassword;
	}
	
	void display(){
		System.out.println(" Customer Name = " +username);
		System.out.println(" Customer Password = " +password);
		System.out.println(" Customer Account Number = " +bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setDetails("Rahul","20000Rahul", "110555555666" );
	    bankAccount1.display();
        bankAccount1.updatepassword("12345rahul");
        bankAccount1.display();
	}	
}
		