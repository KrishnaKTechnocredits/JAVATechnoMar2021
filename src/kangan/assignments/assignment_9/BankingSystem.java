package kangan.assignments.assignment_9;

/**
 * Create a Banking System which has the following functionality.* Create two
 * object to perform below scenario. 1) Method to debit amount 2) Method to
 * credit amount 3) Method to printBalance [it will print current balance] 4)
 * individualTransactionSummary() method should show how many times individually
 * debit, credit & printBalance method called . Hint : Create 3 non static
 * instance variable. Output* : user1 transaction summary : Credit - 2 times,
 * Debit - 1 times, printBalance - 1 time user2 transaction summary : Credit - 5
 * times, Debit - 2 times, printBalance - 0 time 5) allTransactionSummary()
 * method should show by both users total how many times debit, credit &
 * printBalance method get called. Hint : Create 3 static variables will be
 * required. Output* : All transaction summary : Credit - 7 times, Debit - 3
 * times, printBalance - 1 time
 */

public class BankingSystem {

	int totalBal=5000;
	int debitCount;
	int creditCount;
	int printBal;
	static int printBalTotal;
	static int debitCountTotal;
	static int creditCountTotal;
	
	
	void debitAmount(int debit) {
		if(debit<=totalBal) {
		totalBal= totalBal-debit;
		debitCount++;
		debitCountTotal++;
		}
		else {
			System.out.println("Invalid input");
		}
	}
	void creditAmount(int credit) {
		totalBal = totalBal+credit;
		creditCount++;
		creditCountTotal++;
		
	}
	void printBalance() {
		
		if (totalBal>=0) {
			System.out.println("Current bal is :" + totalBal);
		}
		else {
			System.out.println("Bal not sufficient");	
		}
		printBal++;
		printBalTotal++;
	}
	
	void individualTransactionSummary(){
		System.out.println("Debited :" + debitCount +" times");
		System.out.println("Credited :" + creditCount +" times");
		System.out.println("Print count is : " + printBal);
	}
	void allTransactionSummary() {
		System.out.println("All transaction summary: \nTotal Debited :" + debitCountTotal +" times");
		System.out.println("Total Credited :" + creditCountTotal +" times");
		System.out.println("Total print count is : " + printBalTotal);
		
	}
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.debitAmount(100);
		bankingSystem1.creditAmount(500);
		bankingSystem1.creditAmount(200);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		System.out.println();
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.debitAmount(100);
		bankingSystem2.creditAmount(200);
		bankingSystem2.printBalance();
		bankingSystem2.allTransactionSummary();
	}
}
