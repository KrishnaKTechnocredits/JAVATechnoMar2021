package pallavi.Assignment_9;

public class BankAccountInfo {
	int totalBalance;
	String username;
	int creditIndCount;
	int debitIndCount;
	int printIndCount;
	static int creditCount = 0;
	static int debitCount = 0;
	static int printBalCount = 0;

	void setUser(int totalBal, String name) {
		username = name;
		totalBalance = totalBal;
	}

	void debitAmount(int amt) {
		if (totalBalance >= amt) {
			totalBalance = totalBalance - amt;
			debitCount++;
			debitIndCount++;
		}
	}

	void creditAmount(int creditAmt) {
		if (creditAmt > 0)
			totalBalance = totalBalance + creditAmt;
		creditCount++;
		creditIndCount++;
	}

	void printBalance() {
		System.out.println(username + " balance is " + totalBalance);
		printBalCount++;
		printIndCount++;
	}

	void individualTransactionSummary() {
		System.out.println(username + " All transaction summary : Credit - " + creditIndCount + " times,   Debit - "
				+ debitIndCount + "times, printBalance - " + printIndCount + " times");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + creditCount + " times,   Debit - " + debitCount
				+ " times, printBalance - " + printBalCount + " times");

	}

	public static void main(String[] args) {
		BankAccountInfo bankAccountInfo = new BankAccountInfo();
		bankAccountInfo.setUser(50000, "user1");
		bankAccountInfo.printBalance();
		bankAccountInfo.debitAmount(20000);
		bankAccountInfo.creditAmount(10000);
		bankAccountInfo.creditAmount(5000);
		bankAccountInfo.printBalance();
		bankAccountInfo.individualTransactionSummary();
		BankAccountInfo bankAccountInfo1 = new BankAccountInfo();
		bankAccountInfo1.setUser(90000, "user2");
		bankAccountInfo1.debitAmount(30000);
		bankAccountInfo1.debitAmount(2000);
		bankAccountInfo1.printBalance();
		bankAccountInfo1.creditAmount(30000);
		bankAccountInfo1.printBalance();
		bankAccountInfo1.individualTransactionSummary();
		bankAccountInfo1.allTransactionSummary();

	}

}
