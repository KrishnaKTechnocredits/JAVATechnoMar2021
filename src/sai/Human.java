package sai;

class Human{
	String name;
	boolean speak;
	int age;
	
	void humanName(String humanName){
		name = humanName;
	}
	
	void canSpeak(boolean canSpeak){
		speak = canSpeak;
	}
	
	void humanAge(int humanAge){
		age = humanAge;
	}
	
	void showDetails(){
		System.out.println("Name of the human is " + name);
		System.out.println("Can human speak : " + speak);
		System.out.println("Age of the human is " + age);
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Sunny");
		human.canSpeak(true);
		human.humanAge(27);
		human.showDetails();
	}
}