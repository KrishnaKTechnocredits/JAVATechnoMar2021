/*Java Assignment 3: 23rd March 2021

3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak
a. humanName()
b. canSpeak()
c. humanAge()
d. showDetails()
Hint: One String, one boolean, one int variable needed.

 */

package vaibhav;

class Human{
	String humanName;
	boolean canSpeak;
	int humanAge;
	
	void humanName(String name){
		humanName = name;
	}

	void canSpeak(boolean speakingAblity){
		canSpeak = speakingAblity;
	}
	
	void humanAge(int age){
		humanAge = age;	
	}
	
	void showDetails(){
		System.out.println("Name of the person is " + humanName);
		System.out.println("Age of person is " + humanAge);
		System.out.println("Person can able to speak ==> " + canSpeak);		
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Techno");
		human.canSpeak(false);
		human.humanAge(30);
		human.showDetails();		
	}
}