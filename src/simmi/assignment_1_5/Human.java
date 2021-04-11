/*Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. */

package simmi.assignment_1_5;

class Human{
	String name;
	int age;
	boolean canSpeak;
	
	void humanName(String h_name){
		name = h_name;
	}
	
	void canSpeak(boolean flag){
		canSpeak = flag;
	}
	
	void humanAge(int h_age){
		age = h_age;
	}
	
	void showDetails(){
		System.out.println(" Her name is : " + name);
		System.out.println(" She can speak : " + canSpeak);
		System.out.println(" Her age is : " + age);
	}
	
	public static void main(String[] args){
		Human h = new Human();
		h.humanName("Siarra");
		h.canSpeak(false);
		h.humanAge(1);
		h.showDetails();
	}
}