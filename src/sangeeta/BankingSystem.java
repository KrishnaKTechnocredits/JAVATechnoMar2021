package sangeeta;

public class BankingSystem {
	String name;
	int Totalbalance;
	int DebitCount = 0;
	int CreditCount = 0;
	int PrintBalanceCount = 0;
	static int TotalDebitCount = 0;
	static int TotalCreditCount = 0;
	static int TotalPrintBalanceCount = 0;
	
	void setData(int initialBalance, String cusName) {
		Totalbalance = initialBalance;
		name = cusName;
	}
	
	void debitAmount(int amount) {
		while(Totalbalance >= amount) {
			Totalbalance = Totalbalance - amount;
			DebitCount++;
			TotalDebitCount++;
		}
	}
	
	void creditAmount(int creditamount) {
		if(creditamount > 0)
			Totalbalance = Totalbalance + creditamount;
			CreditCount++;
			TotalCreditCount++;
	}
	
	void printBalance() {
		PrintBalanceCount++;
		TotalPrintBalanceCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println(name+" Credit- "+CreditCount);
		System.out.println(name+" Debit- "+DebitCount);
		System.out.println(name+" Print Balance count : "+PrintBalanceCount);
		
	}
	
	void allTransactionSummary() {
		System.out.println(" Total Credit- "+TotalCreditCount);
		System.out.println(" Total Debit- "+TotalDebitCount);
		System.out.println(" Total Print Balance- "+TotalPrintBalanceCount);
	}
	
	public static void main(String[] a) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setData(20000, "User1");
		bankingSystem1.creditAmount(500);
		bankingSystem1.creditAmount(500);
		bankingSystem1.debitAmount(2000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setData(10000, "User2");
		bankingSystem2.creditAmount(100);
		bankingSystem2.creditAmount(500);
		bankingSystem2.debitAmount(1500);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();
		bankingSystem2.allTransactionSummary();
		
		
		
	}
}
