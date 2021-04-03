package technocredits.communicationBtwClasses;
// StudentName_PackageStructure
public class Bank {
	int balance;
	String custName;
	
	void setDetails(int accBalance, String name) {
		balance = accBalance;
		custName = name;
	}
	
	void printInfo() {
		System.out.println("Customer name is " + custName);
		System.out.println("Balance = " + balance);
	}

}
