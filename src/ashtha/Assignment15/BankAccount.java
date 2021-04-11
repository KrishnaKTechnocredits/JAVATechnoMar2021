/*Assignment 15 - 9th April
 * Bank program by taking input from the user */
package ashtha.Assignment15;

import java.util.Scanner;

public class BankAccount {
	double iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	int iciciDebitCount = 0, hdfcDebitCount = 0, bobDebitCount = 0 , sbiDebitCount = 0;
	int iciciCreditCount = 0, hdfcCreditCount =0, bobCreditCount =0, sbiCreditCount =0 ;
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	double totalBalance;
	
//Method to perform bank operation (credit or debit) as per user selection
	
	void transaction (String bank,String operation, double amount) {
		bank = bank.toUpperCase();
		operation = operation.toUpperCase();
		switch(operation) {
			case "DEBIT":
				switch (bank) {
					case "ICICI":
						if (amount<= iciciBalance) {
							iciciBalance = iciciBalance - amount;
							iciciDebitCount++;
							totalDebitCount++;
						}
						else 
							System.out.println("Insufficient balance");
						break;
					case "HDFC":
						if (amount<= hdfcBalance) {
							hdfcBalance = hdfcBalance - amount;
							hdfcDebitCount++;
							totalDebitCount++;
						}
						else
							System.out.println("Insufficient balance");
						break;
					case "BOB":
						if (amount<= bobBalance) {
							bobBalance = bobBalance - amount;
							bobDebitCount++;
							totalDebitCount++;
						}
						else
							System.out.println("Insufficient balance");
						break;
					case "SBI":
						if (amount<= sbiBalance) {
							sbiBalance = sbiBalance - amount;
							sbiDebitCount++;
							totalDebitCount++;
						}
						else
							System.out.println("Insufficient balance");
						break;
					default :
						System.out.println("Please select the correct bank");
						break;
				}
				break;
			case "CREDIT" : 
				switch (bank) {
					case "ICICI":
						if (amount>0)
							iciciBalance = iciciBalance + amount;
							iciciCreditCount++;
							totalCreditCount++;			
					break;
					case "HDFC":
						if (amount>0)
							hdfcBalance = hdfcBalance + amount;
							hdfcCreditCount++;
							totalCreditCount++;
					break;
					case "BOB":
						if (amount>0)
							bobBalance = bobBalance + amount;
							bobCreditCount++;
							totalCreditCount++;
					break;
					case "SBI":
						if (amount>0)
							sbiBalance = sbiBalance + amount;
							sbiCreditCount++;
							totalCreditCount++;
					break;
					default:
					System.out.println("Please select the correct bank");
					break;
				}
			break;
			default:
				System.out.println("Please enter either debit or credit operation");
				break;
		}
	}

//Method to set balance on bank accounts
	
	void setBalance(double iBalance, double hBalance, double bBalance, double sBalance) {
		iciciBalance = iBalance;
		hdfcBalance = hBalance;
		bobBalance = bBalance;
		sbiBalance = sBalance;
	}

//Method to calculate total balance of bank accounts	
	
	void totalBalance () {
		totalBalance = iciciBalance+hdfcBalance+bobBalance+sbiBalance;
		System.out.println("Total Balance is : "+totalBalance);
	}

//Method to calculate total credit and debit count
	
	void totalCreditDebitOp() {
		System.out.println("Total Credit Operation - "+totalCreditCount+" times");
		System.out.println("Total Debit Operation - "+totalDebitCount+" times");
	}

//Method to calculate individual bank's credit operation	
	
	void individualBankCreditOp() {
		System.out.println("ICICI Bank Credit Operation - "+iciciCreditCount);
		System.out.println("HDFC Bank Credit Operation - "+hdfcCreditCount);
		System.out.println("SBI Bank Credit Operation - "+sbiCreditCount);
		System.out.println("BOB Bank Credit Operation - "+bobCreditCount);
	}

//Method to calculate individual bank's debit operation	
	
	void individualBankDebitOp() {
		System.out.println("ICICI Bank Debit Operation - "+iciciDebitCount);
		System.out.println("HDFC Bank Debit Operation - "+hdfcDebitCount);
		System.out.println("SBI Bank Debit Operation - "+sbiDebitCount);
		System.out.println("BOB Bank Debit Operation - "+bobDebitCount);
		
	}
	
//Method to take input from user for bank selection in order to pass the value to Transaction method	
	
	String bankSelection() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the bank name");
		String selectedBank = scanner.nextLine();
		return selectedBank;
	}

//Method to take input from user for operation selection in order to pass the value to Transaction method	
	
	String operationSelection() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the operation to perform");
		String op = scanner.nextLine();
		return op;
	}

//Method to take input from user for amount in order to pass the value to Transaction method	
	
	int inputAmount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the amount");
		int transactionAmount = scanner.nextInt();
		return transactionAmount;
	}
	
	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount();
		BankAccount bankAccount2 = new BankAccount();
		bankAccount1.setBalance(50000,40000,30000,20000);
		String bank1 = bankAccount1.bankSelection();
		String operation1 = bankAccount1.operationSelection();
		int amount1 = bankAccount1.inputAmount();
		System.out.println("Bank Account details for customer 1.");
		bankAccount1.transaction(bank1,operation1,amount1);
		bankAccount1.transaction("hdfc","credit",2000);
		bankAccount1.transaction("icici","debit",5000);
		bankAccount1.transaction("bob","debit",5000);
		bankAccount1.transaction("sbi","credit",4000);
		bankAccount1.transaction("hdfc","credit",2900.50);
		bankAccount1.transaction("icici","credit",3300.75);
		bankAccount1.transaction("bob","credit",9000.50);
		bankAccount1.transaction("sbi","debit",2250.25);
		bankAccount1.totalBalance();
		bankAccount1.individualBankCreditOp();
		bankAccount1.individualBankDebitOp();
		bankAccount2.setBalance(50000,40000,30000,20000);
		String bank2 = bankAccount2.bankSelection();
		String operation2 = bankAccount2.operationSelection();
		int amount2 = bankAccount2.inputAmount();
		System.out.println("Bank Account details for customer 2");
		bankAccount2.transaction(bank2,operation2,amount2);
		bankAccount2.transaction("hdfc","debit",8000);
		bankAccount2.transaction("icici","debit",800);
		bankAccount2.transaction("bob","credit",7025);
		bankAccount2.transaction("sbi","credit",1075);
		bankAccount2.transaction("hdfc","credit",9800.50);
		bankAccount2.transaction("icici","credit",3700.75);
		bankAccount2.transaction("bob","debit",700.50);
		bankAccount2.transaction("sbi","debit",250.25);
		bankAccount2.totalBalance();
		bankAccount2.individualBankCreditOp();
		bankAccount2.individualBankDebitOp();
		bankAccount2.totalCreditDebitOp();		
	}
}
