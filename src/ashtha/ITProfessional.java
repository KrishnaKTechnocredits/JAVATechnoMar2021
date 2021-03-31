package ashtha;

class ITProfessional {
	String employeeName;
	boolean partyOnWeekend;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean addictedToAlcohol;
	
	void empName(String eName){
		employeeName = eName;
	}
	
	void doesPartyOnWeekend(boolean weekendParty){
		partyOnWeekend = weekendParty;
	}
	
	void isAddictedToTea(boolean teaAddict){
		addictedToTea = teaAddict;
	}
	
	void isAddictedToCoffee(boolean coffeeAddict){
		addictedToCoffee = coffeeAddict;
	}
	
	void isAddictedToAlcohol(boolean alcoholAddict){
		addictedToAlcohol = alcoholAddict;
	}

	void displayInformation(){
		System.out.println("The employee name is "+employeeName);
		System.out.println("Does the employee party on weekends? : "+partyOnWeekend);
		System.out.println("Is the employee a tea addict? : "+addictedToTea);
		System.out.println("Is the employee a coffee addict? : "+addictedToCoffee);
		System.out.println("Is the employee an alcoholic? : "+addictedToAlcohol);
	}
	
	public static void main(String[] args){
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Astha Prakash");
		itProfessional.doesPartyOnWeekend(false);
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(true);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
	}
}
		
	
	