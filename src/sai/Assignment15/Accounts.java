package sai.Assignment15;

/*
 *Assignment - 15 : 9th April'2021
 *
 * A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
a) Person can debit or credit amount from respective bank.
Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

c) A Method to show total credit, debit operations
output : Total credit operation - 7 times
Total debit operation - 5 times

d) A Method to show individual bank credit operations.
output : ICICI bank Credit operation - 2
HDFC bank Credit operation - 2
SBI bank Credit operation - 1
BOB bank Credit operation - 4

e) A Method to show individual bank debit operations.
output : ICICI bank Debit operation - 2
HDFC bank Debit operation - 2
SBI

 */
public class Accounts {

	int iciciBalance = 125000, hdfcBalance = 150000, bobBalance = 175000, sbiBalance = 185000;
	int iciciCreditCount = 0, hdfcCreditCount = 0, bobCreditCount = 0, sbiCreditCount = 0, totalCreditCount = 0;
	int iciciDebitCount = 0, hdfcreditCount = 0, bobDebitCount = 0, sbiDebitCount = 0, totalDebitCount = 0;

	void debitCredit(String bank, String operation, int amt) {
		switch (operation) {
		case "debit":
			switch (bank) {
			case "icici":
				if (iciciBalance >= amt) {
					iciciBalance = iciciBalance - amt;
				} else {
					System.out.println("Not sufficient balance");
				}
				iciciDebitCount++;
				totalDebitCount++;
				break;
			case "hdfc":
				if (hdfcBalance >= amt) {
					hdfcBalance = hdfcBalance - amt;
				} else {
					System.out.println("Not sufficient balance");
				}
				hdfcCreditCount++;
				totalDebitCount++;
				break;
			case "bob":
				if (bobBalance >= amt) {
					bobBalance = bobBalance - amt;
				} else {
					System.out.println("Not sufficient balance");
				}
				bobDebitCount++;
				totalDebitCount++;
				break;
			case "sbi":
				if (sbiBalance >= amt) {
					sbiBalance = sbiBalance - amt;
				} else {
					System.out.println("Not sufficient balance");
				}
				sbiDebitCount++;
				totalDebitCount++;
				break;
			}
			break;
		case "credit":
			switch (bank) {
			case "icici":
				iciciBalance = iciciBalance + amt;
				iciciCreditCount++;
				totalCreditCount++;
				break;
			case "hdfc":
				hdfcBalance = hdfcBalance + amt;
				hdfcCreditCount++;
				totalCreditCount++;
				break;
			case "bob":
				bobBalance = bobBalance + amt;
				bobCreditCount++;
				totalCreditCount++;
				break;
			case "sbi":
				sbiBalance = sbiBalance + amt;
				sbiCreditCount++;
				totalCreditCount++;
				break;
			}
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
	}

	void totalCreDeboperations() {
		int creditoperation = iciciCreditCount + hdfcCreditCount + bobCreditCount + sbiCreditCount + totalCreditCount;
		System.out.println("Total Credit operation - " + creditoperation + " times");
		int debitoperation = iciciDebitCount + hdfcCreditCount + bobDebitCount + sbiDebitCount + totalDebitCount;
		System.out.println("Total Debit operation - " + debitoperation + " times");
	}

	void totalCreditoperation() {
		System.out.println("ICICI credit count: " + iciciCreditCount);
		System.out.println("HDFC credit count: " + hdfcCreditCount);
		System.out.println("BOB credit count: " + bobCreditCount);
		System.out.println("SBI credit count: " + sbiCreditCount);
	}

	void totalDebitoperation() {
		System.out.println("ICICI debit count: " + iciciDebitCount);
		System.out.println("HDFC debit count: " + hdfcCreditCount);
		System.out.println("BOB debit count: " + bobDebitCount);
		System.out.println("SBI debit count: " + sbiDebitCount);
	}

	void totalBalance() {
		int totalBal = iciciBalance + hdfcBalance + bobBalance + sbiBalance;
		System.out.println("Total Balance is : " + totalBal);
	}

	public static void main(String[] args) {
		Accounts accounts = new Accounts();
		accounts.debitCredit("icici", "credit", 100000);
		accounts.debitCredit("icici", "credit", 10000);
		accounts.debitCredit("hdfc", "credit", 20000);
		accounts.debitCredit("hdfc", "credit", 10000);
		accounts.debitCredit("sbi", "credit", 5000);
		accounts.debitCredit("icici", "debit", 30000);
		accounts.debitCredit("icici", "debit", 100000);
		accounts.debitCredit("icici", "debit", 40000);
		accounts.debitCredit("hdfc", "debit", 20000);
		accounts.debitCredit("bob", "debit", 25000);
		accounts.totalBalance();
		accounts.totalCreditoperation();
		accounts.totalDebitoperation();
		accounts.totalCreDeboperations();
	}
}
