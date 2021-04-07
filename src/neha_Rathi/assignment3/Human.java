/*
 * Assignment 3_3
 * Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
 */
package neha_Rathi.assignment3;

class Human {
	String name;
	boolean canSpeak;
	int age;

	void humanName(String hName) {
		name = hName;
	}

	void canSpeak(boolean speak) {
		canSpeak = speak;
	}

	void humanAge(int hAge) {
		age = hAge;
	}

	void showDetails() {
		System.out.println("Human Name is: " + name);
		System.out.println("Can " + name + " Speak: " + canSpeak);
		System.out.println("age of " + name + " is: " + age);
	}

	public static void main(String[] args) {
		Human human = new Human();
		human.humanName("Neha");
		human.canSpeak(true);
		human.humanAge(32);
		human.showDetails();
	}
}