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
		                 SBI */

package radha.NestedSwitchCase.Assignment15;

public class BankOperations {
	double iciciBal=5000, hdfcBal=4500, bobBal=9000, sbiBal=6000;
	int iciciCredit=0, hdfcCredit=0, bobCredit=0, sbiCredit=0, iciciDebit=0, hdfcDebit=0, bobDebit=0, sbiDebit=0;
	static int totalDebitCnt=0, totalCreditCnt=0;
	
	void operation(String bankName, String operation, double amount) {
		bankName = bankName.toLowerCase();
		operation = operation.toLowerCase();
		switch(operation) {
		case "debit":
			switch(bankName) {
			case "icici":
				if(amount <= iciciBal) {
					iciciBal = iciciBal - amount;
					iciciDebit++;
					totalDebitCnt++;
				}
				else
					System.out.println("Insufficient Balance");
			break;
			
			case "hdfc":
				if(amount <= hdfcBal) {
					hdfcBal = hdfcBal - amount;
					hdfcDebit++;
					totalDebitCnt++;
				}
				else
					System.out.println("Insufficient Balance");
			break;
			
			case "bob":
				if(amount <= bobBal) {
					bobBal = bobBal - amount;
					bobDebit++;
					totalDebitCnt++;
				}
				else
					System.out.println("Insufficient Balance");
			break;
			
			case "sbi":
				if(amount <= sbiBal) {
					sbiBal = sbiBal - amount;
					sbiDebit++;
					totalDebitCnt++;
				}
				else
					System.out.println("Insufficient Balance");
			break;	
			}
		break;
		
		case "credit":
			switch(bankName) {
			case "icici":
					iciciBal = iciciBal + amount;
					iciciCredit++;
					totalCreditCnt++;	
			break;
			
			case "hdfc":
						hdfcBal = hdfcBal + amount;
						hdfcCredit++;
						totalCreditCnt++;
			break;
			
			case "bob":
					bobBal = bobBal + amount;
					bobCredit++;
					totalCreditCnt++;
			break;
			
			case "sbi":
					sbiBal = sbiBal + amount;
					sbiCredit++;
					totalCreditCnt++;
			break;
		}
		break;
			
		default:
				System.out.println("Invalid Operation!Please Enter credit or debit operation.");
		break;
		}	
	}
	
	void totalBalance() {
		double totalBalance = iciciBal + hdfcBal + bobBal + sbiBal;
		System.out.println("Total balance is: "+totalBalance);
	}
	
	void totalOperations() {
			System.out.println("Total credit operation is "+totalCreditCnt);
			System.out.println("Total debit operation is "+totalDebitCnt);	
	}
	
	void individualCreditOp() {
		System.out.println("ICICI bank Credit operations count is: "+iciciCredit);
		System.out.println("HDFC bank Credit operations count is: "+hdfcCredit);
		System.out.println("BOB Credit operations count is: "+bobCredit);
		System.out.println("SBI Credit operations count is: "+sbiCredit);
	}
	
	void individualDebitOp() {
		System.out.println("ICICI bank Debit operations count is: "+iciciDebit);
		System.out.println("HDFC bank Debit operations count is: "+hdfcDebit);
		System.out.println("BOB Debit operations count is: "+bobDebit);
		System.out.println("SBI Debit operations count is: "+sbiDebit);
	}
	
	public static void main(String[] args) {
		BankOperations bankOp = new BankOperations();
		System.out.println("Balance available is: \nICICI bank: "+bankOp.iciciBal+" , HDFC Bank: "+bankOp.hdfcBal+" , BOB: "+bankOp.bobBal+" , SBI: "+bankOp.sbiBal);
		bankOp.totalBalance();
		bankOp.operation("ICICI", "Debit", 2000);
		bankOp.operation("BOB", "Credit", 1500);
		bankOp.operation("HDFC", "Debit", 3000);
		bankOp.operation("ICICI", "Credit", 1000);
		bankOp.operation("ICICI", "Credit", 500);
		bankOp.operation("SBI", "Credit", 3000);
		bankOp.operation("SBI", "Debit", 2500);
		bankOp.operation("SBI", "Debit", 100);
		bankOp.operation("HDFC", "Credit", 1000);
		bankOp.operation("BOB", "Debit", 1000);
		bankOp.operation("BOB", "Debit", 1000);
		System.out.println("\n*****Total Credit & Debit operations in all Banks*****\n");
		bankOp.totalOperations();
		System.out.println("\n*****Debit Operations in all Banks*****\n");
		bankOp.individualDebitOp();
		System.out.println("\n*****Credit Operations in all Banks*****\n");
		bankOp.individualCreditOp();
		System.out.println("\nBalance available is: \nICICI bank: "+bankOp.iciciBal+" , HDFC Bank: "+bankOp.hdfcBal+" , BOB: "+bankOp.bobBal+" , SBI: "+bankOp.sbiBal);
		bankOp.totalBalance();
	}
}