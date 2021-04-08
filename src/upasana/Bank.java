package upasana;

public class Bank {
	
	int debit;
	int credit;
	int printBal;
	int creditCount = 0;
	int debitCount = 0;
	int printBalCount =0;
	//String user1;
	//String user2;
	
	static int debitT;
	static int creditT;
	static int printBalT;
	static int creditCountT = 0;
	static int debitCountT = 0;
	static int printBalCountT =0;
	static int totalBal = 15000;
	
	void debit(int amt) {
		if(totalBal>=amt) {
			totalBal = totalBal - amt;
			debitCount++;
			debitCountT++;
			
		}
	}
	
	void credit(int amt) {
		if(amt>0) {
			totalBal = totalBal + amt;
			creditCount++;
			creditCountT++;
		}
	}
	
	void printBal() {
		printBalCount++;
		printBalCountT++;
	
	}
	
	void individualTransactionSummary(String user) {
		System.out.println(user+ " transaction summary : Credit - "+creditCount+" times, "
				+ "Debit - "+debitCount +"times,printBalance - "+printBalCount +" times");
		}
	
	void allTransactionSummary() {
		System.out.println(" All transaction summary : Credit - "+creditCountT +"times, "
				+ "Debit - "+debitCountT  +"times, printBalance - "+printBalCountT +" time");
	}
	
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.debit(3000);
		bank1.printBal();
		bank1.individualTransactionSummary("user1");
		
		Bank bank2 = new Bank();
		bank2.credit(5000);
		bank2.printBal();
		bank2.individualTransactionSummary("user2");
		
		bank1.allTransactionSummary();
	}
}
