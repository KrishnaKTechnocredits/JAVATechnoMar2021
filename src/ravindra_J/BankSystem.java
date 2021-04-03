/*Assignment 9 : Banking System Transaction 2nd April 2021
Create a Banking System which has the following functionality.
Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time
5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
------------------------------- 
 */


package ravindra_J;

class BankSystem {

static double creditAmount;
static double debitAmount;
static double balence;
static double totalBalence;
static int debitCount=0,creditCount=0,printCount = 0;
int individualDebitCount=0,individualCreditCount=0,individualPrintCount = 0;
	   
	   
	void setOpeningBalence(int openingAmount){
		totalBalence=openingAmount;
		System.out.println("Opening balence is:-  " +totalBalence); 
	}
	void creditBalence(int creditAmount ){
		if(creditAmount > 0) {
			totalBalence = totalBalence + creditAmount;
			creditCount++;
			individualCreditCount++;
		}
	}
	void debitBalence(int debitAmount){
		if(debitAmount < totalBalence){
			totalBalence = totalBalence - debitAmount;
			debitCount++;
			individualDebitCount++;
		
		}
		else {
			System.out.println("Sorry , Your Account Has Insufficient Balance , Your Current Balance is - "+totalBalence);
		}
	
	}
	
	void printCurrentBalence(){
		//System.out.println("Current balance is :- "+totalBalence);
		System.out.println(totalBalence);
		printCount++;
		individualPrintCount++;
	}
	
	void individualTransactionSummary(){
		System.out.println("Total Count of Individual debit is :- "+individualDebitCount+" , Total Count of Individual credit is :- "+ individualCreditCount+ " Total Count of Individual Print Receipt is :- "+individualPrintCount);
	}
	void allTransactionSummary(){
		System.out.println("Total number of debits are:- "+ debitCount+" , Total number of credit are :- "+ creditCount+ " Total number of Print receipt :- "+printCount);
		
	}
	

	public static void main(String []args){
		BankSystem banksystem = new BankSystem();
		BankSystem banksystem1 = new BankSystem();
		
		banksystem.setOpeningBalence(1000);
		banksystem.debitBalence(200);
		System.out.println("Current balance after user1 debit is :- ");
		banksystem.printCurrentBalence();
		banksystem.creditBalence(300);
		System.out.println("Current balance after user2 credit is :- ");
		banksystem.printCurrentBalence();
		
		banksystem1.setOpeningBalence(10000);
		banksystem1.debitBalence(2555500);
		System.out.println("Current balance after user2 debit is :- ");
		banksystem1.printCurrentBalence();
		banksystem1.creditBalence(100);
		System.out.println("Current balance after user2 credit is :- ");
		banksystem1.printCurrentBalence();
		
		banksystem1.individualTransactionSummary();
		banksystem1.allTransactionSummary();
}
}

