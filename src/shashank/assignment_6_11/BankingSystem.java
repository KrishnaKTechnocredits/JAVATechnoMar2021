package shashank.assignment_6_11;

public class BankingSystem {

	String name;
	int balance, creditCount, debitCount, printBalanceCount;
	static int totalCreditCount, totalDebitCount, totalPrintBalanceCount;

	private void setdata(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	private void credit(int credit) {
		balance += credit;
		creditCount++;
		totalCreditCount++;
	}

	private void debit(int debit) {
		if (balance > debit) {
			balance -= debit;
			debitCount++;
			totalDebitCount++;
		} else
			System.out.println(name + " doesnt have sufficient balance to withdraw");
	}

	private void printBalance() {
		System.out.println("Available balance in " + name + " account is: " + balance);
		printBalanceCount++;
		totalPrintBalanceCount++;
	}

	private void individualTransactionSummary() {
		System.out.println(name + " transaction summary -- credit " + creditCount + " times , Debit " + debitCount
				+ " times , Printbalance " + printBalanceCount + " times.");

	}

	private void allTransactionSummary() {
		System.out.println("All transaction summary-- Credit: " + totalCreditCount + " times Debit: " + totalDebitCount
				+ " times Total printbalance " + totalPrintBalanceCount + " times.");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingSystem bankingSystem = new BankingSystem();
		bankingSystem.setdata("Shashank", 10000);
		bankingSystem.credit(5000);
		bankingSystem.debit(7500);
		bankingSystem.credit(3200);
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setdata("Pooja", 2400);
		bankingSystem2.credit(7800);
		bankingSystem2.credit(200);
		bankingSystem2.credit(2600);
		bankingSystem2.debit(1000);
		bankingSystem2.credit(5000);
		bankingSystem2.credit(1000);
		bankingSystem2.debit(1200);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary();
		bankingSystem2.individualTransactionSummary();
		bankingSystem.allTransactionSummary();
	}

}
