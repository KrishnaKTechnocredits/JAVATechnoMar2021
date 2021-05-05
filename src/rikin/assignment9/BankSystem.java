package rikin.assignment9;

class BankSystem{
	
	String name;
	int totalBalance;
	int debit;
	int credit;
	int pBalance;
	static int debitCount;
	static int creditCount;
	static int printBalanceCount;
	
	void setData(String nameOfCustomer, int balance){
		name = nameOfCustomer;
		totalBalance = balance;
	}
	
	void debitAmount(int amount){
		if(amount <= totalBalance){
			totalBalance = totalBalance - amount;
			debit++;
			debitCount++;
		}	
	}	
	void creditAmount(int amount){
		totalBalance = totalBalance + amount;
		credit++;
		creditCount++;
	}	

	void printBalance(){
		System.out.println(" ");
		System.out.println(name + " Current balance is: " + totalBalance);
		pBalance++;
		printBalanceCount++;
	}
	void individualTransactionSummary() {
		System.out.println(" ");
		System.out.println(name + " transaction summary : " + " credit - " + credit + " times, " + " Debit - " + debit
				+ " times, " + "Print Balance - " + pBalance + " times");
	}
	void allTransactionSummary() {
		System.out.println("\nAll transaction summary: "+ "Credit - "+creditCount+" times,  Debit - " +debitCount+" times, "+ "print Balance - "+printBalanceCount+" times");
	}
	
	public static void main(String[] args) {
		BankSystem bankSystem = new BankSystem();
		bankSystem.setData("Customer1", 10000);
		bankSystem.creditAmount(1000);
		bankSystem.creditAmount(2000);
		bankSystem.debitAmount(5000);
		bankSystem.printBalance();
		bankSystem.individualTransactionSummary();
		
		BankSystem bankSystem_1 = new BankSystem();
		bankSystem_1.setData("Customer2", 10000);
		bankSystem_1.creditAmount(1000);
		bankSystem_1.creditAmount(2000);
		bankSystem_1.creditAmount(2000);
		bankSystem_1.creditAmount(2000);
		bankSystem_1.creditAmount(2000);
		bankSystem_1.debitAmount(5000);
		bankSystem_1.debitAmount(5000);
        bankSystem_1.printBalance();
		bankSystem_1.individualTransactionSummary();
		
		bankSystem.allTransactionSummary();
		
	}	
}