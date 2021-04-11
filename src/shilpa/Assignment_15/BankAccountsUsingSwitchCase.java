package shilpa.Assignment_15;

import java.util.Scanner;
public class BankAccountsUsingSwitchCase {
	int iciciBal, hdfcBal, bobBal, sbiBal;
	String bankname;
	int iciDebitCnt = 0, hdfcDebitCnt = 0, bobDebitCnt = 0, sbiDebitCnt = 0;
	int iciCreditCnt = 0, hdfcCreditCnt = 0, bobCreditCnt = 0, sbiCreditCnt = 0;
	int totalDebitAttempt = 0;
	int totalCreditAttempt = 0;

	public void debitCreditOps(String operation, String bank, int amt) {
		bankname=bank;
		switch (operation.toUpperCase()) {
		
//******************* Debit Operation **********************
		case "DEBIT":
			switch (bankname.toUpperCase()) {
			case "ICICI":
				if (iciciBal >= amt) {
					iciciBal = iciciBal - amt;
					iciDebitCnt++;
					totalDebitAttempt++;
				} else
					System.out.println("Not sufficient balance");
				break;
			case "HDFC":
				if (hdfcBal >= amt) {
					hdfcBal = hdfcBal - amt;
					hdfcDebitCnt++;
					totalDebitAttempt++;
				} else
					System.out.println("Not sufficient balance");
				break;

			case "BOB":
				if (bobBal >= amt) {
					bobBal = bobBal - amt;
					bobDebitCnt++;
					totalDebitAttempt++;
				} else
					System.out.println("Not sufficient balance");
				break;

			case "SBI":
				if (sbiBal >= amt) {
					sbiBal = sbiBal - amt;
					sbiDebitCnt++;
					totalDebitAttempt++;
				} else
					System.out.println("Not sufficient balance");
				break;
			default:
				System.out.println("Enter valid bank name");
				break;

			}
			break;
// ***************Credit Operation******************************************
		case "CREDIT":
			switch (bankname.toUpperCase()) {
			case "ICICI":
				iciciBal = iciciBal + amt;
				iciCreditCnt++;
				totalCreditAttempt++;
				break;
			case "HDFC":
				hdfcBal = hdfcBal + amt;
				System.out.println(hdfcBal);
				hdfcCreditCnt++;
				totalCreditAttempt++;
				break;

			case "BOB":
				bobBal = bobBal + amt;
				bobCreditCnt++;
				totalCreditAttempt++;
				break;

			case "SBI":
				sbiBal = sbiBal + amt;
				sbiCreditCnt++;
				totalCreditAttempt++;
				break;
			default:
				System.out.println("Enter valid bank name");
				break;
			}
			break;
		default:
			System.out.println("Enter valid operation");
			break;

		}

	}

	public void totalBalance(String bank) {
		bankname = bank;
		switch (bankname.toUpperCase()) {
		case "ICICI":
			System.out.println("Total Balance ICICI Bank:- " + iciciBal);
			break;
		case "HDFC":
			System.out.println("Total Balance HDFC Bank:- " + hdfcBal);
			break;
		case "BOB":
			System.out.println("Total Balance BOB Bank:- " + bobBal);
			break;
		case "SBI":
			System.out.println("Total Balance SBI Bank:- " + sbiBal);
			break;
		}
	}

	public void totalCrDrOps() {

		System.out.println("Total Debit Operations:-" + totalDebitAttempt);
		System.out.println("Total Credit Operations:-" + totalCreditAttempt);

	}

	public void individualBankCrOps(String bank) {
		System.out.println("ICICI Bank Credit Operations:- " + iciCreditCnt);
		System.out.println("HDFC Bank Credit Operations:- " + hdfcCreditCnt);
		System.out.println("BOB Bank Credit Operations:- " + bobCreditCnt);
		System.out.println("SBI Bank Credit Operations:- " + sbiCreditCnt);

	}
	public void individualBankDrOps(String bank) {
			System.out.println("ICICI Bank Debit Operations:- " + iciDebitCnt);
			System.out.println("HDFC Bank Debit Operations:- " + hdfcDebitCnt);
			System.out.println("BOB Bank Debit Operations:- " + bobDebitCnt);
			System.out.println("SBI Bank CrDebitedit Operations:- " + sbiDebitCnt);
	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccountsUsingSwitchCase bank = new BankAccountsUsingSwitchCase();
		String input1 = "";
		do {
		System.out.println("Enter Operation(Credit/Debit):-");
		String operation = scanner.nextLine();
		System.out.println("Enter Bank Name/;-");
		String bankname = scanner.nextLine();
		System.out.println("Enter "+operation+" amount");
		int amount = scanner.nextInt();
		bank.debitCreditOps(operation, bankname, amount);
		bank.totalBalance(bankname);
		bank.totalCrDrOps();
		bank.individualBankCrOps(bankname);
		bank.individualBankDrOps(bankname);
		System.out.println("Do you want to continue:-");
		input1=scanner.next();
		scanner.nextLine();
		}while(input1.equals("y"));
		scanner.close();
	}

}
