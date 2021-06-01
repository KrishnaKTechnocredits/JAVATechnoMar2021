package technocredits.multiThreading.synchronizedDemo;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		UserAccount maulikAccount = new UserAccount();
		Bank krishna = new Bank(maulikAccount);
		Bank maulik = new Bank(maulikAccount);
		maulik.setPriority(7);
		krishna.setPriority(6);
		krishna.setName("Krishna");
		maulik.setName("Maulik");
		krishna.start();
		krishna.join();
		maulik.start();
		
		
	}
}
