/*
 * 3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. 
 */

package amruta.Assignment_3;

class Human{
	String humanName;
	boolean humancanSpeak;
	int humanAge;
	
	void humanName(String name){
		humanName = name;
	}
	void canSpeak(boolean canspeak){
		humancanSpeak = canspeak;
	}
	void humanAge(int age){
		humanAge = age;
	}
	void showDetails(){
		System.out.println("Name of Human is : "+humanName);
		System.out.println("Is human speak : "+humancanSpeak);
		System.out.println("Age of Human is : "+humanAge);
	}
	
	public static void main(String[] args){
	Human human = new Human();
	human.humanName("Amruta Kharat");
	human.canSpeak(true);
	human.humanAge(24);
	human.showDetails();
	}
}