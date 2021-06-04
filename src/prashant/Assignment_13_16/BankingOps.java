/* Assignment 15
A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
a)	Person can debit or credit amount from respective bank.
Hint: Switch case is expected here. [Please watch today's recording again, in case of confusion.]
b)	A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]
c)	A Method to show total credit, debit operations
Output: Total credit operation - 7 times
Total debit operation - 5 times
d)	A Method to show individual bank credit operations.
Output: ICICI bank Credit Operation - 2
HDFC bank Credit Operation - 2
SBI bank Credit Operation - 1
BOB bank Credit Operation - 4
e)	A Method to show individual bank debit operations.
Output: ICICI bank Debit Operation - 2
HDFC bank Debit Operation - 2
SBI*/
package prashant.Assignment_13_16;

public class BankingOps {
	int iciciBal = 13000;
	int hdfcBal = 15000;
	int bobBal = 16000;
	int sbiBal = 15000;
	int iciciCrCnt = 0, hdfcCrCnt = 0, bobCrCnt = 0, sbiCrCnt = 0;
	int iciciDrCnt = 0, hdfcDrCnt = 0, bobDrCnt = 0, sbiDrCnt = 0;

	void debitcreditops(String bankName, String ops, int amt) {
		switch (ops) {
		case "debit":
			switch (bankName) {
			case "icici":
				if (iciciBal >= amt) {
					iciciBal = iciciBal - amt;
					iciciDrCnt++;
				} else {
					System.out.println("Not sufficient balance");
				}
				break;
			case "hdfc":
				if (hdfcBal >= amt) {
					hdfcBal = hdfcBal - amt;
					hdfcDrCnt++;
				} else {
					System.out.println("Not sufficient balance");
				}
				break;
			case "bob":
				if (bobBal >= amt) {
					bobBal = bobBal - amt;
					bobDrCnt++;
				} else {
					System.out.println("Not sufficient balance");
				}
				break;
			case "sbi":
				if (sbiBal >= amt) {
					sbiBal = sbiBal - amt;
					sbiDrCnt++;
				} else {
					System.out.println("Not sufficient balance");
				}
				break;
			}
			break;
		case "credit":
			switch (bankName) {
			case "icici":
				if (amt > 0) {
					iciciBal = iciciBal + amt;
					iciciCrCnt++;
				} else {
					System.out.println("Not sufficient balance");
				}
				break;
			case "hdfc":
				if (amt > 0) {
					hdfcBal = hdfcBal + amt;
					hdfcCrCnt++;
				} else {
					System.out.println("Not sufficient balance");
				}
				break;
			case "bob":
				if (amt > 0) {
					bobBal = bobBal + amt;
					bobCrCnt++;
				} else {
					System.out.println("Not sufficient balance");
				}
				break;
			case "sbi":
				if (amt > 0) {
					sbiBal = sbiBal + amt;
					sbiCrCnt++;
				} else {
					System.out.println("Not sufficient balance");
				}
				break;
			}
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
	}

	void totalBal() {
		int totalBal = iciciBal + hdfcBal + bobBal + sbiBal;
		System.out.println("Total Balance of the all Banks is : " + totalBal);
		System.out.println("------------------------------------------------");
	}

	void totalCrDrperations() {
		int creditOp = iciciCrCnt + hdfcCrCnt + bobCrCnt + sbiCrCnt;
		System.out.println("------------------------------------------------");
		System.out.println("Total Credit operations - " + creditOp);
		int debitOp = iciciDrCnt + hdfcDrCnt + bobDrCnt + sbiDrCnt;
		System.out.println("Total Debit operations - " + debitOp);
		System.out.println("---------------------------------------");
	}

	void totalCrOps() {
		System.out.println("HDFC Bank credit operation: " + hdfcCrCnt);
		System.out.println("ICICI Bank credit operation: " + iciciCrCnt);
		System.out.println("BOB Bank credit operation: " + bobCrCnt);
		System.out.println("SBI Bank credit operation: " + sbiCrCnt);
		System.out.println("--------------------------------------------");
	}

	void totalDrOps() {
		System.out.println("HDFC Bank debit operation: " + hdfcDrCnt);
		System.out.println("ICICI Bank debit operation: " + iciciDrCnt);
		System.out.println("BOB Bank debit operation: " + bobDrCnt);
		System.out.println("SBI Bank debit operation: " + sbiDrCnt);
	}

	public static void main(String[] args) {
		BankingOps bankops = new BankingOps();
		bankops.debitcreditops("icici", "debit", 400);
		bankops.debitcreditops("hdfc", "credit", 1000);
		bankops.debitcreditops("sbi", "credit", 2000);
		bankops.debitcreditops("hdfc", "credit", 1000);
		bankops.debitcreditops("bob", "credit", 500);
		bankops.debitcreditops("bob", "debit", 1500);
		bankops.debitcreditops("sbi", "debit", 3000);
		bankops.debitcreditops("icici", "credit", 10000);
		bankops.debitcreditops("icici", "debit", 4000);
		bankops.debitcreditops("sbi", "debit", 2000);
		bankops.debitcreditops("hdfc", "debit", 2500);
		bankops.totalBal();
		bankops.totalCrOps();
		bankops.totalDrOps();
		bankops.totalCrDrperations();
	}
}
