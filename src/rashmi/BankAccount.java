package rashmi;
public class BankAccount{
	int bankAccountNo;
	String password;
	String username;
	
    void setDetails(String uname, String pword, int acctno){
		username = uname;
		password = pword;
		bankAccountNo = acctno;
    }

	void updatePassword(String updatePword){
		 password = updatePword;
    }
	
	void displayInfo(){
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankAccountNo);
	}
	
	public static void main(String[] args){
	     BankAccount bankaccount = new BankAccount();
		 bankaccount.setDetails("tina@009","123467jk",897);
		 bankaccount.updatePassword("abcd1234");
		 bankaccount.displayInfo();
	}
}