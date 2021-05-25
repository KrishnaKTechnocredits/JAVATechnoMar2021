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
HDFC bank Debit Operation - 2
SBI
*/
package ami.Assignment_15;

public class AccountBank {
	static int iBalance = 5000;
	static int hBalance = 4000;
	static int bBalance = 2000;
	static int sBalance = 6000;
	int iDebit = 0, iCredit = 0;
	int hDebit = 0, hCredit = 0;
	int sDebit = 0, sCredit = 0;
	int bDebit = 0, bCredit = 0;
	static int totalDebitcount =0;
	static int totalCreditcount= 0;


	void opertaion(String bank, String op, int amt) {
		switch (op) {
		case "Debit":
			switch (bank) {
			case "icici":
				if (iBalance >= amt) {
					iBalance = iBalance - amt;
				} else {
					System.out.println("Insufficient Balance ");
				}
				iDebit++;
				break;
				
			case "hdfc":
				if (hBalance >= amt) {
					hBalance = hBalance - amt;
				} else {
					System.out.println("Insufficient Balance ");
				}
				hDebit++;
				break;
				
			case "bob":
				if (bBalance >= amt) {
					bBalance = bBalance - amt;
				} else {
					System.out.println("Insufficient Balance ");
				}
				bDebit++;
				break;
				
			case "sbi":
				if (sBalance >= amt) {
					sBalance = sBalance - amt;
				} else {
					System.out.println("Insufficient Balance ");
				}
				sDebit++;
				break;
				
			default: 
				System.out.println("Debit operation not allowed");
			}
			break;
				
		case "credit":
			switch (bank) {
			case "icici":
				iBalance = iBalance + amt;
				iCredit++;
				break;
					
			case "hdfc":
				hBalance = hBalance + amt;
				hCredit++;
				break;
					
			case "bob":
				bBalance = bBalance + amt;
				bCredit++;
				break;
					
			case "sbi":
				sBalance = sBalance + amt;
				sCredit++;
				break;
				
			default:
				System.out.println("try again");
			}
		}
	}

	void showTotalBln() {
		double totalBln = iBalance + hBalance + bBalance + sBalance;
		System.out.println("Total Balance= "+ totalBln);
	}
	
	void showTotalCedDebcount() {
		totalCreditcount = iCredit + hCredit + bCredit +sCredit;
		System.out.println("Total Credit Count = "+ totalCreditcount);
		totalDebitcount= iDebit + hDebit + bDebit + sDebit;
		System.out.println("Total Debit Count = " + totalDebitcount);
	}
	
	void individualCreditCount() {
		System.out.println("----------------Credit Count--------------");
		System.out.println("icici Credit operation : " + iCredit);
		System.out.println("hdfc Credit operation : " + hCredit);
		System.out.println("bob Credit operation : " + bCredit);
		System.out.println("sbi Credit operation : " + sCredit);
	}

	void individualDebitcount() {
		System.out.println("----------------Debit Count--------------");
		System.out.println("icici Debit operation : " + iDebit);
		System.out.println("hdfc Debit operation : " + hDebit);
		System.out.println("bob Debit operation : " + bDebit);
		System.out.println("sbi Debit operation : " + sDebit);
	}
	
	static{
		System.out.println("-------Initial Balance------------ ");
		
	}

	public static void main(String[] a) {
		AccountBank accounts1 = new AccountBank();
		accounts1.opertaion("icici", "credit", 600);	
		accounts1.opertaion("bob", "credit", 400);	
		accounts1.opertaion("sbi", "credit", 300);	
		accounts1.opertaion("hdfc", "credit", 200);
		accounts1.opertaion("icici", "Debit", 600);
		accounts1.opertaion("icici", "credit", 500);
		accounts1.opertaion("sbi", "Debit", 300);
		accounts1.opertaion("bob", "Debit", 200);
		accounts1.opertaion("hdfc", "Debit", 600);
		accounts1.opertaion("hdfc", "credit", 200);
		
		System.out.println("Balance in icici bank : " + iBalance);
		System.out.println("Balance in bob bank : " + bBalance);
		System.out.println("Balance in sbi bank : " + sBalance);
		System.out.println("Balance in hdfc bank : " + hBalance);
		
		accounts1.individualCreditCount();
		accounts1.individualDebitcount();
		System.out.println("----------Total Debit/Credit Count----------");
		accounts1.showTotalCedDebcount();
		System.out.println("----------Total Balance ----------");
		accounts1.showTotalBln();
	}

}
