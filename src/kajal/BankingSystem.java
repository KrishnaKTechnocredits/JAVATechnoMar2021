package kajal;

public class BankingSystem {
	String name;
	int debitcount;
	int creditcount;
	int printcount = 0;
	int totalbal;
	static int totalcreditcount;
	static int totaldebitcount;
	static int totalprintcount;
	
		void setData(String nm, int initAmt) {
		name= nm;
		totalbal = initAmt;
		}
	
		void debitAmt(int amt) {
		debitcount=0;
		
		while(totalbal >= amt) {
			totalbal = totalbal- amt;
		 debitcount++;
		 totaldebitcount++;
		 }
		}
	
		void creditAmt(int amt) {
		creditcount=0;
		while(totalbal <= amt) {
			totalbal = totalbal + amt;
			creditcount++;
			totalcreditcount++;
		 }
	    	}
		void printBal() {//current balance
			
		System.out.println(name + " your total current balance is:" + totalbal);
		printcount++;
		totalprintcount++;
		}
		
		void individualSummary() {
		System.out.println(name + " : transaction summary creditcount: " + creditcount + " ,Debitcount: " + debitcount + " ,printbalancecount: " + printcount);
				
		}
	
		void AlltranSummary() {
		System.out.println("All : transaction summary totalcreditcount: " + totalcreditcount + " ,totalDebitcount " + totaldebitcount + " ,printbalancecount : " + totalprintcount );
		
		}

	
		public static void main (String[]a) {
		BankingSystem bankingsystem = new BankingSystem();
		//1st object created
		bankingsystem.setData("Kajal", 10000);
		bankingsystem.debitAmt(2000);
		bankingsystem.creditAmt(7000);
		bankingsystem.printBal();
		bankingsystem.individualSummary();
		
		//2nd object created
		BankingSystem bankingsystem1 = new BankingSystem();
		bankingsystem1.setData("Komal", 12000);
		bankingsystem1.debitAmt(5000);
		bankingsystem1.creditAmt(2000);
		bankingsystem1.printBal();
		//bankingsystem1.printBal();
		bankingsystem1.individualSummary();
		bankingsystem1.AlltranSummary();
		//bankingsystem1.printBal();
				
		}

}
