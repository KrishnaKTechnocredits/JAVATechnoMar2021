package sandesh.Assignment_9;

public class BankingSystem {
	String customerName;
	double balance = 5000;
	int debitCountSingle;
	int creditCountSingle;
	int printCountSingle;
	static int debitCountTotal; 
	static int creditCountTotal;
	static int printCountTotal;
	
	void debitAmount(double debitAmt) {
		balance -= debitAmt;
		debitCountSingle++;
		debitCountTotal++;
	}

	void creditAmount(double creditAmt) {
		balance += creditAmt;
		creditCountSingle++;
		creditCountTotal++;
	}

	void printBalance() {
		System.out.println(customerName +" Current balance is: " +balance);
		printCountSingle++;
		printCountTotal++;
	}
	
	void setName(String custName) {
		customerName = custName;
	}

	void singleTransactions() {
		System.out.println(customerName +" transaction summary: \n"+"Credit: " + creditCountSingle + " time \nDebit: " + debitCountSingle + " time \nPrintBalance: " + printCountSingle + " time");
	}

	void allTransactions() {
		System.out.println("All transaction summary: \n"+"Credit: " + creditCountTotal + " time \nDebit: "+debitCountTotal+" time \nPrintBalance: " + printCountTotal + " time" );
	}

	public static void main(String[] args) {
		BankingSystem bst1 = new BankingSystem();
		bst1.setName("Sandesh");
		bst1.creditAmount(1000);
		bst1.debitAmount(100);
		bst1.creditAmount(600);
		bst1.printBalance();		
		bst1.singleTransactions();	
		System.out.println();
		
		BankingSystem bst2 = new BankingSystem();
		bst2.setName("Shashank");
		bst2.creditAmount(5000);
		bst2.creditAmount(1000);
		bst2.debitAmount(1000);
		bst2.creditAmount(500);
		bst2.debitAmount(100);
		bst2.printBalance();
		bst2.singleTransactions();
		System.out.println();
		bst2.allTransactions();
	}
}

