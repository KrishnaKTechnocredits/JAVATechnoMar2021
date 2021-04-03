package technocredits.communicationBtwClasses;

public class Manager {

	public static void main(String[] args) {
		Bank bank1 = new Bank();
		System.out.println(bank1.balance); // 0
		bank1.setDetails(10000,"Techno");
		bank1.printInfo();
		
		BankClient bankClient = new BankClient();
		bankClient.m1();
	}
}
