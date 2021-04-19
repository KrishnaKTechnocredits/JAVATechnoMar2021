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
package ravindra_J.Assignment_No_15_Nested_SwitchCase;

import java.util.Scanner;

public class BankAccountUsingNestedSwitchCase {
	static String customerName;
	static double sbiAmount=500;
	static double bobAmount=500;
	static double hdfcAmount=500;
	static double iciciAmount=500;
	static double debitCount, creditCount;
	static double sbiCreditCount,bobCreditCount,hdfcCreditCount,iciciCreditCount;
	static double sbiDebitCount,bobDebitCount,hdfcDebitCount,iciciDebitCount;
	static void TransactionType(String type, String bankName, double amount) {
		
		
		switch(type.toLowerCase()) {
			case "debit":
				debitCount++;
				switch(bankName.toUpperCase()) {
					case "SBI":
						if(amount <= sbiAmount) {
							sbiAmount = sbiAmount - amount;
							sbiDebitCount++;
							System.out.println("Current Balence after Debit "+amount+ " : " +sbiAmount);
						}
						else 
							System.out.println("Your SBI account has Insufficient Balence" +sbiAmount);
							break;
						
					case "BOB":
						if(amount <= bobAmount) {
							bobAmount = bobAmount - amount;
							bobDebitCount++;
							System.out.println("Current Balence after Debit "+amount+ " :" +bobAmount);
						}
						else 
							System.out.println("Your BOB account has Insufficient Balence" +bobAmount);
							break;
						
					case "HDFC":
						if(amount <= hdfcAmount) {
							hdfcAmount = hdfcAmount - amount;
							hdfcDebitCount++;
							System.out.println("Current Balence after Debit "+amount+ " :" +hdfcAmount);
						}
						else 
							System.out.println("Your HDFC account has Insufficient Balence" +hdfcAmount);
							break;
						
					case "ICICI":
						if(amount <= iciciAmount) {
							iciciAmount = iciciAmount - amount;
							iciciDebitCount++;
							System.out.println("Current Balence after Debit "+amount+ " :" +iciciAmount);
						}
						else 
							System.out.println("Your ICICI account has Insufficient Balence" +iciciAmount);
							break;
						
				}
					break;
				
			case "credit":
				creditCount++;
				switch(bankName) {
					case "SBI":
						sbiCreditCount++;
						sbiAmount += amount;
						System.out.println("\nCurrent Balence after Credit "+amount+ " : " +sbiAmount);
						break;
					
					case "BOB":
					bobCreditCount++;
						bobAmount += amount;
						System.out.println("Current Balence after Credit "+amount+ " :" +bobAmount);
						break;
					
					case "HDFC":
					hdfcCreditCount++;
						hdfcAmount += amount;
						System.out.println("Current Balence after Credit "+amount+ " :" +hdfcAmount);
						break;
					
					case "ICICI":
					iciciCreditCount++;
						iciciAmount += amount;
						System.out.println("Current Balence after Credit "+amount+ " :" +iciciAmount);
						break;
				
					default :
						System.out.println("Invalid input");
					
			}
				break;
			
			default :
				System.out.println("Invalid input");
		}
		
	}
	static void customer(String custName) {
		customerName = custName;
		System.out.println("\n"+customerName + "'s Transaction details are : ");
	}
	static void totalBalence() {
		double totalbalence = sbiAmount+bobAmount+hdfcAmount+iciciAmount;
		System.out.println("\n"+customerName +"'s total balence of all the banks are - "+totalbalence); 
		 
	}
	
	static void totalTransactionCount() {
		System.out.println("\nTotal debit count is :" +debitCount);
		System.out.println("Total credit count is :" +creditCount);
	}
	
	static void individualBankCreditCount() {
		System.out.println("\nSBI Credit Operation Count - " +sbiCreditCount);
		System.out.println("BOB Credit Operation Count - " +bobCreditCount);
		System.out.println("HDFC Credit Operation Count - " +hdfcCreditCount);
		System.out.println("ICICI Credit Operation Count - " +iciciCreditCount);
	}
	
	static void individualBankDebitCount() {
		System.out.println("\nSBI Debit Operation Count - " +sbiDebitCount);
		System.out.println("BOB Debit Operation Count - " +bobDebitCount);
		System.out.println("HDFC Debit Operation Count - " +hdfcDebitCount);
		System.out.println("ICICI Debit Operation Count - " +iciciDebitCount);
	}
	
	public static void main(String[] args) {
		/*BankAccountUsingNestedSwitchCase bankaccounts = new BankAccountUsingNestedSwitchCase();
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter the transaction type : ");
		String TransType=scanner.next();
		
		System.out.print("Please, enter the Bank Name : ");
		String toBank=scanner.next().toUpperCase();
		System.out.print("Please, enter the Amount : ");
		double amt = Double.parseDouble(scanner.next());	*/
	
		//TransactionType(TransType,toBank,amt);
		customer("Wilson");
		TransactionType("Debit","SBI",100);
		TransactionType("CreDit","SBI",0.0);
		TransactionType("Credit","BOB",100);
		TransactionType("Credit","ICICI",233);
		TransactionType("Credit","HDFC",111);
		TransactionType("debit","HDFC",233);
		TransactionType("debit","ICICI",50.5);
		totalBalence();
		totalTransactionCount();
		individualBankCreditCount();
		individualBankDebitCount();
}
}
