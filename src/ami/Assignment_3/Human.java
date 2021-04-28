package ami.Assignment_3;

/*
3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. 
 */

public class Human {
	String hmnName;
	boolean hmnSpk;
	int hmnAge;
	
	
	void humanName(String humanName) {
		hmnName = humanName;
	}
	
	void canSpeak(Boolean canSpeak) {
		hmnSpk = canSpeak;
	}

	void humanAge(int humanAge) {
		hmnAge = humanAge;
	}
	
	void showDetails() {
		System.out.println("Name of Human is : " + hmnName);
		System.out.println("Is human spea : " + hmnSpk);
		System.out.println("Age of Human is : " + hmnAge);
	}
	
	public static void main(String[] a) {
		Human human = new Human();
		human.humanName("Lata");
		human.canSpeak(true);
		human.humanAge(35);
		human.showDetails();

	}

}
