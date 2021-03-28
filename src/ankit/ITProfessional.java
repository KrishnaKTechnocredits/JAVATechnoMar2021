/*4. Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed
*/
package ankit;
class ITProfessional{
	String empName = "Ankit";
	boolean partyOnWeekend, addictedToTea, addictedToCoffee, addictedToAlcohol;
	
	void doesPartyOnWeekend(boolean partyweekend){
		partyOnWeekend = partyweekend;
	}  
    void isAddictedToTea(boolean additectedTea){
		addictedToTea = additectedTea;
	}
    void isAddictedToCoffee(boolean addictedCoffee){
		addictedToCoffee = addictedCoffee;
	}  
    void isAddictedToAlcohol(boolean addictedAlcohol){
		addictedToAlcohol = addictedAlcohol;
	} 
    void displayInformation(){
		System.out.println("Name of Employee : "+ empName);
		System.out.println("Do Employee Party on weekends : "+ partyOnWeekend);
		System.out.println("Is Employee addicated to Tea : "+ addictedToTea);
		System.out.println("Is Employee addicated to Coffee: "+ addictedToCoffee);
		System.out.println("Is Employee addicated to Alcohol : "+ addictedToAlcohol);
	}
	public static void main(String[] args){
		ITProfessional iTProfessional = new ITProfessional();
		iTProfessional.doesPartyOnWeekend(true);
		iTProfessional.isAddictedToTea(true);
		iTProfessional.isAddictedToCoffee(false);
		iTProfessional.isAddictedToAlcohol(false);
		iTProfessional.displayInformation();
	}
}