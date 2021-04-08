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



package rashmi;
public class BankingSystem{

	int balance;
	int debitcnt=0;
	int creditcnt=0;
	String name;
	static int  totalDebitCnt=0;
	static int totalCreditCnt=0;
	int printBalancecnt = 0;
	static int totalprintBalancecnt = 0;
	
	 

	void setData(String uname, int initialBalance){
		name = uname;
		balance = initialBalance;
	}
	
	void debtAmt(int amt){
		while(balance>=amt){
		balance = balance - amt;
		debitcnt++;
		totalDebitCnt++;
		printBalancecnt++;
		totalprintBalancecnt++;
		
	}
	}

	void creditAmt(int amt){
		
		if(amt>=0){
		balance = balance + amt;
		creditcnt++;
		totalCreditCnt++;
		printBalancecnt++;
		totalprintBalancecnt++;
		}
		
		
	}
	void printBalance(){
		System.out.println("Current balance : "+balance);
	}
	
	void individualTransactionSummary(){
		System.out.println(name+" transaction summary : "+"credit - "+creditcnt+" debit - "+debitcnt+" printBalance - "+printBalancecnt);
	}
	
	void allTransactionSummary(){
		System.out.println("Total transaction summary : "+"credit - "+totalCreditCnt+" debit - "+totalDebitCnt+" printBalance - "+totalprintBalancecnt);
	}
	
	public static void main(String[] args){
		BankingSystem bankingSystem_1= new BankingSystem();
		bankingSystem_1.setData("customer 1",10000);
		bankingSystem_1.debtAmt(5000);
		bankingSystem_1.creditAmt(3000);
		bankingSystem_1.individualTransactionSummary();
		bankingSystem_1.allTransactionSummary();
		
		BankingSystem bankingSystem_2 = new BankingSystem();
		bankingSystem_2.setData("customer 1",10000);
		bankingSystem_2.debtAmt(5000);
		bankingSystem_2.creditAmt(3000);
		bankingSystem_2.individualTransactionSummary();
		bankingSystem_2.allTransactionSummary();
		
	}
}
		
		
		
		
	


