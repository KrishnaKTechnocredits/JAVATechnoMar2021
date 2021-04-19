package rahul_Hiremath.assignment_15;

import java.util.Scanner;

public class Ass_15 {

	double ICICIBal = 1000;
	double HDFCBal = 1000;
	double BOBBal = 1000;
	double SBIBal = 1000;

	int ICICCreditCount;
	int HDFCCreditCount;
	int BOBCreditCount;
	int SBICreditCount;

	int ICICDebitCount;
	int HDFCDebitCount;
	int BOBDebitCount;
	int SBIDebitCount;

	static int totalCredit;
	static int totalDebit;

	void debitOrCredit(String bankName, String operation, double amt) {
		String ignoreCaseBankName = bankName.toUpperCase();
		switch (operation) {
		case "credit":
			if (ignoreCaseBankName.equals("ICICI")) {
				ICICIBal = ICICIBal + amt;
				ICICCreditCount++;
				totalCredit++;
				break;
			} else if (ignoreCaseBankName.equals("HDFC")) {
				HDFCBal = HDFCBal + amt;
				HDFCCreditCount++;
				totalCredit++;
				break;
			} else if (ignoreCaseBankName.equals("BOB")) {
				BOBBal = BOBBal + amt;
				BOBCreditCount++;
				totalCredit++;
				break;
			} else if (ignoreCaseBankName.equals("SBI")) {
				SBIBal = SBIBal + amt;
				SBICreditCount++;
				totalCredit++;
				break;
			} else {
				System.out.println("Bank name do not match");
				break;
			}

		case "debit":
			if (ignoreCaseBankName.equals("ICICI")) {
				if (amt <= ICICIBal) {
					ICICIBal = ICICIBal - amt;
					ICICDebitCount++;
					totalDebit++;
				} else {
					System.out.println("Insufficient bal, current balance is: " + ICICIBal);
					break;
				}
			}
			if (ignoreCaseBankName.equals("HDFC")) {
				if (amt <= HDFCBal) {
					HDFCBal = HDFCBal - amt;
					HDFCDebitCount++;
					totalDebit++;
				} else {
					System.out.println("Insufficient bal, current balance is: " + HDFCBal);
					break;
				}
			}

			if (ignoreCaseBankName.equals("BOB")) {
				if (amt <= BOBBal) {
					BOBBal = BOBBal - amt;
					BOBDebitCount++;
					totalDebit++;
				} else {
					System.out.println("Insufficient bal, current balance is: " + BOBBal);
					break;
				}
			}

			if (ignoreCaseBankName.equals("SBI")) {
				if (amt <= SBIBal) {
					SBIBal = SBIBal - amt;
					SBIDebitCount++;
					totalDebit++;
				} else {
					System.out.println("Insufficient bal, current balance is: " + SBIBal);
					break;
				}
			} else {
				System.out.println("Bank name do not match");
				break;
			}
		}
	}

	void totalBal() {
		double totalBal = ICICIBal + HDFCBal + BOBBal + SBIBal;
		System.out.println("Total balance is: " + totalBal);
	}

	void totalOperations() {
		System.out.println("Total debit: " + totalDebit);
		System.out.println("Total credit: " + totalCredit);
	}

	void individualBankCreditOperations() {
		System.out.println("ICICI bank Credit Operation: " + ICICCreditCount);
		System.out.println("HDFC bank Credit Operation: " + HDFCCreditCount);
		System.out.println("SBI bank Credit Operation: " + SBICreditCount);
		System.out.println("BOB bank Credit Operation: " + BOBCreditCount);
	}

	void individualBankDebitOperations() {
		System.out.println("ICICI bank Debit Operation:" + ICICDebitCount);
		System.out.println("HDFC bank Debit Operation:" + HDFCDebitCount);
		System.out.println("SBI bank Debit Operation:" + SBIDebitCount);
		System.out.println("BOB bank Debit Operation:" + BOBDebitCount);
	}

	public static void main(String[] args) {
		Ass_15 ass_15 = new Ass_15();
		Scanner scanner = new Scanner(System.in);

		System.out.println("1: Please enter bank name, debit/credit & amout");
		String bankName = scanner.nextLine();
		String option = scanner.nextLine();
		String amt = scanner.nextLine();
		ass_15.debitOrCredit(bankName, option, Integer.parseInt(amt));

		System.out.println("2: Please enter bank name, debit/credit & amout");
		String bankName1 = scanner.nextLine();
		String option1 = scanner.nextLine();
		String amt1 = scanner.nextLine();
		ass_15.debitOrCredit(bankName1, option1, Integer.parseInt(amt1));

		System.out.println("---------------------------");
		ass_15.totalBal();
		System.out.println("---------------------------");
		ass_15.totalOperations();
		System.out.println("---------------------------");
		ass_15.individualBankCreditOperations();
		System.out.println("---------------------------");
		ass_15.individualBankDebitOperations();
		System.out.println("---------------------------");
		scanner.close();
	}

}
