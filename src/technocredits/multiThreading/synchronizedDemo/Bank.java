package technocredits.multiThreading.synchronizedDemo;

public class Bank extends Thread {
	UserAccount account;
	
	Bank(UserAccount account){
		this.account = account;
	}
	
	public void run() {
		account.debitAmt(10000);
	}
}
