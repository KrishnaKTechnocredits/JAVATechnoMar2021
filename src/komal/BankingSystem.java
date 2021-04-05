package komal;

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

public class BankingSystem {
	String custName;
	int totalAmt;
	int creditCount;
	int debitCount;
	int balanceCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintBalanceCount;

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
		if(totalAmt>dAmount) {
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
		BankingSystem bankingsystem = new BankingSystem();
		bankingsystem.customerDetails("Komal",10000);
		bankingsystem.creditAmountMethod(500);
		bankingsystem.creditAmountMethod(500);
		bankingsystem.debitAmountMethod(1000);
		bankingsystem.printBalance();
		bankingsystem.individualTransactionSummary();
		
		BankingSystem bankingsystem_1 = new BankingSystem();
		bankingsystem_1.customerDetails("Vishal",50000);
		bankingsystem_1.creditAmountMethod(1000);
		bankingsystem_1.creditAmountMethod(2000);
		bankingsystem_1.creditAmountMethod(3000);
		bankingsystem_1.creditAmountMethod(4000);
		bankingsystem_1.creditAmountMethod(5000);
		bankingsystem_1.debitAmountMethod(5000);
		bankingsystem_1.debitAmountMethod(5000);
		bankingsystem_1.individualTransactionSummary();
		bankingsystem_1.allTransactionSummary();
	}
}