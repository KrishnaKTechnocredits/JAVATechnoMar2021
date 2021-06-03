package monika.Practise1.Revision;

public class UserAccount {
	
	BankOp useraccount;
	public UserAccount(BankOp obj) {
		this.useraccount = obj;
	}
	
	public void m1() {
		useraccount.debitAmount(3000);
		//useraccount.run();
	}
}
