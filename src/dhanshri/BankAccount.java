package dhanshri;

public class BankAccount{

 String custName;
 String bankPassword;
 int accountNum;
 
 void setDetails(String username, String password, int bankAccountNumber){
 custName = username;
 bankPassword = password;
 accountNum = bankAccountNumber;
 }

 void updatePassword(String password){
 bankPassword = password;
 }

 void displayInfo(){
 System.out.println("Customer name is "+custName);
 System.out.println("Customer password is "+bankPassword);
 System.out.println("Customer account number is "+accountNum);
 }
 
 public static void main(String[] args){
 BankAccount bankAccount = new BankAccount();
 bankAccount.setDetails("Dhanshri","1245@D",12547);
 bankAccount.displayInfo();
 bankAccount.updatePassword("98745!S");
 bankAccount.displayInfo();
 }
}
