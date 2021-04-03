//3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak
//a. humanName()
//b. canSpeak()
//c. humanAge()
//d. showDetails()
//Hint: One String, one boolean, one int variable needed.

package mayur;

class Human
{
	String humanName;
	boolean canSpeak;
	int humanAge;
	void humanName(String name)
	{
		humanName=name;
	}
	
	void canSpeak(boolean flag)
	{
		canSpeak = flag; 
	}
	
	void humanAge(int age)
	{
		humanAge = age;
	}
	void showDetails()
	{
		System.out.println("Name of the human is " +humanName);
		System.out.println("Can that human speak " +canSpeak);
		System.out.println("Age of the human is " +humanAge);
	}
	
	public static void main(String[] args)
	{
		Human human = new Human();
		human.humanName("Mayur");
		human.canSpeak(true);
		human.humanAge(18);
		human.showDetails();
	}
	 
	 
}