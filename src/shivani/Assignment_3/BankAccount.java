package shivani.Assignment_3;

class BankAccount{
    String userName;
    int accountNumber;
    String password;
   
   void setDetails(String name,int accNumber,String pass ){
	   userName =name;
	   accountNumber=accNumber;
	   password=pass;
   }
   
   void updatePassword(String updatePass){
	   password=updatePass;
	   System.out.println("Updated password ="+password);
   }
   
   void displayInfo(){
	   System.out.println("UserName is ="+userName);
	   System.out.println("Account number is ="+accountNumber);
	   System.out.println("Password is ="+password);
   }
   
   public static void main(String [] args){
	   BankAccount bankAccount=new BankAccount();
	   bankAccount.setDetails("shivani",1212313,"12@s");
	   bankAccount.displayInfo();
       bankAccount.updatePassword("qwerty@");
   }   
}   
   
	   
	   
	   
	   