/*3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. 

*/
package ankit.assignment_1_5;
class Human{
	
	String humanName;
	boolean canSpeak;
	int age;
	
	void humanName(String hName){
		humanName = hName;
	}
	void canSpeak(boolean flag){
		canSpeak = flag;
	}
	void humanAge(int hAge){
		age = hAge;
	}
	
	void showDetails(){
		System.out.println("Name of Human : "+ humanName);
		System.out.println("Can human Speak : " + canSpeak);
		System.out.println("Human Age  : " + age);	
	}
	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Techno");
		human.canSpeak(false);
		human.humanAge(45);
		human.showDetails();
	}
}