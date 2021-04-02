/*Java Assignment 9: 2nd April 2021

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
*/


package vaibhav;

public class BankingSystem {
	
	String custName;
	int debitAmt, creditAmt, currentBalance;
	int dCount, cCount, pBCount;
	static int totalDCount=0, totalCCount=0, totalPBCount=0;
	
	
	//==============================================//
	//             Set Customer Details      	    //
	//==============================================//
		
	void setData(int cBalance, String name) {
		currentBalance = cBalance;
		custName = name;		
	}
	
	
	//======================================================//
	//             		Transaction	for Debit	   	  	    //
	//======================================================//
		
	void debitAmmount(int dAmt){
		debitAmt = dAmt;
		
		if (debitAmt<=0){
			System.out.println("Please enter ammout greater than zero");
		}
		
		if (currentBalance <=0){
			System.out.println("Not able to perform action as current balance in account is zero OR less than zero");
		}
					
		if (debitAmt > 0){
			if (currentBalance > 0){
				if (currentBalance >= debitAmt) {
					currentBalance = currentBalance - debitAmt;
					dCount++;
					totalDCount++;
				}else {
					System.out.println("Debit transection is not able to perform as debit ammount (i.e. " + debitAmt+ ") is larger than available balance in account");
				}
			}
		}
	}
	
	
	//======================================================//
	//             		Transaction	for Credit	   	  	    //
	//======================================================//
	
	void creditAmmount(int cAmt) {
		creditAmt = cAmt;
		
		if (creditAmt <= 0) {
			System.out.println("Credit transection is not able to perform as credit ammount is less than or equal to zero");
		}
		else {
			currentBalance = currentBalance + creditAmt;
			cCount++;
			totalCCount++;			
		}	
	}
	
	
	//======================================//
	//             Print Balance      	    //
	//======================================//
		
	void printBalance() {
		System.out.println("Current balance in " + custName + "'s account is " + currentBalance);
		pBCount++;
		totalPBCount++;
	}
	
	//======================================================//
	//             Individual transaction summary      	    //
	//======================================================//
	
	void individualTransactionSummary() {
		System.out.println("");
		System.out.println(custName + "'s transaction summary : " + "Credit - " + cCount + " times , "+ "Debit - " + dCount + " times , "+ "Print Balance - " + pBCount + " times.");
	}
	
	
	//======================================================//
	//             Overall transaction summary      	    //
	//======================================================//
	
	void allTransactionSummary() {
		System.out.println("");
		System.out.println("All transaction summary : " + "Credit - " + totalCCount + " times , "+ "Debit - " + totalDCount + " times , "+ "Print Balance - " + totalPBCount + " times.");
	}
	
	
	//=======================================================================//
	//    					Main Function calling 			 	  		     //  
	//=======================================================================//
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		
		bankingSystem1.setData(15000, "Techno_1");					// Object 1
		bankingSystem1.printBalance();
		bankingSystem1.debitAmmount(100);
		bankingSystem1.printBalance();
		bankingSystem1.debitAmmount(16000);
		bankingSystem1.printBalance();
		bankingSystem1.debitAmmount(12000);
		bankingSystem1.creditAmmount(3400);
		bankingSystem1.printBalance();
		
		bankingSystem2.setData(2000, "Techno_2");					// Object 2
		bankingSystem2.creditAmmount(3000);
		bankingSystem2.creditAmmount(1500);
		bankingSystem2.creditAmmount(2000);
		bankingSystem2.debitAmmount(1800);
		bankingSystem2.debitAmmount(100);
		bankingSystem2.creditAmmount(1500);
		bankingSystem2.creditAmmount(2000);
		bankingSystem2.printBalance();
		
		bankingSystem1.individualTransactionSummary();				// Individual Transaction Summary
		bankingSystem2.individualTransactionSummary();
		
		bankingSystem1.allTransactionSummary();						// Overall Transaction Summary
	}
}
