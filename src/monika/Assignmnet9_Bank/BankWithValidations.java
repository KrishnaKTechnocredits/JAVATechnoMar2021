package monika.Assignmnet9_Bank;

/*Assignment 9 : 2nd April 2021

Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/

public class BankWithValidations {
	String user;
	int currenBalance;
	
	int debitCount, creditCount, printBalanceCount;
	static int debitCountBoth, creditCountBoth, printBalanceCountBoth;
	
	void setUserBankDetails(String userInput, int amount) {
		user = userInput;
		if(amount > 0)
			currenBalance = amount;
		else
			System.out.println("Negative amount will not be entertained");
	}
	void debitAmount(int debitamount) {
		if(currenBalance > 0 && debitamount > 0) {
			currenBalance = currenBalance - debitamount;
			debitCount++;
			debitCountBoth++;
		}else
			System.out.println("Negative debit amount not allowed");
	}	
	void creditAmount(int creditamount) {
		if(currenBalance > 0 && creditamount > 0) {
			currenBalance = currenBalance + creditamount;
			creditCount++;
			creditCountBoth++;
		}else
			System.out.println("Negative credit amount not allowed");
	}
	void printBalance() {
		System.out.println(user+" Current balance is : "+currenBalance);
		printBalanceCount++;
		printBalanceCountBoth++;
	}
	void individualTransactionSummary() {
		System.out.println(user+" transaction summary : "+"Credit - "+creditCount+" times, "
				+ "Debit - "+debitCount+" times, printBalance - "+printBalanceCount+" time");
	}
	void allTransactionSummary() {
		System.out.println("Credit - "+creditCountBoth+" times, "
				+ "Debit - "+debitCountBoth+" times, printBalance - "+printBalanceCountBoth+" time");
	}
	
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.setUserBankDetails("User1", -5);
		bank1.debitAmount(-3000);
		bank1.creditAmount(-1000);
		bank1.printBalance();
		bank1.individualTransactionSummary();
		
		Bank bank2 = new Bank();
		bank2.setUserBankDetails("User1", -200);
		bank2.debitAmount(-1000);
		bank2.creditAmount(500);
		bank2.printBalance();
		bank2.individualTransactionSummary();
		
		bank1.allTransactionSummary();
		bank2.allTransactionSummary(); // testing purpose written
//----------------------------------------------------------------
/*		System.out.println("-----------------");
		bank1.setUserBankDetails("User2", 100);
		bank1.debitAmount(40);
		bank1.creditAmount(20);
		bank1.creditAmount(200);
		bank1.printBalance();
		bank1.individualTransactionSummary();
		
		bank2.setUserBankDetails("User2", 5000);
		bank2.debitAmount(1000);
		bank2.creditAmount(500);
		bank2.debitAmount(1000);
		bank2.printBalance();
		bank2.individualTransactionSummary();
		
		bank1.allTransactionSummary();
		bank2.allTransactionSummary();*/ // testing purpose written
	}

}
