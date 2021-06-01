package priyanka_Kamble.assignment_15;

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
public class BankTransaction {

	double totalBalanceIcici, totalBalanceHdfc, totalBalanceBob, totalBalanceSbi;
	int debitCountIcici, debitCountHdfc, debitCountBob, debitCountSbi, creditCountIcici, creditCountHdfc,
			creditCountBob, creditCountSbi;
	String customerName;

	// Method to set Customer name
	void setCutomerName(String custName) {
		customerName = custName;
		System.out.println(custName + "'s Transaction details as below:");
	}

	// Method to set initial total balance for respective banks.
	void setBalance(double balance, String bankName) {
		switch (bankName.toUpperCase()) {
		case "ICICI":
			totalBalanceIcici = balance;
			break;
		case "HDFC":
			totalBalanceHdfc = balance;
			break;
		case "BOB":
			totalBalanceBob = balance;
			break;
		case "SBI":
			totalBalanceSbi = balance;
			break;
		default:
			System.out.println("Invalid bank name!");
		}
	}

	// Method to set Bank transaction details.
	void bankTransaction(String bankName, String transactionType, double amount) {
		switch (transactionType.toUpperCase()) {			
			case "DEBIT":
				switch (bankName.toUpperCase()) {
					case "ICICI":
						if (totalBalanceIcici >= amount) {
							totalBalanceIcici -= amount;
							debitCountIcici++;
						} else
							System.out.println("Insuffucuent balance to process your debit request");
						break;
					case "HDFC":
						if (totalBalanceHdfc >= amount) {
							totalBalanceHdfc -= amount;
							debitCountHdfc++;
						} else
							System.out.println("Insuffucuent balance to process your debit request");
						break;
					case "BOB":
						if (totalBalanceBob >= amount) {
							totalBalanceBob -= amount;
							debitCountBob++;
						} else
							System.out.println("Insuffucuent balance to process your debit request");
						break;
					case "SBI":
						if (totalBalanceSbi >= amount) {
							totalBalanceSbi -= amount;
							debitCountSbi++;
						} else
							System.out.println("Insuffucuent balance to process your debit request");
						break;
					default:
						System.out.println("Invalid bank name!");
					}
			break;
			// For transaction type CREDIT, add amount in respective bank and increment the
			// credit counter everytime.
			case "CREDIT":
				switch (bankName.toUpperCase()) {
					case "ICICI":
						totalBalanceIcici += amount;
						creditCountIcici++;
						break;
					case "HDFC":
						totalBalanceHdfc += amount;
						creditCountHdfc++;
						break;
					case "BOB":
						totalBalanceBob += amount;
						creditCountBob++;
						break;
					case "SBI":
						totalBalanceSbi += amount;
						creditCountSbi++;
						break;
					default:
						System.out.println("Invalid bank name!");
					}
			break;
			// For transaction type other than DEBIT or CREDIT.
			default:
				System.out.println("Invalid Transactiondc Type");
			}
	}

	// Method to display sum of total balance of respective banks
	void displaySumOfTotalBalance() {
		System.out.println("Sum of total balance of ICICI, HDFC, BOB and SBI is: "
				+ (totalBalanceIcici + totalBalanceHdfc + totalBalanceBob + totalBalanceSbi));
	}

	void displayAllBankTransactionCount() {
		System.out.println(
				"Total Credit operations: " + (creditCountIcici + creditCountHdfc + creditCountBob + creditCountSbi));
		System.out.println(
				"Total Debit operations: " + (debitCountIcici + debitCountHdfc + debitCountBob + debitCountSbi));
	}

	void displayIndividualBankCreditCount() {
		System.out.println("ICICI Credit operation: " + creditCountIcici + "\nHDFC Credit operation: " + creditCountHdfc
				+ "\nBOB Credit operation: " + creditCountBob + "\nSBI Credit operation: " + creditCountSbi);
	}

	void displayIndividualBankDebitCount() {
		System.out.println("ICICI Debit operation: " + debitCountIcici + "\nHDFC Debit operation: " + debitCountHdfc
				+ "\nBOB Debit operation: " + debitCountBob + "\nSBI Debit operation: " + debitCountSbi);
	}

	public static void main(String[] args) {
		BankTransaction bankTransaction = new BankTransaction();
		// To set customer name
		bankTransaction.setCutomerName("Maulik");
		// To set balance in respective bank
		bankTransaction.setBalance(1000, "HDFC");
		bankTransaction.setBalance(2000, "ICICI");
		bankTransaction.setBalance(3000, "BOb");
		bankTransaction.setBalance(4000, "sbi");
		System.out.println();
		// To set bank transaction details
		bankTransaction.bankTransaction("icici", "debit", 500);
		bankTransaction.bankTransaction("hdfc", "credit", 200);
		bankTransaction.bankTransaction("icici", "debit", 100);
		bankTransaction.bankTransaction("sbi", "debit", 300);
		bankTransaction.bankTransaction("bob", "credit", 500);
		bankTransaction.bankTransaction("sbi", "credit", 400);
		bankTransaction.bankTransaction("hdfc", "debit", 1200);
		// Displaying sum of total balances of all bank account and credit and debit
		// count.
		bankTransaction.displaySumOfTotalBalance();
		System.out.println();
		bankTransaction.displayAllBankTransactionCount();
		System.out.println();
		bankTransaction.displayIndividualBankCreditCount();
		System.out.println();
		bankTransaction.displayIndividualBankDebitCount();
	}
}
