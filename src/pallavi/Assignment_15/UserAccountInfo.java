package pallavi.Assignment_15;

import java.util.Scanner;

public class UserAccountInfo {
	int iBalance = 50000;
	int hBalance = 30000;
	int bBalance = 60000;
	int sBalance = 80000;

	int iCreditCount = 0, hCreditCount = 0, bCreditCount = 0, sCreditCount = 0;
	int iDebitCount = 0, hDebitCount = 0, bDebitCount = 0, sDebitCount = 0;

	void totalDebitandCreditCount() {
		int totalDebit = iDebitCount + hDebitCount + bDebitCount + sDebitCount;
		System.out.println("Total debited transactions count are :" + totalDebit + " times");
		int totalCredit = iCreditCount + hCreditCount + bCreditCount + sCreditCount;
		System.out.println("Total credit operation :" + totalCredit + " times");
	}

	void indivisualCreditOperation() {
		System.out.println(" ");
		System.out.println("------------You will get total Credit operations indivisually---------------");
		System.out.println("ICICI bank Credit Operation : " + iCreditCount + " times");
		System.out.println(" HDFC bank Credit Operation :" + hCreditCount + " times");
		System.out.println("SBI bank Credit Operation :" + sCreditCount + " times");
		System.out.println("BOB bank Credit Operation :" + bCreditCount + " times");
	}

	void indivisualDebitOperation() {
		System.out.println(" ");
		System.out.println("------------You will get total Debit operations indivisually---------------");
		System.out.println("ICICI bank Debit Operation : " + iDebitCount + " times");
		System.out.println(" HDFC bank Debit Operation :" + hDebitCount + " times");
		System.out.println("SBI bank Debit Operation :" + sDebitCount + " times");
		System.out.println("BOB bank Debit Operation :" + bDebitCount + " times");
	}

	void operation(String op, String bank, int amount) {
		switch (op) {
		case "debit":
			switch (bank) {
			case "ICICI":
				if (iBalance >= amount) {
					iBalance = iBalance - amount;
					System.out.println("Debited amount from ICICI " + amount);
					System.out.println("Remaining balance " + iBalance);
					iDebitCount++;
				} else
					System.out.println("Insufficient balance");
				break;

			case "HDFC":
				if (hBalance >= amount) {
					hBalance = hBalance - amount;
					System.out.println("Debited amount from HDFC " + amount);
					System.out.println("Reamining balance " + hBalance);
					hDebitCount++;
				} else
					System.out.println("Insufficient balance");
				break;

			case "BOB":
				if (bBalance >= amount) {
					bBalance = bBalance - amount;
					System.out.println("Debited amount from BOB " + amount);
					System.out.println("Reamining balance " + bBalance);
					bDebitCount++;
				} else
					System.out.println("Insufficient balance");
				break;

			case "SBI":
				if (sBalance >= amount) {
					sBalance = sBalance - amount;
					System.out.println("Debited amount from SBI " + amount);
					System.out.println("Reamining balance " + sBalance);

					sDebitCount++;
				} else
					System.out.println("Insufficient balance");
				break;

			default:
				System.out.println("Sorry we are not providing debit serivice for " + bank);
			}

			break;

		case "credit":
			switch (bank) {
			case "ICICI":
				if (amount > 0) {
					iBalance = iBalance + amount;
					System.out.println("Credit amount from ICICI " + amount);
					iCreditCount++;
				} else
					System.out.println("Please deposite some amount");
				break;

			case "HDFC":
				if (amount > 0) {
					hBalance = hBalance + amount;
					System.out.println("Credit amount from HDFC " + amount);
					hCreditCount++;
				} else
					System.out.println("Please deposite some amount");
				break;

			case "BOB":
				if (amount > 0) {
					bBalance = bBalance + amount;
					System.out.println("Credit amount from BOB " + amount);
					bCreditCount++;
				} else
					System.out.println("Please deposite some amount");
				break;

			case "SBI":
				if (amount > 0) {
					sBalance = sBalance + amount;
					System.out.println("Credit amount from SBI " + amount);
					sCreditCount++;
				} else
					System.out.println("Please deposite some amount");
				break;

			default:
				System.out.println("Sorry we are not providing credit service for " + bank);
			}

			break;

		default:
			System.out.println("Operation not Allowed");
		}
	}

	void totalBalnce() {
		int totalBalnace = iBalance + hBalance + bBalance + sBalance;
		System.out.println("Total balnace is :" + totalBalnace);
	}

	public static void main(String[] args) {
		UserAccountInfo userAccountInfo = new UserAccountInfo();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your input  1) debit and 2) credit ");
		String OperationInput = sc.next();
		System.out.println(" Provide your input-  1)ICICI 2)HDFC 3)BOB 4)SBI");
		String bankOption = sc.next();
		System.out.println("Enter amount please: ");
		int amount = sc.nextInt();
		System.out.println(amount);
		userAccountInfo.operation(OperationInput, bankOption, amount);

		System.out.println("Please provide your input  1) debit and 2) credit ");
		String OperationInput1 = sc.next();
		System.out.println(" Provide your input-  1)ICICI 2)HDFC 3)BOB 4)SBI");
		String bankOption1 = sc.next();
		System.out.println("Enter amount please: ");
		int amount1 = sc.nextInt();
		System.out.println(amount);
		userAccountInfo.operation(OperationInput1, bankOption1, amount1);

		/*
		 * userAccountInfo.operation("debit", "HDFC", 10000);
		 * userAccountInfo.operation("debit", "HDFC", 20000);
		 * userAccountInfo.operation("debit", "SBI", 50000);
		 * userAccountInfo.operation("credit", "SBI", 20000);
		 * userAccountInfo.operation("debit", "BOB", 5000);
		 * userAccountInfo.operation("debit", "BOB", 10000);
		 * userAccountInfo.operation("credit", "BOB", 10000);
		 * userAccountInfo.operation("credit", "HDFC", 50000);
		 */
		userAccountInfo.totalBalnce();
		userAccountInfo.totalDebitandCreditCount();
		userAccountInfo.indivisualCreditOperation();
		userAccountInfo.indivisualDebitOperation();

	}

}
