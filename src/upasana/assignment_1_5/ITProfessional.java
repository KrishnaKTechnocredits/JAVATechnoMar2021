package upasana.assignment_1_5;

class ITProfessional{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void empName(String eName){
		empName = eName;
	}
	
	void doesPartyOnWeekend(boolean partyOnWeekend){
		doesPartyOnWeekend = partyOnWeekend;
	}
	
	void isAddictedToTea(boolean addictedToTea){
		isAddictedToTea = addictedToTea;
	}
	
	void isAddictedToCoffee(boolean addictedToCoffee){
		isAddictedToCoffee = addictedToCoffee;
	}
	
	void isAddictedToAlcohol(boolean addictedToAlcohol){
		isAddictedToAlcohol = addictedToAlcohol;
	}
	
	void displayInformation(){
		System.out.println("Employee Name is "+empName);
		System.out.println("Does she party on weekend ? "+doesPartyOnWeekend);
		System.out.println("Is she addicted to tea ? "+isAddictedToTea);
		System.out.println("Is she addicted to Coffee ? "+isAddictedToCoffee);
		System.out.println("Is she addicted to alcohol ? "+isAddictedToAlcohol);

	}
	public static void main(String[] args){
		ITProfessional iTProfessional = new ITProfessional();
		iTProfessional.empName("Upasana");
		iTProfessional.doesPartyOnWeekend(true);
		iTProfessional.isAddictedToTea(true);
		iTProfessional.isAddictedToCoffee(true);
		iTProfessional.isAddictedToAlcohol(false);
		iTProfessional.displayInformation();
	}
}
