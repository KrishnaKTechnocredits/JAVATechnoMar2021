//3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak*  
//a. humanName()  
//b. canSpeak()  
//c. humanAge()  
//d. showDetails() 
//Hint: One String, one boolean, one int variable needed. 

package krati_Jain;

class Human {
	String nameOfHuman;
	boolean canHumanSpeak;
	int ageofHuman;

	void humanName(String name) {
		nameOfHuman = name;
	}
			
	void canSpeak(boolean flag) {
		canHumanSpeak = flag;
	}

	void humanAge(int age) {
	ageofHuman = age;
	}

	void showDetails() {
		System.out.println ("Name of the person : " + nameOfHuman);
		System.out.println ("Can the person speak? : " + canHumanSpeak);
		System.out.println ("Age of the person : " + ageofHuman);
	}
	
	public static void main(String[] a) {
		Human human = new Human();
		human.humanName("KJ");
		human.canHumanSpeak = (true);
		human.ageofHuman = (20);
		human.showDetails();
	}
}