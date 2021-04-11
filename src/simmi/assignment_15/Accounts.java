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
		                 SBI*/

package simmi.assignment_15;

import java.util.Scanner;

public class Accounts {
	int iciciBalance = 10000, hdfcBalance = 8000, bobBalance = 9000, sbiBalance = 5000;
	int debitCountICICI = 0, debitCountHDFC = 0, debitCountBOB = 0, debitCountSBI = 0;
	int creditCountICICI = 0, creditCountHDFC = 0, creditCountBOB = 0, creditCountSBI = 0;
	
	void operation(String bank, String operation, int amount) {
		switch(operation) {
		case "debit" :
			switch(bank) {
			case "ICICI" :
				if(iciciBalance >= amount) {
					iciciBalance = iciciBalance - amount;
					debitCountICICI++;
					System.out.println(" Amount debited from ICICI bank is:" + iciciBalance);
				}
				else
					System.out.println(" Not sufficient balance");
				break;
				
			case "HDFC":
				if(hdfcBalance >= amount) {
					hdfcBalance = hdfcBalance - amount;
					debitCountHDFC++;
					System.out.println(" Amount debited from HDFC bank is:" + hdfcBalance);
				}
				else
					System.out.println(" Not sufficient balance");
				break;
				
			case "BOB":
				if(bobBalance >= amount) {
					bobBalance = bobBalance - amount;
					debitCountBOB++;
					System.out.println(" Amount debited from BOB bank is:" + bobBalance);
				}
				else
					System.out.println(" Not sufficient balance");
				break;
				
			case "SBI":
				if(sbiBalance >= amount) {
					sbiBalance = sbiBalance - amount;
					debitCountSBI++;
					System.out.println(" Amount debited from SBI bank is:" + sbiBalance);
				}
				else
					System.out.println(" Not sufficient balance");
				break;
				
			default:
				System.out.println(" You have entered wrong bank name");
			}
			
		case "credit" :
			switch(bank) {
			case "ICICI" :
				if(amount  > 0) {
					iciciBalance = iciciBalance + amount;
					creditCountICICI++;
					System.out.println(" Amount credited to ICICI bank is:" + amount);
					System.out.println(" Total amount in ICICI bank is:" + iciciBalance);
					}
				break;
				
			case "HDFC":
				if(amount  > 0) {
					hdfcBalance = hdfcBalance + amount;
					creditCountHDFC++;
					System.out.println(" Amount credited to HDFC bank is:" + amount);
					System.out.println(" Total amount in HDFC bank is:" + hdfcBalance);
					}
				break;
				
			case "BOB":
				if(amount  > 0) {
					bobBalance = bobBalance + amount;
					creditCountBOB++;
					System.out.println(" Amount credited to BOB bank is:" + amount);
					System.out.println(" Total amount in BOB bank is:" + bobBalance);
					}
				break;
				
			case "SBI":
				if(amount  > 0) {
					sbiBalance = sbiBalance + amount;
					creditCountSBI++;
					System.out.println(" Amount credited to SBI bank is:" + amount);
					System.out.println(" Total amount in SBI bank is:" + sbiBalance);
					}
				break;
				
			default:
				System.out.println(" You have entered the wrong bank name");
			}
		}
	}
		
		void totalBalance() {
			System.out.println(" The total account balance of all the banks combined is: " + (sbiBalance+bobBalance+hdfcBalance+iciciBalance));
		}
		
		void totalCreditDebit() {
			System.out.println(" Total number of debit operation are done " + (debitCountICICI+debitCountHDFC+debitCountBOB+debitCountSBI) +" times");
			System.out.println(" Total number of credit operation are done " + (creditCountICICI+creditCountHDFC+creditCountBOB+creditCountSBI) +" times");
		}
		
		void individualBankCredit() {
			System.out.println(" Number of credit done in ICICI is " +creditCountICICI+ " time");
			System.out.println(" Number of credit done in HDFC is " +creditCountHDFC+ " time");
			System.out.println(" Number of credit done in BOB is " +creditCountBOB+ " time");
			System.out.println(" Number of credit done in SBI is " +creditCountSBI+ " time");
		}
		
		void individualBankDebit() {
			System.out.println(" Number of debit done in ICICI is " +debitCountICICI+ " time");
			System.out.println(" Number of debit done in HDFC is " +debitCountHDFC+ " time");
			System.out.println(" Number of debit done in BOB is " +debitCountBOB+ " time");
			System.out.println(" Number of debit done in SBI is " +debitCountSBI+ " time");
		}
			public static void main(String[] args) {
				Accounts accounts = new Accounts();
				Scanner scanner = new Scanner(System.in);
				System.out.println(" Enter the operation to perform ");
				String operation = scanner.nextLine();
				System.out.println(" Enter the bank name ");
				String bank = scanner.nextLine();
				//bank = bank.toLowerCase();
				System.out.println(" Enter the amount ");
				int amount = scanner.nextInt();
				/*System.out.println(" Enter the credit amount ");
				int amount = scanner.nextInt();*/
				accounts.operation(bank,operation,amount);
				accounts.totalBalance();
				accounts.totalCreditDebit();
				accounts.individualBankCredit();
				accounts.individualBankDebit();
			}
	}
		
			
			
			
			
			

