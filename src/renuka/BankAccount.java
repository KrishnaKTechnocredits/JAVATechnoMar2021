/*Assignment-3 :Create a class called BankAccount which has 3 methods.*/

package renuka;

class BankAccount{
    
	 String userName;
	 String password;
	 int accountNumber;
	 
	 void setDetails(String uname, String pwd, int acc){
	     userName = uname;
		 password = pwd;
		 accountNumber = acc;
	 }
	 
	 void updatePassword(String updatePwd){
	     password = updatePwd;
	 }
	 
	 void displayInfo(){
	     System.out.println("User Name is: " +userName);
		 System.out.println("Password is: " +password);
		 System.out.println("Account Number is: " +accountNumber);
	 }
	 
	 public static void main(String[] args){
		 BankAccount bankAccount = new BankAccount();
		 bankAccount.setDetails("Renuka", "Abc@123", 1234567);
		 bankAccount.displayInfo();
		 bankAccount.updatePassword("Xyz@123");
		 bankAccount.displayInfo();
	 }
}

