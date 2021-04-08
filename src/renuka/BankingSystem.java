package renuka;

public class BankingSystem {
	
	String custName;
	int totalAmt;
	int creditCount = 0;
	int debitCount = 0;
	int balanceCount = 0;
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int totalPrintBalanceCount = 0;
	
	
	void customerDetails(String name, int totalAmount) {
		custName = name;
		totalAmt = totalAmount;
	}
	
	void debitAmount(int dbtAmount) {
		if(totalDebitCount >= debitCount)
		totalAmt = totalAmt - dbtAmount;
		debitCount++;
		totalDebitCount++;
	}
	
	void creditAmount(int crdAmount) {
		totalAmt = totalAmt + crdAmount;
		creditCount++;
		totalCreditCount++;	
	}
	
	void printBalance() {
		System.out.println("Current Balance for "+custName+" is: "+totalAmt);
		balanceCount++;
		totalPrintBalanceCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println(custName+" Transaction summary: "+"Credit- "+creditCount+"times, "+"Debit- "+debitCount+"times, "+"printBalance- "+balanceCount+"time");
	}
	
	void allTransactionSummary() {
		System.out.println("All Transaction summary: "+"Credit- "+totalCreditCount+"times, "+"Debit- "+totalDebitCount+"times, "+"printBalance- "+totalPrintBalanceCount+"time");
	}

	public static void main(String[] args) {
		BankingSystem bankDetails = new BankingSystem();
		bankDetails.customerDetails("User1",10000);
		bankDetails.debitAmount(300);
		bankDetails.creditAmount(400);
		bankDetails.creditAmount(400);
		bankDetails.printBalance();
		bankDetails.individualTransactionSummary();
		
		
		BankingSystem bankDetails2 = new BankingSystem();
		bankDetails2.customerDetails("User2",30000);
		bankDetails2.debitAmount(300);
		bankDetails2.debitAmount(300);
		bankDetails2.creditAmount(400);
		bankDetails2.creditAmount(400);
		bankDetails2.creditAmount(400);
		bankDetails2.creditAmount(400);
		bankDetails2.creditAmount(400);
		//bankDetails2.printBalance();
		bankDetails2.individualTransactionSummary();
		bankDetails2.allTransactionSummary();
		

	}

}
