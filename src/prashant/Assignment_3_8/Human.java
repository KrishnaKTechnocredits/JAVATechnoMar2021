/**Assignment 3 : Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed.*/
package prashant.Assignment_3_8;

public class Human {
	String name;
	int age;
	boolean canSpeak;

	void humanName(String hname) {
		name = hname;
	}

	void canSpeak(boolean speak) {
		canSpeak = speak;
	}

	void humanAge(int hage) {
		age = hage;
	}

	void showDetails() {
		System.out.println("Human name is : " + name);
		System.out.println("Human can speak : " + canSpeak);
		System.out.println("Human age is : " + age);
	}

	public static void main(String[] args) {
		Human human = new Human();
		human.humanName("Narmada");
		human.canSpeak(true);
		human.humanAge(20);
		human.showDetails();
	}
}
