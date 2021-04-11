package meenu.assignment_15;

/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times
                              Total debit operation - 5 times

         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2
                         HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                         BOB bank Credit Operation - 4

         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2
		                 SBI
*/

import java.util.Scanner;

public class BankDetails {
	int iciciBalance = 1000;
	int hdfcBalance = 2000;
	int bobBalance = 3000;
	int sbiBalance = 4000;
	int totalBalance;
	int totalCreditCount;
	int totalDebitCount;
	int iciciCreditCount;
	int hdfcCreditCount;
	int bobCreditCount;
	int sbiCreditCount;
	int iciciDebitCount;
	int hdfcDebitCount;
	int bobDebitCount;
	int sbiDebitCount;

	void getTotalBalance(int iciciBal, int hdfcBal, int bobBal, int sbiBal) {
		iciciBalance = iciciBal;
		hdfcBalance = hdfcBal;
		bobBalance = bobBal;
		sbiBalance = sbiBal;

		totalBalance = iciciBalance + hdfcBalance + bobBalance + sbiBalance;
		System.out.println("Total balance in all account is : " + totalBalance);

	}

	void totalOperation(String bank, String operation, int amount) {
		switch (operation) {
		case "debit":
			switch (bank) {
			case "icici":
				if (iciciBalance >= amount) {
					iciciBalance = iciciBalance - amount;
					iciciDebitCount++;
					totalDebitCount++;
			//		bankDebit(iciciCreditCount, 0, 0, 0);
				} else
					System.out.println("Insufficient Balance");
				break;

			case "hdfc":
				if (hdfcBalance >= amount) {
					hdfcBalance = hdfcBalance - amount;
					hdfcDebitCount++;
					totalDebitCount++;
		//			bankDebit(0, hdfcCreditCount, 0, 0);
				} else
					System.out.println("Insufficient Balance");
				break;

			case "bob":
				if (bobBalance >= amount) {
					bobBalance = bobBalance - amount;
					bobDebitCount++;
					totalDebitCount++;
		//			bankDebit(0, 0, bobCreditCount, 0);
				} else
					System.out.println("Insufficient Balance");
				break;

			case "sbi":
				if (sbiBalance >= amount) {
					sbiBalance = sbiBalance - amount;
					sbiDebitCount++;
					totalDebitCount++;
		//			bankDebit(0, 0, 0, sbiCreditCount);
				} else
					System.out.println("Insufficient Balance");
				break;
			default:
				System.out.println("Not Appropriate Input");
			}
			break;
		case "credit":
			switch (bank) {
			case "icici":
				iciciBalance = iciciBalance + amount;
				iciciCreditCount++;
				totalCreditCount++;
	//			bankCredit(iciciCreditCount, 0, 0, 0);
				break;

			case "hdfc":
				hdfcBalance = hdfcBalance + amount;
				hdfcCreditCount++;
				totalCreditCount++;
		//		bankCredit(0, hdfcCreditCount, 0, 0);
				break;

			case "bob":
				bobBalance = bobBalance + amount;
				bobCreditCount++;
				totalCreditCount++;
		//		bankCredit(0, 0, bobCreditCount, 0);
				break;

			case "sbi":
				sbiBalance = sbiBalance + amount;
				sbiCreditCount++;
				totalCreditCount++;
		//		bankCredit(0, 0, 0, sbiCreditCount);
				break;
			default:
				System.out.println("Not Appropriate Input");
			}
		}
	}

	void bankCredit() {

		System.out.println("ICICI bank Credit Operation - " + iciciCreditCount);
		System.out.println("HDFC bank Credit Operation - " + hdfcCreditCount);
		System.out.println("SBI bank Credit Operation - " + sbiCreditCount);
		System.out.println("BOB bank Credit Operation - " + bobCreditCount);
	}

	void bankDebit() {
		System.out.println("ICICI bank Debit Operation - " + iciciDebitCount);
		System.out.println("HDFC bank Debit Operation - " + hdfcDebitCount);
		System.out.println("SBI bank Debit Operation - " + sbiDebitCount);
		System.out.println("BOB bank Debit Operation - " + bobDebitCount);

	}

	public static void main(String[] args) {
		BankDetails bankDetails = new BankDetails();
		Scanner scanner = new Scanner(System.in);
		String choice;

		do {
			System.out.println("Enter the BankName: ");
			String bank = scanner.next();
			System.out.println("Enter the Operation: ");
			String operation = scanner.next();
			System.out.println("Enter the Amount: ");
			int amount = scanner.nextInt();
			bankDetails.totalOperation(bank, operation, amount);
			System.out.println("Do you wish to continue : ");
			choice = scanner.next();
		} while (choice.equalsIgnoreCase("yes"));

		System.out.println("Total Debit Count: " + bankDetails.totalDebitCount);
		System.out.println();
		System.out.println("Total Credit Count: " + bankDetails.totalCreditCount);
		System.out.println();
		System.out.println("Total Credit Count for each bank : ");
		bankDetails.bankCredit();
		System.out.println();
		System.out.println("Total Debit Count for each bank : ");
		bankDetails.bankDebit();
	}


}
