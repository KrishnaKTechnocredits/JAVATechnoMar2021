package mayur.assignment15;

public class SwitchBank {
	int iBalance=25000;
	int hBalance=20000;
	int bBalance=10000;
	int sBalance=15000;
	int iCreditCount = 0, hCreditCount = 0, bCreditCount = 0,sCreditCount=0, totalCreditCount = 0;
	int iDebitCount = 0, hDebitCount = 0, bDebitCount = 0,sDebitCount=0, totalDebitCount = 0;

	void displayDebitCredit(String bank,String op,int amt) {
		switch(op) {
		case "debit":
			switch(bank) {
			case "ICICI" :
				if(iBalance>=amt) {
					iBalance=iBalance-amt;}
				else {
					System.out.println("Not sufficient balance");
				}
				iDebitCount++;
				totalDebitCount++;
				break;
			case "HDFC":
				if(hBalance>=amt) {
					hBalance=hBalance-amt;}
				else {
					System.out.println("Not sufficient balance");
				}
				hDebitCount++;
				totalDebitCount++;
				break;
			case "BOB" :
				if(bBalance>=amt) {
					bBalance=bBalance-amt;}
				else {
					System.out.println("Not sufficient balance");
				}
				bDebitCount++;
				totalDebitCount++;
				break;
			case "SBI" :
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
			case "ICICI" :
				iBalance=iBalance+amt;
				iCreditCount++;
				totalCreditCount++;
				break;
			case "HDFC" :
				hBalance=hBalance+amt;
				hCreditCount++;
				totalCreditCount++;
				break;
			case "BOB" :
				bBalance=bBalance+amt;
				bCreditCount++;
				totalCreditCount++;
				break;
			case "SBI":
				sBalance=sBalance+amt;
				sCreditCount++;
				totalCreditCount++;
				break;
			}
			break;	
			default :
				System.out.println(" Enter valid operation");
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
		switchbank.displayDebitCredit("ICICI","credit",10000);
		switchbank.displayDebitCredit("ICICI","credit",1000);
		switchbank.displayDebitCredit("HDFC","credit",2000);
		switchbank.displayDebitCredit("HDFC","credit",1000);
		switchbank.displayDebitCredit("SBI","credit",500);
		switchbank.displayDebitCredit("BOB","credit",1500);
		switchbank.displayDebitCredit("ICICI","debit",3000);
		switchbank.displayDebitCredit("ICICI","debit",10000);
		switchbank.displayDebitCredit("ICICI","debit",4000);
		switchbank.displayDebitCredit("HDFC","debit",2000);
		switchbank.displayDebitCredit("HDFC","debit",2500);
		switchbank.totalBalance();
		switchbank.totalCreditOp();
		switchbank.totalDebitOp();
		switchbank.totalCreDebOperations();
		switchbank.displayDebitCredit("ICICI","withdraw",2500);
	}

}
