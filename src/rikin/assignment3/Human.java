package rikin.assignment3;

class Human{
	String humanName;
	boolean canSpeak;
	int humanAge;
	
	void behaviour(String nameOfHuman, boolean speak, int ageOfHuman){
		humanName= nameOfHuman;
		canSpeak = speak;
		humanAge = ageOfHuman;
	}
	
	void showDetails(){
		System.out.println("Human name is " + humanName);
		System.out.println("Human can Speak : " + canSpeak);
		System.out.println("Human age is " + humanAge);
	}
	
	public static void main (String [] args){
		Human human = new Human();
		human.behaviour("Rikin", true, 31);
		human.showDetails();
	}
	
}