package neha_Patil;

public class BankSystem {
	int CreditAmt;
	int DebitAmt;
	String Cname;
	int Totalbalance = 10000;
 

	int bal;
	int CreditCount;
	int DebitCount;

	static int totaldebitcount = 0;
	static int totalcreditcount = 0;
	static int totalbalcount = 0;

	

	void Credit(String CustName, int Camt) {
		Cname = CustName;
		CreditAmt = Camt;
		System.out.println("Credit Amount  :" + Camt);
		Totalbalance = Totalbalance + CreditAmt;
		CreditCount++;
		totalcreditcount++;
	}


	void Debit(String CustName, int Damt) {
 

		Cname = CustName;
		DebitAmt = Damt;
		System.out.println("Debit Amount  :" + Damt);
		Totalbalance = Totalbalance - DebitAmt;
		DebitCount++;
		totaldebitcount++;
	}

	

	void iniBal(String CustName) {
		System.out.println("Initial Balance is :" + Totalbalance + "  for " + CustName);
	}

	
	void PrintBal() {
		System.out.println("Current Balance is " + Totalbalance + " " + "for" + " " + Cname);
		bal++;
		totalbalcount++;
	}

	
	void IndividualTransSummary() {
		System.out.println("Customer Transaction summary for " + Cname + " ," + "Total No. of Debit: " + DebitCount
				+ ", " + "Total No. of Credit: " + " " + CreditCount + ", " + "No. of times Balance Check :" + " "
				+ bal);
	}

	
	void AllTransSummary() {
		System.out.println(
				"All Transaction summary: Total No. of Debit: " + totaldebitcount + "," + "Total No. of Credit:" + " "
						+ totalcreditcount + ", " + "No. of Times balance check:" + " " + totalbalcount);
	}

	public static void main(String[] args) {

		BankSystem Bank1 = new BankSystem();
		Bank1.iniBal("Customer_1");
		Bank1.Credit("Customer_1", 8000);
		Bank1.Credit("Customer_1", 1000);
		Bank1.Debit("Customer_1", 3000);
		Bank1.PrintBal();
		Bank1.IndividualTransSummary();

		BankSystem Bank2 = new BankSystem();
		Bank2.iniBal("Customer_2");
		Bank2.Credit("Customer_2", 1000);
		Bank2.Credit("Customer_2", 4000);
		Bank2.Credit("Customer_2", 3000);
		Bank2.Credit("Customer_2", 5000);
		Bank2.Credit("Customer_2", 3000);
		Bank2.Debit("Customer_2", 3000);
		Bank2.Debit("Customer_2", 2000);
		Bank2.PrintBal();
		Bank2.IndividualTransSummary();
		Bank2.AllTransSummary();
	}

}


