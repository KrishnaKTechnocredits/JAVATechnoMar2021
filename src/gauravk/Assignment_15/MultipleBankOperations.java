package gauravk.Assignment_15;
/*
 * And 10th_April_Session-20_Doubt_Discussion Assignment - 15 : 9th April'2021
A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
a) Person can debit or credit amount from respective bank.
Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]
b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]
c) A Method to show total credit, debit operations
output : Total credit operation - 7 times
Total debit operation - 5 times
.
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

import java.util.Scanner;

public class MultipleBankOperations {
	double balanceICIC=10000, balanceHDFC=15000, balanceBOB=10000, balanceSBI=20000;
	int creditICICCount, creditHDFCCount, creditBOBCount, creditSBICount, totalCreditCount;
	int debitICICCount, debitHDFCCount, debitBOBCount, debitSBICount, totalDebitCount;
	static Scanner sc = new Scanner(System.in);
	
	void totalBalanceAllBanks() {
		System.out.println("Gross total balance of all bank accounts is: "+(balanceICIC+balanceHDFC+balanceBOB+balanceSBI));
	}
	
	void totalOperations() {
		totalCreditCount = creditICICCount+ creditHDFCCount+ creditBOBCount+ creditSBICount;
		totalDebitCount = debitICICCount+debitHDFCCount+debitBOBCount+debitSBICount;
		System.out.println("Total Credit operations: "+ totalCreditCount+"\nTotal Debit operations: "+totalDebitCount);
	}

	void individualCreditOps() {
	System.out.println("Indiidual credit counts by banks");
	System.out.println("ICIC credits :"+creditICICCount+"\nHDFC credits: "+creditHDFCCount+"\nBOB credits: "+creditBOBCount+"\nSBI credits: "+creditSBICount);
}

	void individualDebitOps() {
		System.out.println("Indiidual debit counts by banks");
		System.out.println("ICIC debits: "+debitICICCount+"\nHDFC debits: "+debitHDFCCount+"\nBOB debits: "+debitBOBCount+"\nSBI debits: "+debitSBICount);
	}

	
	void operations(char op) {
		switch(op) {
		case 'c':
		case 'C': {
			System.out.println("Which bank would you like to do credit operation?");
			System.out.println("Enter I for ICIC bank \n Enter H for HDFC bank \n Enter B for BOB bank \n Enter S for SBI bank");
			char ch = sc.next().charAt(0);
			switch (ch) {
			case 'i':
			case 'I':
				System.out.println("Enter amout to credit ICIC bank account.");
				balanceICIC = balanceICIC + sc.nextDouble();
				creditICICCount++;
				totalCreditCount++;
				break;
			case 'h':
			case 'H':
				System.out.println("Enter amout to credit HDFC bank account.");
				balanceHDFC = balanceHDFC + sc.nextDouble();
				creditHDFCCount++;
				totalCreditCount++;
				break;
			case 'b':
			case 'B':
				System.out.println("Enter amout to credit BOB bank account.");
				balanceBOB = balanceBOB + sc.nextDouble();
				creditBOBCount++;
				totalCreditCount++;
				break;
			case 's':
			case 'S':
				System.out.println("Enter amout to credit SBI bank account.");
				balanceSBI = balanceSBI + sc.nextDouble();
				creditSBICount++;
				totalCreditCount++;
				break;
			}
		}
		break;
		case 'd':
		case 'D': {
			System.out.println("Which bank would you like to do debit operation?");
			System.out.println("Enter I for ICIC bank \n Enter H for HDFC bank \n Enter B for BOB bank \n Enter S for SBI bank");
			char ch = sc.next().charAt(0);
			double dbamt;
			switch (ch) {
			case 'i':
			case 'I':
				System.out.println("Enter amout to debit ICIC bank account.");
				dbamt = sc.nextDouble();
				if(dbamt<=balanceICIC) {
					balanceICIC = balanceICIC - dbamt;
					debitICICCount++;
					totalDebitCount++;
				}
				else System.out.println("Debit operation not possible.");
				break;
			case 'h':
			case 'H':
				System.out.println("Enter amout to debit HDFC bank account.");
				dbamt = sc.nextDouble();
					if(dbamt<=balanceHDFC) {
						balanceHDFC = balanceHDFC - dbamt;
						debitHDFCCount++;
						totalDebitCount++;
					}
					else System.out.println("Debit operation not possible.");
					break;
			case 'b':
			case 'B':
				System.out.println("Enter amout to debit BOB bank account.");
				dbamt = sc.nextDouble();
					if(dbamt<=balanceBOB) {
						balanceBOB = balanceBOB - dbamt;
						debitBOBCount++;
						totalDebitCount++;
					}
					else System.out.println("Debit operation not possible.");
					break;
			case 's':
			case 'S':
				System.out.println("Enter amout to debit SBI bank account.");
				dbamt = sc.nextDouble();
					if(dbamt<=balanceSBI) {
						balanceSBI = balanceSBI - dbamt;
						debitSBICount++;
						totalDebitCount++;
					}
					else System.out.println("Debit operation not possible.");
					break;
			}
		}
		break;
		}
	}
		
	public static void main(String[] a) {
		
		MultipleBankOperations multiBankOperations1 = new MultipleBankOperations();
		//System.out.println("Please enter your name.");
		//String name = sc.nextLine();
		System.out.println("What would you like to do? Press d for Debit or c for Credit.");
		char oper = sc.next().charAt(0);
		do {
			if(oper=='c'|| oper=='C'|| oper=='d'|| oper=='D'){
				multiBankOperations1.operations(oper);
				System.out.println("Press c for more Credit operations \nPress d for more Debit operations \nPress x to exit.");
				oper = sc.next().charAt(0);
			}
			else
				System.out.println("No operations performed.");
		} while(oper == 'c' || oper == 'C' || oper == 'd' || oper == 'D');
		System.out.println("==========================================");
		multiBankOperations1.individualCreditOps();
		multiBankOperations1.individualDebitOps();
		multiBankOperations1.totalOperations();
		multiBankOperations1.totalBalanceAllBanks();
		System.out.println("==========================================");
		System.out.println("Banking system logged out.");
	}

}