/*
 Assignment 03
 Program 03
 Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak
	a. humanName()
	b. canSpeak()
	c. humanAge()
	d. showDetails()
	Hint: One String, one boolean, one int variable needed.
	 */
package madhavi_Raut;

class Human {

	String name;
	boolean canSpeak;
	int age;

	void humanName(String humanName) {
		name = humanName;
	}

	void canSpeak(boolean speak) {
		canSpeak = speak;
	}

	void humanAge(int humanAge) {
		age = humanAge;
	}

	void showDetails() {
		System.out.println("Human Name: " + name + "\n" + "Can human speak: " + canSpeak + "\n" + "Human Age: " + age);
	}

	public static void main(String[] args) {
		Human human = new Human();
		human.humanName("Daniel");
		human.canSpeak(true);
		human.humanAge(31);
		human.showDetails();
	}
}