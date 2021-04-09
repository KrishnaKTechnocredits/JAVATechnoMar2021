/*Assignment - 15 : 9th April'2021

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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
		                 SBI*/

package rashmi.NestedSwitch_assignments;

import java.util.Scanner;

public class SwitchBank {

	int iBalance = 6000, hBalance = 8000, bobBalance = 7000, sBalance = 10000;
	int iCreditCnt = 0, iDebitCnt = 0, hCreditCnt = 0, hDebitCnt = 0, bobCreditCnt = 0, bobDebitCnt = 0, sCreditCnt = 0,
			sDebitCnt = 0;

	void totalOperationsCnt() {
		System.out.println("\n------TOTAL DEBIT AND CREDIT OPERATIONS-----\n");
		int totalCreditCnt = iCreditCnt + hCreditCnt + bobCreditCnt + sCreditCnt;
		int totalDebitCnt = iDebitCnt + hDebitCnt + bobDebitCnt + sDebitCnt;
		System.out.println("Total credit operations : " + totalCreditCnt);
		System.out.println("Total debit operations : " + totalDebitCnt);
	}

	void individualCreditoperation() {
		System.out.println("\n----INDIVIDUAL CREDIT OPERATIONS---\n");
		System.out.println("ICICI bank credit operation : " + iCreditCnt);
		System.out.println("HDFC bank credit operation : " + hCreditCnt);
		System.out.println("BOB bank credit operation : " + bobCreditCnt);
		System.out.println("SBI bank credit operation : " + sCreditCnt);
	}

	void individualDebitOperation() {
		System.out.println("\n----INDIVIDUAL DEBIT OPERATIONS-----\n");
		System.out.println("ICICI bank debit operation : " + iDebitCnt);
		System.out.println("HDFC bank debit operation : " + hDebitCnt);
		System.out.println("BOB bank debit operation : " + bobDebitCnt);
		System.out.println("SBI bank debit operation : " + sDebitCnt);
	}

	void totalBalance() {
		System.out.println("\n---------TOTAL BALANCE-------\n");
		int tBalance = iBalance + hBalance + bobBalance + sBalance;
		System.out.println("Total balance : " + tBalance);
	}

	void operation(String bName, String op, int amt) {
		String name = bName.toUpperCase();

		switch (op) {
		case "debit":
			switch (name) {
			case "ICICI":
				if (iBalance >= amt) {
					iBalance = iBalance - amt;
					iDebitCnt++;
				} else
					System.out.println("Insufficient balance....");
				break;

			case "HDFC":
				if (hBalance >= amt) {
					hBalance = hBalance - amt;
					hDebitCnt++;
				} else
					System.out.println("Insufficient balance....");
				break;

			case "BOB":
				if (bobBalance >= amt) {
					bobBalance = bobBalance - amt;
					bobDebitCnt++;
				} else
					System.out.println("Insufficient balance....");
				break;

			case "SBI":
				if (sBalance >= amt) {
					sBalance = sBalance - amt;
					sDebitCnt++;
				} else
					System.out.println("Insufficient balance....");
				break;

			default:
				System.out.println("Invalid bank..");
			}

			break;

		case "credit":

			switch (bName) {
			case "ICICI":
				if (amt >= 0) {
					iBalance = iBalance + amt;
					iCreditCnt++;
				} else
					System.out.println("Amount " + amt + " cannot be credited");
				break;

			case "HDFC":
				if (amt >= 0) {
					hBalance = hBalance + amt;
					hCreditCnt++;
				} else
					System.out.println("Amount " + amt + " cannot be credited");
				break;

			case "BOB":
				if (amt >= 0) {
					bobBalance = bobBalance + amt;
					bobCreditCnt++;
				} else
					System.out.println("Amount " + amt + " cannot be credited");
				break;

			case "SBI":
				if (amt >= 0) {
					sBalance = sBalance + amt;
					sCreditCnt++;
				} else
					System.out.println("Amount " + amt + " cannot be credited");
				break;

			default:
				System.out.println("invalid  bank...");
				break;
			}

			break;

		default:

			System.out.println("Invalid operation...");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SwitchBank switchBank = new SwitchBank();
		System.out.println("Enter the operation ");
		String op = sc.nextLine();
		System.out.println("Enter the bank ");
		String bName = sc.nextLine();
		System.out.println("Enter the amount ");
		int amt = sc.nextInt();
		switchBank.operation(bName, op, amt);
		switchBank.individualCreditoperation();
		switchBank.individualDebitOperation();
		switchBank.totalOperationsCnt();
		switchBank.totalBalance();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the operation ");
		op = sc1.nextLine();
		System.out.println("Enter the bank ");
		bName = sc1.nextLine();
		System.out.println("Enter the amount ");
		amt = sc1.nextInt();
		switchBank.operation(bName, op, amt);
		switchBank.individualCreditoperation();
		switchBank.individualDebitOperation();
		switchBank.totalOperationsCnt();
		switchBank.totalBalance();
		sc.close();
		sc1.close();
	}

}
