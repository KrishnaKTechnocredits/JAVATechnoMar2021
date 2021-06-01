package monali.Assignment_15;

public class Bank_15_1 {

	int iBalIcici = 10000;
	int iBalHdfc = 15000;
	int iBalBob = 20000;
	int iBalSbi = 25000;
	int idebitcnt = 0, icreditcnt = 0;
	int hdebitcnt = 0, hcreditcnt = 0;
	int Bdebitcnt = 0, Bcreditcnt = 0;
	int Sdebitcnt = 0, Screditcnt = 0;
	int totalDebitCnt;
	int totalCreditCnt;

	void DebitOperation(String bank, String op, int amount) {
		switch (op) {
		case "individualDebit":
			switch (bank) {
			case "icici":
				if (iBalIcici >= amount) {
					iBalIcici = iBalIcici - amount;
					System.out.println("icici account han been debited by " + amount);
				} else {
					System.out.println("sorry not suffient balance in icici");
				}
				idebitcnt++;
				break;

			case "hdfc":
				if (iBalHdfc >= amount) {
					iBalHdfc = iBalHdfc - amount;
					System.out.println("hdfc account han been debited by " + amount);
				} else {
					System.out.println("sorry not suffient balance in hdfc");
				}
				hdebitcnt++;
				break;

			case "BOB":
				if (iBalBob >= amount) {
					iBalBob = iBalBob - amount;
					System.out.println("BOB account han been debited by " + amount);
				} else {
					System.out.println("sorry not suffient balance in BOB");
				}
				Bdebitcnt++;
				break;

			case "Sbi":
				if (iBalSbi >= amount) {
					iBalSbi = iBalSbi - amount;
					System.out.println("SBI account han been debited by " + amount);
				} else {
					System.out.println("sorry not suffient balance in SBI");
				}
				Sdebitcnt++;
				break;
			}
			totalDebitCnt++;
			break;
		}
	}

	void CreditOperation(String bank, String op, int amount) {
		switch (op) {
		case "individualCredit":
			switch (bank) {
			case "icici":
				if (iBalIcici <= amount)
					iBalIcici = iBalIcici + amount;
				System.out.println("ICICI account has been cerdited by " + amount);
				icreditcnt++;
				break;

			case "hdfc":
				if (iBalHdfc <= amount)
					iBalHdfc = iBalHdfc + amount;
				System.out.println("HDFC account has been cerdited by " + amount);
				hcreditcnt++;
				break;

			case "BOB":
				if (iBalBob <= amount)
					iBalBob = iBalBob + amount;
				System.out.println("BOB account has been cerdited by " + amount);
				Bcreditcnt++;
				break;

			case "Sbi":
				if (iBalSbi <= amount)
					iBalSbi = iBalSbi + amount;
				System.out.println("SBI account has been cerdited by " + amount);
				Screditcnt++;
				break;
			}
			totalCreditCnt++;
			break;
		}
	}

	void totalBalance() {
		int Balance = iBalIcici + iBalHdfc + iBalBob + iBalSbi;
		System.out.println("totalbalance is " + Balance);

	}

	void totalDebitAndCreditOperation() {

		System.out.println("total debit operation " + totalDebitCnt + " times");

		System.out.println("total credit operation " + totalCreditCnt + " times");
	}

	void individualBankCreditOperation() {
		System.out.println("ICICI bank credit operation " + icreditcnt);
		System.out.println("HDFC bank credit operation " + hcreditcnt);
		System.out.println("BOB bank credit operation " + Bcreditcnt);
		System.out.println("SBI bank credit operation " + Screditcnt);
	}

	void individualBankDebitOperation() {
		System.out.println("ICICI bank debit operation " + idebitcnt);
		System.out.println("HDFC bank debit operation " + hdebitcnt);
		System.out.println("BOB bank debit operation " + Bdebitcnt);
		System.out.println("SBI bank debit operation " + Sdebitcnt);

	}

	public static void main(String[] a) {
		Bank_15_1 bank_15_1 = new Bank_15_1();
		bank_15_1.DebitOperation("icici", "individualDebit", 11000);
		bank_15_1.DebitOperation("icici", "individualDebit", 1000);
		bank_15_1.CreditOperation("hdfc", "individualCredit", 5000);
		bank_15_1.CreditOperation("Sbi", "individualCredit", 2000);
		bank_15_1.CreditOperation("BOB", "individualCredit", 1500);
		bank_15_1.totalBalance();
		bank_15_1.totalDebitAndCreditOperation();
		bank_15_1.individualBankCreditOperation();
		bank_15_1.individualBankDebitOperation();
	}
}
