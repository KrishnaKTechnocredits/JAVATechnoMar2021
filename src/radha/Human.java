/*Assignment 3- Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. */
package radha;

class Human{
	String name;
	boolean canSpeak;
	int age;
	
	void humanName(String hName){
		name = hName;
	}
	
	void canSpeak(boolean speak){
		canSpeak = speak;
	}
	
	void humanAge(int hAge){
		age = hAge;
	}
	
	void showDetails(){
		System.out.println("Name of the human is: "+name);
		System.out.println("Can the human speak?: "+canSpeak);
		System.out.println("Age of human is: "+age);
	}
	
	public static void main(String[] args){
		Human human_1 = new Human();
		human_1.humanName("Radha");
		human_1.canSpeak(true);
		human_1.humanAge(25);
		human_1.showDetails();
	}
}
