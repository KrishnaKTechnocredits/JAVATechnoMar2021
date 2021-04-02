package monali;

public class Assignment_9 {
	
	String name;
    int totalBalance;
    int debitCount = 0;
    int creditCount = 0;
    static int totalDebitCount = 0;
    static int totalCreditCount = 0;
    
    void setCustInfo(int initialBal,String custName) {
    	totalBalance = initialBal;
    	name = custName;
    }
    
    void amtDebited(int num) {
    	if(num <=totalBalance) {
    		totalBalance = totalBalance - num;
    		debitCount = debitCount + 1;
    		totalDebitCount ++;
    	}
    }
    	
    void printDebitCount() {
    		System.out.println(name + " debit count" +debitCount);
    	}
    
      void amtCredited(int num) {
    	if(num <= totalBalance) {
    		totalBalance = totalBalance + num;
    		creditCount = creditCount + 1;
    		totalCreditCount ++;
    	}
    	}
    
      void printCreditCount() {
    	System.out.println(name + " credit count" +creditCount);
    }
    
     
    void printBalance() { 
    	System.out.println("Total Balance" +totalBalance);
     }
     
     void printOverAllBal() {
    	 System.out.println("total debit count by users " +totalDebitCount);
    	 System.out.println("total credit count by users " +totalCreditCount);
    	 System.out.println("Total Balance" +totalBalance);
     }
     
    
     public static void main(String[] a) {
    	 Assignment_9 assignment_9 = new Assignment_9();
    	 assignment_9.setCustInfo(30000,"saurav");
    	 assignment_9.amtDebited(5000);
    	 assignment_9.amtDebited(3000);
    	 assignment_9.printBalance();
    	 assignment_9.printDebitCount();
    	 assignment_9.amtCredited(5000);
    	 assignment_9.printBalance();
    	 assignment_9.printOverAllBal();
    	 
    	 
    	 
    	 Assignment_9 assignment_9A = new Assignment_9();
         assignment_9A.setCustInfo(50000,"Vikas");
    	 assignment_9A.amtCredited(4000);
    	 assignment_9A.printBalance();
    	 assignment_9A.printCreditCount();
    	 
    	 assignment_9A.printOverAllBal();
     }
    	 
}
	

