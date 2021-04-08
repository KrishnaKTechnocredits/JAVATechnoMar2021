//assignment 3 Program 1

package kajal.Kajal_Package_Folder;

class Bankaccount{
	
	String name;
	String pass;
	int acno;

	void setDetails(String username, String password, int bankAccountNumber){
		
		name= username;
		pass= password;
		acno= bankAccountNumber;
		}
	void updatePassword(String updatepassword){
		
		pass=updatepassword;
		}
	void displayInfo(){
		
		System.out.println("Your name is " +name);
		System.out.println("Your password is " +pass);
		System.out.println("Your account number is " +acno);
		}
	public static void main(String[] args){
		
		Bankaccount bankaccount = new Bankaccount();
		bankaccount.setDetails("kajal","abc@123",12345);
		bankaccount.displayInfo();
		bankaccount.updatePassword("xyz@123");
		bankaccount.displayInfo();

	}
}
	