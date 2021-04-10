package surabhi.assignment15_16;

import java.util.Scanner;

public class BankAccount {

	String Customername;
	int currentICBal, currentHDFCbal, currentBOIbal, currentSBIbal;
	int debitHDFC, creditHDFC, debitSBI, creditSBI, debitBOI, creditBOI, debitIC, creditIC;
	static int debitAmtCount, creditAmtCount;
	
	void setInitialBalance(int balICICI, int balHDFC, int balSBI, int balBOI) {
		currentICBal=balICICI;
		currentHDFCbal=balHDFC;
	}
	
	void processDetails(String bankName, String operation, int amount) {
		bankName=bankName.toLowerCase();
		operation=operation.toLowerCase();
				switch(bankName) {
					case "hdfc":
						switch(operation) {
						case "debit":
							if(currentHDFCbal>=amount) {
								currentHDFCbal=currentHDFCbal-amount;
								debitHDFC++;
								debitAmtCount++;
							}else {
								System.out.println("insufficient funds");
							}
							break;
						case "credit":
							currentHDFCbal=currentHDFCbal+amount;
							creditHDFC++;
							creditAmtCount++;
							break;
						}
						
					case "sbi":
						switch(operation) {
							case "debit":
								if(currentSBIbal>=amount) {
									currentSBIbal=currentSBIbal-amount;
								debitSBI++;
								debitAmtCount++;
								}else {
									System.out.println("insufficient funds");
								}
								break;
							case "credit":
								currentSBIbal=currentSBIbal+amount;
								creditSBI++;
								creditAmtCount++;
								break;
						}
					
					case "boi":
						switch(operation) {
							case "debit":
								if(currentBOIbal>=amount) {
									currentBOIbal=currentBOIbal-amount;
									debitBOI++;
									debitAmtCount++;
								}else {
									System.out.println("insufficient funds");
								}
								break;
							case "credit":
								currentBOIbal=currentBOIbal+amount;
								creditBOI++;
								creditAmtCount++;
								break;
						}
					
					case "icici":
						switch(operation) {
							case "debit":
								if(currentICBal>=amount) {
									currentICBal=currentICBal-amount;
									debitIC++;
									debitAmtCount++;
								}else {
									System.out.println("insufficient funds");
								}
								break;
							case "credit":
								currentICBal=currentICBal+amount;
								creditIC++;
								creditAmtCount++;
								break;
						}
						
					default:
						System.out.println("Invalid bank name");
				}
		
	}
	void printTotalBalance() {
		System.out.println("Total balance is :"+(currentBOIbal+currentHDFCbal+currentSBIbal+currentICBal));
	}
	
	void printTotaloperations() {
		System.out.println("Total current balance of bank HDFC :"+currentHDFCbal);
		System.out.println("Total current balance of bank ICICI :"+currentICBal);
		System.out.println("Total current balance of bank BOI :"+currentBOIbal);
		System.out.println("Total current balance of bank SBI :"+currentSBIbal);
	}
	
	void totalTransactionDetails() {
		System.out.println("Total credit operations: "+creditAmtCount);
		System.out.println("Total debit operations: "+debitAmtCount);
		
	}
	
	void allIndividualDebits() {
		 System.out.println("ICICI bank debit operations :"+debitIC);
		 System.out.println("HDFC bank debit operations :"+debitHDFC);
		 System.out.println("BOI bank debit operations :"+debitBOI);
		 System.out.println("SBI bank debit operations :"+debitSBI);
	}
	
	void allIndividualCredits() {
		 System.out.println("ICICI bank credit operations :"+creditIC);
		 System.out.println("HDFC bank credit operations :"+creditHDFC);
		 System.out.println("BOI bank credit operations :"+creditBOI);
		 System.out.println("SBI bank credit operations :"+creditSBI);
	}
	public static void main(String[] args) {
		int amount=0;
		String bankName, operation;
		BankAccount bankAccount=new BankAccount();
		bankAccount.setInitialBalance(1000, 2000, 3000, 2000);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter bank name : ");
		bankName=scanner.next();
		System.out.println("Please enter the banking operation mode :");
		operation=scanner.next();
		
		if(operation.toLowerCase().equalsIgnoreCase("debit")) {
			System.out.println("Please enter the debit amount");
			amount=scanner.nextInt();
		}
		else if(operation.toLowerCase().equalsIgnoreCase("credit")){		
			System.out.println("Please enter the credit amount");
			amount=scanner.nextInt();
		}
		bankAccount.processDetails(bankName, operation, amount);
		bankAccount.processDetails(bankName, operation, amount);
		
		BankAccount bankAccount1=new BankAccount();
		System.out.println("Please enter bank name : ");
		bankName=scanner.next();
		System.out.println("Please enter the banking operation mode :");
		operation=scanner.next();
		
		if(operation.toLowerCase().equalsIgnoreCase("debit")) {
			System.out.println("Please enter the debit amount");
			amount=scanner.nextInt();
		}
		else if(operation.toLowerCase().equalsIgnoreCase("credit")){		
			System.out.println("Please enter the credit amount");
			amount=scanner.nextInt();
		}
		
		bankAccount1.processDetails(bankName, operation, amount);
		bankAccount1.processDetails(bankName, operation, amount);
		
		bankAccount.printTotalBalance();
		bankAccount1.printTotalBalance();
		bankAccount.totalTransactionDetails();
		bankAccount.allIndividualCredits();
		bankAccount.allIndividualDebits();
		bankAccount1.allIndividualCredits();
		bankAccount1.allIndividualDebits();
		
		
	}
}