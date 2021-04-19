package priyanka_Panat;

/*
 Assignment-9
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

class BankSystem{
	int totalbal;
	int debitCount=0;
	int creditCount=0;
	int printBalanceCount=0;
	String name;
	static int totalDebitAmt=0;
	static int totalCreditAmt=0;
	static int totalPrintBalance=0;
	
	void setData(int initialBal,String custName){
		totalbal=initialBal;
		name=custName;
	}
	
	void debitAmt(int amount){
		if(amount>=totalbal){
			System.out.print("You dont have sufficient balance. ");
		}else{
			totalbal=totalbal-amount;
		    debitCount++;
		    totalDebitAmt++;
		}
	}
	
	void crediAmt(int amount){
			totalbal=totalbal+amount;
			creditCount++;
			totalCreditAmt++;
	}
	
	void printBalance(){
		System.out.println("Current Balance for : " + name + " is " + totalbal);
		printBalanceCount++;
		totalPrintBalance++;
	}
	
	void individualTransactionSummary(){
		System.out.println(name + " transaction summary : Credit - " + creditCount + " times , " + " Debit - " + debitCount + " times , " + " printBalance " +printBalanceCount);
	}
	
	void allTransactionSummary(){
		System.out.println("All Transaction Summary : Credit - " + totalCreditAmt + " times , " + " Debit - " + totalDebitAmt + " times , " + "printBalance " +totalPrintBalance);
	}
	
	public static void main(String[] args){
		BankSystem banksystem1=new BankSystem();
		banksystem1.setData(10000,"User1");
		banksystem1.debitAmt(1000);
		banksystem1.crediAmt(2000);
		banksystem1.crediAmt(4000);
		banksystem1.printBalance();
		banksystem1.individualTransactionSummary();
		BankSystem banksystem2=new BankSystem();
		banksystem2.setData(20000,"User2");
		banksystem2.debitAmt(2000);
		banksystem2.debitAmt(3000);
		banksystem2.crediAmt(3000);
		banksystem2.crediAmt(1500);
		banksystem2.crediAmt(2500);
		banksystem2.crediAmt(200);
		banksystem2.crediAmt(2450);
		banksystem2.individualTransactionSummary();
		banksystem1.allTransactionSummary();
	}
}		
		