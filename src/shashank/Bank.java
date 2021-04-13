package shashank;
public class Bank{
	static int bal =700;
	public static void main (String args[])
	{
		int bal =500;
		credit(200);
		debit(500);
		print();
	}
	static void print()
	{
		System.out.println(bal);
	}
	static void credit (int balance){
		Bank bank = new Bank();
		int bal=1000;
		int value =bank.bal;
		bal = value + balance;
	}
	static void debit (int balance) {
		if (bal >balance)
			bal = bal -balance;
		else
			System.out.println("Not Suffiient");
	}
}