package siddhant;

class SwitchBank{
	String name;
	int iamount = 30000;
	int hamount = 25000;
	int samount = 28000;
	int bamount = 29000;
	int idebitcount , icreditcount;
	int hdebitcount , hcreditcount;
	int sdebitcount , screditcount;
	int bdebitcount , bcreditcount;
	static int totalcreditcount = 0;
	static int totaldebitcount = 0;
	static int totalcount = 0;
			
	void operation(String Bank, String op , int amt){
		switch(op){
			case "Debit" :
				switch(Bank){
					case "icic" :
						if(amt<=iamount){
							iamount =iamount - amt;
							System.out.println("When debited from icic : " +amt+ " amount is : " +iamount);
							idebitcount++;
							totaldebitcount++;
						}else{
							System.out.println("Not sufficient balance");
						}
						break;
					case "hdfc" :
						if(amt<hamount){
							hamount = hamount - amt;
							System.out.println("When debited from hdfc : " +amt+ " amount is : " +hamount);
							hdebitcount++;
							totaldebitcount++;
						}else{
							System.out.println("Not sufficient balance");
						}
					break;
					case "sbi" :
						if(amt<samount){
							samount = samount - amt;
							System.out.println("When debited from sbi : " +amt+ " amount is : " +samount);
							sdebitcount++;
							totaldebitcount++;
						}else{
							System.out.println("Not sufficient balance");
						}
					break;
					case "BOI" :
						if(amt<bamount){
							bamount = bamount - amt;
							System.out.println("When debited from BOI: " +amt+ " amount is : " +bamount);	
							bdebitcount++;
							totaldebitcount++;
						}else{
							System.out.println("Not sufficient balance");
						}
					break;
					default :
						System.out.println("Incorrect bank name provided");
				}
			break;
			case "Credit" :
				switch(Bank){
					case "icic" :
						if(amt>0){
							iamount = iamount + amt;
							System.out.println("When amount credited to icic is : " +amt+ " balance becomes : " +iamount);
							icreditcount++;
							totalcreditcount++;
						}
					break;
					case "hdfc" :
						if(amt>0){
							hamount = hamount + amt;
							System.out.println("When amount credited to hdfc is : " +amt+ " balance becomes : " +hamount);
							hcreditcount++;
							totalcreditcount++;
						}
					break;
					case "sbi" :
						if(amt>0){
							samount = samount + amt;
							System.out.println("When amount credited to sbi : " +amt+ "  balance  becomes : " +samount);
							screditcount++;
							totalcreditcount++;
						}
					break;
					case "BOI" :
						if(amt>0){
							bamount = bamount + amt;
							System.out.println("When amount credited to BOI : " +amt+ " balance becomes : " +bamount);
							bcreditcount++;
							totalcreditcount++;
						}
					break;
					default :
						System.out.println("Incorrect Bank name Provided");
				}
		}		
	}
	void totalbalance(){
		System.out.println("-------------------------TOTAL BALANCE------------------------");
		System.out.println("TOTAL BALANCE IS : " +(hamount+iamount+samount+bamount));
	}
	void totalcount(){
		System.out.println("-------------------------Total Credit and Debit count----------------------------");
		System.out.println("TOTAL DEBIT  COUNT IS : "  +totaldebitcount);
		System.out.println("TOTAL CREDIT COUNT IS : " +totalcreditcount);
	}
	void individualtransaction(){
		System.out.println("-----------------Individual Transaction-------------------");
		System.out.println("For ICIC ACCOUNT CREDIT COUNT IS : " +icreditcount+ " AND DEBIT COUNT IS : " +idebitcount);
		System.out.println("For HDFC ACCOUNT CREDIT COUNT IS : " +hcreditcount+ " AND DEBIT COUNT IS : " +hdebitcount);
		System.out.println("For SBI  ACCOUNT CREDIT COUNT IS : " +screditcount+ " AND DEBIT COUNT IS : " +sdebitcount);
		System.out.println("For BOI  ACCOUNT CREDIT COUNT IS : " +bcreditcount+ " AND DEBIT COUNT IS : " +bdebitcount);
	}
	public static void main(String[]args){
		SwitchBank sb = new SwitchBank();
		sb.operation("icic",  "Debit",1000);
		sb.operation("icic", "Credit",2000);
		sb.operation("BOI" ,  "Debit",1000);
		sb.operation("BOI" , "Credit",5000);
		sb.operation("hdfc", "Credit",9000);
		sb.operation("hdfc",  "Debit",1000);
		sb.totalbalance();
		sb.totalcount();
		sb.individualtransaction();
	}
}
		
		
	
						
			
