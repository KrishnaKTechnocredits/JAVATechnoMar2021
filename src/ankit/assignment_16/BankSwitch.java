package ankit.assignment_16;

import java.util.Scanner;

public class BankSwitch {
	int hBalance = 5000, iBalance = 6000, sBalance = 7000, bBalance = 8000;
	int hDebit=0, hCredit=0, iDebit=0, iCredit=0, sDebit=0, sCredit=0, bDebit=0, bCredit;
	static int tDebit, tCredit; 

	void creditDebit(String str, int amt, String bank) {
		switch(bank) {
		case "HDFC" :
			switch(str) {
			case "Debit" :{
				if(hBalance >= amt) {
					System.out.println("Current Balance in your "+bank+" account :"+hBalance);
					hBalance = hBalance - amt;
					System.out.println("Amount " +amt+" Debited from your "+bank+ " account");
					System.out.println("Remaining balance :"+hBalance);
					hDebit++;
					tDebit++;
					System.out.println("--------------------------------");
				}else{
					System.out.println("Insufficient fund in your "+bank+ " bank account");
					System.out.println("--------------------------------");
				}break;
			}
			case "Credit" :{
				System.out.println("Current Balance in your "+bank+" account :"+hBalance);
				System.out.println("Amount Credited : "+amt);
				hBalance = hBalance + amt;
				System.out.println("Current Balance in your "+bank+" account :"+hBalance);
				hCredit++;
				tCredit++;
				System.out.println("--------------------------------");
			}
			}break;

		case "ICICI" :
			switch(str) {
			case "Debit" :
				if(iBalance >= amt) {
					System.out.println("Current Balance in your "+bank+" account :"+iBalance);
					iBalance = iBalance - amt;
					System.out.println("Amount " +amt+" Debited from your "+bank+ " account");
					System.out.println("Remaining balance :"+iBalance);
					iDebit++;
					tDebit++;
					System.out.println("--------------------------------");
				}else{
					System.out.println("Insufficient fund in your "+bank+ " bank account");
					System.out.println("--------------------------------");
				}break;

			case "Credit" :{
				System.out.println("Current Balance in your "+bank+" account :"+iBalance);
				System.out.println("Amount Credited : "+amt);
				iBalance = iBalance + amt;
				System.out.println("Current Balance in your "+bank+" account :"+iBalance);
				iCredit++;
				tCredit++;
				System.out.println("--------------------------------");
			}
			}break;
		case "BOB" :
			switch(str) {
			case "Debit" :
				if(bBalance >= amt) {
					System.out.println("Current Balance in your "+bank+" account :"+bBalance);
					bBalance = bBalance - amt;
					System.out.println("Amount " +amt+" Debited from your "+bank+ " account");
					System.out.println("Remaining balance :"+bBalance);
					bDebit++;
					tDebit++;
					System.out.println("--------------------------------");
				}else{
					System.out.println("Insufficient fund in your "+bank+ " bank account");
					System.out.println("--------------------------------");
				}break;
			case "Credit" :{
				System.out.println("Current Balance in your "+bank+" account :"+bBalance);
				System.out.println("Amount Credited : "+amt);
				bBalance = bBalance + amt;
				System.out.println("Current Balance in your "+bank+" account :"+bBalance);
				bCredit++;
				tCredit++;
				System.out.println("--------------------------------");
			}
			}break;
		case "SBI" :
			switch(str) {
			case "Debit" :
				if(sBalance >= amt) {
					System.out.println("Current Balance in your "+bank+" account :"+sBalance);
					sBalance = sBalance - amt;
					System.out.println("Amount " +amt+" Debited from your "+bank+ " account");
					System.out.println("Remaining balance :"+sBalance);
					sDebit++;
					tDebit++;
					System.out.println("--------------------------------");
				}else{
					System.out.println("Insufficient fund in your "+bank+ " bank account");
					System.out.println("--------------------------------");
				}break;
			case "Credit" :{
				System.out.println("Current Balance in your "+bank+" account :"+hBalance);
				System.out.println("Amount Credited : "+amt);
				sBalance = sBalance + amt;
				System.out.println("Current Balance in your "+bank+" account :"+sBalance);
				sCredit++;
				tCredit++;
				System.out.println("--------------------------------");
			}
			}break;
		default :
			System.out.println("Invalid Values entered");
		}

	}
	void showTotalbalance() {
		System.out.println("*****TOTAL BALANCE*****");
		System.out.println("Total Balance of all accounts : "+(hBalance + iBalance + bBalance + sBalance));
	}
	void transactionCount() {
		System.out.println("*****TOTAL TRANSACTION COUNTS*****");
		System.out.println("Total Debit Transactions : " +tDebit);
		System.out.println("Total Credit Transactions : " +tCredit);
	} 
	void indBankCreditDebitcounts() {
		System.out.println("*****TOTAL TRANSACTION COUNTS ON BANK LEVEL*****");
		System.out.println("For your HDFC Account - Credit transaction :" +hCredit+" Debit Transactions :"+ hDebit);
		System.out.println("For your ICICI Account - Credit transaction :" +iCredit+" Debit Transactions :"+ iDebit);
		System.out.println("For your BOB Account - Credit transaction :" +bCredit+" Debit Transactions :"+ bDebit);
		System.out.println("For your SBI Account - Credit transaction :" +sCredit+" Debit Transactions :"+ sDebit);
	}
	public static void main(String[] args) {
		BankSwitch bankSwitch = new BankSwitch();
		/* The below code is valid but as we need to have multiple bank operations so hard coding the variable for methods
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what you want to perform Options: Credit/Debit :");
		String str = sc.nextLine();
		System.out.println("Enter the amount for which you want to perform " +str+ " Operation :");
		int amt = sc.nextInt();
		System.out.println("Select the bank from which you want to perform "+str+" Operation : Options(ICICI/BOB/SBI/HDFC)");
		String bankName = sc.next();
		bank.creditDebit(str, amt, bankName);
		bank.showTotalbalance();
		bank.indBankCreditcounts(bankName);
		sc.close();
		 */
		bankSwitch.creditDebit("Credit", 1000, "HDFC");
		bankSwitch.creditDebit("Debit", 1500, "HDFC");
		bankSwitch.creditDebit("Debit", 10000, "HDFC");
		bankSwitch.creditDebit("YYYY", 10000, "HDFC");
		bankSwitch.creditDebit("Debit", 10000, "ABCD");
		bankSwitch.creditDebit("Credit", 2500, "ICICI");
		bankSwitch.creditDebit("Debit", 2000, "ICICI");
		bankSwitch.creditDebit("Debit", 10000, "ICICI");
		bankSwitch.creditDebit("Credit", 10000, "XYZ");
		bankSwitch.creditDebit("Credit", 3000, "BOB");
		bankSwitch.creditDebit("Debit", 3500, "BOB");
		bankSwitch.creditDebit("Debit", 10000, "BOB");
		bankSwitch.creditDebit("Debit", 4500, "SBI");
		bankSwitch.creditDebit("Credit", 5300, "SBI");
		bankSwitch.creditDebit("Debit", 10000, "SBI");
		bankSwitch.indBankCreditDebitcounts();
		bankSwitch.transactionCount();
		bankSwitch.showTotalbalance();
	}
}


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