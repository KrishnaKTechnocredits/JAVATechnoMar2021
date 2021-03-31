package monika;

/* Assignment 3 : 23rd March 2021

1. Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer [for example : 13164]*/

class BankAccount{
String usernameAccount; 
String passwordAccount; 
int bankAccountNumber;

void setDetails(String username, String password, int bankAccountNumberTemp){
	usernameAccount = username;
	passwordAccount = password;
	bankAccountNumber = bankAccountNumberTemp;
}
void updatePassword(String password){
	passwordAccount = password;
}
void displayInfo(){
	System.out.println("My bank username is: "+usernameAccount+ " and password is "+passwordAccount+ " for account number "+bankAccountNumber);
}

public static void main(String[] args){
	BankAccount bankAccount = new BankAccount();
	bankAccount.setDetails("monikakaul05","Technocredts@123#",1234);
	bankAccount.updatePassword("Monika@123#");
	bankAccount.displayInfo();
}
}