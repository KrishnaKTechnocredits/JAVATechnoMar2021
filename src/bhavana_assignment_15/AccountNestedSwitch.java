package bhavana_assignment_15;
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
		                 SBI */

public class AccountNestedSwitch {
	
	double iciciBal,hdfcBal,bobBal,sbiBal,totalBalance;
	int totalDebitCount,totalCreditCount;
	int iciciDebitCount,hdfcDebitCount,bobDebitCount,sbiDebitCount;
	int iciciCreditCount,hdfcCreditCount,bobCreditCount,sbiCreditCount;
	String custName;
	
	void setCustomerDetails(String name) {
		custName=name;
		System.out.println(custName+"'s details are:");
	}
	
	void setInitialBalance(double icici,double hdfc,double bob,double sbi) {
		iciciBal=icici;
		hdfcBal=hdfc;
		bobBal=bob;
		sbiBal=sbi;
	}
	
	
	void debitCreditOperation(String bank, String op,double amount) {
		switch(op) {
			case"debit":
				switch(bank) {
					case"icici":
						if(iciciBal>=amount) {
							iciciBal=iciciBal-amount;
							totalDebitCount++;
							iciciDebitCount++;
						}else
							System.out.println("Not sufficient balance");
						break;
					case"hdfc":
						if(hdfcBal>=amount) {
							hdfcBal=hdfcBal-amount;
							totalDebitCount++;
							hdfcDebitCount++;
						}else
							System.out.println("Not sufficient balance");
						break;
					case"bob":
						if(bobBal>=amount) {
							bobBal=bobBal-amount;
							totalDebitCount++;
							bobDebitCount++;
						}else
							System.out.println("Not sufficinet balance");
						break;
					case"sbi":
						if(sbiBal>=amount) {
							sbiBal=sbiBal-amount;
							totalDebitCount++;
							sbiDebitCount++;
						}else
							System.out.println("Not sufficinet balance");
						break;
					default:System.out.println("Invalid input");
				}
			break;
			case"credit":		
				switch(bank) {
					case"icici":
						if(iciciBal>=amount) {
							iciciBal=iciciBal+amount;
							totalCreditCount++;
							iciciCreditCount++;
						}else
							System.out.println("Not sufficient balance");
						break;
					case"hdfc":
						if(hdfcBal>=amount) {
							hdfcBal=hdfcBal+amount;
							totalCreditCount++;
							hdfcCreditCount++;
						}else
							System.out.println("Not sufficient balance");
						break;
					case"bob":
						if(bobBal>=amount) {
							bobBal=bobBal+amount;
							totalCreditCount++;
							bobCreditCount++;
						}else
							System.out.println("Not sufficinet balance");
						break;
					case"sbi":
						if(sbiBal>=amount) {
							sbiBal=sbiBal+amount;
							totalCreditCount++;
							sbiCreditCount++;
						}else	
							System.out.println("Not sufficinet balance");
						break;
					default:System.out.println("Invalid input");
				}
		}	
	}
	
	void totalDebitCount() {
		System.out.println("Total debit count is:"+totalDebitCount);
	}
	
	void totalCreditCount() {
		System.out.println("Total credit count is:"+totalCreditCount);
	}
	
	void individualDebitCount() {
		System.out.println("ICICI debit count is:"+iciciDebitCount);
		System.out.println("HDFC debit count is:"+hdfcDebitCount);
		System.out.println("BOB debit count is:"+bobDebitCount);
		System.out.println("SBI debit count is:"+sbiDebitCount);
	}
	
	void individualCreditCount() {
		System.out.println("ICICI credit count is:"+iciciCreditCount);
		System.out.println("HDFC credit count is:"+hdfcCreditCount);
		System.out.println("BOB credit count is:"+bobCreditCount);
		System.out.println("SBI credit count is:"+sbiCreditCount);
	}
	void totalBalance() {
		totalBalance=iciciBal+hdfcBal+bobBal+sbiBal;
		System.out.println("Total balance is:"+totalBalance);		
	}			
	
	public static void main(String[] args) {
		AccountNestedSwitch ans=new AccountNestedSwitch();
		ans.setCustomerDetails("Gopal");
		ans.setInitialBalance(10000, 20000, 30000, 40000);
		ans.debitCreditOperation("icici","debit",1000);
		ans.debitCreditOperation("sbi","debit",1000);
		ans.debitCreditOperation("hdfc","debit",500);
		ans.debitCreditOperation("bob","debit",2000);
		ans.debitCreditOperation("icici","credit",4000);
		ans.debitCreditOperation("hdfc","credit",10000);
		ans.debitCreditOperation("bob","credit",1200);
		ans.debitCreditOperation("sbi","credit",2000);
		ans.individualDebitCount();
		ans.individualCreditCount();
		ans.totalDebitCount();
		ans.totalCreditCount();
		ans.totalBalance();
	}
	
}
