/*
 * Assignment9
 */
package neha_Rathi;

public class BankingSystem {
	String name;
	int amount;
	int debitCount = 0;
	int creditCount = 0;
	int printBalanceCount = 0;
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int totalPrintBalanceCount = 0;

	void setData(String cName, int initialAmt) {
		name = cName;
		amount = initialAmt;
	}

	void debitAmount(int debitAmt) {
		if (debitAmt > amount) {
			System.out.println("You dont have sufficient balance");
		} else {
			amount = amount - debitAmt;
			debitCount++;
			totalDebitCount++;
		}
	}

	void creditAmount(int creditAmt) {
		amount = amount + creditAmt;
		creditCount++;
		totalCreditCount++;
	}

	void printBalance() {
		System.out.println("Current balance for " + name + " is: " + amount + "\n");
		printBalanceCount++;
		totalPrintBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println(name + " transcation summary is: " + "\n" + "Credit - " + creditCount + " times, "
				+ " Debit - " + debitCount + " times, " + " PrintBalance - " + printBalanceCount + " times" + "\n");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary: " + "\n" + "Credit - " + totalCreditCount + " times, " + " Debit - "
						+ totalDebitCount + " times, " + " PrintBalance - " + totalPrintBalanceCount + " times" + "\n");
	}

	public static void main(String[] a) {
		BankingSystem bankingSystem = new BankingSystem();
		bankingSystem.setData("Customer1", 2000);
		bankingSystem.debitAmount(1000);
		bankingSystem.creditAmount(3000);
		bankingSystem.creditAmount(3000);
		bankingSystem.debitAmount(1000);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary();
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setData("Customer2", 10000);
		bankingSystem1.creditAmount(3000);
		bankingSystem1.creditAmount(3000);
		bankingSystem1.creditAmount(3000);
		bankingSystem1.creditAmount(3000);
		bankingSystem1.creditAmount(3000);
		bankingSystem1.debitAmount(5000);
		bankingSystem1.debitAmount(5000);
		bankingSystem1.individualTransactionSummary();
		bankingSystem1.allTransactionSummary();
	}
}
