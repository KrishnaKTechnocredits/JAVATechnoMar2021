package krishna.Assignment_15_16;
import java.util.Scanner;
/*
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
 
 */
public class NestedSwitchExmp {
	int iciciBalance = 5000, hdfcBalance =6000, bobBalance = 4000, sbiBalance =8000;
	static int totalBalance=0;
	static int totalDebitCount,totalCreditCount;
	static int iciciCreditCount,hdfcCreditCount,bobCreditCount,sbiCreditCount;
	static int iciciDebitCount,hdfcDebitCount,bobDebitCount,sbitDebitCount;
	
	void operation(String bank,String ops, int amount) {
		switch (ops) {
			case "DEBIT":
				switch (bank) {
					case "HDFC":
						if (hdfcBalance>amount) {
							hdfcBalance = hdfcBalance - amount;
							System.out.println(amount+" rupees is debited from your HDFC account. Remaining balance is "+hdfcBalance+" rupees.");
							hdfcDebitCount++;
							totalDebitCount++;
						}else {
							System.out.println("There is not suficient balance in your HDFC account. You can only debit up to "+hdfcBalance);
						}
					break;
					case "ICICI":
						if (iciciBalance>amount) {
							iciciBalance = iciciBalance - amount;
							System.out.println(amount+" rupees is debited from your ICICI account. Remaining balance is "+iciciBalance+" rupees.");
							iciciDebitCount++;
							totalDebitCount++;
						}else {
							System.out.println("There is not suficient balance in your ICICI account. You can only debit up to "+iciciBalance);
						}
					break;
					case "BOB":
						if (bobBalance>amount) {
							bobBalance = bobBalance - amount;
							System.out.println(amount+" rupees is debited from your BOB account. Remaining balance is "+bobBalance+" rupees.");
							bobDebitCount++;
							totalDebitCount++;
						}else {
							System.out.println("There is not suficient balance in your BOB account. You can only debit up to "+bobBalance);
						}
					break;
					case "SBI":
						if (sbiBalance>amount) {
							sbiBalance = sbiBalance - amount;
							System.out.println(amount+" rupees is debited from your SBI account. Remaining balance is "+sbiBalance+" rupees.");
							sbitDebitCount++;
							totalDebitCount++;
						}else {
							System.out.println("There is not suficient balance in your SBI account. You can only debit up to "+sbiBalance);
						}
					break;
				
				}
				
			break;
			
			case "CREDIT":
				switch (bank) {
					case "HDFC":
							hdfcBalance = hdfcBalance + amount;
							System.out.println(amount+" is credited in your HDFC account. Your current balance is "+hdfcBalance);
							totalCreditCount++;
							hdfcCreditCount++;
					break;
					case "ICICI":
						iciciBalance = iciciBalance + amount;
						System.out.println(amount+" is credited in your ICICI account. Your current balance is "+iciciBalance);
						totalCreditCount++;
						iciciCreditCount++;
					break;
					case "BOB":
						bobBalance = bobBalance + amount;
						System.out.println(amount+" is credited in your ICICI account. Your current balance is "+bobBalance);
						totalCreditCount++;
						bobCreditCount++;
					break;
					case "SBI":
						sbiBalance = sbiBalance + amount;
						System.out.println(amount+" is credited in your ICICI account. Your current balance is "+sbiBalance);
						totalCreditCount++;
						sbiCreditCount++;
					break;
					
					}
			break;
				}
				
		}
	
	
	void showTotalBalance() {
		int totalBalance = iciciBalance + hdfcBalance + bobBalance + sbiBalance;
		System.out.println("Your total balance of all bank accounts is: "+totalBalance +"/- Rupees");
	}
	
	void showTotalOpsCount() {
		System.out.println("Total debit operation is: "+totalDebitCount);
		System.out.println("Total credit operation is: "+totalCreditCount);
		
		
				
	}
	
	void individiualCreditOpsCount() {
		
		System.out.println("ICICI credit operation is: "+iciciCreditCount);
		System.out.println("HDFC credit operation is: "+hdfcCreditCount);
		System.out.println("BOB credit operation is: "+bobCreditCount);
		System.out.println("SBI credit operation is: "+sbiCreditCount);
		
	}
	
	void individiualDebitOpsCount() {
		System.out.println("ICICI debit operation is: "+iciciDebitCount);
		System.out.println("HDFC debit operation is: "+hdfcDebitCount);
		System.out.println("BOB debit operation is: "+bobDebitCount);
		System.out.println("SBI debit operation is: "+sbitDebitCount);
		
			
	}
	
	public static void main(String[] args) {
		NestedSwitchExmp nestedSwitchExmp = new NestedSwitchExmp();
		
		
		for (int i=0;i<13;i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter bank name: ");
			String bank =scanner.next();
			System.out.println("Please enter operation name CREDIT or DEBIT : ");
			String ops =scanner.next();
			System.out.println("Please enter amount for operation : ");
			int amount =scanner.nextInt();
			nestedSwitchExmp.operation(bank,ops,amount);
		}
		System.out.println();
		nestedSwitchExmp.showTotalBalance();
		System.out.println();
		nestedSwitchExmp.showTotalOpsCount();
		System.out.println();
		nestedSwitchExmp.individiualDebitOpsCount();
		System.out.println();
		nestedSwitchExmp.individiualCreditOpsCount();
		
	}

}
