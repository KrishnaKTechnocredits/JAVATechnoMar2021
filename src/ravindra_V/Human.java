//Assignment3

package ravindra_V;

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
		System.out.println("Name of Human is = " + name);
		System.out.println("Can Human Speak = " + canSpeak);
		System.out.println("Age of the Human is = " + age);
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Ravindra");
		human.canSpeak(true);
		human.humanAge(55);
		human.showDetails();
	}
}	