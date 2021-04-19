

package mayur;

class BankAccount
{
	String username,password;
	int bankAaccountNumber;
	
	void setDetails(String name,String pass,int accNo)
	{
		username=name;
		password=pass;
		bankAaccountNumber=accNo;
		System.out.println("Old password is " +password);
	}
	
	void updatePassword(String pass)
	{
		password=pass;
	}
	
	void displayInfo()
	{
		System.out.println("Username is " +username);
		System.out.println("Updated is "+password);
		System.out.println("User's account no. is " +bankAaccountNumber);
	}
	
	public static void main(String[] args)
	{
		BankAccount bA = new BankAccount();
		bA.setDetails("Mayur", "Ma@123", 78692);
		bA.updatePassword("Pa@123");
		bA.displayInfo();
	}
}
