package rahul_Hiremath;

class Ass_3_1
{
	String username;
	String password;
	int bankAccountNumber;
	void setDetails(String uname, String pass, int bankAccNo){
		username = uname;
		password = pass;
		bankAccountNumber = bankAccNo;
	}
	void updatePassword(String passUpdated){
		password = passUpdated;
		System.out.println("Password updated to: " + password);
	}
	void displayInfo(){
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
		System.out.println("Bank account number is: "  + bankAccountNumber);
	}
	public static void main (String[] args){
		Ass_3_1 bankAccount = new Ass_3_1();
		bankAccount.setDetails("Rahul Hiremath", "Password@12", 12345);
		bankAccount.updatePassword("000000");
		bankAccount.displayInfo();
	}
}