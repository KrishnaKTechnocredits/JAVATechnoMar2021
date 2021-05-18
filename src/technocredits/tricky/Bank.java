package technocredits.tricky;

public class Bank {
	
	int balance = 1000;
	int debitCnt,creditCnt;
	
	void debitOp(int amt) {
		debitCnt = 0;
		int bal = balance;
		if(bal >= amt) 
			bal = bal - amt;
		debitCnt++;
	}

	void creditOp(int amt) {
		creditCnt = 0;
		balance = balance + amt;
		creditCnt++;
	}
	
	void printInfo() {
		System.out.println("Remaining balance is " + balance);
		System.out.println("Debit Cnt " + debitCnt + "\n Credit count " + creditCnt);
	}
	
}
