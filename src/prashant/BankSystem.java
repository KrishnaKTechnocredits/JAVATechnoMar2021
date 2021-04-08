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

package prashant;

public class BankSystem {

	int CreditAmt;
	int DebitAmt;
	String Cname;
	int Totalbalance = 10000;
	int bal;
	int CreditIteration;
	int DebitIteration;

	static int totaldebitcount = 0;
	static int totalcreditcount = 0;
	static int totalbalcount = 0;

	// Method for Credit amount calculation

	void Credit(String CustName, int Cramt) {
		Cname = CustName;
		CreditAmt = Cramt;
		System.out.println("Credit Amount  :" + Cramt);
		Totalbalance = Totalbalance + CreditAmt;
		CreditIteration++;
		totalcreditcount++;
	}

	// Method for Debit amount calculation

	void Debit(String CustName, int Dramt) {
		Cname = CustName;
		DebitAmt = Dramt;
		System.out.println("Debit Amount  :" + Dramt);
		Totalbalance = Totalbalance - DebitAmt;
		DebitIteration++;
		totaldebitcount++;
	}

	// Method for Display initial balance amount

	void iniBal(String CustName) {
		System.out.println("Initial Balance is :" + Totalbalance + "  for " + CustName);
	}

	// Method for Display balance amount
	void PrintBal() {
		System.out.println("Current Balance is " + Totalbalance + " " + "for" + " " + Cname);
		bal++;
		totalbalcount++;
	}

	// Method for Display Customer wise summary
	void IndividualTransSummary() {
		System.out.println("Customer Transaction summary for " + Cname + " ," + "Total No. of Debit: " + DebitIteration
				+ ", " + "Total No. of Credit: " + " " + CreditIteration + ", " + "No. of times Balance Check :" + " "
				+ bal);
	}

	// Method for Display All summary
	void AllTransSummary() {
		System.out.println(
				"All Transaction summary: Total No. of Debit: " + totaldebitcount + "," + "Total No. of Credit:" + " "
						+ totalcreditcount + ", " + "No. of Times balance check:" + " " + totalbalcount);
	}

	public static void main(String[] args) {

		BankSystem Bank1 = new BankSystem();
		Bank1.iniBal("Customer_1");
		Bank1.Credit("Customer_1", 7000);
		Bank1.Credit("Customer_1", 2000);
		Bank1.Debit("Customer_1", 2000);
		Bank1.PrintBal();
		Bank1.IndividualTransSummary();

		BankSystem Bank2 = new BankSystem();
		Bank2.iniBal("Customer_2");
		Bank2.Credit("Customer_2", 2000);
		Bank2.Credit("Customer_2", 6000);
		Bank2.Credit("Customer_2", 2000);
		Bank2.Credit("Customer_2", 6000);
		Bank2.Credit("Customer_2", 2000);
		Bank2.Debit("Customer_2", 2000);
		Bank2.Debit("Customer_2", 2000);
		Bank2.PrintBal();
		Bank2.IndividualTransSummary();
		Bank2.AllTransSummary();
	}

}
