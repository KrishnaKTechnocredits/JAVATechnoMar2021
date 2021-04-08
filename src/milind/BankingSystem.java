package milind;
/*Assignment 09: 
Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit 

& printBalance method called .
Hint : Create 3 non static instance variable.
Output :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit 

& printBalance method get called.
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/

public class BankingSystem {
	String name;
	int totalBalance;
	int debit=0;
	static int totalDebitCount=0;
	int credit=0;
	static int totalCreditCount=0;
	int printBalance=0;
	static int totalprintBalance=0;
	
	void setdata(int intialBal,String cusName)
	{
		totalBalance=intialBal;
		name=cusName;
	}
	
	void debitAmount(int amount) {
		if(amount<=totalBalance)
		{
			totalBalance=totalBalance-amount;
			debit++;
			totalDebitCount++;
		}
		
	}
	
	void creditAmount(int amount) {
		if(amount<=totalBalance)
		{
			totalBalance=totalBalance+amount;
			credit++;
			totalCreditCount++;
		}
	}
	
	void printBalance() {
		printBalance++;
		totalprintBalance++;
	}
		
	
	void individualTran(String cusName) {
		System.out.println(cusName +" "+" transaction summary: credit - " +credit+" "+"times,"+" debit - "+debit+" times, printBalance "+printBalance+ " -time");
	}
	static void allTranSummary() {
		System.out.println("All" +" "+" transaction summary: credit -" +totalCreditCount+" "+"times, "+" debit - "+totalDebitCount+" time, printBalance "+totalprintBalance+ " -time");
	}
	public static void main(String[] a) {
		BankingSystem Bank=new BankingSystem();
		Bank.setdata(18000, "user1");
		Bank.creditAmount(3000);
		Bank.creditAmount(2000);
		Bank.debitAmount(4000);
		Bank.printBalance();
		Bank.individualTran("user1");
		
		BankingSystem Bank1=new BankingSystem();
		Bank1.setdata(15000, "user2");
		Bank1.creditAmount(2000);
		Bank1.creditAmount(1000);
		Bank1.creditAmount(1000);
		Bank1.debitAmount(4000);
		Bank1.debitAmount(2000);
		Bank1.printBalance();
		Bank1.individualTran("user2");
		Bank1. allTranSummary();
	}
}
