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

package kapil;

public class BankTrans {
    String name;
	int totalBal;
	int debitCount = 0;
	int creditCount = 0;
    static int totalDebitCount = 0;
    static int totalCreditCount = 0;
    static int totalPrintBalance = 0;
    
    void setData(int initialBal, String cusName) {
    	totalBal = initialBal;
    	name= cusName;
    }
    
	void debitAmt(int amount) {
		if(amount <= totalBal) {
			totalBal = totalBal - amount;
			debitCount = debitCount + 1;	
			totalDebitCount = totalDebitCount + 1;
	}
}

	void creditAmt (int amount) {
		if(amount <= totalBal ) {
			totalBal = totalBal + amount;
			creditCount = creditCount + 1;
			totalCreditCount = totalCreditCount + 1 ;
		}
	}
	
	void printBal() {
		System.out.println("Print Balance : " +totalBal);
		     totalPrintBalance = totalPrintBalance + 1;
	}
	
	
	void individualTrans() {
		System.out.println("Customer Name : " + name);
		System.out.println("Debit operation count : "+debitCount);
		System.out.println("Credit operation count : "+creditCount);
	
	}
	
	void allTrans() {
		System.out.println("Total Debit Count : " +totalDebitCount);
		System.out.println("Total Credit Count : " +totalCreditCount);
		System.out.println("Total Print Balance : " +totalPrintBalance);
	
	}
	public static void main(String[] args) {
	     BankTrans banktrans1 = new BankTrans();
	     banktrans1.setData(10000, "Rahul");
	     banktrans1.debitAmt(1000);
	     banktrans1.creditAmt(500);
	     banktrans1.creditAmt(3000);
	     banktrans1.individualTrans();
	     banktrans1.printBal();
	     
	     BankTrans banktrans2 = new BankTrans();
	     banktrans2.setData( 20000, "Rohit");
	     banktrans2.debitAmt(1000);
	     banktrans2.debitAmt(200);
	     banktrans2.creditAmt(800);
	     banktrans2.creditAmt(250);
	     banktrans2.creditAmt(400);
	     banktrans2.creditAmt(500);
	     banktrans2.creditAmt(100);
	     banktrans2.individualTrans();
         banktrans2.allTrans();
   }
}
	