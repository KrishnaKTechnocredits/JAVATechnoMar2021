/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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
*/package neha_Patil.Assignment_15;

public class BankInfo {
	int idebitCnt , icreditCnt ;
	int hdebitCnt , hcreditCnt;
	int bdebitCnt , bcreditCnt;
	int sdebitCnt , screditCnt;
	static int debitCount , creditCount;
	int iBalance , hBalance , bBalance , sBalance;

	int totalIAmount=70000 , totalhAmount=50000 , totalBAmount=35000 , totalSAmount=20000;
	int totalAmount;
	public void transaction(String operation , String bank , int amt) {
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
						System.out.println("Invalid bank name");
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

	 int debitAmount(int balance ,int amt) {
		if(amt<balance) {
			totalAmount=balance-amt;
			debitCount++;
		}else {
			System.out.println("Insufficient Balance");	
		}

		return totalAmount;
	}

	 int creditAmount(int intialbalance ,int amt) {
		totalAmount=intialbalance+amt;
		creditCount++;
		return totalAmount;
	}

	public void printTotalBalance() {
		totalAmount = iBalance+hBalance+bBalance+sBalance;
		System.out.println("Total balance is "+totalAmount +" RS.");

	}

	public void printTotalTransaction() {
		System.out.println("Total transactions irrespective of Bank :");
		System.out.println("Total credit operations  "+creditCount );
		System.out.println("Total debit operations  "+debitCount );
	}

	public void forAllbanksShowCreditOperationCount() {
		System.out.println("Total transactions for credit opeartion with respect to Bank Name is as follows :");
		System.out.println("Total credit operations for bank ICICI  "+icreditCnt );
		System.out.println("Total credit operations for bank HDFC  "+hcreditCnt );
		System.out.println("Total credit operations for bank BOB  "+bcreditCnt );
		System.out.println("Total credit operations for bank SBI  "+screditCnt );
	}

	public void forAllbanksShowDebitOperationCount() {
		System.out.println("Total transactions for Debit opeartion with respect to Bank Name is as follows :");
		System.out.println("Total Debit operations for bank ICICI bank: "+ idebitCnt);
		System.out.println("Total Debit operations for bank HDFC bank: "+hdebitCnt );
		System.out.println("Total Dbit operations for bank  BOB: "+bdebitCnt );
		System.out.println("Total Debit operations for bank SBI:  "+sdebitCnt );
	}

	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.transaction("Credit","ICICI" , 400);
		bank.transaction("Credit","ICICI" , 1500);
		bank.transaction("Debit","ICICI" , 13000);
		bank.transaction("Debit","ICICI" , 12000);

		bank.transaction("Credit","HDFC" , 200);
		bank.transaction("Debit","HDFC" , 700);
		bank.transaction("Credit","HDFC" , 8000);
		bank.transaction("Debit","HDFC" , 7000);

		bank.transaction("Credit","BOB" , 100);
		bank.transaction("Credit","BOB" , 700);
		bank.transaction("Credit","BOB" , 400);
		bank.transaction("Debit","BOB" , 500);

		bank.transaction("Credit","SBI" , 500);
		bank.transaction("Debit","SBI" , 10000);
		bank.printTotalBalance();
		bank.printTotalTransaction();
		bank.forAllbanksShowCreditOperationCount();
		bank.forAllbanksShowDebitOperationCount();
	}


}
