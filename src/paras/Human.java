//3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
//	a. humanName()  
//	b. canSpeak()  
//	c. humanAge()  
//	d. showDetails() 
//Hint: One String, one boolean, one int variable needed.

/*
Assignment 3 - Program 3 - Program Statement : Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak
*/

package paras;

class Human{
	
	String name;
	boolean canSpeak;
	int age;
	
	void humanName(String hName){
		name = hName;
	}
	
	void canSpeak(boolean cSpeak){
		canSpeak = cSpeak;
	}
	
	void humanAge(int hAge){
		age = hAge;
	}
	
	void showDetails(){
		System.out.println("Name of the Human is - " + name);
		System.out.println("Can Human Speak - " + canSpeak);
		System.out.println("Age of the Human is - " + age);
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Paras");
		human.canSpeak(true);
		human.humanAge(28);
		human.showDetails();
	}
}