/*Create two object to perform below scenario.
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
package rupali;

public class BankingSystem {
	String name;
	int debitcount;
	int creditcount;
	int balance;
	int balancecount;
	static int totaldebitcount, totalcreditcount,totalbalancecount;
	
	void setData(String custname,int amount) {
		name=custname;
		balance=amount;
	}
	void debitamount(int debitamount) {
		if(balance>=debitamount) {
		balance=balance-debitamount;
		debitcount++;
		totaldebitcount++;
		}
		else
			System.out.println("Unable to debit due to insuffiecient balance");
	}
	
	void creditamount(int creditamount) {
		balance=balance+creditamount;
		creditcount++;
		totalcreditcount++;
	}
	
	void printbalance() {
		System.out.println("Available balance in "+name+" account is: "+balance);
		balancecount++;
		totalbalancecount++;
		
	}
	
	void customertransactionsummary() {
		System.out.println(name+" transaction summary -- credit "+creditcount+" times , Debit "+debitcount+" times , Printbalance "+balancecount+" times.");
	}
	
	void totaltransactionsummary() {
		System.out.println("All transaction summary-- Credit: "+totalcreditcount+" times Debit: "+totaldebitcount+" times Total printbalance "+totalbalancecount);
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem=new BankingSystem();
		bankingSystem.setData("Rupali", 10000);
		bankingSystem.debitamount(2000);
		bankingSystem.creditamount(1000);
		bankingSystem.creditamount(500);
		bankingSystem.printbalance();
		bankingSystem.customertransactionsummary();
		BankingSystem bankingSystem_1=new BankingSystem();
		bankingSystem_1.setData("Surabhi", 15000);
		bankingSystem_1.debitamount(5000);
		bankingSystem_1.creditamount(1000);
		bankingSystem_1.creditamount(2000);
		bankingSystem_1.creditamount(500);
		bankingSystem_1.creditamount(500);
		bankingSystem_1.debitamount(3000);
		bankingSystem_1.creditamount(5000);
		bankingSystem_1.customertransactionsummary();
		bankingSystem.totaltransactionsummary();
	}
}
