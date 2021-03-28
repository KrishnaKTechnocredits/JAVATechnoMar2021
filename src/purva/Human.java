/* 
 * Assignment 3 class human with 4 methods 
 */
package purva;

class Human{
    String personName;
	boolean canPersonSpeak;
	int personAge;
	
	void humanName(String name){
		personName = name;
	}
	
	void canSpeak(boolean flag){
		canPersonSpeak = flag;
	}
	
	void humanAge(int age){
		personAge = age;
	}
	
	void showDetails(){
		System.out.println("Name is "+personName);
		System.out.println("Can speak? "+canPersonSpeak);
		System.out.println("Age is "+personAge);
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Purva");
		human.canSpeak(true);
		human.humanAge(27);
		human.showDetails();
	}
		
}
