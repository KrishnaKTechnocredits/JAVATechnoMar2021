package technocredits;

public class Bank {
	
	String name;
	int totalBal;
	int debitCount = 0;
	static int totalDebitCount = 0;
	
	void setData(int initialBal, String custName) {
		totalBal = initialBal;
		name = custName;
	}
	
	void debitAmt(int amount) {
		if(amount <= totalBal) {
			totalBal = totalBal - amount;
			debitCount = debitCount + 1;
			totalDebitCount = totalDebitCount + 1;
		}
	}
	
	void printDebitCnt() {
		System.out.println(name + " - Debit operation count : " + debitCount);
	}
	
	void printTotalDebitCnt() {
		System.out.println("Total Debit Count : " + totalDebitCount);
	}
	
	void printBalance() {
		System.out.println("Total balance : " + totalBal);
	}
	
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.setData(10000, "Customer1");
		bank1.debitAmt(3000);
		bank1.debitAmt(1000);
		bank1.debitAmt(1200);
		bank1.printDebitCnt(); // 3
		
		Bank bank2 = new Bank();
		bank2.setData(30000, "Customer2");
		bank2.debitAmt(1800);
		bank2.debitAmt(4300);
		bank2.printDebitCnt(); // 2
		
		bank1.printTotalDebitCnt();
		
	}
}
