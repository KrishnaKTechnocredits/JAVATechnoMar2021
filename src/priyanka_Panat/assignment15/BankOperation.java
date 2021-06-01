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

package priyanka_Panat.assignment15;


	public class BankOperation {

			int icicibalance, sbibalance, hdfcbalance,bobbalance;
			int idebitCount=0,icreditCount=0, sdebitCount=0,screditCount=0, hdebitCount=0, hcreditCount=0,bdebitCount=0,bcreditCount=0;
			String name;
			
			void setBal(int ibal,int sbal,int hbal,int bbal,String custname) {
				icicibalance=ibal;
				sbibalance=sbal;
				hdfcbalance=hbal;
				bobbalance=bbal;
				name=custname;
				System.out.println(name + " Transaction details");
			}
			
			void bankCreditDebitOperation(String bank, String op,int amt) {
			switch(op) {
				case "debit":
				switch(bank) {
				case "ICICI" :
						if(icicibalance>=amt) {
							icicibalance=icicibalance-amt;
							idebitCount++;
						}else {
							System.out.println("You don't have suffficient balance to complete the operation.");
						}
						break;
					
				case "SBI" :
					if(sbibalance>=amt) {
						sbibalance=sbibalance-amt;
						sdebitCount++;
					}else {
						System.out.println("You don't have suffficient balance to complete the operation.");
					}
					break;
					
					
				case "HDFC" :
					if(hdfcbalance>=amt) {
						hdfcbalance=hdfcbalance-amt;
						hdebitCount++;
					}else {
						System.out.println("You don't have suffficient balance to complete the operation.");
					}
					break;
				
				case "BOB" :
					if(bobbalance>=amt) {
						bobbalance=bobbalance-amt;
						bdebitCount++;
					}else {
						System.out.println("You don't have suffficient balance to complete the operation.");
					}
					break;
					default:
						System.out.println("Invalid bank name.");
					}
					break;
				
					
				case "credit":
					switch(bank) {
					case "ICICI" :
						icicibalance=icicibalance+amt;
						icreditCount++;
						break;
					
				    case "SBI" :
				    	sbibalance=sbibalance+amt;
				    	screditCount++;
				    	break;
					
					case "HDFC" :
						hdfcbalance=hdfcbalance+amt;
						hcreditCount++;
						break;
						
					case "BOB" :
						bobbalance=bobbalance+amt;
						bcreditCount++;
						break;
					default:
						System.out.println("Invalid bank name");
					}
					break;
				
				default:
					System.out.println("Invalid operation");
				}
		}
			
			void displayTotalBal() {
				int totalbal=icicibalance+hdfcbalance+sbibalance+bobbalance;
				System.out.println("Total balance of ICICI,SBI,HDFC,BOB is : "+totalbal);
			}
			
			void totalOperation() {
				int totalDebitOperation=idebitCount+hdebitCount+sdebitCount+bdebitCount;
				int totalCreditOperation=icreditCount+hcreditCount+screditCount+bcreditCount;
				System.out.println("Total Debit Operation performed are : " +totalDebitOperation);
				System.out.println("Total Credit Operation performed are : " +totalCreditOperation);
			}
			
			void individualBankCreditOperation() {
				System.out.println("ICICI Bank Credit Operation : "+icreditCount+  "\nSBI Bank Credit Operation : " + screditCount + " \nHDFC Bank Credit Operation : " + hcreditCount + "\nBOB Bank Credit Operation : " +bcreditCount);
			}
			
			void individualBankDebitOperation() {
				System.out.println("ICICI Bank Debit Operation : "+idebitCount+ "\nSBI Bank Debit Operation : "+ sdebitCount + "\nHDFC Bank Debit Operation : "+ hdebitCount +"\nBOB Bank Debit Operation : " + bdebitCount );
				
			}
			public static void main(String[] args) {
				BankOperation bankOperation=new BankOperation();
				bankOperation.setBal(1000, 2000, 3000, 4000,"Customer1");
				bankOperation.bankCreditDebitOperation("HDFC", "debit", 200);
				bankOperation.bankCreditDebitOperation("BOB", "credit", 1000);
				bankOperation.bankCreditDebitOperation("ICICI", "debit", 300);
				bankOperation.bankCreditDebitOperation("SBI", "debit", 1000);
				bankOperation.bankCreditDebitOperation("BOB", "debit", 900);
				bankOperation.bankCreditDebitOperation("SBI", "credit", 1400);
				bankOperation.bankCreditDebitOperation("ICICI", "credit", 540);
				bankOperation.bankCreditDebitOperation("HDFC", "credit", 200);
				bankOperation.bankCreditDebitOperation("SBI", "credit", 400);
				System.out.println(" ");
				bankOperation.displayTotalBal();
				System.out.println(" ");
				bankOperation.totalOperation();
				System.out.println(" ");
				bankOperation.individualBankCreditOperation();
				System.out.println(" ");
				bankOperation.individualBankDebitOperation();
				
			}
		}
