package ashtha;

class Human {
	String name;
	int age;
	boolean speak;
	
	void humanName(String nameOfTheHuman){
		name = nameOfTheHuman;
	}
	
	void humanAge(int ageOfTheHuman){
		age = ageOfTheHuman;
	}
	
	void canSpeak(boolean canHumanSpeak){
		speak = canHumanSpeak;
	}
	
	void showDetails(){
		System.out.println("Human name is "+name);
		System.out.println("Human age is "+age);
		System.out.println("Can the human speak: "+speak);
	}

	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Harvey Specter");
		human.humanAge(40);
		human.canSpeak(true);
		human.showDetails();
	}
}
	
		
	