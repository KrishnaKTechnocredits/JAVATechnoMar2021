package ravindra_V;

class ITProfessional{
	
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;

	void employeeName(String name){
		empName = name;
	}

	void doesPartyOnWeekend(boolean weekendParty){
		doesPartyOnWeekend = weekendParty;
	}
	
	void isAddictedToTea(boolean teaAddicted){
		isAddictedToTea = teaAddicted;
	}	
	
	void isAddictedToCoffee(boolean coffeeAddicted){
		isAddictedToCoffee = coffeeAddicted;
	}
		
	void isAddictedToAlcohol(boolean alcoholAddicted){
		isAddictedToAlcohol = alcoholAddicted;
	}
	
	void displayInformation(){
		System.out.println("Employee name is = " + empName);
		System.out.println("Party on weekend = " + doesPartyOnWeekend);
		System.out.println("Is Addicted to Tea = " + isAddictedToTea);
		System.out.println("Is Addicted to Coffee = " + isAddictedToCoffee);
		System.out.println("Is Addicted to Alcohol = " + isAddictedToAlcohol);
	}
	
	public static void main(String[] args){
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.employeeName("Ravindra");
		itprofessional.doesPartyOnWeekend(true);
		itprofessional.isAddictedToTea(true);
		itprofessional.isAddictedToCoffee(false);
		itprofessional.isAddictedToAlcohol(false);
		itprofessional.displayInformation();
	}
}	