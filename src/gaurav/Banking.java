package gaurav;

public class Banking {
	static int iciciBalance =10000;
	static int hdfcBalance =15000;
	static int bobBalance =14000;
	static int sbiBalance =16000;
	
	static int totalDebitCount;
	static int totalCreditCount;
	
	int iciciCreditCount=0, hdfcCreditCount=0,bobCreditCount=0 ,sbiCreditCount=0;
	int iciciDebitCount=0, hdfcDebitCount=0,bobDebitCount=0 ,sbiDebitCount=0;
    
	
	void operation(String bank,String op,int amt){
		switch(op){
			case "debit":
				switch(bank){
					case"icici":
						if(iciciBalance>=amt) {
							iciciBalance = iciciBalance-amt;
						    iciciDebitCount++;
						}else
							System.out.println("insufficient balance in icici account");
						break;
						
					case "hdfc":
						if(hdfcBalance >= amt) {
							hdfcBalance = hdfcBalance - amt;
							hdfcDebitCount++;
						}else 
							System.out.println("insufficient balance in hdfc account");
						break;
						
					 case "bob":
					   if (bobBalance >=amt){
						   bobBalance = bobBalance - amt;
						   bobDebitCount++;
					   }else
						   System.out.println("insufficient balance in bob account");
					   break;
					   
					 case "sbi":
						 if(sbiBalance >=amt) {
							sbiBalance = sbiBalance - amt;
						    sbiDebitCount++;
						 }else
							System.out.println("insufficient balance in sbi account");
					 break;	 
					 default:
						 System.out.println("Debit Opration not allowed");
			    			 
				}
				break;
				
			case "credit":
				switch(bank){
					case"icici":
						iciciBalance=iciciBalance+amt;
						iciciCreditCount++;
						break;
						
					case "hdfc":
						hdfcBalance=hdfcBalance+amt;
					    hdfcCreditCount++;
					    break;
					    
					 case "bob":
						 hdfcBalance=hdfcBalance+amt;
						 hdfcCreditCount++;
						 break;
					   
					 case "sbi":
						 sbiBalance=sbiBalance+amt;
						 sbiCreditCount++;
					     break;
					     
					  default:
						  System.out.println("credit opration not allowed");
				break;		  
				}
		}
	}
	
	void showTotalBalance() {
		double showTotalBalance=iciciBalance+hdfcBalance+bobBalance+sbiBalance;
		System.out.println("Overall Total Balance is: "+showTotalBalance);
	}
	
	void ShowTotalCreditDebitOp(){
		totalDebitCount=iciciDebitCount+hdfcDebitCount+bobDebitCount+sbiDebitCount;
		System.out.println("Total Debit opreation count is: "+totalDebitCount);
		totalCreditCount=iciciCreditCount+hdfcCreditCount+bobCreditCount+sbiCreditCount;
		System.out.println("Total Credit opreation count is: "+totalCreditCount);
	}
    
	void showIndividualBankCreditOp(){
		System.out.println("ICICI bank credit opration -"+iciciCreditCount);
		System.out.println("HDFC bank credit opration -"+hdfcCreditCount);
		System.out.println("BOB bank credit opration -"+bobCreditCount);
		System.out.println("SBI bank credit opration -"+hdfcCreditCount);
	}
	
	void showIndividualBankDebitOp(){
		System.out.println("ICICI bank Debit opration -"+iciciDebitCount);
		System.out.println("HDFC bank Debit opration -"+hdfcDebitCount);
		System.out.println("BOB bank Debit opration -"+bobDebitCount);
		System.out.println("SBI bank Debit opration -"+hdfcDebitCount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking banking = new Banking();
		banking.operation("icici", "Debit", 1000);
		System.out.println("Balance in icici bank account is "+iciciBalance);
		banking.operation("hdfc", "Debit", 1500);
		System.out.println("Balance in hdfc bank account is "+iciciBalance);
		banking.operation("bob", "Debit", 1000);
		System.out.println("Balance in icici bank account is "+iciciBalance);
		banking.operation("sbi", "Debit", 1500);
		System.out.println("Balance in sbi bank account is "+sbiBalance);
		System.out.println("==============================================");
		
		
		banking.operation("icici", "Credit", 500);
		System.out.println("Balance in icici bank account is "+iciciBalance);
		banking.operation("hdfc", "Credit", 600);
		System.out.println("Balance in hdfc bank account is "+iciciBalance);
		banking.operation("bob", "Credit", 700);
		System.out.println("Balance in bob bank account is "+sbiBalance);
		banking.operation("sbi","credit",800);
		System.out.println("Balance in icici bank account is "+iciciBalance);
		System.out.println("==============================================");
		
		banking.ShowTotalCreditDebitOp();
		System.out.println("============================================");
		
		banking.showIndividualBankCreditOp();
		System.out.println("=============================================");
		
		banking.showIndividualBankDebitOp();
		System.out.println("=============================================");
		
		banking.showTotalBalance();
		
	}

}