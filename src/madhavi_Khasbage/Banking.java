package madhavi_Khasbage;
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
	All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/

public class Banking {
	String userName;
	static int debitAmountCnt;
	static int creditAmountCnt;
	static int printBalanceCnt;
	int userDebitCnt;
	int userCreditCnt;
	int userPrintBalanceCnt;
	double accBalance;
	
	void debitAmount(double dbtAmount){		
		if(accBalance>0 && dbtAmount<=accBalance){
			accBalance=accBalance-dbtAmount;		
			debitAmountCnt++;
			userDebitCnt++;
			System.out.println("Amount debit  : " + dbtAmount);
		}	
		else{
			System.out.println("Warning         : Insufficient funds in your account.");
		}
	}
	
	void creditAmount(double amtCredit){		
		if(amtCredit>0){
			accBalance=accBalance+amtCredit;		
			creditAmountCnt++;
			userCreditCnt++;
			System.out.println("Amount credit : " + amtCredit);
		}
	}
	
	void printBalance(){		
		printBalanceCnt++;
		userPrintBalanceCnt++;
		System.out.println("Current balance : " + accBalance);		
	}
	
	void individualTransactionSummary(){
		System.out.println(userName + " transaction summary : Credit - "+ userCreditCnt +" times, Debit - "+ userDebitCnt +" times, Print balance - "+ userPrintBalanceCnt +" time");		
	}
	
	void allTransactionSummary(){
		System.out.println("All transaction summary : Credit - "+ creditAmountCnt + " times, Debit - "+ debitAmountCnt +" times, Print balance - "+ printBalanceCnt +" time");
	}
	
	public static void main(String[] agrs){
		Banking bank1 =new Banking();
		bank1.accBalance=5000;
		bank1.userName="Customer1";
		System.out.println(bank1.userName +" account balance:" + bank1.accBalance); 		
		bank1.debitAmount(1000);
		bank1.creditAmount(2000);
		bank1.debitAmount(500);
		bank1.debitAmount(700);
		bank1.creditAmount(2000);
		bank1.printBalance();
		bank1.individualTransactionSummary();		
		System.out.println("=====================================================================================");
		
		Banking bank2 =new Banking();
		bank2.accBalance=10000;
		bank2.userName="Customer2";
		System.out.println(bank2.userName + "account balance:" + bank2.accBalance);		
		bank2.debitAmount(3000);
		bank2.debitAmount(3000);
		bank2.creditAmount(1000);
		bank2.creditAmount(600);
		bank2.creditAmount(100);
		bank2.printBalance();
		bank2.individualTransactionSummary();		
		System.out.println("======================================================================================");
		bank2.allTransactionSummary();
	}	
}
