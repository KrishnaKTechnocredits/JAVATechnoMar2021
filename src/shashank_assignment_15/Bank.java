package shashank_assignment_15;

public class Bank {

	int iciciBalance, sbiBalance, hdfcBalance, axisBalance;
	int iciciCreditCnt, sbiCreditCnt, hdfcCreditCnt, axisCreditCnt;
	int iciciDebitCnt, sbiDebitCnt,hdfcDebitCnt,axisDebitCnt;
	static int totalCreditCnt, totalDebitCnt;
	int totalBalance;
	int totalAmtICICI = 15000;
	int totalAmtSBI = 30000;
	int totalAmtHDFC = 40000;
	int totalAmtAxis = 100000;

	void transaction(String operation, String bank, int amt) {
		switch (operation) {
		case "Credit":
		case "credit":
			switch (bank) {
			case "ICICI":
				iciciBalance = credit(amt, totalAmtICICI);
				iciciCreditCnt++;
				break;
			case "SBI":
				sbiBalance = credit(amt, totalAmtSBI);
				sbiCreditCnt++;
				break;
			case "HDFC":
				hdfcBalance = credit(amt, totalAmtHDFC);
				hdfcCreditCnt++;
				break;
			case "AXIS":
				axisBalance = credit(amt, totalAmtAxis);
				axisCreditCnt++;
				break;
			default:
				System.out.println("Invalid Bank Name");

			}
			break;
		case "Debit":
		case "debit":
			switch (bank) {
			case "ICICI":
				iciciBalance = debit(amt, totalAmtICICI);
				iciciDebitCnt++;
				break;
			case "SBI":
				sbiBalance = debit(amt, totalAmtSBI);
				sbiDebitCnt++;
				break;
			case "HDFC":
				hdfcDebitCnt++;
				hdfcBalance = debit(amt, totalAmtHDFC);
				break;
			case "AXIS":
				axisBalance = debit(amt, totalAmtAxis);
				axisDebitCnt++;
				break;
			default:
				System.out.println("Invalid Bank Name");

			}
			break;
		}
	}

	int debit(int amt, int balance) {
		if (balance > amt) {
			totalBalance = balance - amt;
			totalDebitCnt++;
		} else {
			System.out.println("Not Sufficient Balance");
		}
		return totalBalance;
	}

	int credit(int amt, int balance) {
		totalBalance = balance + amt;
		totalCreditCnt++;
		return totalBalance;
	}

	public void printTotalBalance() {
		totalBalance = iciciBalance + hdfcBalance + axisBalance + sbiBalance;
		System.out.println("Total balance is " + totalBalance + " RS.");

	}

	public void printTotalTransaction() {
		System.out.println("Total transactions irrespective of Bank :");
		System.out.println("Total credit operations  " + totalCreditCnt);
		System.out.println("Total debit operations  " + totalDebitCnt);
	}

	public void forAllbanksShowCreditOperationCount() {
		System.out.println("Total transactions for credit opeartion with respect to Bank Name is as follows :");
		System.out.println("Total credit operations for bank ICICI  " + iciciCreditCnt);
		System.out.println("Total credit operations for bank HDFC  " + hdfcCreditCnt);
		System.out.println("Total credit operations for bank AXIS  " + axisCreditCnt);
		System.out.println("Total credit operations for bank SBI  " + sbiCreditCnt);
	}

	public void forAllbanksShowDebitOperationCount() {
		System.out.println("Total transactions for Debit opeartion with respect to Bank Name is as follows :");
		System.out.println("Total Debit operations for bank ICICI bank: " + iciciDebitCnt);
		System.out.println("Total Debit operations for bank HDFC bank: " + hdfcDebitCnt);
		System.out.println("Total Debit operations for bank  AXIS: " + axisDebitCnt);
		System.out.println("Total Debit operations for bank SBI:  " + sbiDebitCnt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.transaction("Credit", "ICICI", 5000);
		bank.transaction("credit", "ICICI", 2000);
		bank.transaction("Credit", "HDFC", 10000);
		bank.transaction("Credit", "HDFC", 1000);
		bank.transaction("Credit", "SBI", 100);
		bank.transaction("Credit", "AXIS", 100000);
		bank.transaction("Credit", "AXIS", 1000);
		bank.transaction("credit", "AXIS", 200000);
		bank.transaction("Credit", "AXIS", 100);
		bank.transaction("debit", "HDFC", 100);
		bank.transaction("debit", "HDFC", 1000);
		bank.transaction("debit", "ICICI", 900);
		bank.transaction("debit", "ICICI", 3000);
		bank.printTotalBalance();
		bank.forAllbanksShowCreditOperationCount();
		bank.forAllbanksShowDebitOperationCount();
		bank.printTotalTransaction();
	}

}
