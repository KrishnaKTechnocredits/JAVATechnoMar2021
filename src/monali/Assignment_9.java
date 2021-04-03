package monali;

public class assignment_9 {
	
	String name;
    int totalBalance;
    int debitCount = 0;
    int creditCount = 0;
    static int totalDebitCount = 0;
    static int totalCreditCount = 0;
    static int pBCount=0,totalPBCount=0;
    
    
    void setCustInfo(int initialBal,String custName) {
    	totalBalance = initialBal;
    	name = custName;
    }
    
    void amtDebited(int num) {
    	if(num <=totalBalance) {
    		System.out.println("Sorry don't have sufficient balance");
    	}
    	else {
    		totalBalance = totalBalance - num;
    		debitCount = debitCount + 1;
    		totalDebitCount ++;
    	}
   }
    
    	
    void printDebitCount() {
    		System.out.println(name + " debit count" +debitCount);
    	}
    
      void amtCredited(int num) {
    		totalBalance = totalBalance + num;
    		creditCount = creditCount + 1;
    		totalCreditCount ++;
    	}
    
   
     void printBalance() { 
    	System.out.println("Total Balance in" + name + "'s account is " +totalBalance);
    	pBCount++;
    	totalPBCount++;
    	
    	
     
     }
     
     void indivisualTransactionSummary() {
    	 System.out.println( name + " 's transaction summary ; " + " credit - " +creditCount +"times,"+ "Debit -" + debitCount +"times"+ "Print Balance -" +pBCount +"times");
     }
     
     void allTransactionSummary() {
    	 System.out.println("All transaction summary :"  + " Credit - " + totalCreditCount + "times ," + "Debit - " + totalDebitCount + "times ," + "print balance - " +totalPBCount + "times.");
     }
     
    	
     public static void main(String[] a) {
    	 assignment_9 Assignment_9A = new assignment_9();
    	 Assignment_9A.setCustInfo(30000,"saurav");
    	 Assignment_9A.amtDebited(5000);
    	 Assignment_9A.amtDebited(3000);
    	 Assignment_9A.printBalance();
    	 Assignment_9A.printDebitCount();
    	 Assignment_9A.amtCredited(5000);
    	 Assignment_9A.printBalance();
    	 Assignment_9A.indivisualTransactionSummary();
    	 
    	 assignment_9 Assignment_9B = new assignment_9();
         Assignment_9B.setCustInfo(50000,"Vikas");
    	 Assignment_9B.amtCredited(4000);
    	 Assignment_9B.printBalance();
    	 Assignment_9B.indivisualTransactionSummary();
    	 
    	Assignment_9A.allTransactionSummary();
    	
    	 
    	 
     }
    	 
}



