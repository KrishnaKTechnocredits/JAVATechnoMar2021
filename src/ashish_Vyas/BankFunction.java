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
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
*/
package ashish_Vyas;
public class BankFunction {
	String user;
	int balanceAmount ;
	static int countDebitTrans =0 ;
	static int countCreditTrans =0 ;
	static int countBalancePrint=0 ;
	int localcountDb=0;
	int localcountCr=0;
	int localcountPr=0;
	
	void debitAmount(int dbAmt) {
		if (balanceAmount >= dbAmt) {
		balanceAmount = balanceAmount - dbAmt ;
		localcountDb++ ;
		countDebitTrans++ ;
		}else //if balance is not sufficient for credit;
			System.out.println(countCreditTrans +"Transaction could not be Complete: Available Balance: "+balanceAmount+" ,Debit Requirment: "+dbAmt);
	}
	
	void creditAmount(int crAmt) {
		balanceAmount = balanceAmount + crAmt ;
		countCreditTrans++ ;
		localcountCr++ ;
		}
	
	void displayCurrentBalance() {
		System.out.println("Current balance of "+user+": "+ balanceAmount);
		countBalancePrint++ ;
		localcountPr++ ;
	}
	
	void individualTransactionSummary() {
		System.out.println(user +" transaction summary : Credit - "+localcountCr+ " times, Debit - "+localcountDb+ " times, printBalance -"+localcountPr+ " time");
	}
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - "+countCreditTrans+" times, Debit - "+countDebitTrans+" times, printBalance - "+countBalancePrint+" time");
	}
	
	public static void main(String[] arg) {
		BankFunction bankFunction1 = new BankFunction();
		bankFunction1.user = "User1";
		bankFunction1.creditAmount(10000);
		bankFunction1.debitAmount(5000);
		bankFunction1.creditAmount(2000);
		bankFunction1.displayCurrentBalance();
		bankFunction1.individualTransactionSummary();
		//Now Creating 2nd Object bankFunction2
		BankFunction bankFunction2 = new BankFunction();
		bankFunction2.user = "User2";
		bankFunction2.creditAmount(7000);
		bankFunction2.debitAmount(3000);
		bankFunction2.creditAmount(1000);
		bankFunction2.debitAmount(3000);
		bankFunction2.creditAmount(1000);
		bankFunction2.creditAmount(1000);
		bankFunction2.creditAmount(1000);
		bankFunction2.individualTransactionSummary();
		bankFunction2.allTransactionSummary();
		
	}
}
