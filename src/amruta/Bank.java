package amruta;


/*class Bank{
	String custname;					// If we want to use instance in multiple methods so we have to declare variable globaly
	double balance;
	
	void setData(String name, double amount){
		custname = name;					// Local variable ki life bass utni he method k liye hoti hai
		balance = amount;
	}
	
	void debitAmt(double debitAmt){
	balance = debitAmt;	
	}
	
	void creditAmt(double creditAmt){
	balance = balance + creditAmt;
	}
	
	void display(){
	System.out.println("Balance amount is : "+balance);
	}
	
	public static void main(String[] a){
	Bank bank = new Bank();
	bank.setData("Amruta",10000);
	bank.debitAmt(3000);
	bank.display();
	bank.creditAmt(4000);
	bank.display();
	}
}*/


class Bank{
	String custname;					// If we want to use instance in multiple methods so we have to declare variable globaly
	double balance;
	
	void setData(String name, double amount){
		custname = name;					// Local variable ki life bass utni he method k liye hoti hai
		balance = amount;
	}
	
	void debitAmt(double debitAmt){
		double balance = 0;
		balance = balance - debitAmt;	
	}
	
	void creditAmt(double creditAmt){
		balance = balance + creditAmt;
	}
	
	void display(){
		System.out.println("Balance amount is : "+balance);
	}
	
	public static void main(String[] a){
		Bank bank = new Bank();
		bank.setData("Amruta",10000);
		bank.debitAmt(3000);
		bank.display();
		bank.creditAmt(5000);
		bank.display();
	}
}