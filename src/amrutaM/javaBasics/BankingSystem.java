package amrutaM.javaBasics;

/*Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called.
Hint : Create 3 non static instance variables.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance.
*/
public class BankingSystem {
	int debitAmt, creditAmt;
	int debitCnt = 0, creditCnt = 0,printBalanceCnt=0;
	int balance;
	static int overallDebitCnt, overallCreditCnt,overallPrintCnt;
	String customerName;

	void setUserDetails(String username, int initBal) {
		customerName = username;
		balance = initBal;
	}

	void individualTransactionSummary() {
		System.out.println(customerName+" Individual transaction summary : Credit - "+creditCnt+" times, "
				+ "Debit - "+debitCnt+ " times, printBalance - "+printBalanceCnt+ " time");
	}

	void debitAmount(int amount) {
		balance = balance - amount;
		debitCnt++;
		overallDebitCnt++;
	}

	void creditAmount(int amount) {
		balance = balance + amount;
		creditCnt++;
		overallCreditCnt++;
	}

	void printBalance() {
		System.out.println(customerName +" balance is - "+balance);
		printBalanceCnt++;
		overallPrintCnt++;
	}
	void allTransactionSummary() {
		System.out.println("All transaction details --> Credit - "+ overallCreditCnt+" times, Debit - "+overallDebitCnt+" times, printBalance - "+overallPrintCnt+" time");
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem = new BankingSystem();
		bankingSystem.setUserDetails("Maulik", 1000);
		bankingSystem.printBalance();
		bankingSystem.creditAmount(500);
		bankingSystem.debitAmount(200);
		//bankingSystem.individualTransactionSummary();
		bankingSystem.debitAmount(200);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary();
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setUserDetails("Krishna", 11000);
		bankingSystem1.printBalance();
		bankingSystem1.creditAmount(500);
		bankingSystem1.debitAmount(200);
		bankingSystem1.debitAmount(200);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		bankingSystem.allTransactionSummary();
	}
}
