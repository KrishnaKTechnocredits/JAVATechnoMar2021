package amruta.communicationBtwnClasses;

public class BankManager {
	public static void main(String[] args) {

		BankClient bank2 = new BankClient();
		bank2.m1();
		
		Bank bank3 = new Bank();
		bank3.setdetails(5000, "Sonali");
		bank3.displayInfo();
		System.out.println(bank3.balance);// We can access variable using object but variable should be instance variable only

		
		Bank bank1 = new Bank();
		bank1.setdetails(5000, "Sonali");
		bank1.displayInfo();
	}
}

//Same object we can create in two different classes to call methods.
//Even we can create same name object in different metods of same program.