package shivani.Assignment_15;

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
		                 SBI*/
public class Bank {
	int ibalance = 2000;
	int hBalance = 2000;
	int bBalance = 4000;
	int sBalance = 3000;
	int idCount, hdCount, bdCount, sdCount;
	int icCount, hcCount, bcCount, scCount;

	void banking(String bankName, String op, int amt) {
		switch (op) {
		case "debit":
			switch (bankName) {
			case "ICICI":
				if (ibalance >= amt) {
					ibalance = ibalance - amt;
				} else
					System.out.println("Sorry you dont have sufficient Balance");

				idCount++;
				break;
			case "HDFC":
				if (hBalance >= amt) {
					hBalance = hBalance - amt;
				} else
					System.out.println("Sorry you dont have sufficient Balance");
				hdCount++;

				break;

			case "BOB":
				if (bBalance >= amt) {
					bBalance = bBalance - amt;
				} else
					System.out.println("Sorry you dont have sufficient Balance");

				bdCount++;

				break;
			}
		case "SBI":
			if (sBalance >= amt) {
				sBalance = sBalance - amt;
			} else
				System.out.println("Sorry you dont have sufficient Balance");

			sdCount++;
			break;
		}
		switch (op) {
		case "credit":
			switch (bankName) {
			case "ICICI":
				ibalance = ibalance + amt;
				icCount++;

				break;

			case "HDFC":
				hBalance = hBalance + amt;
				hcCount++;

				break;

			case "BOB":
				bBalance = bBalance + amt;
				bcCount++;

				break;

			case "SBI":
				sBalance = sBalance + amt;
				scCount++;

				break;
			default:
				System.out.println("not a valid operation");
			}

		}
	}

	void showTotalBalnce() {
		System.out.println(ibalance + hBalance + bBalance + sBalance + " toatl Balance");
	}

	void totalCreditDebit() {
		System.out.println(icCount + hcCount + bcCount + scCount + " Toal Credit count");
		System.out.println(idCount + hdCount + bdCount + sdCount + " toatl debit count");
	}

	void individualCredit() {
		System.out.println("Icici bank credit operation " + icCount);
		System.out.println("HDFC bank credit operation " + hcCount);
		System.out.println("BOB bank balance " + bcCount);
		System.out.println("SBI bank balance " + scCount);
	}

	void individualDebit() {
		System.out.println(" ICICI bank debit operation :" + idCount);
		System.out.println("HDFC bank debit operation :" + hdCount);
		System.out.println("SBI");
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.banking("ICICI", "credit", 1000);
		bank.banking("ICICI", "credit", 500);
		bank.banking("HDFC", "credit", 100);
		bank.banking("HDFC", "credit", 500);
		bank.banking("SBI", "credit", 1000);
		bank.banking("BOB", "credit", 300);
		bank.banking("BOB", "credit", 400);
		bank.banking("BOB", "credit", 700);
		bank.banking("BOB", "credit", 800);
		bank.banking("ICICI", "debit", 300);
		bank.banking("ICICI", "debit", 500);
		bank.banking("HDFC", "debit", 300);
		bank.banking("HDFC", "debit", 500);

		bank.individualCredit();
		bank.individualDebit();
		bank.totalCreditDebit();
		bank.showTotalBalnce();

	}
}