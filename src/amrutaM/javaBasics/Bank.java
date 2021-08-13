package amrutaM.javaBasics;

/*Assignment - 2 : 2nd Aug'21
*Create a class called Bank having 3 methods and one instance variable.
- expected operations - debitAmount, creditAmount, displayBalanace.
- variable balance to hold current balance.
- create only one object and call methods multiple times
*/
public class Bank {
	int balance = 3000;

	void debitAmout(int amount) {
		balance = balance - amount;
	}

	void creditAmount(int amount) {
		balance = balance + amount;
	}

	void displayBalanace() {
		System.out.println("Balance is " + balance);
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.displayBalanace();
		bank.debitAmout(200);//2800
		bank.creditAmount(500);//3300
		bank.displayBalanace();
	}
}
