package monika.Practise1.Revision;

public class MainOperating {

	public static void main(String[] args) {

		// UserAccount obj1 = new UserAccount(account1);
		// UserAccount obj2 = new UserAccount(account1);
		BankOp account1 = new BankOp();
		BankOp account2 = account1;
		System.out.println("Start");
		account1.setName("BankOp Thread1");
		account2.setName("BankOp Thread2");
		account1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		account2.start();
		System.out.println("End");
	}

}
