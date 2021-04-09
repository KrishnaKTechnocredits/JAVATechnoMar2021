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
                         HDFC bank Debit Operation - 2
		                 SBI
*/

package sangeeta;

public class BankingSystem {
	
	int iBalance = 10000;
	int sBalance = 15000;
	int hBalance = 5000;
	int bBalance = 8000;
	int iDebitCount = 0, sDebitCount = 0, hDebitCount = 0, bDebitCount = 0;
	int iCreditCount = 0, sCreditCount = 0, hCreditCount = 0, bCreditCount = 0;
	static int totalCreditCount, totalDebitCount;
	
	 void debitOperation(String bank, int amt) {
				switch(bank) {
					case "icici":
						if(iBalance>=amt) {
							iBalance = iBalance-amt;
							iDebitCount++;
							totalDebitCount++;
						}
						else
							System.out.println("ICICI account has no sufficient balance");
						break;
					case "sbi":
						if(sBalance>=amt) {
							sBalance = sBalance-amt;
							sDebitCount++;
							totalDebitCount++;
						}
						else
							System.out.println("SBI account has no sufficient balance");
						break;
					case "hdfc":
						if(hBalance>=amt) {
							hBalance = hBalance-amt;
							hDebitCount++;
							totalDebitCount++;
						}
						else
							System.out.println("HDFC account has no sufficient balance");
						break;
					case "bob":
						if(bBalance>=amt) {
							bBalance = bBalance-amt;
							bDebitCount++;
							totalDebitCount++;
						}
						else
							System.out.println("BOB account has no sufficient balance");
				}
			}
		
	void creditOperation(int Creditamt, String bank)	{		
				switch(bank) {
					case "icici":
						if(Creditamt>0) {
							iBalance = iBalance+Creditamt;
							iCreditCount++;
							totalCreditCount++;
							//System.out.println("ICICI bank balance is: "+iBalance);
							}
							break;
							
					case "sbi":
						if(Creditamt>0) {
							iBalance = iBalance+Creditamt;
							sCreditCount++;
							totalCreditCount++;
							//System.out.println("SBI bank balance is: "+sBalance);
							}
							break;
					case "hdfc":
						if(Creditamt>0) {
							iBalance = iBalance+Creditamt;
							hCreditCount++;
							totalCreditCount++;
							//System.out.println("HDFC bank balance is: "+hBalance);
							}
							break;
					case "bob":
						if(Creditamt>0) {
							iBalance = iBalance+Creditamt;
							bCreditCount++;
							totalCreditCount++;
							//System.out.println("BOB bank balance is: "+bBalance);
							}
							break;
			}
		}
	
	void totalBalance() {
		int TotalBalance = iBalance+sBalance+hBalance+bBalance;
		System.out.println("Total Balance is "+TotalBalance);
		}
	
	void totalCreditDebit() {
		System.out.println("Total Credit count is "+totalCreditCount);
		System.out.println("Total Debit count is "+totalDebitCount);
	}
	
	void individualCredit() {
		System.out.println("ICICI Credit count is "+iCreditCount);
		System.out.println("SBI Credit count is "+sCreditCount);
		System.out.println("HDFC Credit count is "+hCreditCount);
		System.out.println("BOB Credit count is "+bCreditCount);
		
	}	
	
	void individualDebit() {
		System.out.println("ICICI Debit count is "+iDebitCount);
		System.out.println("SBI Debit count is "+sDebitCount);
		System.out.println("HDFC Debit count is "+hDebitCount);
		System.out.println("BOB Debit count is "+bDebitCount);
	}
	
	public static void main(String[] a) {
		BankingSystem bankingSystem = new BankingSystem();
		bankingSystem.creditOperation(1000,"icici");
		bankingSystem.creditOperation(1200,"icici");
		bankingSystem.creditOperation(500,"hdfc");
		bankingSystem.creditOperation(2000,"hdfc");
		bankingSystem.creditOperation(10000,"sbi");
		bankingSystem.creditOperation(1000,"bob");
		bankingSystem.creditOperation(5000,"bob");
		bankingSystem.creditOperation(500,"bob");
		bankingSystem.creditOperation(1000,"bob");
		bankingSystem.debitOperation("hdfc", 1500);
		bankingSystem.debitOperation("hdfc", 11000);
		bankingSystem.debitOperation("icici", 200);
		bankingSystem.debitOperation("icici", 2000);
		bankingSystem.debitOperation("sbi", 8000);
		bankingSystem.debitOperation("sbi", 3000);
		bankingSystem.debitOperation("bob", 4000);
		bankingSystem.debitOperation("bob", 2000);
		bankingSystem.totalBalance();
		bankingSystem.totalCreditDebit();
		bankingSystem.individualCredit();
		bankingSystem.individualDebit();
		
	}
	
}



