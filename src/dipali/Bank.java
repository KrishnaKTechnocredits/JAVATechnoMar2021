package dipali;

public class Bank {
	
	int debitCnt=0 , creditCnt=0 , printCnt=0;
	static int debitCount=0 , creditCount=0 , printCount=0;
	int totalAmount=20000;
	public void debitAmount(int amt) {
		totalAmount=totalAmount-amt;
		debitCnt++;
		debitCount++;
	}
	
	public void creditAmount(int amt) {
		totalAmount=totalAmount+amt;
		creditCnt++;
		creditCount++;
	}
	
	public void printBalance() {
		System.out.println("Total balance is "+totalAmount +" RS.");
		System.out.println("--------------------------------------------------------------------");
		printCnt++;
		printCount++;
	}
	
	public void individualTransactionSummary(String user) {
		System.out.println("Individual Transaction summary for user ["+user+"] : ");
		System.out.println("Debit amount method called by user ["+user+"] is ["+debitCnt +"] time");
		System.out.println("Credit amount method called by user ["+user+"] is ["+creditCnt +"] time");
		System.out.println("Print balance method called by user ["+user+"] is ["+printCnt +"] time");
		System.out.println("--------------------------------------------------------------------");
	}
	
	public void allTransactionSummary() {
		System.out.println("All Transaction summary : ");
		System.out.println("Debit amount method called by users is ["+debitCount +"] time");
		System.out.println("Credit amount method called user  is ["+creditCount +"] time");
		System.out.println("Print balance method called user is ["+printCount +"] time");
	}

	public static void main(String[] args) {
		Bank bank1=new Bank();
		bank1.debitAmount(1000);
		bank1.creditAmount(2000);
		bank1.creditAmount(2000);
		bank1.printBalance();
		bank1.individualTransactionSummary("Customer1");
		
		Bank bank2=new Bank();
		bank2.creditAmount(1000);
		bank2.creditAmount(900);
		bank2.creditAmount(800);
		bank2.creditAmount(700);
		bank2.creditAmount(600);
		bank2.debitAmount(1000);
		bank2.debitAmount(2000);
		bank2.individualTransactionSummary("Customer2");
		bank2.allTransactionSummary();
	}

}
