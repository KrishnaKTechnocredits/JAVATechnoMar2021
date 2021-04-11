/*Assignment 9 : 2nd April 2021
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
hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
 */

package ravindra_J.Assignment_No_9;

 
public class BankSystem {

	static int creditAmount;
	static int debitAmount;
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
		System.out.println(totalBalence);
		printCount++;
		individualPrintCount++;
	}
	
	void individualTransactionSummary(){
		System.out.println("Individual Number of debit count:- "+individualDebitCount+" , Individual Number of credit count :- "+ individualCreditCount+ " Individual Number of Print Balence count :- "+individualPrintCount);
	}
	void allTransactionSummary(){
		System.out.println("All Number of debit count:- "+ debitCount+" , All Number of credit count :- "+ creditCount+ " All Number of Print Balence count :- "+printCount);
		
	}
	

	public static void main(String []args){
		BankSystem banksystem = new BankSystem();
		BankSystem banksystem1 = new BankSystem();
		
		banksystem.setOpeningBalence(1000);
		banksystem.debitBalence(200);
		System.out.print("Current balence after debit "+debitAmount+" is :- ");
		banksystem.printCurrentBalence();
		banksystem.creditBalence(300);
		System.out.print("Current balence after Credit "+creditAmount+" is :- ");
		banksystem.printCurrentBalence();
		
		banksystem1.setOpeningBalence(10000);
		banksystem1.debitBalence(2555500);
		banksystem1.creditBalence(100);
		System.out.print("Current balence after Credit "+creditAmount+" is :- ");
		banksystem1.printCurrentBalence();
		
		
		banksystem1.individualTransactionSummary();
		banksystem1.allTransactionSummary();
}
}
