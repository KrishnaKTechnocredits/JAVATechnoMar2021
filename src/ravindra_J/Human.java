/*3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
 * 	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. 
 */
package ravindra_J;

class Human{
	String hName;
	int hAge;
	boolean hCanSpeak;
	void humanName(String name){
		hName = name;
	}
	void canSpeak(boolean canSpeak){
		hCanSpeak = canSpeak;
	}
	void humanAge(int age){
		hAge = age;
	}
	void showDetails(){
		System.out.println("human name->"+hName);
		System.out.println("human age ->"+hAge);
		System.out.println("human speak ->"+hCanSpeak);
	}
	public static void main(String []args){
		Human human = new Human();
		human.humanName("Techno");
		human.humanAge(2);
		human.canSpeak(false);
		human.showDetails();
	}
}
