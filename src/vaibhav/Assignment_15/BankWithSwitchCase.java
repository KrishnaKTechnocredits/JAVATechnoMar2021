/*Java Assignment 15: 9th April 2021

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

package vaibhav.Assignment_15;

public class BankWithSwitchCase {

	int iBalance, hBalance, bBalance, sBalance;
	int iDCount, hDCount, bDCount, sDCount;
	int iCCount, hCCount, bCCount, sCCount;
	// static int totalDCount=0, totalCCount=0;

	void setBalance(int iCICIBal, int hDFDBal, int bOBBalance, int sBIBalance) {
		iBalance = iCICIBal;
		hBalance = hDFDBal;
		bBalance = bOBBalance;
		sBalance = sBIBalance;
	}

	void operation(String op, String bankName, int amt) {
		switch (op) {
		case "debit":
			switch (bankName) {
			case "ICICI":
				if (iBalance >= amt) {
					iBalance -= amt; // iBalance = iBalance - amt;
					iDCount++;
					// totalDCount++;
				} else {
					System.out
							.println("Not sufficient balance in " + bankName + " please enter amout below " + iBalance);
				}
				break;

			case "HDFC":
				if (hBalance >= amt) {
					hBalance -= amt; // hBalance = hBalance - amt;
					hDCount++;
					// totalDCount++;
				} else {
					System.out
							.println("Not sufficient balance in " + bankName + " please enter amout below " + hBalance);
				}
				break;

			case "BOB":
				if (bBalance >= amt) {
					bBalance -= amt; // bBalance = bBalance - amt;
					bDCount++;
					// totalDCount++;
				} else {
					System.out
							.println("Not sufficient balance in " + bankName + " please enter amout below " + bBalance);
				}
				break;

			case "SBI":
				if (sBalance >= amt) {
					sBalance -= amt; // sBalance = sBalance - amt;
					sDCount++;
					// totalDCount++;
				} else {
					System.out
							.println("Not sufficient balance in " + bankName + " please enter amout below " + sBalance);
				}
				break;

			default:
				System.out.println("Please enter the correct input amoung 'ICICI', 'HDFC', 'BOB' & 'SBI'");
				break;
			}

			break;

		case "credit":
			switch (bankName) {
			case "ICICI":
				if (amt > 0) {
					iBalance += amt;
					iCCount++;
					// totalCCount++;
				} else {
					System.out.println("Please enter the correct amount which is greater than '0'");
				}
				break;

			case "HDFC":
				if (amt > 0) {
					hBalance += amt;
					hCCount++;
					// totalCCount++;
				} else {
					System.out.println("Please enter the correct amount which is greater than '0'");
				}
				break;

			case "BOB":
				if (amt > 0) {
					bBalance += amt;
					bCCount++;
					// totalCCount++;
				} else {
					System.out.println("Please enter the correct amount which is greater than '0'");
				}
				break;

			case "SBI":
				if (amt > 0) {
					sBalance += amt;
					sCCount++;
					// totalCCount++;
				} else {
					System.out.println("Please enter the correct amount which is greater than '0'");
				}
				break;

			default:
				System.out.println("Please enter the correct input amoung 'ICICI', 'HDFC', 'BOB' & 'SBI'");
				break;
			}

			break;

		default:
			System.out.println("Please enter option amoung 'debit' or 'credit' option");
			break;
		}

	}

	void totalBalance() {
		int totalBal = iBalance + hBalance + bBalance + sBalance;
		System.out.println("");
		System.out.println("Total balace form all bank accounts is : " + totalBal);
		System.out.println("");
	}

	void totalCDOperations() {
		int totalDebitOperations = iDCount + hDCount + bDCount + sDCount;
		int totalCreditOperations = iCCount + hCCount + bDCount + sCCount;
		System.out.println("Total credit operations : " + totalCreditOperations);
		System.out.println("Total debit operations : " + totalDebitOperations);
		System.out.println("");
	}

	void individualBankCreditOperations() {
		System.out.println("ICICI bank Credit Operation	: " + iCCount);
		System.out.println("HDFC bank Credit Operation	: " + hCCount);
		System.out.println("BOB bank Credit Operation	: " + bCCount);
		System.out.println("SBI bank Credit Operation	: " + sCCount);
		System.out.println("");
	}

	void individualBankDebitOperations() {
		System.out.println("ICICI bank Debit Operation	: " + iDCount);
		System.out.println("HDFC bank Debit Operation	: " + hDCount);
		System.out.println("BOB bank Debit Operation	: " + bDCount);
		System.out.println("SBI bank Debit Operation	: " + sDCount);
		System.out.println("");
	}

	public static void main(String[] args) {
		BankWithSwitchCase bankWithSwitchCase = new BankWithSwitchCase();
		bankWithSwitchCase.setBalance(20000, 15000, 10000, 5000);
		bankWithSwitchCase.operation("debit", "ICICI", 200);
		bankWithSwitchCase.operation("debit", "HDFC", 1000);
		bankWithSwitchCase.operation("credit", "SBI", 500);
		bankWithSwitchCase.operation("credit", "BOB", 200);
		bankWithSwitchCase.operation("debit", "BOB", 1500);
		bankWithSwitchCase.operation("debit", "SBI", 6000);
		bankWithSwitchCase.operation("Credit", "sbi", 9000);
		bankWithSwitchCase.operation("credit", "ICICI", 2000);
		bankWithSwitchCase.operation("credit", "SBI", 5000);

		bankWithSwitchCase.totalBalance();

		bankWithSwitchCase.totalCDOperations();

		bankWithSwitchCase.individualBankCreditOperations();
		bankWithSwitchCase.individualBankDebitOperations();

	}

}
