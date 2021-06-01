package nikita;

public class Bankdata {
	
	int balance=10000;
	int debt;
	int cred;
	int debtcnt, credcnt;
    static int debitcnt, creditcnt;
	
	
	void debitamt(int debt)
	{
		if(balance>=debt)
		balance= balance-debt;	
		debtcnt= debtcnt+1;
		debitcnt=debitcnt+1;
		
	}
	
	void credamt(int cred)
	{
		balance=balance+cred;	
		credcnt=credcnt+1;
		creditcnt=creditcnt+1;
			
	}
	
	
	void printBalance()
	{
		System.out.println("The balance is :" +balance);
	}
	
	void individualTransactionSummery()
	{
		System.out.println("User 1 debit transaction summery :" +debtcnt);
		System.out.println("User 2 credit transaction summery :" +credcnt);
		
	}
	
	void allTransactionSummery()
	{
		System.out.println("All debit transaction summery :" +debitcnt);
		System.out.println("All credit transaction summery :" +creditcnt);
	}
	
	public static void main(String args[])
	{
		Bankdata b=new Bankdata();
		b.debitamt(1000);
		b.credamt(2000);
		b.credamt(3000);
		b.debitamt(5000);
		b.printBalance();
		b.individualTransactionSummery();
		
		Bankdata b1=new Bankdata();
		b1.debitamt(2000);
		b1.credamt(1000);
		b1.debitamt(2000);
		b.allTransactionSummery();
		
	}

}
