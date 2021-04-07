package paras;

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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
*/

public class BankDetails {
	
	int printBalance = 0;
	int debitAmount = 0;
	int creditAmount = 0;
	static int printBalanceCount = 0;
	static int debitAmountCount = 0;
	static int creditAmountCount = 0;
	String customerName;
	int currentBalance;
	
	void setCustomerData(String name, int initialBalance){
		customerName = name;
		currentBalance = initialBalance;
	}
	
	void debitAmount(int debtamount){
		if(debtamount > currentBalance){
			System.out.println("Please enter the correct Debit amount");
		}else{
			currentBalance = currentBalance - debtamount;
			debitAmount++;
			debitAmountCount++;
	}
	}
	
	void creditAmount(int credamount){
			currentBalance = currentBalance + credamount;
			creditAmount++;
			creditAmountCount++;
	}
	
	void printBalance(){
	//	System.out.println("Current Balance for the " + customerName + " is : " + currentBalance + "\n");
		printBalance++;
		printBalanceCount++;
	}
	
	void individualTransactionSummary(){
		System.out.println(customerName + " transaction summary :" + "Credit - " + creditAmount + "times, " + "Debit - " + debitAmount + "times, " + "printBalance - " + printBalance + "time");
	}
	
	void allTransactionSummary(){
		System.out.println("\nAll transaction summary : " + "Credit - " + creditAmountCount + "times," + "Debit - " + debitAmountCount + "times, " + "printBalance - " + printBalanceCount + "time");
	}
	
	public static void main(String[] args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.setCustomerData("User1",10000);
		bankdetails.creditAmount(4000);
		bankdetails.debitAmount(5000);
		bankdetails.creditAmount(6000);
		bankdetails.printBalance();
		bankdetails.individualTransactionSummary();
		BankDetails bankdetails1 = new BankDetails();
		bankdetails1.setCustomerData("User2",15000);
		bankdetails1.creditAmount(2000);
		bankdetails1.debitAmount(4000);
		bankdetails1.creditAmount(5000);
		bankdetails1.debitAmount(6000);
		bankdetails1.creditAmount(1000);
		bankdetails1.creditAmount(2000);
		bankdetails1.creditAmount(3000);
		bankdetails1.individualTransactionSummary();
		bankdetails1.allTransactionSummary();
	}
}

