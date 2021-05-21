package aashay.ConditionalStatement;
/*
 * Assignment - 15 : 9th April'2021

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



public class MultipleBankAccounts {
	double iciciBalance = 5000;
	double sbiBalance = 5000;
	double hdfcBalance = 5000;
	double bobBalance = 5000;
	
	int creditCountICICI,creditCountSBI,creditCountHDFC,creditCountBOB,debitCountICICI,debitCountSBI,debitCountHDFC,debitCountBOB;
	
	void accntHandling( double amount, String operation, String bank) {
		
		switch(operation) {
		case "Credit":
			if(bank.equals("ICICI")) {
					iciciBalance = iciciBalance + amount;
					System.out.println("Credited amount "+amount+" in to your ICICI bank account. Your current balane is "+iciciBalance);
					creditCountICICI++;
			}else if(bank.equals("SBI")) {
					sbiBalance = sbiBalance + amount;
					System.out.println("Credited amount "+amount+" in to your SBI bank account. Your current balane is "+sbiBalance);
					creditCountSBI++;
			}else if(bank.equals("HDFC")) {
				bobBalance = hdfcBalance + amount;
					System.out.println("Credited amount "+amount+" in to your HDFC bank account. Your current balane is "+bobBalance);
					creditCountHDFC++;
			}else if(bank.equals("BOB")) {
					bobBalance = bobBalance + amount;
					System.out.println("Credited amount "+amount+" in to your BOB bank account. Your current balane is "+bobBalance);
					creditCountBOB++;
			}
				break;
		
		case "Debit": 
			if(bank.equals("ICICI")) {
					if(amount <= iciciBalance ) {
						iciciBalance = iciciBalance - amount;
						System.out.println("Your ICICI bank account is debited by "+amount+" amount. Your current balance is : "+iciciBalance);
						debitCountICICI++;
					}else
						System.out.println("You do not have sufficient balance in your ICICI bank account");
			}else if(bank.equals("SBI")) {
				if(amount <= sbiBalance ) {
						sbiBalance = sbiBalance - amount;
						System.out.println("Your SBI bank account is debited by "+amount+" amount. Your current balance is : "+sbiBalance);
						debitCountSBI++;
					}else
						System.out.println("You do not have sufficient balance in your SBI bank account");
			 }else if(bank.equals("HDFC")) {
				if(amount <= hdfcBalance ) {
						hdfcBalance = hdfcBalance - amount;
						System.out.println("Your HDFC bank account is debited by "+amount+" amount. Your current balance is : "+hdfcBalance);
						debitCountHDFC++;
					}else
						System.out.println("You do not have sufficient balance in your HDFC bank account");
				}else if(bank.equals("BOB")) {
					if(amount <= bobBalance ) {
						bobBalance = bobBalance - amount;
						System.out.println("Your ICICI bank account is debited by "+amount+" amount. Your current balance is : "+bobBalance);
						debitCountBOB++;
					}else
						System.out.println("You do not have sufficient balance in your ICICI bank account");
				}
			break;
			
		}
		
		
	}
	void totalAllBankBalance() {
		double totalAllBankBalance = iciciBalance + sbiBalance + hdfcBalance + bobBalance;
		System.out.println("Total Bank Balance is: "+ totalAllBankBalance);
			
	}
	void operationsAll() {
		int totalCreditOperations = creditCountICICI+ creditCountSBI+ creditCountHDFC + creditCountBOB;
		System.out.println("Total Credit operations are: "+totalCreditOperations);
	}
	void individualCreditOperations() {
		System.out.println("ICICI Credit operation Count:"+creditCountICICI+"\nSBI Credit operation Count "+creditCountSBI+"\nHDFC Credit operation Count "+creditCountHDFC+"\nBOB Credit operation Count "+creditCountBOB);
		
	}
	void individualDebitOperations() {
		System.out.println("ICICI Debit operation Count:"+debitCountICICI+"\nSBI Debit operation Count "+debitCountSBI+"\nHDFC Debit operation Count "+debitCountHDFC+"\nBOB Debit operation Count "+debitCountBOB);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		MultipleBankAccounts multipleBankAccounts = new MultipleBankAccounts();
//USe below commented code for run time user inputs
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Bank : \nICICI\nHDFC\nSBI\nBOB");
		String bankNameValidate = scan.next();
			if(bankNameValidate == "ICICI" || bankNameValidate == "HDFC" || bankNameValidate == "BOB" ) {
			bankName	= bankNameValidate;
		}
		
		System.out.println("Please enter operation:Credit / Debit");
		String operationValidate = scan.next();
		while(operationValidate == "Credit" || operationValidate == "Debit") {
			operation = operationValidate;
		}
		System.out.println("Please enter amount:");
		String amountString = scan.next();
		double amountvalidate = Double.parseDouble(amountString);
		while(amountvalidate <= 0) {
			System.out.println("Please enter valid amount");
			amountString = scan.nextLine();
			continue;
		}	
		double amount = amountvalidate;
		multipleBankAccounts.accntHandling(amount, operationValidate, bankNameValidate);
		//------------------------------------------------
		System.out.println("Please enter Bank : \nICICI\nHDFC\nSBI\nBOB");
		bankNameValidate = scan.next();
		if(bankNameValidate == "ICICI" || bankNameValidate == "HDFC" || bankNameValidate == "BOB" ) {
			bankName	= bankNameValidate;
		}
		
		System.out.println("Please enter operation:Credit / Debit");
		operationValidate = scan.next();
		while(operationValidate == "Credit" || operationValidate == "Debit") {
			operation = operationValidate;
		}
		System.out.println("Please enter amount:");
		amountString = scan.next();
		amountvalidate = Double.parseDouble(amountString);
		while(amountvalidate <= 0) {
			System.out.println("Please enter valid amount");
			amountString = scan.nextLine();
			continue;
		}	
		amount = amountvalidate;
		multipleBankAccounts.accntHandling(amount, operationValidate, bankNameValidate);
		//------------------------------------------------
		System.out.println("Please enter Bank : \nICICI\nHDFC\nSBI\nBOB");
		bankNameValidate = scan.next();
		if(bankNameValidate == "ICICI" || bankNameValidate == "HDFC" || bankNameValidate == "BOB" ) {
			bankName	= bankNameValidate;
		}
		
		System.out.println("Please enter operation:Credit / Debit");
		operationValidate = scan.next();
		while(operationValidate == "Credit" || operationValidate == "Debit") {
			operation = operationValidate;
		}
		System.out.println("Please enter amount:");
		amountString = scan.next();
		amountvalidate = Double.parseDouble(amountString);
		while(amountvalidate <= 0) {
			System.out.println("Please enter valid amount");
			amountString = scan.nextLine();
			continue;
		}	
		amount = amountvalidate;
		multipleBankAccounts.accntHandling(amount, operationValidate, bankNameValidate);
		//------------------------------------------------
		System.out.println("Please enter Bank : \nICICI\nHDFC\nSBI\nBOB");
		bankNameValidate = scan.next();
		if(bankNameValidate == "ICICI" || bankNameValidate == "HDFC" || bankNameValidate == "BOB" ) {
			bankName	= bankNameValidate;
		}
		
		System.out.println("Please enter operation:Credit / Debit");
		operationValidate = scan.next();
		while(operationValidate == "Credit" || operationValidate == "Debit") {
			operation = operationValidate;
		}
		System.out.println("Please enter amount:");
		amountString = scan.next();
		amountvalidate = Double.parseDouble(amountString);
		while(amountvalidate <= 0) {
			System.out.println("Please enter valid amount");
			amountString = scan.nextLine();
			continue;
		}	
		amount = amountvalidate;
		multipleBankAccounts.accntHandling(amount, operationValidate, bankNameValidate);
		//------------------------------------------------
		System.out.println("Please enter Bank : \nICICI\nHDFC\nSBI\nBOB");
		bankNameValidate = scan.next();
		if(bankNameValidate == "ICICI" || bankNameValidate == "HDFC" || bankNameValidate == "BOB" ) {
			bankName	= bankNameValidate;
		}
		
		System.out.println("Please enter operation:Credit / Debit");
		operationValidate = scan.next();
		while(operationValidate == "Credit" || operationValidate == "Debit") {
			operation = operationValidate;
		}
		System.out.println("Please enter amount:");
		amountString = scan.next();
		amountvalidate = Double.parseDouble(amountString);
		while(amountvalidate <= 0) {
			System.out.println("Please enter valid amount");
			amountString = scan.nextLine();
			continue;
		}	
		amount = amountvalidate;
		multipleBankAccounts.accntHandling(amount, operationValidate, bankNameValidate);
		//------------------------------------------------
		scan.close();
	
*/
		multipleBankAccounts.accntHandling(1000, "Credit", "SBI");
		multipleBankAccounts.accntHandling(1000, "Credit", "SBI");
		multipleBankAccounts.accntHandling(1000, "Credit", "SBI");
		multipleBankAccounts.accntHandling(1000, "Credit", "SBI");
		multipleBankAccounts.accntHandling(2000, "Credit", "HDFC");
		multipleBankAccounts.accntHandling(2000, "Credit", "HDFC");
		multipleBankAccounts.accntHandling(2000, "Credit", "HDFC");
		multipleBankAccounts.accntHandling(2000, "Credit", "HDFC");
		multipleBankAccounts.accntHandling(2000, "Credit", "HDFC");
		multipleBankAccounts.accntHandling(2000, "Credit", "HDFC");
		multipleBankAccounts.accntHandling(3000, "Credit", "SBI");
		multipleBankAccounts.accntHandling(3000, "Credit", "SBI");
		multipleBankAccounts.accntHandling(1000, "Credit", "BOB");
		multipleBankAccounts.accntHandling(1000, "Debit", "SBI");
		multipleBankAccounts.accntHandling(1000, "Debit", "SBI");
		multipleBankAccounts.accntHandling(1000, "Debit", "HDFC");
		multipleBankAccounts.accntHandling(1000, "Debit", "HDFC");
		multipleBankAccounts.accntHandling(1000, "Debit", "HDFC");
		multipleBankAccounts.accntHandling(1000, "Debit", "ICICI");
		multipleBankAccounts.accntHandling(1000, "Debit", "ICICI");
		multipleBankAccounts.totalAllBankBalance();
		multipleBankAccounts.operationsAll();
		multipleBankAccounts.individualCreditOperations();
		multipleBankAccounts.individualDebitOperations();
		
		

	}

}
