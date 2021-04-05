package bhavana;

public class BankingSystem {
	String name;
	double currentBalance;
	int debitCount=0;
	int creditCount=0;
	int printCount=0;
	static int totalDebitCount=0;
	static int totalCreditCount=0;
	static int totalPrintCount=0;
	
	void setData(double initialBalance,String custName) {
		currentBalance=initialBalance;
		name=custName;
	}
	void debitAmt(int amount) {
		if(amount<=currentBalance)
			currentBalance =currentBalance-amount;
			debitCount++;
			totalDebitCount++;
	}
	
	void creditAmt(int amount){
		if(amount<=currentBalance)
		currentBalance=currentBalance+amount;
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance() {
		System.out.println(name+"current balance is "+ currentBalance);
		printCount++;
		totalPrintCount++;
	}
	
	void individualTransactionSummery(){
		System.out.println(name+" transaction summery:"+" Credit "+ creditCount +" Debit "+ debitCount +" Print balance "+ printCount);
		//System.out.println("User2 transaction summery:"+" Credit "+ creditCount +" Debit "+ debitCount +" Print balance "+ printCount);
	}
	
	void allTransactionSummery() {
		System.out.println("All transaction summery:"+" Credit "+totalCreditCount+" Debit "+totalDebitCount+" Print balance "+totalPrintCount);
	}
	public static void main(String[] args) {
		BankingSystem bankingsystem=new BankingSystem();
		bankingsystem.setData(10000, "Gopal");
		bankingsystem.debitAmt(1000);
		bankingsystem.creditAmt(1200);
		bankingsystem.printBalance();
		bankingsystem.individualTransactionSummery();
		
		BankingSystem bankingsystem2=new BankingSystem();
		bankingsystem2.setData(20000, "Laxman");
		bankingsystem2.debitAmt(1000);
		bankingsystem2.debitAmt(200);
		bankingsystem2.debitAmt(200);
		bankingsystem2.debitAmt(200);
		bankingsystem2.printBalance();
		bankingsystem2.individualTransactionSummery();
		bankingsystem.allTransactionSummery();
	}
}
