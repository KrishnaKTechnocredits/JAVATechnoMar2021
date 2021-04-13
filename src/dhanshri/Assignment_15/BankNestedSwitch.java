package dhanshri.Assignment_15;

public class BankNestedSwitch {
	int iBalance = 5000, hBalance = 8000, bBalance = 10000, sBalance = 15000;
	int iDebit=0, hDebit=0, bDebit=0, sDebit=0, iCredit=0, hCredit=0, bCredit=0, sCredit=0;

	void operations(String bank, String op, int amt) {
		switch (op) {
		case "Debit":
			switch (bank) {
			case "ICICI":
				if (iBalance >= amt) {
					iBalance = iBalance - amt;
					iDebit++;
				} else {
					System.out.println("NOt sufficient Balance in ICICI account");
				}
				break;
			case "HDFC":
				if (hBalance >= amt) {
					hBalance = hBalance - amt;
					hDebit++;
				} else {
					System.out.println("NOt sufficient Balance in HDFC account");
				}
				break;
			case "BOB":
				if (bBalance >= amt) {
					bBalance = bBalance - amt;
					bDebit++;
				} else {
					System.out.println("NOt sufficient Balance in BOB account");
				}
				break;
			case "SBI":
				if (sBalance >= amt) {
					sBalance = sBalance - amt;
					sDebit++;
				} else {
					System.out.println("NOt sufficient Balance in SBI account");
				}
				break;

			}
			break;

		case "Credit":
			switch (bank) {
			case "ICICI":
				iBalance = iBalance + amt;
				iCredit++;
				break;

			case "HDFC":
				hBalance = hBalance + amt;
				hCredit++;
				break;

			case "BOB":
				bBalance = bBalance + amt;
				bCredit++;
				break;

			case "SBI":
				sBalance = sBalance + amt;
				sCredit++;
				break;
			}

		}
		
		
	}

	void totalBankBalance() {
		int totalBalance = iBalance + hBalance + bBalance + sBalance;
	System.out.println("Total bank balance sum is : " +totalBalance);
	}

	void totalCreditDebit() {
		 int totalcredit = iCredit + hCredit + bCredit + sCredit;
		System.out.println("Total Credit operatiob are " +totalcredit);
		int totalDebit = iDebit + hDebit + bDebit + sDebit;
		System.out.println("Total debit operatiob are " +totalDebit);
	}

	void individualCredit() {
		System.out.println("ICICI total crdit operastion : " + iCredit);
		System.out.println("HDFC total crdit operastion : " + hCredit);
		System.out.println("BOB total crdit operastion : " + bCredit);
		System.out.println("SBI total crdit operastion : " + sCredit);

	}

	void individeualDebit() {
		System.out.println("ICICI total debit operastion : " + iDebit);
		System.out.println("HDFC total debit operastion : " + hDebit);
		System.out.println("BOB total debit operastion : " + bDebit);
		System.out.println("SBI total debit operastion : " + sDebit);
		
	}

	public static void main(String[] args) {
		BankNestedSwitch bankNestedSwitch = new BankNestedSwitch();
		bankNestedSwitch.operations("ICICI", "Credit", 1000);
		bankNestedSwitch.operations("HDFC", "Debit", 2000);
		bankNestedSwitch.operations("BOB", "Credit", 5000);
		bankNestedSwitch.operations("SBI", "Debit", 8000);
		bankNestedSwitch.operations("SBI", "Credit", 1000);
		bankNestedSwitch.totalBankBalance();
		bankNestedSwitch.totalCreditDebit();
		bankNestedSwitch.individualCredit();
		bankNestedSwitch.individeualDebit();
	}

}
