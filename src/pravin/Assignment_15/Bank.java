/*Assignment - 15 : 9th April'2021

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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

package pravin.Assignment_15;
	
	public class Bank {
		int iBalance=1000;
		int sBalance=3000;
		int hBalance=4000;
		int bBalance=5000;
		int TotalDebitCount;
		int TotalCreditCount;
		int iDebitCount = 0,iCreditCount=0,sDebitCount = 0,sCreditCount=0,hDebitCount = 0,hCreditCount=0,bDebitCount = 0,bCreditCount=0;
	
		void operation(String op,String bank,int amt) {
			switch (op){
			case "debit":
				switch (bank) {
				case "icici":
					if(iBalance>=amt) {
						iBalance=iBalance-amt;
						System.out.println("Total debit balance in ICICI Account is " +iBalance);
						iDebitCount++;
					}else {
						System.out.println("Not sufficiant balance in ICICI Account");
	
					}
					break;
				case "hdfc":
					if(hBalance>=amt) {
						hBalance=hBalance-amt;
						System.out.println("Total debit balance in hdfc Account is " +hBalance);
						hDebitCount++;
					}else {
						System.out.println("Not sufficiant balance in HDFC Account");
	
					}
					break;
				case "sbi":
					if(sBalance>=amt) {
						sBalance=sBalance-amt;
						System.out.println("Total debit balance in sbi Account is " +sBalance);
						sDebitCount++;
					}else {
						System.out.println("Not sufficiant balance in SBI Account");
					}
					break;
				case "bob":
					if(bBalance>=amt) {
						bBalance=bBalance-amt;
						System.out.println("Total debit balance in bob Account is " +bBalance);
						bDebitCount++;
					}else {
						System.out.println("Not sufficiant balance in BOB Account");
					}
					break;
				}
				break;
			case "credit":
				switch (bank) {
				case "icici":{
					iBalance=iBalance+amt;
					System.out.println("Total Credit balance in ICICI Account is " +iBalance);
					iCreditCount++;
					break;
				}
				case "hdfc":{
					hBalance=hBalance+amt;
					System.out.println("Total Credit balance in HDFC Account is  " +hBalance);
					hCreditCount++;
					break;
				}case "sbi":{
					sBalance=sBalance+amt;
					System.out.println("Total Credit balance in SBI Account is  " +sBalance);
					sCreditCount++;
					break;
				}case "bob":{
					bBalance=bBalance+amt;
					System.out.println("Total Credit balance in BOB Account is  " +bBalance);
					bCreditCount++;
					break;
				}
				default:
					System.out.println("Operation not allowed");
				}
			}
		}
		void individualDebitCount() {
			System.out.println("ICICI bank Debit Operation "+iDebitCount);
			System.out.println("HDFC bank Debit Operation "+hDebitCount);
			System.out.println("SBI bank Debit Operation "+sDebitCount);
			System.out.println("BOB bank Debit Operation "+bDebitCount);
		}
		void individualCreditCount() {
			System.out.println("ICICI bank Credit Operation "+iCreditCount);
			System.out.println("HDFC bank Credit Operation "+hCreditCount);
			System.out.println("SBI bank Credit Operation "+sCreditCount);
			System.out.println("BOB bank Credit Operation "+bCreditCount);
		}
		void TotalDebitCount() {
			TotalDebitCount = iDebitCount+hDebitCount+sDebitCount+bDebitCount;
			System.out.println("Total Debit Count is  " + TotalDebitCount);
		}
		void TotalCreditCount(){
			TotalCreditCount = iCreditCount + hCreditCount + sCreditCount + bCreditCount ;
			System.out.println("Total Credit Count is  " + TotalCreditCount);
		}
		public static void main(String[] args) {
			Bank bank = new Bank();
			bank.operation("debit","icici",2000);
			bank.operation("debit","hdfc",500);
			bank.operation("debit","sbi",300);
			bank.operation("debit","bob",400);
			bank.operation("credit","bob",400);
			bank.operation("credit","icici",400);
			bank.operation("credit","hdfc",400);
			bank.operation("credit","sbi",400);
			bank.individualDebitCount();
			bank.individualCreditCount();
			bank.TotalDebitCount();
			bank.TotalCreditCount();
		}	
	}
