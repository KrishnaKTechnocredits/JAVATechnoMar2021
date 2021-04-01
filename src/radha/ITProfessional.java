/*Assignment 3- Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed*/
package radha;

class ITProfessional{
	String name;
	boolean doesParty;
	boolean addictedToCoffee;
	boolean addictedToTea;
	boolean addictedToAlcohol;
	
	void empName(String eName){
		name = eName;
	}
	
	void doesPartyOnWeekend(boolean party){
		doesParty = party;
	}
	
	void isAddictedToTea(boolean tea){
		addictedToTea = tea;
	}
	
	void isAddictedToCoffee(boolean coffee){
		addictedToCoffee = coffee;
	}
	
	void isAddictedToAlcohol(boolean alcohol){
		addictedToAlcohol = alcohol;
	}
	
	void displayInformation(){
		System.out.println("Name of the employee is: "+name);
		System.out.println("Does the employee party on weekend? "+doesParty);
		System.out.println("Is the employee addicted to Tea?: "+addictedToTea);
		System.out.println("Is the employee addicted to Coffee?: "+addictedToCoffee);
		System.out.println("Is the employee addicted to Alcohol?: "+addictedToAlcohol);
	}
	
	public static void main(String[] args){
		ITProfessional prof = new ITProfessional();
		prof.empName("Radha");
		prof.doesPartyOnWeekend(true);
		prof.isAddictedToTea(true);
		prof.isAddictedToCoffee(false);
		prof.isAddictedToAlcohol(false);
		prof.displayInformation();
	}
}