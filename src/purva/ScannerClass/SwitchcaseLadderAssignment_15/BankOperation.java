package purva.ScannerClass.SwitchcaseLadderAssignment_15;

public class BankOperation {

	int iciciBalance =5000;
	int hdfcBalance = 9000;
	int bobBalance =8000;
	int sbiBalance =700;
	
	int debitCounticici=0,debitCounthdfc=0,debitCountbob=0,debitCountsbi=0,creditCounticici=0,creditCounthdfc=0,creditCountbob=0,creditCountsbi=0;
	static int totalDebitCount=0, totalCreditCount=0;
	void operation(String bankName,String transactionType,int amount) {
		switch(transactionType) {
		case "Debit":
			switch(bankName) {
			case "ICICI":
				if(iciciBalance>=amount) {
				   iciciBalance = iciciBalance - amount;
				   debitCounticici++;
				   totalDebitCount++;
				}
				else
					System.out.println("No sufficient amount");
			break;
			
			case "HDFC":
				if(hdfcBalance>=amount) {
					hdfcBalance = hdfcBalance - amount;
					debitCounthdfc++;
					totalDebitCount++;
					}
				else
					System.out.println("No sufficient amount");
			break;
				
			case "BOB":
				if(bobBalance>=amount) {
					bobBalance = bobBalance - amount;
					debitCountbob++;
					totalDebitCount++;
					}
                else
					System.out.println("No sufficient amount");
			break;
			
			case "SBI":
				if(sbiBalance>=amount) {
					sbiBalance = sbiBalance - amount;
					debitCountsbi++;
					totalDebitCount++;
					}
				else
					System.out.println("No sufficient amount");
			break;
			
			}
		break;
		
		case "Credit":
			switch(bankName) {
			case "ICICI":
				iciciBalance += amount;
				creditCounticici++;
				totalCreditCount++;
				
			break;
			
			case "HDFC":
				hdfcBalance += amount;
				creditCounthdfc++;
				totalCreditCount++;
				
			break;
			
			case "BOB":
				bobBalance += amount;
				creditCountbob++;
				totalCreditCount++;
				
			break;
			
			case "SBI":
				sbiBalance += amount;
				creditCountsbi++;
				totalCreditCount++;
				
			break;
			}
		//default :
			//System.out.println("operations are not allowed ");
		}
    }
	
	void showTotalBalance() {
		int totalBalance = iciciBalance+hdfcBalance+sbiBalance+bobBalance;
		System.out.println("Total Balance of all 4 accounts is "+totalBalance);
	}
	
	void totalCreditDebit() {
		System.out.println("Total credit operation is "+totalCreditCount);
		System.out.println("Total debit operation is "+totalDebitCount);
	}
	
	void individualBankCredit() {
		System.out.println("ICICI total credit operation is: "+creditCounticici);
		System.out.println("HDFC total credit operation is: "+creditCounthdfc);
		System.out.println("BOB total credit operation is: "+creditCountbob);
		System.out.println("SBI total credit operation is: "+creditCountsbi);
		}
	
	void individualBankDebit() {
		System.out.println("ICICI total dedit operation is: "+debitCounticici);
		System.out.println("HDFC total dedit operation is: "+debitCounthdfc);
		System.out.println("BOB total dedit operation is: "+debitCountbob);
		System.out.println("SBI total dedit operation is: "+debitCountsbi);
		}
	
	public static void main(String[] args) {
		BankOperation bankOperation = new BankOperation();
		bankOperation.operation("HDFC","Debit",500);
		bankOperation.operation( "BOB","Credit",100);
		bankOperation.operation("SBI", "Credit", 7000);
		bankOperation.operation("ICICI", "Debit", 600);
		bankOperation.operation("HDFC", "Debit", 1000);
		
		bankOperation.showTotalBalance();
		bankOperation.totalCreditDebit();
		bankOperation.individualBankCredit();
		bankOperation.individualBankDebit();
		
	}
	
	
}
