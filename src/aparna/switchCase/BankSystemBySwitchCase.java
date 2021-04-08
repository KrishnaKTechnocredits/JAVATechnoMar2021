/* 7th April'2021-Switch Case Example for Bank system in which
 *  debit and credit is done by using Switch case
 */
package aparna.switchCase;

public class BankSystemBySwitchCase {
	String customerName;
	int totalBalance;

	void setCustomerDetails(String name, int initialAmount) {
		customerName = name;
		totalBalance = initialAmount;
	}

	void amounttransaction(String operation, int amount) {
		switch (operation) {
		case "debit":
			if (amount > totalBalance) {
				System.out.println("You dont have sufficient balance in your Account");
			} else {
				totalBalance = totalBalance - amount;
				System.out.println("Total balance will be after Debit:- " + totalBalance);
			}
			break;
		case "credit":
			totalBalance = totalBalance + amount;
			System.out.println("Total balance will be after Credit:- " + totalBalance);
			break;
		}
	}

	void printBalance() {
		System.out.println("Current Balance in :- " + customerName + "'s Account is : " + totalBalance + "\n");
	}

	public static void main(String[] args) {
		BankSystemBySwitchCase bankSystemBySwitchCase = new BankSystemBySwitchCase();
		bankSystemBySwitchCase.setCustomerDetails("Customer1", 2000);
		bankSystemBySwitchCase.amounttransaction("debit", 3000);
		bankSystemBySwitchCase.amounttransaction("credit", 5000);
		bankSystemBySwitchCase.amounttransaction("debit", 3000);
		bankSystemBySwitchCase.printBalance();

		bankSystemBySwitchCase.setCustomerDetails("Customer2", 10000);
		bankSystemBySwitchCase.amounttransaction("debit", 2000);
		bankSystemBySwitchCase.amounttransaction("credit", 7000);
		bankSystemBySwitchCase.printBalance();
	}

}
