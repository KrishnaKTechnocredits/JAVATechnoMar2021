package dhanshri;

public class BankDetails {

	String custName;
	int totalAmt;
	int debit = 0;
	int credit = 0;
	int pBalance = 0;
	static int debitcCount = 0;
	static int creditCount = 0;
	static int printBalcount = 0;

	void setData(String name, int balance) {
		totalAmt = balance;
		custName = name;
	}

	void debitAmt(int debitAmount) {
		if (totalAmt >= debitAmount) {
			totalAmt = totalAmt - debitAmount;
		debit++;
		debitcCount++;
		}
	
	}

	void creditAmt(int creditAmount) {
		totalAmt = totalAmt + creditAmount;
		credit++;
		creditCount++;
	}

	void printBalance() {

		System.out.println("Current balance of " + custName + " is " + totalAmt);
		pBalance++;
		printBalcount++;

	}

	void individualTransactionSummary() {
		System.out.println(custName + " transaction summary : " + " credit " + credit + " times, " + " Debit " + debit
				+ " times, " + "Print Balance " + pBalance + " times");

	}

	void allTransactionSummary() {
		System.out.println("All transaction summary: "+ "Credit - "+creditCount+" times,  Debit - " +debitcCount+" times, "+ "print Balance "+printBalcount+" times");
		
	}
	
	
	
	public static void main(String[] args) {
		BankDetails bankDetails = new BankDetails();
		bankDetails.setData("User1", 5000);
		bankDetails.debitAmt(1000);
		bankDetails.creditAmt(100);
		bankDetails.creditAmt(100);
		bankDetails.printBalance();
		bankDetails.individualTransactionSummary();

		BankDetails bankDetails2 = new BankDetails();
		bankDetails2.setData("User2", 15000);
		bankDetails2.creditAmt(1000);
		bankDetails2.debitAmt(3000);
		bankDetails2.creditAmt(100);
		bankDetails2.creditAmt(100);
		bankDetails2.creditAmt(100);
		bankDetails2.creditAmt(100);
		bankDetails2.printBalance();
		bankDetails2.individualTransactionSummary();
		
		bankDetails2.allTransactionSummary();

	}

}
