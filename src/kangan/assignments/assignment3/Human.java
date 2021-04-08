package kangan.assignments.assignment3;

public class Human {

	String humanName;
	boolean speak;
	int humanAge;
	
	void humanName(String name) {
		humanName = name;
	}
	void canSpeak(boolean flag) {
		speak = flag;
	}
	void humanAge(int age){
		humanAge = age;
	}
	void showDetails() {
		System.out.println("Human name is " + humanName);
		System.out.println(humanName + " can speak : " + speak);
		System.out.println(humanName + " is " + humanAge + " year old");
	}
	public static void main(String[] args) {
		Human human = new Human();
		human.humanName("Kangan");
		human.canSpeak(true);
		human.humanAge(27);
		human.showDetails();
	}
}
