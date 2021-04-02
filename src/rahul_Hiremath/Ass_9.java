package rahul_Hiremath;

public class Ass_9 {

	int amt = 1000;
	int debCount;
	int crdCount;
	int pintBalCount;
	static int sCreditCount;
	static int sDebitCount;
	static int sPBalCount;

	void debitAmt(int dAmt) {
		amt = amt - dAmt;
		debCount++;
		sDebitCount++;
	}

	void crdAmt(int cAmt) {
		amt = amt + cAmt;
		crdCount++;
		sCreditCount++;
	}

	void printBalance() {
		pintBalCount++;
		sPBalCount++;
	}

	void individualTransactionSummaryU1() {
		System.out.println("user1 transaction summary : Credit: " + crdCount + " times, Debit: " + debCount
				+ " times, Print Balance: " + pintBalCount + " times.");
	}

	void individualTransactionSummaryU2() {
		System.out.println("user2 transaction summary : Credit: " + crdCount + " times, Debit: " + debCount
				+ " times, Print Balance: " + pintBalCount + " times.");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary: Credit - " + sCreditCount + " times, Debit - " + sDebitCount
				+ " times, Print Balance - " + sPBalCount + " times");
	}

	public static void main(String[] args) {
		Ass_9 user1 = new Ass_9();
		user1.debitAmt(200);
		user1.crdAmt(100);
		user1.crdAmt(300);
		user1.printBalance();
		user1.individualTransactionSummaryU1();
		Ass_9 user2 = new Ass_9();
		user2.debitAmt(300);
		user2.debitAmt(300);
		user2.crdAmt(200);
		user2.crdAmt(100);
		user2.crdAmt(100);
		user2.crdAmt(100);
		user2.crdAmt(200);
		user2.individualTransactionSummaryU2();
		user2.allTransactionSummary();
	}
}
