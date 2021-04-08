package prachi.Assignment_9;

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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/


public class Assignment_9 {
	String custName;
	int totalAmt;
	int creditCount;
	int debitCount;
	int balanceCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintBalanceCount;
	//Harsh's comment: No need to initialize variable values.

	void customerDetails(String cName,int totalAmount) {
		custName = cName;
		totalAmt = totalAmount;
	}

	void creditAmountMethod(int cAmount){
		totalAmt = totalAmt + cAmount;
		creditCount++;
		totalCreditCount++;
	}

	void debitAmountMethod(int dAmount) {
		if(totalAmt>=dAmount) {                     //Harsh's Inputs: = is needed.
			totalAmt=totalAmt - dAmount;
			debitCount++;
			totalDebitCount++;
		}else {
			System.out.println("Transaction cannot be performed as '"+dAmount+ "' is greater than current account balance '"+totalAmt+"'");
		}
	}

	void printBalance(){
		System.out.println("Balance in " +custName+ " Account : " +totalAmt);
		balanceCount++;
		totalPrintBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println(custName+ " transaction summary : Credit - "+creditCount+ " times, Debit - "+debitCount+ " times, printBalance - "+balanceCount+ " times");
	}

	void allTransactionSummary() {
		System.out.println("All Transaction Summary : "+ "Credit - "+totalCreditCount+ " times, Debit - "+totalDebitCount+ " times, printBalance - "+totalPrintBalanceCount+ " times");
	}

	public static void main(String[] args){
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.customerDetails("Prachi",10000);
		assignment_9.creditAmountMethod(500);
		assignment_9.creditAmountMethod(500);
		assignment_9.debitAmountMethod(1000);
		assignment_9.printBalance();
		assignment_9.individualTransactionSummary();

		Assignment_9 assignment_9_1 = new Assignment_9();
		assignment_9_1.customerDetails("Sagar",50000);
		assignment_9_1.creditAmountMethod(1000);
		assignment_9_1.creditAmountMethod(2000);
		assignment_9_1.creditAmountMethod(3000);
		assignment_9_1.creditAmountMethod(4000);
		assignment_9_1.creditAmountMethod(5000);
		assignment_9_1.debitAmountMethod(5000);
		assignment_9_1.debitAmountMethod(5000);
		assignment_9_1.individualTransactionSummary();
		assignment_9_1.allTransactionSummary();
	}
}