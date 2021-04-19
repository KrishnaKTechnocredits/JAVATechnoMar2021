package dipali;

public class NestedSwitchCase {
	
	int idebitCnt=0 , icreditCnt=0 ;
	int hdebitCnt=0 , hcreditCnt;
	int bdebitCnt=0 , bcreditCnt;
	int sdebitCnt=0 , screditCnt;
	static int debitCount=0 , creditCount=0 ;
	double iBalance , hBalance , bBalance , sBalance;
	//Explicitly set initial balance for each bank
	double totalIAmount=30000 , totalhAmount=40000 , totalBAmount=20000 , totalSAmount=30000;
	double totalAmount;
	public void doTransaction(String operation , String bank , int amt) {
		switch(operation){
			case "Debit" :
				switch(bank) {
					case "ICICI" :
						iBalance=debitAmount(totalIAmount ,amt);
						idebitCnt++;
						break;
					case "HDFC" :
						hBalance=debitAmount(totalhAmount ,amt);
						hdebitCnt++;
						break;
					case "BOB" :
						bBalance=debitAmount(totalBAmount ,amt);
						bdebitCnt++;
						break;
					case "SBI" :
						sBalance=debitAmount(totalSAmount ,amt);
						sdebitCnt++;
						break;	
					default :
						System.out.println("Invalid bank name provided  , please provide correct bank name.");
				}
				break;
			case "Credit" :
				switch(bank) {
				case "ICICI" :
					iBalance=creditAmount(totalIAmount ,amt);
					icreditCnt++;
					break;
				case "HDFC" :
					hBalance=creditAmount(totalhAmount ,amt);
					hcreditCnt++;
					break;
				case "BOB" :
					bBalance=creditAmount(totalBAmount ,amt);
					bcreditCnt++;
					break;
				case "SBI" :
					sBalance=creditAmount(totalSAmount ,amt);
					screditCnt++;
					break;	
				default :
					System.out.println("Invalid bank name provided  , please provide correct bank name.");
			}
			break;	
				
		}
	}

	public double debitAmount(double intialbalance ,int amt) {
		if(amt<intialbalance) {
			totalAmount=intialbalance-amt;
			debitCount++;
		}else {
			System.out.println("Insufficient Balance");	
		}
		
		return totalAmount;
	}
	
	public double creditAmount(double intialbalance ,int amt) {
		totalAmount=intialbalance+amt;
		creditCount++;
		return totalAmount;
	}
	
	public void printTotalBalance() {
		totalAmount = iBalance+hBalance+bBalance+sBalance;
		System.out.println("Total balance is "+totalAmount +" RS.");
		System.out.println("--------------------------------------------------------------------");
	}
	
	public void printTotalTransaction() {
		System.out.println("Total transactions irrespective of Bank :");
		System.out.println("Total credit operations  "+creditCount );
		System.out.println("Total debit operations  "+debitCount );
	}
	
	public void forAllbanksShowCreditOperationCount() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total transactions for credit opeartion with respect to Bank Name is as follows :");
		System.out.println("Total credit operations for bank ICICI  "+icreditCnt );
		System.out.println("Total credit operations for bank HDFC  "+hcreditCnt );
		System.out.println("Total credit operations for bank BOB  "+bcreditCnt );
		System.out.println("Total credit operations for bank SBI  "+screditCnt );
	}
	
	public void forAllbanksShowDebitOperationCount() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total transactions for Debit opeartion with respect to Bank Name is as follows :");
		System.out.println("Total Debit operations for bank ICICI  "+idebitCnt );
		System.out.println("Total Debit operations for bank HDFC  "+hdebitCnt );
		System.out.println("Total Debit operations for bank BOB  "+bdebitCnt );
		System.out.println("Total Debit operations for bank SBI  "+sdebitCnt );
	}

	public static void main(String[] args) {
		NestedSwitchCase nsc=new NestedSwitchCase();
		nsc.doTransaction("Credit","ICICI" , 500);
		nsc.doTransaction("Credit","ICICI" , 1000);
		nsc.doTransaction("Debit","ICICI" , 10000);
		nsc.doTransaction("Debit","ICICI" , 10000);
		
		nsc.doTransaction("Credit","HDFC" , 500);
		nsc.doTransaction("Credit","HDFC" , 1000);
		nsc.doTransaction("Debit","HDFC" , 10000);
		nsc.doTransaction("Debit","HDFC" , 10000);
		
		nsc.doTransaction("Credit","BOB" , 500);
		nsc.doTransaction("Credit","BOB" , 500);
		nsc.doTransaction("Credit","BOB" , 500);
		nsc.doTransaction("Credit","BOB" , 500);
		
		nsc.doTransaction("Credit","SBI" , 500);
		nsc.doTransaction("Debit","SBI" , 10000);
		nsc.printTotalBalance();
		nsc.printTotalTransaction();
		nsc.forAllbanksShowCreditOperationCount();
		nsc.forAllbanksShowDebitOperationCount();
	}

}
