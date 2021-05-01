/* Assignment 9 : 2nd April 2021

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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time  */

package priyanka_Kamble.assignment_9;
class Bankdetails{
	int totalbalance;
	String name;
	int debitcount;
	int creditcount;
	int printBalance;
	static int totaldebitcount;
	static int totalcreditcount;
	
	
	void setData(int initialbal, String custname, int count){
		totalbalance = initialbal;
		name = custname;
		printBalance=count;
	}
	
	void debitamount(int amount){
		if(amount <= totalbalance) {
			totalbalance = totalbalance - amount;
			debitcount++;
			totaldebitcount++;
		}
	}
	
	void creditamount(int amount){
			totalbalance = totalbalance + amount;
			creditcount++;
			totalcreditcount++;
	}
	
	
	void individualTransactionSummary(){
		System.out.println(name+" Credit Count : "+creditcount);	
		System.out.println(name+" Debit Count : "+debitcount);
		System.out.println(name+" Print Balance Count : "+printBalance);
	}
	
	void allTransactionSummary(){
		System.out.println("Total Credit Count : "+totalcreditcount);
		System.out.println("Total Debit Count : "+totaldebitcount);
		System.out.println("Total Print Balance Count : "+printBalance);
	} 

	public static void main(String[] args){
		Bankdetails bankdetails = new Bankdetails();
		bankdetails.setData(5000,"User1",1);
		bankdetails.creditamount(1000);
		bankdetails.creditamount(2000);
		bankdetails.debitamount(4000);
		//bankdetails.printBalancecount(1);
		bankdetails.individualTransactionSummary();
		
		System.out.println("-----------------------------------------");
		
		Bankdetails bankdetails_1 = new Bankdetails();
		bankdetails_1.setData(7000,"User2",0);
		bankdetails_1.creditamount(1000);
		bankdetails_1.creditamount(1000);
		bankdetails_1.creditamount(1000);
		bankdetails_1.creditamount(1000);
		bankdetails_1.creditamount(1000);
		bankdetails_1.debitamount(4000);
		bankdetails_1.debitamount(2000);
		//bankdetails_1.printBalancecount(0);		
		bankdetails_1.individualTransactionSummary();
		
		System.out.println("-----------------------------------------");
		
		bankdetails.allTransactionSummary();
	}
}

