/* 
 * Assignment 3 class Itprofessional with 6 methods
 */
package purva;
class ItProfessional{
	String name;
	boolean doesParty;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean	addictedToAlcohol;
	
	void humanName(String nm){
		name=nm;
	}
	
	void doesPartyOnWeekeend(boolean flag){
		doesParty = flag;
	}
	
	void isAddictedToTea(boolean flag){
		addictedToTea = flag;
	}
	
	void isAddictedToCoffee(boolean flag){
		addictedToCoffee = flag ;
	}
    
	void isAddictedToAlcohol(boolean flag){
		addictedToAlcohol = flag;
	}
	
	void displayInformation(){
		System.out.println("name of employee is "+name);
		System.out.println("Does employee party on weekeend "+doesParty);
		System.out.println("Is employee addicted to tea "+addictedToTea );
		System.out.println("Is employee addicted to coffee "+addictedToCoffee);
		System.out.println("Is employee addicted to alcohol "+addictedToAlcohol);
	}
		
	public static void main(String[] args){
		ItProfessional itProfessional = new ItProfessional();
        itProfessional.humanName("Purva");
        itProfessional.doesPartyOnWeekeend(false);
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(false);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
	}
}
