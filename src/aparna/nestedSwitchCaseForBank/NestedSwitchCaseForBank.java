/*Assignment 15:-
 * A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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
 * 
 */
package aparna.nestedSwitchCaseForBank;

public class NestedSwitchCaseForBank {

	String customerName;
	double totalBalanceICICI, totalBalanceHDFC, totalBalanceBOB, totalBalanceSBI;
	int debitCountICICI, debitCountHDFC, debitCountBOB, debitCountSBI, creditCountICICI, creditCountHDFC,
			creditCountBOB, creditCountSBI;

	void setinitialBalanceNCustomerName(String name, double balanceICICI, double balanceHDFC, double balanceBOB,
			double balanceSBI) {
		customerName = name;
		totalBalanceICICI = balanceICICI;
		totalBalanceHDFC = balanceHDFC;
		totalBalanceBOB = balanceBOB;
		totalBalanceSBI = balanceSBI;
		System.out.println("Customer " + customerName + " Bank Transaction Details are as follows: ");
		System.out.println("Total Bank Balance in ICICI Bank: " + totalBalanceICICI
				+ " , Total Bank Balance in HDFC Bank: " + totalBalanceHDFC + " , Total Bank Balance in BOB Bank: "
				+ totalBalanceBOB + ", Total Bank Balance in SBI Bank: " + totalBalanceSBI);
	}

	void bankTransactionDetails(String operation, String bank, int amount) {
		operation = operation.toUpperCase();
		bank = bank.toUpperCase();

		switch (operation) {
		case "DEBIT":
			switch (bank) {
			case "ICICI":
				if (totalBalanceICICI >= amount) {
					totalBalanceICICI = totalBalanceICICI - amount;
					debitCountICICI++;
				} else
					System.out.println("You dont have sufficient balance in your ICICI Bank Account");

				break;
			case "HDFC":
				if (totalBalanceHDFC >= amount) {
					totalBalanceHDFC = totalBalanceHDFC - amount;
					debitCountHDFC++;
				} else
					System.out.println("You dont have sufficient balance in your HDFC Bank Account");

				break;
			case "BOB":
				if (totalBalanceBOB >= totalBalanceBOB) {
					totalBalanceBOB = totalBalanceBOB - amount;
					debitCountBOB++;

				} else
					System.out.println("You dont have sufficient balance in your BOB Bank Account");

				break;

			case "SBI":
				if (totalBalanceSBI >= amount) {
					totalBalanceSBI = totalBalanceSBI - amount;
					debitCountSBI++;
				} else
					System.out.println("You dont have sufficient balance in your SBI Bank Account");

				break;

			default:
				System.out.println("Invalid Bank Name Given By User");
			}
			break;
		case "CREDIT":

			switch (bank) {
			case "ICICI":
				totalBalanceICICI = totalBalanceICICI + amount;
				creditCountICICI++;
				break;

			case "HDFC":
				totalBalanceHDFC = totalBalanceHDFC + amount;
				creditCountHDFC++;
				break;

			case "BOB":
				totalBalanceBOB = totalBalanceBOB + amount;
				creditCountBOB++;
				break;

			case "SBI":
				totalBalanceSBI = totalBalanceSBI + amount;
				creditCountSBI++;
				break;

			default:
				System.out.println("Invalid Bank Name Given By User");
			}

			break;

		default:
			System.out.println("Invalid Operation name Given By User");
		}
	}

	void individualBankCreditCountDisplay() {
		System.out.println("ICICI Bank Credit operation: " + creditCountICICI + "\n" + "HDFC Bank Credit operation: "
				+ creditCountHDFC + "\n" + "BOB Bank Credit operation: " + creditCountBOB + "\n"
				+ "SBI Bank Credit operation: " + creditCountSBI);
	}

	void individualBankDebitCountDisplay() {
		System.out.println("ICICI Bank Debit operation: " + debitCountICICI + "\n" + "HDFC Bank Debit operation: "
				+ debitCountHDFC + "\n" + "BOB Bank Debit operation: " + debitCountBOB + "\n"
				+ "SBI Bank Debit operation: " + debitCountSBI);
	}

	void totalBanksDebitCreditCount() {
		int totalcreditcountofAllBank = creditCountICICI + creditCountHDFC + creditCountBOB + +creditCountSBI;
		int totaldebitcountofAllBank = debitCountICICI + debitCountHDFC + debitCountBOB + +debitCountSBI;
		System.out.println("Total Credit operations of All banks : " + totalcreditcountofAllBank);
		System.out.println("Total Debit operations of All banks : " + totaldebitcountofAllBank);
		System.out.println("So Total Debit and Credit Count by Customer is done : "
				+ (totalcreditcountofAllBank + totaldebitcountofAllBank));
	}

	void totalBanksBalance() {
		double totalbankBalanceofAllBank = totalBalanceICICI + totalBalanceHDFC + totalBalanceBOB + +totalBalanceSBI;
		System.out.println("Total bank balance of All banks : " + totalbankBalanceofAllBank);

	}

	public static void main(String[] args) {
		NestedSwitchCaseForBank nestedSwitchCaseForBank1 = new NestedSwitchCaseForBank();

		nestedSwitchCaseForBank1.setinitialBalanceNCustomerName("Customer1", 50000, 70000, 10000, 3000);
		nestedSwitchCaseForBank1.totalBanksBalance();

		nestedSwitchCaseForBank1.bankTransactionDetails("CREDIT", "HDFC", 8000);
		nestedSwitchCaseForBank1.bankTransactionDetails("DEBIT", "SBI", 4000);
		nestedSwitchCaseForBank1.bankTransactionDetails("credit", "SBI", 5000);
		nestedSwitchCaseForBank1.bankTransactionDetails("Credit", "HDFC", 9000);
		nestedSwitchCaseForBank1.bankTransactionDetails("credit", "BOB", 20000);
		nestedSwitchCaseForBank1.bankTransactionDetails("credit", "bob", 4000);
		nestedSwitchCaseForBank1.bankTransactionDetails("debit", "icici", 4000);
		nestedSwitchCaseForBank1.bankTransactionDetails("credit", "sbi", 4000);
		nestedSwitchCaseForBank1.bankTransactionDetails("debit", "sbi", 1000);
		nestedSwitchCaseForBank1.bankTransactionDetails("DEBIT", "BOB", 2000);

		nestedSwitchCaseForBank1.individualBankCreditCountDisplay();
		nestedSwitchCaseForBank1.individualBankDebitCountDisplay();

		nestedSwitchCaseForBank1.totalBanksDebitCreditCount();

		nestedSwitchCaseForBank1.totalBanksBalance();
	}

}
