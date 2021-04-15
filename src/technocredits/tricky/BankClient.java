package technocredits.tricky;

public class BankClient {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.balance = 3000;
		bank.debitOp(2000);
		bank.creditOp(200);
		bank.debitOp(200);
		bank.printInfo();
	}
}
