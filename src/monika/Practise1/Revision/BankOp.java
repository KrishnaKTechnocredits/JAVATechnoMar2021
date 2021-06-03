package monika.Practise1.Revision;

public class BankOp extends Thread{
	int totalBal = 10000;
	@Override
	public void run() {
		debitAmount(2000);
	}
	
	synchronized public void debitAmount(int amount) {
		if(amount > 0 && amount <= totalBal) {
			totalBal -= amount;
			System.out.println(Thread.currentThread().getName()+"  Debited amount : "+amount);
			System.out.println(Thread.currentThread().getName()+"  Updated totalBal : "+totalBal);
		}
		
	}
}
