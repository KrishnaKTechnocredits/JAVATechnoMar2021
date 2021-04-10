/*person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
a) Person can debit or credit amount from respective bank.
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
                       HDFC bank Debit Operation - 2*/
   
                       
package krati_Shukla.ScannerClass;

import java.util.Scanner;

public class DebitCredit {
	
	static int creditCount;
	static int debitCount;
	static int icici;
	static int hdfc;
	static int sbi;
	static int bob;
	int iCredit;
	int hCredit;
	int sCredit;
	int bCredit;
	int iDebit;
	int hDebit;
	int sDebit;
	int bDebit;
	
	
	void totalOperations() {
		System.out.println("Total credit operations : "+creditCount+" times");
		System.out.println("Total debit operations : "+debitCount+" times");
	}
	
	void individualCredit() {
		System.out.println("ICICI bank credit operations : "+iCredit);
		System.out.println("HDFC bank credit operations : "+hCredit);
		System.out.println("SBI bank credit operations : "+sCredit);
		System.out.println("BOB bank credit operations : "+bCredit);
	}
	
	void individualDebit() {
		System.out.println("ICICI bank debit operations : "+iDebit);
		System.out.println("HDFC bank debit operations : "+hDebit);
		System.out.println("SBI bank debit operations : "+sDebit);
		System.out.println("BOB bank debit operations : "+bDebit);
	}
	
	void totalBalance() {
		System.out.println(icici+hdfc+sbi+bob+ ": is total balance.");
	}
	
	void operation(int op, int bank, int amount) {
		switch (op) {
			case 1:
				switch (bank) {
					case 1:
						icici = icici+amount;
						creditCount++;
						iCredit++;
						break;
					case 2:
						hdfc = hdfc+amount;
						creditCount++;
						hCredit++;
						break;
					case 3:
						sbi = sbi+amount;
						creditCount++;
						sCredit++;
						break;
					case 4:
						bob = bob+amount;
						creditCount++;
						bCredit++;
						break;					
					default:
						System.out.println("enter valid BANK");
						break;
				}
				break;
			case 2:
				switch (bank) {
					case 1:
						if (icici>=amount) {
							icici = icici-amount;
							debitCount++;
							iDebit++;
						}else {
							System.out.println("Insifficient funds. Current Balance is :" +icici);
						}
						break;
					case 2:
						if (hdfc>=amount) {
							hdfc = hdfc-amount;
							debitCount++;
							hDebit++;
						}else {
							System.out.println("Insifficient funds. Current Balance is :" +hdfc);
						}
						break;
					case 3:
						if (sbi>=amount) {
							sbi = sbi-amount;
							debitCount++;
							sDebit++;
						}else {
							System.out.println("Insifficient funds. Current Balance is :" +sbi);
						}
						break;
					case 4:
						if (bob>=amount) {
							icici = bob-amount;
							debitCount++;
							bDebit++;
						}else {
							System.out.println("Insifficient funds. Current Balance is :" +bob);
						}
						break;
					default:
						System.out.println("enter valid BANK : ICICI / HDFC / SBI / BOB");
						break;
				}
			break;
			default:
				System.out.println("enter valid operation : Credit / Debit");
				break;
				
		}
	}
	
	public static void main (String[] a)
	{
		DebitCredit debitCredit = new DebitCredit();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Amount for Icici bank: ");
		icici = scanner.nextInt();
		System.out.println("Enter Amount for hdfc bank: ");
		hdfc = scanner.nextInt();
		System.out.println("Enter Amount for sbi bank: ");
		sbi = scanner.nextInt();
		System.out.println("Enter Amount for bob bank: ");
		bob = scanner.nextInt();
		
		String ans = null;

		do {
			System.out.println("Enter what operation is required. 1:Credit   2:Debit");
			int op1 = scanner.nextInt();
			System.out.println("Enter the amount to be credited or debited");
			int amount1 = scanner.nextInt();
			System.out.println("Enter in which bank action is required. 1:icici   2:hdfc   3:sbi   4:bob");
			int bank1 = scanner.nextInt();
			debitCredit.operation(op1, bank1, amount1);
			System.out.println("Do you want to execute more operations : Y/N");
			ans = scanner.next().toUpperCase();
			//ans = ans.toUpperCase();
		}while(ans.equals("Y"));
		
		debitCredit.individualCredit();
		debitCredit.individualDebit();
		debitCredit.totalOperations();
		debitCredit.totalBalance();
		
	}

}
