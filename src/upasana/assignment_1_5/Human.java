package upasana.assignment_1_5;


class Human{
	String humanName;
	boolean canHumanSpeak;
	int humanAge;
	
	
	void humanName(String hName){
		humanName = hName;
	}
	
	void canSpeak(boolean canSpeak){
		canHumanSpeak = canSpeak;
	}
	
	void humanAge(int hAge){
		humanAge = hAge;
	}
	
	void showDetails(){
		System.out.println("Human Name is "+humanName);
		System.out.println("Can human Speak ? "+canHumanSpeak);
		System.out.println("Human Age is "+humanAge);
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Upasana");
		human.canSpeak(true);
		human.humanAge(25);
		human.showDetails();
	}
}
		
		
	