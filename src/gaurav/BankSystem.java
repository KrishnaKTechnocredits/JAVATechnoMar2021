package gaurav;

public class BankSystem {
		String name;
		int totalBalance;
		int debit=0;
		static int totalDebitCount=0;
		int credit=0;
		static int totalCreditCount=0;
		int printBalance=0;
		static int totalPrintBalance=0;
		
		void setData(int initialBalance,String custName) 
		{
			totalBalance=initialBalance;
			name=custName;
		}
		void debitAmount(int amount) 
		{
			if(amount<=totalBalance)
			{
				totalBalance=totalBalance-amount;
				debit++;
				totalDebitCount++;
			}
		}
		
		void creditAmount(int amount)
		{
			if(amount<=totalBalance) 
			{
				totalBalance=totalBalance+amount;
				credit++;
				totalCreditCount++;
			}
		}
		
		void printBalance()
		{
			printBalance++;
			totalPrintBalance++;
		}
		
		void individualTransactionSummary(String custName) 
		{
			System.out.println(custName +" "+" transaction summary: credit - " +credit+" "+"times,"+" debit - "+debit+" times, printBalance "+printBalance+ " -time");
		}
		static void allTransactionSummary() 
		{
			System.out.println("All" +" "+" transaction summary: credit - " +totalCreditCount+" "+"times,"+" debit - "+totalDebitCount+" times, printBalance "+totalPrintBalance+ " -time");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSystem bankSystem = new BankSystem();
		bankSystem.setData(10000,"user1");
		bankSystem.creditAmount(2000);
		bankSystem.creditAmount(1000);
		bankSystem.debitAmount(3000);
		bankSystem.printBalance();
		bankSystem.individualTransactionSummary("user1");
		
		
		BankSystem bankSystem2 = new BankSystem();
		bankSystem2.setData(15000,"user2");
		bankSystem2.creditAmount(2000);
		bankSystem2.creditAmount(1000);
		bankSystem2.creditAmount(1000);
		bankSystem2.creditAmount(1000);
		bankSystem2.creditAmount(1000);
		bankSystem2.debitAmount(3000);
		bankSystem2.debitAmount(3000);
		bankSystem2.individualTransactionSummary("user2");
		BankSystem.allTransactionSummary();
		
	}

}
