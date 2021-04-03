package parakh;

public class BankAccount{

      String userName, userPassword;
	  int bankAccountNumber;
	  
	  void setDetails(String uName, String uPassword, int ubankAccountNumber){
	       userName = uName;
		   userPassword = uPassword;
		   bankAccountNumber = ubankAccountNumber;
	  }
	  
	  void updatePassword(String updatedPwd){
	       userPassword = updatedPwd;
	  }
	  
	  void displayInfo(){
	       System.out.println("User Name: " +userName +"\n" + "User Password: " +userPassword +"\n" + "Bank Account Number: " +bankAccountNumber);
	  }
	  
	  public static void main(String argsn[]){
	        BankAccount bankAccount = new BankAccount();
			bankAccount.setDetails("Parakh", "Pass@123", 123456);
			bankAccount.displayInfo();
			System.out.println("-----After updating Password-----");
			bankAccount.updatePassword("EditPass@123");
			bankAccount.displayInfo();
			}
}