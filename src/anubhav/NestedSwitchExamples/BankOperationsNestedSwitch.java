package anubhav.NestedSwitchExamples;

/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]
          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]
          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times
                          Total debit operation - 5 times
         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2
                         HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                         BOB bank Credit Operation - 4
         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2 */

public class BankOperationsNestedSwitch {
	
	int iciciDebitCount, iciciCreditCount;  
	int hdfcDebitCount,  hdfcCreditCount;   
	int bobDebitCount,   bobCreditCount;    
	int sbiDebitCount,   sbiCreditCount; 	 
	double hdfcBal=100000; 
	double iciciBal=100000; 
	double bobBal=100000; 
	double sbiBal=100000;
	double totalAmount;
	//double iciciLBalance;
	//double hdfcLBalance;
	//double bobLBalance;
	//double sbiLBalance;	
	
	void operationDebitCredit(String operation, String bankName, double amount) {
		operation= operation.toUpperCase();
		bankName=bankName.toUpperCase();
		switch (operation) {
			case "DEBIT":
				switch (bankName) {
					case "ICICI":
						if (amount>iciciBal) {
							System.out.println("Insufficent funds in " + bankName + " bank account");
						}else {
							iciciBal=(iciciBal-amount);
							iciciDebitCount++;
						}
						break;
					case "HDFC":
						if (amount>hdfcBal) {
							System.out.println("Insufficent funds in " + bankName + " bank account");
						}else {
							hdfcBal=(hdfcBal-amount);
							hdfcDebitCount++;
						}
						break;
					case "BOB":
						if (amount>bobBal) {
							System.out.println("Insufficent funds in " + bankName + " bank account");
						}else {
							bobBal=(bobBal-amount);
							bobDebitCount++;
						}
						break;
					case "SBI":
						if (amount>sbiBal) {
							System.out.println("Insufficent funds in " + bankName + " bank account");
						}else {
							sbiBal=(sbiBal-amount);
							sbiDebitCount++;
						}
						break;
					default:
						System.out.println("You do not have an account in " + bankName + " bank hence Debit operation cannot be performed.");
				}
				break;
			case "CREDIT":
				switch (bankName) {
					case "ICICI":
						iciciBal= (iciciBal+amount);
						iciciCreditCount++;
						break;
					case "HDFC":
						hdfcBal= (hdfcBal+amount);
						hdfcCreditCount++;
						break;
					case "BOB":
						bobBal= (bobBal+amount);
						bobCreditCount++;
						break;
					case "SBI":
						sbiBal= (sbiBal+amount);
						sbiCreditCount++;
						break;
					default :
						System.out.println("You do not have an account in " + bankName + " bank hence Credit operation cannot be performed.");
				}
				break;	
			default:
				System.out.println("Unidentified Operation !! Please perform a valid operation.");
			}
	}
	
	void totalbalance() {
		System.out.println("----TOTAL CUMULATIIVE BALANCE----");
		totalAmount= (iciciBal + hdfcBal + bobBal + sbiBal);
		System.out.println("Cumulative balance in all 4 accounts is : Rs. " + totalAmount);
	}
	
	void totalCreditDebit () {
		System.out.println("----TOTAL OPERATIONS CREDIT & DEBIT----");
		System.out.println("Total number of Credit operations in all bank accounts : " + (iciciCreditCount + hdfcCreditCount + bobCreditCount + sbiCreditCount));
		System.out.println("Total number of Debit operations in all bank accounts  : " + (iciciDebitCount + hdfcDebitCount + bobDebitCount + sbiDebitCount));
	}
	
	void indiDebitCount() {
		System.out.println("----INDIVIDUAL BANK DEBIT OPERATIONS----");
		System.out.println("ICICI bank Debit operation count : " + iciciDebitCount);
		System.out.println("HDFC bank Debit operation count  : " + hdfcDebitCount);
		System.out.println("BOB bank Debit operation count   : " + bobDebitCount);
		System.out.println("SBI bank Debit operation count   : " + sbiDebitCount);
	}

	void indiCreditCount() {
		System.out.println("----INDIVIDUAL BANK CREDIT OPERATIONS----");
		System.out.println("ICICI bank Credit operation count :  " + iciciCreditCount);
		System.out.println("HDFC bank Credit operation count  :  " + hdfcCreditCount);
		System.out.println("BOB bank Credit operation count   :  " + bobCreditCount);
		System.out.println("SBI bank Credit operation count   :  " + sbiCreditCount); 
	}
	
	public static void main (String[] args) {
		BankOperationsNestedSwitch bankOperationsNestedSwitch= new BankOperationsNestedSwitch();
		bankOperationsNestedSwitch.operationDebitCredit("Debit", "icici", 10000);
		bankOperationsNestedSwitch.operationDebitCredit("DEBIT", "HDFC",  10000);
		//bankOperationsNestedSwitch.operationDebitCredit("DEBIT", "SBI",   10000);
		//bankOperationsNestedSwitch.operationDebitCredit("Debit", "Bob",   10000);
		bankOperationsNestedSwitch.operationDebitCredit("Credit", "icici",10000);
		//bankOperationsNestedSwitch.operationDebitCredit("CREDIT", "HDFC", 10000);
		//bankOperationsNestedSwitch.operationDebitCredit("Credit", "Bob",  10000);
		//bankOperationsNestedSwitch.operationDebitCredit("CRediT", "SBI",  10000); 
		//bankOperationsNestedSwitch.operationDebitCredit("Debit", "icici", 10000);
		bankOperationsNestedSwitch.operationDebitCredit("DEBIT", "HDFC",  10000);
		bankOperationsNestedSwitch.operationDebitCredit("DEBIT", "SBI",   10000);
		//bankOperationsNestedSwitch.operationDebitCredit("Debit", "Bob",   10000);
		bankOperationsNestedSwitch.operationDebitCredit("Credit", "icici",10000);
		//bankOperationsNestedSwitch.operationDebitCredit("CREDIT", "HDFC", 10000);
		bankOperationsNestedSwitch.operationDebitCredit("Credit", "Bob",  10000);
		//bankOperationsNestedSwitch.operationDebitCredit("CRediT", "SBI",  10000); 
		bankOperationsNestedSwitch.operationDebitCredit("DEBIT", "hghg",  10000);   //Debit but incorrect bank
		bankOperationsNestedSwitch.operationDebitCredit("CredIT", "klbg", 10000);  	//Credit but incorrect bank
		bankOperationsNestedSwitch.operationDebitCredit("interest","Hdfc",10000);	//Incorrect Operation
		bankOperationsNestedSwitch.totalbalance();
		bankOperationsNestedSwitch.totalCreditDebit();
		bankOperationsNestedSwitch.indiCreditCount();
		bankOperationsNestedSwitch.indiDebitCount();	
	}
}
