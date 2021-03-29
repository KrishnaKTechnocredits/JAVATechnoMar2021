/*Java Assignment 3: 23rd March 2021

4. Create a class named as ITProfessional which contain below methods
a. empName()
b. doesPartyOnWeekend()
c. isAddictedToTea()
d. isAddictedToCoffee()
e. isAddictedToAlcohol()
f. displayInformation()
Hint: One String, 4 boolean variable needed

Note: In Console Print statement in a proper way.

 */

package vaibhav;

class ITProfessional{
	
	String employeeName;
	boolean weekendParty;
	boolean adictedToTea;
	boolean adictedToCoffee;
	boolean adictedToAlcohol;
	
	void empName(String eName){
		employeeName = eName;
	}
	
	void doesPartyOnWeekend(boolean partyWeekend){
		weekendParty = partyWeekend;
	}
		
	void isAddictedToTea(boolean teaAddiction){
		adictedToTea = teaAddiction;
	}
	
	void isAddictedToCoffee(boolean coffeeAddiction){
		adictedToCoffee = coffeeAddiction;
	}
	
	void isAddictedToAlcohol(boolean alcoholAddiction){
		adictedToAlcohol = alcoholAddiction;
	}
	
	void displayInformation(){
		System.out.println( employeeName + " is an IT professional");
		System.out.println( "He / She does party on weekend ==> " + weekendParty);
		System.out.println( "He / She addicted to Tea       ==> " + adictedToTea);
		System.out.println( "He / She addicted to Coffee    ==> " + adictedToCoffee);
		System.out.println( "He / She addicted to Alcohol   ==> " + adictedToAlcohol);
	}
		
	public static void main(String[] args){
		ITProfessional iTProfessional = new ITProfessional();
		iTProfessional.empName("TechnoCredits");
		iTProfessional.doesPartyOnWeekend(false);
		iTProfessional.isAddictedToTea(true);
		iTProfessional.isAddictedToCoffee(false);
		iTProfessional.isAddictedToAlcohol(false);
		iTProfessional.displayInformation();
	} 
}	
