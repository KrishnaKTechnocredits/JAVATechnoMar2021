package krati_Shukla;

class Human
{
		String name;
		int age;
		boolean canSpeak;
		
	void humanName(String personName){
		name = personName;
	}
	void canSpeak(boolean flag){
		canSpeak = flag;
	}
	void humanAge(int personAge){
		age = personAge;
	}
	void showDetails(){
	 System.out.println("Human name is = "+name);
	 System.out.println("Can " +name+ " speak = "+canSpeak);
	 System.out.println("Age of " +name+ " is = "+age);
	}
	public static void main (String[] a)
	{
		Human human = new Human();
		human.humanName("Krati");
		human.humanAge(10);
		human.canSpeak(true);
		human.showDetails();
	}
}