package technocredits;

public class Example8 {

	int balance = 10000;
	int maxDebitCount = 0;
	
	void debitAmt(int amt) {
		while(balance >= amt) {
			balance = balance - amt;
			maxDebitCount++;
		}
	}
	
	void printDebitCount() {
		System.out.println(maxDebitCount);
		System.out.println("Total Bal " + balance);
	}
	
	public static void main(String[] args) {
		Example8 example8 = new Example8();
		example8.debitAmt(1000);
		example8.printDebitCount();
	}
	
}
