package ashtha.Assignment9;

public class Transaction {
	String name;
	int totalBalance;
	int debitCount = 0;
	int creditCount = 0;
	int printCount = 0;
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int totalPrintCount = 0;
	
	void setDetails (String customerName, int balance) {
		name = customerName;
		totalBalance = balance;		
	}
	
	void debitAmount (int debitAmount) {
		if (debitAmount <= totalBalance) {
			totalBalance = totalBalance - debitAmount;
			debitCount++;
			totalDebitCount++;
		}
		else {
			System.out.println("Insufficient balance");			
		}
	}
	
	void creditAmount (int creditAmount) {
		if (creditAmount > 0) 
			totalBalance = totalBalance + creditAmount;
			creditCount++;
			totalCreditCount++;		
		}
	
	void printBalance () {
		System.out.println("Customer Name - "+name+" , Total Balance : "+totalBalance);
		printCount++;
		totalPrintCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println(name+" transaction summary : Credit - "+creditCount+" times, Debit - "+debitCount+" times, printBalance - "+printCount+" times.");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - "+ totalCreditCount +" times, Debit - "+ totalDebitCount +" times, printBalance - "+ totalPrintCount +" times.");
	}
	
	public static void main(String[] args) {
		Transaction transaction1 = new Transaction();
		transaction1.setDetails("Customer1",30000);
		transaction1.debitAmount(1000);
		transaction1.printBalance();
		transaction1.debitAmount(2000);
		transaction1.printBalance();
		transaction1.creditAmount(5000);
		transaction1.printBalance();
		transaction1.individualTransactionSummary();
		transaction1.debitAmount(32001);
		
		Transaction transaction2 = new Transaction();
		transaction2.setDetails("Customer2",20000);
		transaction2.debitAmount(5000);
		transaction2.printBalance();
		transaction2.creditAmount(2000);
		transaction2.printBalance();
		transaction2.creditAmount(150);
		transaction2.printBalance();
		transaction2.creditAmount(750);
		transaction2.printBalance();
		transaction2.individualTransactionSummary();
		transaction2.allTransactionSummary();
		
	}
}
