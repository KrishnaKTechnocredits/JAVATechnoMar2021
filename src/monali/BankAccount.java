package monali;
class BankAccount{
	String username;
	String passward;
	int accountnumber;
	
	void setDetails(String candidatename,String candidatepwd,int candidateacc){
		username = candidatename;
		passward = candidatepwd;
		accountnumber = candidateacc;
	}
	
	void updatePassward(String candidatepwd){
		passward = candidatepwd;
	}
	
	void displayInfo(){
		System.out.println("candidate name is " +username);
		System.out.println("candidate passward is " +passward);
		System.out.println("candidate accountnumber is "  +accountnumber);
	}
	
	public static void main(String[] a){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("saurav","maharashtra",12368);
		bankaccount.updatePassward("india");
		bankaccount.displayInfo();
	}
		
}
	