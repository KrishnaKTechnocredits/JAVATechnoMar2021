package monali;

public class Assignment_9A {
	
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
    	 Assignment_9A assignment_9 = new Assignment_9A();
    	 assignment_9.setCustInfo(30000,"saurav");
    	 assignment_9.amtDebited(5000);
    	 assignment_9.amtDebited(3000);
    	 assignment_9.printBalance();
    	 assignment_9.printDebitCount();
    	 assignment_9.amtCredited(5000);
    	 assignment_9.printBalance();
    	 assignment_9.indivisualTransactionSummary();
    	 
    	 Assignment_9A assignment_9B = new Assignment_9A();
         assignment_9B.setCustInfo(50000,"Vikas");
    	 assignment_9B.amtCredited(4000);
    	 assignment_9B.printBalance();
    	 assignment_9B.indivisualTransactionSummary();
    	 
    	assignment_9.allTransactionSummary();
    	
    	 
    	 
     }
    	 
}
	
	


