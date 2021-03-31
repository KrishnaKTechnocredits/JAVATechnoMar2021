package nikita;

public class Human {

	String name;
	boolean speak;
	int age;

	void humanName(String huname)
	{
	 name=huname;	 
	}
	
	void canSpeak(boolean husp)
	{ 
	 speak=husp;
	}

	void humanAge(int huage)
	{ 
	 age=huage;
	}

	void showDetails()
	{
	 System.out.println("Human name is:" +name);
	 System.out.println("Can human speak:" +speak);
	 System.out.println("Human age is:" +age);
	}
	public static void main(String[] args)

	{
	 Human h1=new Human();
	 h1.humanName("Nikita");
	 h1.canSpeak(true);
	 h1.humanAge(26);
	 h1.showDetails();        
	}
}
