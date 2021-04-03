package mayur;

public class BankingSystem {
	
		 int debitCount = 0;
		 int creditCount = 0;
		 int balanceCount = 0;
		 static int totalDebitCount = 0;
		 static int totalCreditCount = 0;
		 static int totalBalanceCount = 0;
		 

		 void creditAmt(int creditAmount) {
			 balanceCount = balanceCount+creditAmount;
			 System.out.println(creditAmount + " Rs. credited to your account");
			 creditCount++;
			 totalCreditCount++;
		 }

		 void debitAmt(int debitAmount) {

			 balanceCount = balanceCount-debitAmount;
			 System.out.println(debitAmount + " Rs. debited from your account");
			 debitCount++;
			 totalDebitCount++;
		 }

		 void printBalance() {
			 System.out.println("Total Balance is :"+ balanceCount);
			 balanceCount++;
			 totalBalanceCount++;
		 }

		 void individualTransactionSummary(String userName, int debitCount, int creditCount, int balanceCount ) {
			 System.out.println(userName +" transaction summary : "+"Debit - "+debitCount+ " times,"+" Credit - "+creditCount+" times,"+" Printbalance - "+balanceCount+ " times");
		 }

		 void allTransactionSummary() {
			 System.out.println("All Transaction summary : "+"Debit - "+totalDebitCount+ " times,"+" Credit - "+totalCreditCount+" times,"+" Printbalance - "+totalBalanceCount+ " times");	 }

		 public static void main(String[] args) {

			BankingSystem bankingSystem1=new BankingSystem();
			System.out.println("User1 initial balance : "+ bankingSystem1.balanceCount+" Rs.");
			bankingSystem1.creditAmt(5000);
			bankingSystem1.debitAmt(2500);
			bankingSystem1.creditAmt(3000);
			bankingSystem1.printBalance();
			bankingSystem1.individualTransactionSummary("User1", bankingSystem1.debitCount, bankingSystem1.creditCount, bankingSystem1.balanceCount);


			BankingSystem bankingSystem2=new BankingSystem();
			System.out.println("User2 initial balance : "+bankingSystem2.balanceCount+" Rs.");
			bankingSystem2.debitAmt(4000);
			bankingSystem2.debitAmt(3500);
			bankingSystem2.creditAmt(1000);
			bankingSystem2.creditAmt(2000);
			bankingSystem2.creditAmt(1500);
			bankingSystem2.creditAmt(1500);
			bankingSystem2.creditAmt(500);
			bankingSystem2.individualTransactionSummary("User2", bankingSystem2.debitCount, bankingSystem2.creditCount, bankingSystem2.balanceCount);
			bankingSystem2.allTransactionSummary();
		}
	}


