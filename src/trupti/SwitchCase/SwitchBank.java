package trupti.SwitchCase;

public class SwitchBank {
	int iBalance=13000;
	int hBalance=15000;
	int bBalance=16000;
	int sBalance=15000;
	int iCreditCount = 0, hCreditCount = 0, bCreditCount = 0,sCreditCount=0, totalCreditCount = 0;
	int iDebitCount = 0, hDebitCount = 0, bDebitCount = 0,sDebitCount=0, totalDebitCount = 0;

	void displayDebitCredit(String bank,String op,int amt) {
		switch(op) {
		case "debit":
			switch(bank) {
			case "icici" :
				if(iBalance>=amt) {
					iBalance=iBalance-amt;}
				else {
					System.out.println("Not sufficient balance");
				}
				iDebitCount++;
				totalDebitCount++;
				break;
			case "hdfc":
				if(hBalance>=amt) {
					hBalance=hBalance-amt;}
				else {
					System.out.println("Not sufficient balance");
				}
				hDebitCount++;
				totalDebitCount++;
				break;
			case "bob" :
				if(bBalance>=amt) {
					bBalance=bBalance-amt;}
				else {
					System.out.println("Not sufficient balance");
				}
				bDebitCount++;
				totalDebitCount++;
				break;
			case "sbi" :
				if(sBalance>=amt) {
					sBalance=sBalance-amt;}
				else {
					System.out.println("Not sufficient balance");
				}
				sDebitCount++;
				totalDebitCount++;
				break;
			}
			break;
		case "credit" :
			switch(bank) {
			case "icici" :
				iBalance=iBalance+amt;
				iCreditCount++;
				totalCreditCount++;
				break;
			case "hdfc" :
				hBalance=hBalance+amt;
				hCreditCount++;
				totalCreditCount++;
				break;
			case "bob" :
				bBalance=bBalance+amt;
				bCreditCount++;
				totalCreditCount++;
				break;
			case "sbi":
				sBalance=sBalance+amt;
				sCreditCount++;
				totalCreditCount++;
				break;
			}
			break;	
			default :
				System.out.println("Invalid operation");
			break;	
		}
	}

	void totalBalance() {
		int totalBal=iBalance+hBalance+bBalance+sBalance;
		System.out.println("Total Balance is : "+totalBal);
	}
	
	void totalCreDebOperations() {
		int creditOp=iCreditCount+hCreditCount+bCreditCount+sCreditCount+totalCreditCount;
		System.out.println("Total Credit operation - "+creditOp+" times");
		int debitOp=iDebitCount+hDebitCount+bDebitCount+sDebitCount+totalDebitCount;
		System.out.println("Total Debit operation - "+debitOp+" times");
	}
	
	void totalCreditOp() {
		System.out.println("ICICI Bank credit operation: "+iCreditCount);
		System.out.println("HDFC Bank credit operation: "+hCreditCount);
		System.out.println("BOB Bank credit operation: "+bCreditCount);
		System.out.println("SBI Bank credit operation: "+sCreditCount);
	}
	void totalDebitOp() {
		System.out.println("ICICI Bank debit operation: "+iDebitCount);
		System.out.println("HDFC Bank debit operation: "+hDebitCount);
		System.out.println("BOB Bank debit operation: "+bDebitCount);
		System.out.println("SBI Bank debit operation: "+sDebitCount);
	}
	
	public static void main(String[] args) {
		SwitchBank switchbank=new SwitchBank();
		switchbank.displayDebitCredit("icici","credit",10000);
		switchbank.displayDebitCredit("icici","credit",1000);
		switchbank.displayDebitCredit("hdfc","credit",2000);
		switchbank.displayDebitCredit("hdfc","credit",1000);
		switchbank.displayDebitCredit("sbi","credit",500);
		switchbank.displayDebitCredit("bob","credit",1500);
		switchbank.displayDebitCredit("icici","debit",3000);
		switchbank.displayDebitCredit("icici","debit",10000);
		switchbank.displayDebitCredit("icici","debit",4000);
		switchbank.displayDebitCredit("hdfc","debit",2000);
		switchbank.displayDebitCredit("hdfc","debit",2500);
		switchbank.totalBalance();
		switchbank.totalCreditOp();
		switchbank.totalDebitOp();
		switchbank.totalCreDebOperations();
		switchbank.displayDebitCredit("hdfc","withdraw",2500);
	}

}
