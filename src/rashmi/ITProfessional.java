package rashmi;
public class ITProfessional{
	String name;
	boolean party,teaAddict,coffeeAddict,alcoholAddict;
	 
	void empName(String eName){
		name = eName;
	}
	
	void doesPartyOnWeekend(boolean doesParty){
		party = doesParty;
	}
	
	void isAddictedToTea(boolean empTea){
		teaAddict = empTea;
	}
	
	void isAddictedToCoffee(boolean empCoffee){
		coffeeAddict = empCoffee;
	}
	
	void isAddictedToAlcohol(boolean empAlcohol){
		alcoholAddict = empAlcohol;
	}
	
	void displayInformation(){
		System.out.println("Name of employee : " + name);
		System.out.println("Does employee party on weekend : " + party);
		System.out.println("Does employee addicted to tea : " + teaAddict);
		System.out.println("Does employee addicted to coffee : " + coffeeAddict);
		System.out.println("Does employee addicted to alcohol : " + alcoholAddict);
	}
	
	public static void main(String[] args){
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Deepak");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToTea(false);
		itProfessional.isAddictedToCoffee(true);
		itProfessional.isAddictedToAlcohol(true);
	    itProfessional.displayInformation();
	}
}
