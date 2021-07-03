package gauravk.Assignment_9;
/*
 * Assignment 9 : 2nd April 2021
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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
 */
import java.util.Scanner;

public class BankingSystem {
	
	int creditCount, debitCount, printBalanceCount;
	static int balance;
	static int totalCreditCount, totalDebitCount, totalPrintBalanceCount;
	Scanner sc = new Scanner(System.in);
	
	void debitAmount(int debit) {
		if (debit<=balance) {
			balance = balance - debit;
			debitCount++;
			totalDebitCount++;
		}
		else System.out.println("debit operation not possible.");
	}
	
	void creditAmount(int credit) {
		balance = balance + credit;
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance(String user) {
		System.out.println("Balance of "+user+" is: "+balance);
		printBalanceCount++;
		totalPrintBalanceCount++;
	}
	
	void individualTransactionSummary(String user) {
		
		System.out.println(user+" transaction trigger summary :"+" Credit - "+creditCount+" times,"+" Debit - "+debitCount+" times,"+" printBalance - "+printBalanceCount+" time");
	}
	
	
	public static void main(String[] a) {
		
		String name1="", name2="";
		
		BankingSystem bankingSystemUser1 = new BankingSystem();
		System.out.println("Enter your name:");
		name1 = bankingSystemUser1.sc.next();
		System.out.println("balance of "+name1+" is: ");
		balance = bankingSystemUser1.sc.nextInt();
		System.out.print("enter credit amount: ");
		bankingSystemUser1.creditAmount(bankingSystemUser1.sc.nextInt());
		System.out.print("enter credit amount: ");
		bankingSystemUser1.creditAmount(bankingSystemUser1.sc.nextInt());
		System.out.print("enter debit amount: ");
		bankingSystemUser1.debitAmount(bankingSystemUser1.sc.nextInt());
		bankingSystemUser1.printBalance(name1);
		
		
		BankingSystem bankingSystemUser2 = new BankingSystem();
		System.out.println("Enter your name:");
		name2 = bankingSystemUser2.sc.next();
		System.out.println("balance of "+name2+" is: ");
		balance = bankingSystemUser2.sc.nextInt();
		System.out.print("enter credit amount: ");
		bankingSystemUser2.creditAmount(bankingSystemUser2.sc.nextInt());
		System.out.print("enter credit amount: ");
		bankingSystemUser2.creditAmount(bankingSystemUser2.sc.nextInt());
		System.out.print("enter credit amount: ");
		bankingSystemUser2.creditAmount(bankingSystemUser2.sc.nextInt());
		System.out.print("enter credit amount: ");
		bankingSystemUser2.creditAmount(bankingSystemUser2.sc.nextInt());
		System.out.print("enter credit amount: ");
		bankingSystemUser2.creditAmount(bankingSystemUser2.sc.nextInt());
		System.out.print("enter debit amount: ");
		bankingSystemUser2.debitAmount(bankingSystemUser2.sc.nextInt());
		System.out.print("enter debit amount: ");
		bankingSystemUser2.debitAmount(bankingSystemUser2.sc.nextInt());
		//bankingSystemUser2.printBalance(name2);
		
		bankingSystemUser1.individualTransactionSummary(name1);
		bankingSystemUser2.individualTransactionSummary(name2);
		
		System.out.println("Total triggers:"+" credits : "+totalCreditCount+" debits : "+totalDebitCount+" print balance : "+totalPrintBalanceCount);
	}

}