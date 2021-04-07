//3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
//	a. humanName()  
//	b. canSpeak()  
//	c. humanAge()  
//	d. showDetails() 
//Hint: One String, one boolean, one int variable needed. 
package shilpa.Assignment_1_5;

class Human{
	String Name;
	boolean canspeak;
	double humanage;
	
	void HumanName(String name){		
		Name = name;
	}
	
	void CanSpeak(boolean speak){		
		canspeak = speak;
	}
	
	void HumanAge(double age){
		humanage=age;
	}
	
	void ShowDetails(){		
		
		System.out.println("Name of a Person is  : "+ Name);
		System.out.println("Person can Speak     : "+ canspeak);
		System.out.println("Age of the Person is : "+ humanage);
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.HumanName("Ivani");
		human.CanSpeak(true);
		human.HumanAge(12);
		human.ShowDetails();
	}
}
		
	
