package krishna.Assignment_9;
//Create a Banking System which has the following functionality.

public class BankingSystem1 {
	String name;
	int totalbalance;
	int debitCount=0;
	int creditCount=0;
	int printBalance=0;
	static int totalDebitCount=0;
	static int totalCreditCount=0;
	static int totalPrintBalanceCount=0;
	
	void setData(int amount,String custName) {
		totalbalance =amount;
		name = custName;
	}
	
	void debit(int amount) {
		if(amount<=totalbalance) {
			totalbalance = totalbalance-amount;
			System.out.println("After debit the remaining amount is "+totalbalance);
			debitCount++;
			totalDebitCount++;
		}
	}
	
	void credit(int amount) {
		totalbalance=totalbalance+amount;
		System.out.println("The amount is credited new balance is "+totalbalance);
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance() {
		System.out.println("The balance total amount is "+totalbalance);
		printBalance++;
		totalPrintBalanceCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println();
		System.out.println("Individual Transaction Summary:");
		System.out.println(name+" debit count is "+debitCount);
		System.out.println(name+" credit count is "+creditCount);
		System.out.println(name+" print balance count is "+printBalance);
			
	}
	
	void allTransactionSummary() {
		System.out.println();
		System.out.println("All transaction summary :");
		System.out.println("Total debit count is "+totalDebitCount);
		System.out.println("Total credit count is "+totalCreditCount);
		System.out.println("Total print balance count is "+totalPrintBalanceCount);
	}
	
	public static void main(String[] args) {
		BankingSystem1 bankingSystem1 = new BankingSystem1();
		System.out.println("User1 transaction summary :");
		bankingSystem1.setData(10000,"User1");
		bankingSystem1.debit(1000); 
		bankingSystem1.credit(2000);
		bankingSystem1.credit(500);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		
		System.out.println();
		BankingSystem1 bankingSystem2 = new BankingSystem1();
		System.out.println("User2 transaction summary :");
		bankingSystem2.setData(10000,"User2");
		bankingSystem2.debit(3000);
		bankingSystem2.debit(4000);
		bankingSystem2.credit(1000);
		bankingSystem2.credit(2000);
		bankingSystem2.credit(3000);
		bankingSystem2.credit(4000);
		bankingSystem2.credit(5000);
		bankingSystem2.individualTransactionSummary();
		bankingSystem1.allTransactionSummary();
	}
}
