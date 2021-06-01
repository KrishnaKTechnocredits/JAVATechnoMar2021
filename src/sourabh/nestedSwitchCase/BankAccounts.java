/*
Assignment - 15 : 9th April'2021

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

package sourabh.nestedSwitchCase;

import java.util.Scanner;

public class BankAccounts {
	int iciciBalance=1000;
	int hdfcBalance=2000;
	int bobBalance=1000;
	int sbiBalance=2000;
	int debitCounticici=0, debitCounthdfc=0, debitCountbob=0, debitCountsbi=0;
	int creditCounticici=0, creditCounthdfc=0, creditCountbob=0, creditCountsbi=0;
	void bankOperation(String operation, String bankName, int reqAmt, int depositAmt) {
		switch(operation) {
			case "debit":
				switch (bankName) {
					case "icici":
						if(reqAmt<iciciBalance) {
							iciciBalance= iciciBalance-reqAmt;
							debitCounticici++;
							System.out.println("Debit amount in ICICI: "+reqAmt);
						}
						else 
							System.out.println("Insufficient amount !!");
					break;
					case "hdfc":
						if(reqAmt<hdfcBalance) {
							hdfcBalance= hdfcBalance-reqAmt;
							debitCounthdfc++;
							System.out.println("Debit amount in HDFC: "+reqAmt);
						}
						else 
							System.out.println("Insufficient amount !!");
					break;
					case "bob":
						if(reqAmt<bobBalance) {
							bobBalance= bobBalance-reqAmt;
							debitCountbob++;
							System.out.println("Debit amount in BOB: "+reqAmt);
						}
						else 
							System.out.println("Insufficient amount !!");
					break;
					case "sbi":
						if(reqAmt<sbiBalance) {
							sbiBalance= sbiBalance-reqAmt;
							debitCountsbi++;
							System.out.println("Debit amount in SBI: "+reqAmt);
						}
						else 
							System.out.println("Insufficient amount !!");
					break;
					default:
						System.out.println("Enter correct bank name for Debit !!");					
				}
				break;
			case "credit":
				switch (bankName) {
				case "icici":
					if(depositAmt>0) {
						iciciBalance= iciciBalance+depositAmt;
						creditCounticici++;
						System.out.println("Credit amount in ICICI: "+depositAmt);
						System.out.println("Total amount in ICICI: "+iciciBalance);
					}					
				break;
				case "hdfc":
					if(depositAmt>0) {
						hdfcBalance= hdfcBalance+depositAmt;
						creditCounthdfc++;
						System.out.println("Credit amount in HDFC: "+depositAmt);
						System.out.println("Total amount in HDFC: "+hdfcBalance);
					}
				break;
				case "bob":
					if(depositAmt>0) {
						bobBalance= bobBalance+depositAmt;
						creditCountbob++;
						System.out.println("Credit amount in BOB: "+depositAmt);
						System.out.println("Total amount in BOB: "+bobBalance);
					}					
				break;
				case "sbi":
					if(depositAmt>0) {
						sbiBalance= sbiBalance+depositAmt;
						creditCountsbi++;
						System.out.println("Credit amount in SBI: "+depositAmt);
						System.out.println("Total amount in SBI: "+sbiBalance);
					}				
				break;
				default:
					System.out.println("Enter correct bank name for Credit !!");					
			}
			break;
				
		}
	}
	void showTotalBalance() {
		//double TotalBalance= iciciBalance+hdfcBalance+bobBalance+sbiBalance;
		System.out.println("------------------------TotalBalance--------------------");
		System.out.println("Total balance is: "+(iciciBalance+hdfcBalance+bobBalance+sbiBalance));
	}
	void individualDebitOperation() {
		System.out.println("------------------Individual Debit Operation---------------------");
		System.out.println("ICICI bank Debit Operation: "+debitCounticici);
		System.out.println("HDFC bank Debit Operation: "+debitCounthdfc);
		System.out.println("BOB bank Debit Operation: "+debitCountbob);
		System.out.println("SBI bank Debit Operation: "+debitCountsbi);
	}
	void individualCreditOperation() {
		System.out.println("------------------Individual Credit Operation---------------------");
		System.out.println("ICICI bank Credit Operation: "+creditCounticici);
		System.out.println("HDFC bank Credit Operation: "+creditCounthdfc);
		System.out.println("BOB bank Credit Operation: "+creditCountbob);
		System.out.println("SBI bank Credit Operation: "+creditCountsbi);
	}
	void totalCreditDebitOperations () {
		int totalDebitCount= debitCounticici+debitCounthdfc+debitCountbob+debitCountsbi;
		int totalCreditCount= creditCounticici+creditCounthdfc+creditCountbob+creditCountsbi;
		System.out.println("------------------Total Credit Operation---------------------");
		System.out.println("Total bank Debit Operation: "+totalDebitCount);
		System.out.println("Total bank Credit Operation: "+totalCreditCount);
	}
	public static void main(String[] args) {
		BankAccounts bankAccounts= new BankAccounts();
		//bankAccounts.bankOperation("credit", "icici", 500, 100);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Operation: ");
		String operation= scanner.next();
		System.out.println("Enter bank name: ");
		String bankName= scanner.next();
		System.out.println("Enter debit amount: ");
		int reqAmt= scanner.nextInt();
		System.out.println("Enter deposite amount: ");
		int depositAmt= scanner.nextInt();
		bankAccounts.bankOperation(operation, bankName, reqAmt, depositAmt);
		bankAccounts.showTotalBalance();
		bankAccounts.individualDebitOperation();
		bankAccounts.individualCreditOperation();
		bankAccounts.totalCreditDebitOperations();
	}

}
