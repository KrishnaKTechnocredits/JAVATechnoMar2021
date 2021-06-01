package technocredits.multiThreading.synchronizedDemo;

public class UserAccount {

	 int totalBal = 10000;
	
	 void debitAmt(int amt) {
		System.out.println(Thread.currentThread().getName() + " is operating an account");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		synchronized (this) {
			if(totalBal >= amt) {
				totalBal = totalBal - amt; // 10000 - 10000 = 0, -10000
				System.out.println(Thread.currentThread().getName() + " has withdraw amount " + amt);
				System.out.println(Thread.currentThread().getName() + " : Now Total Bal is " + totalBal);
			}else {
				System.out.println(Thread.currentThread().getName() + " : InSufficient Balance");
			}
		}
	}
}
