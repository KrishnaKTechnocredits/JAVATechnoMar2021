package pavan;
/*
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

Hint : Create 3 static variables will be 

Output :

All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
 */

public class BankingSystem {
	double debamount;
	double balance;
	String custname;
	int ccount=0;
	int dcount=0;
	int pcount=0;
	static int alldebitcount;
	static int allcreditamunt;
	static int printbalance;
	
	void custDetails(String name, double cbalance) {
		custname= name;
		balance= cbalance;	
	}
	void debit(double reqAmout) {
		if (reqAmout>balance){
			System.out.println( custname+ "Do not have sufficient balance");
		}
		else 
			balance= balance-reqAmout;
		dcount= dcount+1;
		alldebitcount=alldebitcount+1;
	} 
	void credit(double cramount) {
		balance= balance+cramount;
		ccount=ccount+1;
		allcreditamunt= allcreditamunt+1;
	}
	void pbalance() {
		pcount = pcount+1;
		///System.out.println(custname+" balance is "+ balance);
		printbalance=printbalance+1;
		
	}
	void print(){
		System.out.println(custname+" Transction summary :"+"Credit - "+ccount+" times, "+"Debit - "+dcount+" times, "+" "+"PrintBalance - "+pcount+" times");
	}
	void  allTransactionSumary() { 
		System.out.println("\nAll Transction summary : "+"Credit - "+ allcreditamunt +" times, "+ "Debit - "+alldebitcount+" times, "+ "PrintBalance - "+printbalance);
	}
	public static void main(String[]Args) {
		BankingSystem test= new BankingSystem();
		test.custDetails("Pavan", 10000);
		test.debit(2000);
		test.debit(5000);
		test.pbalance();
		test.credit(1000);
		test.pbalance();
		test.print();
	
		
		BankingSystem test_1= new BankingSystem();
		test_1.custDetails("Rahul",10000);
		test_1.credit(1000);
		test_1.credit(500);
		test_1.credit(10000);
		test_1.pbalance();
		test_1.print();
		
		test_1.allTransactionSumary();			
	}

}
