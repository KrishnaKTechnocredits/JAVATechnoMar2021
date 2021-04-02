package neha_Patil;

public class BankAccount {
    String username;
	  String password;
	  int bankaccountNumber;
	  
	  void setDetails(String name,String pwd, int account){
	         username = name;
			 password = pwd;
			 bankaccountNumber = account;
			 
	}		 
		void updatePassword(String updtpwd) {
            password = updtpwd;
  }	
    void display(){
       System.out.println("username is: "+ username);
		 System.out.println ("password is: "+ password);
		 System.out.println("Bank Account Number is:"+bankaccountNumber);
		 
		 }
		 public static void main(String[] args){
		 BankAccount b1 = new BankAccount();
		 b1.setDetails("Neha",",vrish@25",2392);
		 b1.display();
		 b1.updatePassword("newpassword");
		 b1.display();
		 }
		 

}
