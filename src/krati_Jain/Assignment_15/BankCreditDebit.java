/*       a) Person can debit or credit amount from respective bank.
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

package krati_Jain.Assignment_15;

import java.util.Scanner;

public class BankCreditDebit {
	
	double availableAmountIcici;
	double availableAmountHdfc;
	double availableAmountBob;
	double availableAmountSbi;
	double debitAmount;
	double creditAmount;
	String selectedBank;
	int individualDebitCntIcici;
	int individualDebitCntHdfc;
	int individualDebitCntBob;
	int individualDebitCntSbi;
	int individualCreditCntIcici;
	int individualCreditCntHdfc;
	int individualCreditCntBob;
	int individualCreditCntSbi;
	static int debitCounter;
	static int creditCounter;
	
	void bankAmountInitilization() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your bank name - ICICI, HDFC, BOB, SBI?");
		selectedBank = scan.next();
		selectedBank = selectedBank.toUpperCase();
		
		System.out.println("How much balance you have in this account already?");
		double availableAmount = scan.nextDouble();
		/*
		 * if (selectedBank.equals("ICICI")) availableAmountIcici = availableAmount;
		 * else if (selectedBank.equals("HDFC")) availableAmountHdfc = availableAmount;
		 * else if (selectedBank.equals("BOB")) availableAmountBob = availableAmount;
		 * else if (selectedBank.equals("SBI")) availableAmountSbi = availableAmount;
		 */
		switch (selectedBank) {
		case "ICICI":
			availableAmountIcici = availableAmount;
			debitCreditAmtInitilization();
			break;
		case "HDFC":
			availableAmountHdfc = availableAmount;
			debitCreditAmtInitilization();
			break;
		case "BOB":
			availableAmountBob = availableAmount;
			debitCreditAmtInitilization();
			break;
		case "SBI":
			availableAmountSbi = availableAmount;
			debitCreditAmtInitilization();
			break;
		default:
			System.out.println("We do not operate with selected bank, please choose a valid bank, type No if you don't want to proceed, Yes to proceed");
			String yesNo = scan.next();
			yesNo=yesNo.toUpperCase();
			switch (yesNo) {
				case "No":
					break;
				case "YES":
					bankAmountInitilization();
					break;
				default:
					break;
				
			}
			
		}
	}
	
	void debitCreditAmtInitilization() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input amount you want to Credit-");
		double creditAmount = scan.nextDouble();
		System.out.println("Input amount you want to Debit-");
		double debitAmount = scan.nextDouble();
		
		
		debitCreditOperation(selectedBank, debitAmount, creditAmount);
		
		System.out.println("Do you want to debit/credit again? Type Yes or No to select");
		String anotherOperation = scan.next();
		anotherOperation= anotherOperation.toUpperCase();
		if (anotherOperation.equalsIgnoreCase("YES")) {
			bankAmountInitilization();
		}
		
	}
	
	void debitCreditOperation(String selectedBank, double debitAmount, double creditAmount ) {
		//System.out.println("Entered next method" + selectedBank + "Debit " + debitAmount + "Credit "+ creditAmount);
		switch (selectedBank) {
		case "ICICI":
		{
			availableAmountIcici = availableAmountIcici + creditAmount;
			individualCreditCntIcici++;
			creditCounter++;
			if(debitAmount <= availableAmountIcici) {
				availableAmountIcici= availableAmountIcici - debitAmount;
				individualDebitCntIcici++;
				debitCounter++;
				totalBalance();
				individualDebit();
				individualCredit();
				totaldebitCreditOps();
			}
				else
				System.out.println("Customer doesn't have sufficient amount to debit the requested amount");
			break;
		
		}
	
		
		case "HDFC": {
			
			availableAmountHdfc= availableAmountHdfc + creditAmount;
			
			individualCreditCntHdfc++;
			creditCounter++;
			if(debitAmount <= availableAmountHdfc) {
				availableAmountHdfc= availableAmountHdfc - debitAmount;
				individualDebitCntHdfc++;
				debitCounter++;
				totalBalance();
				individualDebit();
				individualCredit();
				totaldebitCreditOps();
			}
				else
				System.out.println("Customer doesn't have sufficient amount to debit the requested amount");
		break;
		}
		
		case "SBI": {
			availableAmountSbi = availableAmountSbi + creditAmount;
			individualCreditCntSbi++;
			creditCounter++;
			if(debitAmount <= availableAmountSbi) {
				availableAmountSbi= availableAmountSbi - debitAmount;
				individualDebitCntSbi++;
				debitCounter++;
				totalBalance();
				individualDebit();
				individualCredit();
				totaldebitCreditOps();
			}
				else
				System.out.println("Customer doesn't have sufficient amount to debit the requested amount");
		break;
		}
		
		case "BOB": {
			availableAmountBob = availableAmountBob + creditAmount;
			individualCreditCntBob++;
			creditCounter++;
			if(debitAmount <= availableAmountBob) {
				availableAmountBob= availableAmountBob - debitAmount;
				individualDebitCntBob++;
				debitCounter++;
				totalBalance();
				individualDebit();
				individualCredit();
				totaldebitCreditOps();
			}
				else
				System.out.println("Customer doesn't have sufficient amount to debit the requested amount");
		break;
		}

	}

	}
		
	
	
	void totalBalance() {
		System.out.println("--------------------------------------------------");
		System.out.println("Total Balance in ICICI account = " + availableAmountIcici);
		System.out.println("Total Balance in HDFC account = " + availableAmountHdfc);
		System.out.println("Total Balance in BOB account = " + availableAmountBob);
		System.out.println("Total Balance in SBI account = " + availableAmountSbi);
	}
	
	void totaldebitCreditOps() {
		System.out.println("--------------------------------------------------");
		System.out.println("Total Debit Operations happened so far : " + debitCounter);
		System.out.println("Total Credit Operations happened so far : " + creditCounter);
		
	}
	
	void individualDebit() {
		System.out.println("--------------------------------------------------");
		System.out.println("Individual Debit Operations happened so far for ICICI " + individualDebitCntIcici);
		System.out.println("Individual Debit Operations happened so far for HDFC " + individualDebitCntHdfc);
		System.out.println("Individual Debit Operations happened so far for BOB " + individualDebitCntBob);
		System.out.println("Individual Debit Operations happened so far for SBI " +  individualDebitCntSbi);

	}
	
	void individualCredit() {
		System.out.println("--------------------------------------------------");
		System.out.println("Individual Credit Operations happened so far for ICICI " + individualCreditCntIcici);
		System.out.println("Individual Credit Operations happened so far for HDFC " + individualCreditCntHdfc);
		System.out.println("Individual Credit Operations happened so far for BOB " + individualCreditCntBob);
		System.out.println("Individual Credit Operations happened so far for SBI " +  individualCreditCntSbi);

	}
	
	public static void main(String[] args) {
		BankCreditDebit bank = new BankCreditDebit();
		bank.bankAmountInitilization();
		
	}
	
	
}
