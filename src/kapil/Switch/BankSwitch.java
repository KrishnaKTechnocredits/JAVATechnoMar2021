/*Assignment - 15 : 9th April'2021

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
package kapil.Switch;

public class BankSwitch {
       int iciciBalance = 40000;
       int bobBalance = 30000;
       int sbiBalance = 20000;
       int hdfcBalance = 10000;
       
   int iciciDebitCount = 0, iciciCreditCount = 0,bobDebitCount = 0, bobCreditCount = 0, sbiDebitCount = 0, sbiCreditCount = 0, hdfcDebitCount=0, hdfcCreditCount=0;    
   int totalDebitCount, totalCreditCount;
   
   
   void operation1(String bank, String op, int amt) {
	   switch(op) {
	     case"Debit" :
		   switch (bank) {
		   case "icici" :
	    	   if(iciciBalance>= amt) {
	    		   iciciBalance = iciciBalance - amt;
	          	   iciciDebitCount = iciciDebitCount + 1;	
				   totalDebitCount = totalDebitCount + 1;
				   System.out.println("icici debit amount is "+iciciBalance);
				   }
		
	    	   else
	    		   System.out.println("Balance is not sufficient ");
	    	   break;
		   case "bob" :
	    	   if(bobBalance>= amt) {
	    		   bobBalance = bobBalance - amt;
	    	   bobDebitCount = bobDebitCount + 1;	
			   totalDebitCount = totalDebitCount + 1;  
	    	   System.out.println("bob debit amount is "+bobBalance);} 
	    	   else
	    		   System.out.println("Balance is not sufficient ");
	    	   break;
		   case "sbi" :
	    	   if(sbiBalance>= amt) {
	    		   sbiBalance = sbiBalance - amt;
	    	   sbiDebitCount = sbiDebitCount + 1;	
			   totalDebitCount = totalDebitCount + 1;
	    	   System.out.println("sbi debit amount is "+sbiBalance);}
	    	   else
	    		   System.out.println("Balance is not sufficient ");
	    	   break;
		   case "hdfc" :
	    	   if(hdfcBalance>= amt) {
	    		   hdfcBalance = hdfcBalance - amt;
	    	   hdfcDebitCount = hdfcDebitCount + 1;	
			   totalDebitCount = totalDebitCount + 1;
			   System.out.println("hdfc debit amount is "+hdfcBalance);
		   }else
	    		   System.out.println("Balance is not sufficient ");
	    	   break;}
		   break;
	   }   	    	   
		   
		  
	   } 
	   void operation2(String bank, String op, int amount) {
	   switch(op) {
	     case"Credit" :
		   switch (bank) {
		   case "icici": 
		      if(amount <= iciciBalance ) {
			     iciciBalance =iciciBalance + amount;
			     iciciCreditCount = iciciCreditCount + 1;
			     totalCreditCount = totalCreditCount + 1 ;
		         System.out.println("Credit amount is "+iciciBalance);}
		         else
		        	 System.out.println("Balance is not Sufficient");
		          break;
		   
		 case "bob": 
			   if(amount <= bobBalance ) {
				     bobBalance =bobBalance + amount;
				     bobCreditCount = bobCreditCount + 1;
				     totalCreditCount = totalCreditCount + 1 ;
			         System.out.println("Credit amount is "+bobBalance);}
			      else
			        	 System.out.println("Balance is not Sufficient");
			          break;
	     case "sbi": 
	    	 if(amount <= sbiBalance ) {
				     sbiBalance = sbiBalance + amount;
				     sbiCreditCount = sbiCreditCount + 1;
				     totalCreditCount = totalCreditCount + 1 ;
				         System.out.println("Credit amount is "+sbiBalance);}
				      else
				    	  System.out.println("Balance is not Sufficient");
				          break;
		case "hdfc": 
			  if(amount <= hdfcBalance ) {
			     hdfcBalance =hdfcBalance + amount;
			    		 hdfcCreditCount = hdfcCreditCount + 1;
						  totalCreditCount = totalCreditCount + 1 ;
					         System.out.println("Credit amount is "+hdfcBalance);}
					      else
					         System.out.println("Balance is not Sufficient");
					       break;}   
	   
	   }
	    
	   }
	   void totalbal() {
		   System.out.println("Total balance is " +(iciciBalance+ bobBalance+sbiBalance+hdfcBalance));
	   }
	   void debitCreditoperation() {
		   System.out.println("total debit operation " +totalDebitCount);
		   System.out.println("total credit operation "+totalCreditCount);
	   }
	   void individualDebit() {
		   System.out.println("icici debit count :" +iciciDebitCount);
		   
	   }
	   
	   void individualCredit() {
		   System.out.println("icici credit count "+iciciCreditCount);
		   System.out.println("bob credit count "+bobCreditCount);
	   }
	   
	public static void main(String[] Args) {
		BankSwitch bs = new BankSwitch();
		bs.operation1("icici","Debit", 5000);
		bs.operation1("icici","Debit", 3000);
		bs.operation1("bob","Debit", 6000);
		bs.operation1("sbi","Debit", 7000);
		bs.operation1("hdfc","Debit", 3000);
		bs.operation2("icici", "Credit", 5500);
		bs.operation2("bob", "Credit", 6500);
		bs.operation2("sbi", "Credit", 7500);
		bs.operation2("hdfc", "Credit", 8500);
		bs.operation2("icici", "Credit", 6500);
	    bs.operation2("icici", "Credit", 9500);
	    bs.operation2("icici", "Credit", 8500);
	    bs.totalbal();
	    bs.debitCreditoperation();
	    bs.individualDebit();
	    bs.individualCredit();
	}
	}
