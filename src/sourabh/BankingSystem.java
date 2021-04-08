package sourabh;

public class BankingSystem {
	String custName;
	int totalAmount;
	int debitCount=0; 
	int	creditCount=0;
	int printBalanceCount=0;
	static int debitCountTotal=0;
	static int	creditCountTotal=0;
	static int printBalanceTotal=0;
	void setCustomerDetails(String getname, int gettotalAmount) {
		custName= getname;
		totalAmount= gettotalAmount;
	}
	void debitAmount(int debitAmount) {
		if(debitAmount<=totalAmount) {
			totalAmount= totalAmount-debitAmount;
			debitCount++;
			debitCountTotal++;
		}
	}
	void creditAmount(int creditAmount) {
		totalAmount= totalAmount+creditAmount;
		creditCount++;
		creditCountTotal++;
	}
	void printBalance() {
		System.out.println("Total Amount is "+totalAmount);
		printBalanceCount++;
		printBalanceTotal++;
	}
	void individualTransactionSummary() {
		System.out.println(custName+" transaction summary : Credit - "+creditCount+" times, Debit - "+debitCount+" times, printBalance - "+printBalanceCount+" time");
	}
	void allTransactionSummary() {		
		System.out.println("Credit - "+creditCountTotal+" times, Debit - "+debitCountTotal+" times, printBalance - "+printBalanceTotal+" time");	
	}
	public static void main(String[] args) {
		BankingSystem bankingSystem= new BankingSystem();
		bankingSystem.setCustomerDetails("User1", 10000);
		bankingSystem.debitAmount(1000);
		bankingSystem.debitAmount(1000);
		bankingSystem.creditAmount(2000);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary();
		//bankingSystem.allTransactionSummary();
	/*------------------Next Customer-------------------*/	
		BankingSystem bankingSystem2= new BankingSystem();
		bankingSystem2.setCustomerDetails("User2", 10000);
		bankingSystem2.debitAmount(1000);
		bankingSystem2.debitAmount(1000);
		bankingSystem2.creditAmount(2000);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();
		bankingSystem2.allTransactionSummary();
	}
	
}
