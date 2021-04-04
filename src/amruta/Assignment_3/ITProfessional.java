/*
 * 4. Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed
 */

package amruta.Assignment_3;

class ITProfessional{
	String employeeName;
	boolean weekendParty, addictedtoTea, addictedtoCoffee, addictedtoAlcohol;
	
	void empName(String name){
		employeeName = name;
	}
	void doesPartyOnWeekend(boolean party){
		weekendParty = party;
	}
	void isAddictedToTea(boolean teaaddiction){
		addictedtoTea = teaaddiction;
	}
	void isAddictedToCoffee(boolean coffeeaddiction){
		addictedtoCoffee = coffeeaddiction;
	}
	void isAddictedToAlcohol(boolean alcoholaddiction){
		addictedtoAlcohol = alcoholaddiction;
	}
	void displayInformation(){
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Does the party on weekend: "+weekendParty);
		System.out.println("Tea Addicted : "+addictedtoTea);
		System.out.println("Coffee Addicted : "+addictedtoCoffee);
		System.out.println("Alcohol Addicted : "+addictedtoAlcohol);
		System.out.println("Information of employee : "+addictedtoTea);
	}
    
	public static void main(String[] args){
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.empName("XYZ");
		itprofessional.doesPartyOnWeekend(true);
		itprofessional.isAddictedToTea(true);
		itprofessional.isAddictedToCoffee(true);
		itprofessional.isAddictedToAlcohol(true);
		itprofessional.displayInformation();
	}
}