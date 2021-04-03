package surabhi.assignment9;

/*Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
*/

public class BankDetails {
	String Customername;
	int currentBal=10000;
	int debitCount=0, creditCount=0, counter=0;
	static int debitAmtCount=0, creditAmtCount=0, methodCounter=0;
	
	void debitAmt(int amt, String name) {
		Customername=name;
		if(currentBal>=amt) {
			currentBal=currentBal-amt;
			debitAmtCount++;
			debitCount++;
		}

	}

	void creditAmt(int amt, String name) {
			Customername=name;
			currentBal=currentBal+amt;
			creditAmtCount++;
			creditCount++;	
	}
	
	void printBalance() {
		
			System.out.println(Customername+ " Current Account Balance is :"+currentBal );	
			counter++;
			methodCounter++;
	}
	
	void individualTransactionSummary() {
		
		System.out.println(Customername+ " transaction summary :" +"Credit - " +creditCount+ ", Debit - " +debitCount+ ", printBalance - "+counter);
	}
	
	void allTransactionSummary() {
		
		System.out.println("All transaction summary :" +"Credit - " +creditAmtCount+ ", Debit - " +debitAmtCount+ ", printBalance - "+methodCounter);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails bankDetails=new BankDetails();
		bankDetails.debitAmt(1000, "Surabhi");
		bankDetails.debitAmt(1200, "Surabhi");
		bankDetails.printBalance();
		bankDetails.creditAmt(500, "Surabhi");
		bankDetails.printBalance();
		bankDetails.individualTransactionSummary();
		
		BankDetails bankDetails_1=new BankDetails();
		bankDetails_1.debitAmt(1000, "Shreyash");
		bankDetails_1.printBalance();
		bankDetails_1.creditAmt(500, "Shreyash");
		bankDetails_1.printBalance();	
		bankDetails_1.individualTransactionSummary();
		
		bankDetails_1.allTransactionSummary();
	}

}
