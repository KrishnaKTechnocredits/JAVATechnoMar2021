/*Assignment - 15 : 9th April'2021

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
a) Person can debit or credit amount from respective bank.
Hint : Switch case is expected here. [Please watch today's recording 

again, in case of confusion.]

b) A Method to show total balance [ICICI balance + HDFC balance + BOB 

balance + SBI Balance]

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
package neha_Rathi.assignment15;

public class AccountDetails {
	double totalBalanceIcici, totalBalanceHdfc, totalBalanceBob, totalBalanceSbi, totalBalance;
	int debitCountIcici, debitCountHdfc, debitCountBob, debitCountSbi, creditCountIcici, creditCountHdfc,
			creditCountBob, creditCountSbi, totalDebitCount, totalCreditCount;

	void setBalance(double balace, String bankName) {

		switch (bankName.toUpperCase()) {
		case "ICICI":
			totalBalanceIcici = balace;
			break;
		case "HDFC":
			totalBalanceHdfc = balace;
			break;
		case "BOB":
			totalBalanceBob = balace;
			break;
		case "SBI":
			totalBalanceSbi = balace;
			break;
		default:
			System.out.println("Invalid Bank");
		}
	}

	void Operation(String op, String bankName, int amount) {
		switch (op.toUpperCase()) {
		default:
			System.out.println("Invalid Transcation");
		case "DEBIT":
			switch (bankName.toUpperCase()) {

			default:
				System.out.println("Invalid bank");
				break;
			case "ICICI":
				if (totalBalanceIcici >= amount) {
					totalBalanceIcici = totalBalanceIcici - amount;
					debitCountIcici++;
					totalDebitCount++;
				} else
					System.out.println("Insufficient Balance");
				break;
			case "HDFC":
				if (totalBalanceHdfc >= amount) {
					totalBalanceHdfc = totalBalanceHdfc - amount;
					debitCountHdfc++;
					totalDebitCount++;
				} else
					System.out.println("Insufficient Balance");
				break;
			case "BOB":
				if (totalBalanceBob >= amount) {
					totalBalanceBob = totalBalanceBob - amount;
					debitCountBob++;
					totalDebitCount++;
				} else
					System.out.println("Insufficient Balance");
				break;
			case "SBI":
				if (totalBalanceSbi >= amount) {
					totalBalanceSbi = totalBalanceSbi - amount;
					debitCountSbi++;
					totalDebitCount++;
				} else
					System.out.println("Insufficient Balance");
				break;

			}
			break;
		case "CREDIT":
			switch (bankName.toUpperCase()) {
			case "ICICI":
				totalBalanceIcici = totalBalanceIcici + amount;
				creditCountIcici++;
				totalCreditCount++;
				break;
			case "HDFC":
				totalBalanceIcici = totalBalanceIcici + amount;
				creditCountHdfc++;
				totalCreditCount++;
				break;
			case "BOB":
				totalBalanceIcici = totalBalanceIcici + amount;
				creditCountBob++;
				totalCreditCount++;
				break;
			case "SBI":
				totalBalanceIcici = totalBalanceIcici + amount;
				creditCountSbi++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid bank");
			}
		}
	}

	void totalBalance() {
		System.out.println(
				"ToTal Balance is: " + (totalBalanceIcici + totalBalanceHdfc + totalBalanceBob + totalBalanceSbi));
	}

	void totalCount() {
		System.out.println("ToTal Credit operation: " + totalCreditCount + " times");
		System.out.println("ToTal Debit operation: " + totalDebitCount + " times");
	}

	void totalIndividualCreditOp() {
		System.out.println("ICICI bank Credit Operation: " + creditCountIcici + " times");
		System.out.println("HDFC bank Credit Operation: " + creditCountHdfc + " times");
		System.out.println("BOB bank Credit Operation: " + creditCountBob + " times");
		System.out.println("SBI bank Credit Operation: " + creditCountSbi + " times");
	}

	void totalIndividualDebitOp() {
		System.out.println("ICICI bank Debit Operation: " + debitCountIcici + " times");
		System.out.println("HDFC bank Debit Operation: " + debitCountHdfc + " times");
		System.out.println("BOB bank Debit Operation: " + debitCountBob + " times");
		System.out.println("SBI bank Debit Operation: " + debitCountSbi + " times");
	}

	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
		accountDetails.setBalance(7000, "Hdfc");
		accountDetails.setBalance(5000, "SBI");
		accountDetails.setBalance(7000, "BOB");
		accountDetails.setBalance(8000, "ICICI");
		accountDetails.totalBalance();
		accountDetails.Operation("Credit", "ICICI", 3500);
		accountDetails.Operation("Credit", "sbi", 5000);
		accountDetails.Operation("Credit", "HDFC", 5500);
		accountDetails.Operation("Credit", "Bob", 7500);
		accountDetails.Operation("Debit", "Icici", 2500);
		accountDetails.Operation("Debit", "sbi", 3000);
		accountDetails.Operation("debit", "HDFC", 1500);
		accountDetails.Operation("debit", "bob", 500);
		accountDetails.totalIndividualCreditOp();
		accountDetails.totalIndividualDebitOp();
		accountDetails.totalCount();
		accountDetails.totalBalance();
	}
}
