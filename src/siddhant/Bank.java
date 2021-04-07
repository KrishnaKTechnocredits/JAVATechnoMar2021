package siddhant;

public class Bank{
	String name;
	int totalbalance;
	int creditcount;
	int debitcount;
	int printbal;
	static int totalcreditcount;
	static int totaldebitcount;
	static int totalprintbal;
	
	void setintials(int amount,String user){
		totalbalance = amount;
		name = user;
	}
	void  debit(int amt){
		if(amt<=totalbalance){
			totalbalance = totalbalance - amt;
			debitcount++;
			totaldebitcount++;
		}
	}
	void credit(int amt){
		if(amt>0){
		totalbalance = totalbalance + amt;
		creditcount++;
		totalcreditcount++;
		}
	}
	void balance(){
		System.out.println(name+ " Total Balance is " + totalbalance);
		printbal++;
		totalprintbal++;
	}
	void individualtransaction(){
		System.out.println( name+ " Transaction summary : Credit - " + creditcount + " Debit - " + debitcount + " printbalance - " +printbal );
	}
	void Alltransaction(){
		System.out.println( "All Transaction summary : Credit - " + totalcreditcount + " Debit - " + totaldebitcount + " printbalance - " +totalprintbal );
	}
	public static void main(String[]args){
		Bank b1 = new Bank();
		b1.setintials(40000,"User1");
		b1.debit(3000);
		b1.credit(4000);
		b1.credit(5000);
		b1.balance();
		b1.individualtransaction();
		Bank b2 = new Bank();
		b2.setintials(50000,"User2");
		b2.debit(4000);
		b2.debit(5000);
		b2.credit(4000);
		b2.credit(4000);
		b2.balance();
		b2.individualtransaction();
		b2.Alltransaction();
	}
}