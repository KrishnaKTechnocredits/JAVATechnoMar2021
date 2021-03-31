package nikita;

public class Bankaccount {
	String name;
	String password;
	int bankaccountnumber;

  void setDetails(String username, String pwd, int bankaccno)
	{
	 name=username;
	 password=pwd;
	 bankaccountnumber= bankaccno;
	}
  void updatepassword(String pwd)
	{ 
	 password=pwd;
	}

  void display()
	{
	 System.out.println("Username" +name);
	 System.out.println("Username" +password);
	 System.out.println("Username" +bankaccountnumber);
	}
 public static void main(String[] args){
	 Bankaccount b1=new Bankaccount();
	 b1.setDetails("Nikita","Nikinaik",12345678);
	 b1.updatepassword("Niksnaik");
	 b1.display();
}
}
	
