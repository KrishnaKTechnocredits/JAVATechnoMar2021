package meenu;

/*Create a Banking System which has the following functionality.

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

public class BankingSystem {
	String name;
	int totalAmount;
	int debitCount; 
	int creditCount;
	int printBalanceCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintBalanceCount;
	
	void customerDetails(String customerName,int intialAmount) {
		name = customerName;
		totalAmount = intialAmount;
	}

	void debitAmount(int amount){
		if(amount <= totalAmount)
		  totalAmount = totalAmount - amount;
		  debitCount++;
		  totalDebitCount++;
	}
	
	void creditAmount(int amount){
		totalAmount = totalAmount + amount;
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance(){
	        System.out.println("Current Balance in "+name+"'s account : "+totalAmount);
	        printBalanceCount++;
	        totalPrintBalanceCount++;
	}
	
	void individualTransactionSummary(){
		System.out.println(name+" transaction summery : Credit - "+creditCount+" times, Debit - "+debitCount+" times, printBalance - "+printBalanceCount +" times");
	
	}
	
	void allTransactionSummary(){
		System.out.println("All transaction summary : Credit - "+totalCreditCount+" times, Debit - "+totalDebitCount+" times, Printbalance - "+totalPrintBalanceCount+" times");
	
	}
	
	public static void main(String[] args){
	BankingSystem bankingSystem1 = new BankingSystem();
	bankingSystem1.customerDetails("Ria",5000);
	bankingSystem1.creditAmount(500);
	bankingSystem1.debitAmount(1500);
	bankingSystem1.creditAmount(1000);
	bankingSystem1.printBalance();
	bankingSystem1.individualTransactionSummary();
	BankingSystem bankingSystem2 = new BankingSystem();  //creating another object here
	bankingSystem2.customerDetails("Tia",10000);
	bankingSystem2.creditAmount(100);
	bankingSystem2.debitAmount(1500);
	bankingSystem2.creditAmount(1000);
	bankingSystem2.creditAmount(400);
	bankingSystem2.creditAmount(4000);
	bankingSystem2.creditAmount(500);
	bankingSystem2.debitAmount(3000);
	bankingSystem2.individualTransactionSummary();
	//bankingSystem2.printBalance();
	bankingSystem1.allTransactionSummary();
	
	
		

	}

}
