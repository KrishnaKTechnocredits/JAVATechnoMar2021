package prachi.Assignment_15;
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
SBI*/

public class AccountSwitch {

	static int iciciBal = 10000;
	static int hdfcBal = 15000;
	static int bobBal = 20000;
	static int sbiBal = 25000;
	
	static int totalDebitCount;
	static int totalCreditCount;

	int iciciCredCnt=0, hdfcCredCnt=0, bobCredCnt=0, sbiCredCnt=0;
	int iciciDebCnt=0, hdfcDebCnt=0, bobDebCnt=0, sbiDebCnt=0;

	void operation(String bank, String op, int amt) {
		switch (op) {
		case "debit":
			switch (bank) {
			case "icici":
				if (iciciBal>=amt) {
					iciciBal=iciciBal-amt;
					iciciDebCnt++;
				}else
					System.out.println("Insufficient banlance in icici account");
				break;

			case "hdfc":
				if (hdfcBal>=amt) {
					hdfcBal=hdfcBal-amt;
					hdfcDebCnt++;
				}else
					System.out.println("Insufficient banlance in hdfc account");
				break;

			case "bob":
				if (bobBal>=amt) {
					bobBal=bobBal-amt;
					bobDebCnt++;
				}else
					System.out.println("Insufficient banlance in hdfc account");
				break;

			case "sbi":
				if (sbiBal>=amt) {
					sbiBal=sbiBal-amt;
					sbiDebCnt++;
				}else
					System.out.println("Insufficient banlance in hdfc account");
				break;
			default: 
				System.out.println("Debit operation not allowed");
			}
		
			break;

		case "credit":
			switch (bank) {
			case "icici":
				iciciBal=iciciBal+amt;
				iciciCredCnt++;
				break;

			case "hdfc":
				hdfcBal=hdfcBal+amt;
				hdfcCredCnt++;
				break;

			case "bob":
				bobBal=bobBal+amt;
				bobCredCnt++;
				break;

			case "sbi":
				sbiBal=sbiBal+amt;
				sbiCredCnt++;
				break;

			default: 
				System.out.println("credit operation not allowed");

			}
		}
	}
					
	void showTotalBal() {
		double showTotBal=iciciBal+hdfcBal+bobBal+sbiBal;
		System.out.println("Overall Total Balance is: "+showTotBal);
	}

	void showTotalCredDebOp() {
		totalCreditCount=iciciCredCnt+hdfcCredCnt+bobCredCnt+sbiCredCnt;
		System.out.println("Total Credit operation Count is: "+totalCreditCount);
		totalDebitCount=iciciDebCnt+hdfcDebCnt+bobDebCnt+sbiDebCnt;
		System.out.println("Total Debit operation Count is: "+totalDebitCount);

	}

	void showIndiBankCredOp() {
		System.out.println("ICICI bank Credit Operation - "+iciciCredCnt);
		System.out.println("HDFC bank Credit Operation - "+hdfcCredCnt);
		System.out.println("BOB bank Credit Operation - "+bobCredCnt);
		System.out.println("SBI bank Credit Operation - "+sbiCredCnt);

	}

	void showIndiBankDebOp() {
		System.out.println("ICICI bank Debit Operation - "+iciciDebCnt);
		System.out.println("HDFC bank Debit Operation - "+hdfcDebCnt);
		System.out.println("BOB bank Debit Operation - "+bobDebCnt);
		System.out.println("SBI bank Debit Operation - "+sbiDebCnt);
	}

	public static void main(String[] args) {
		AccountSwitch acSwitch=new AccountSwitch();
		acSwitch.operation("icici", "debit", 500);
		System.out.println("Balance in icici bank account is: "+iciciBal);
		acSwitch.operation("hdfc", "debit", 500);
		System.out.println("Balance in hdfc bank account is: "+hdfcBal);
		acSwitch.operation("bob", "debit", 500);
		System.out.println("Balance in bob bank account is: "+bobBal);
		acSwitch.operation("sbi", "debit", 500);
		System.out.println("Balance in sbi bank account is: "+sbiBal);
		System.out.println("=============================================");

		acSwitch.operation("icici", "credit", 1000);
		acSwitch.operation("icici", "credit", 700);
		System.out.println("Balance in icici bank account is: "+iciciBal);
		acSwitch.operation("hdfc", "credit", 1000);
		acSwitch.operation("hdfc", "credit", 500);
		System.out.println("Balance in hdfc bank account is: "+hdfcBal);
		acSwitch.operation("bob", "credit", 1000);
		System.out.println("Balance in bob bank account is: "+bobBal);
		acSwitch.operation("sbi", "credit", 1000);
		acSwitch.operation("sbi", "credit", 400);
		acSwitch.operation("sbi", "credit", 300);
		acSwitch.operation("sbi", "credit", 200);
		System.out.println("Balance in sbi bank account is: "+sbiBal);
		System.out.println("=============================================");

		acSwitch.showIndiBankDebOp();
		System.out.println("=============================================");

		acSwitch.showIndiBankCredOp();
		System.out.println("=============================================");
		
		acSwitch.showTotalCredDebOp();
		System.out.println("=============================================");

		acSwitch.showTotalBal();
	}
}