package sai;

class ITProfessional{

	String name;
	boolean partyonWeekend, addictedToTea, addictedToCoffee, addictedToAlcohol;
	
	void empName(String empName){
		name = empName;
	}

	void doesPartyOnWeekend(boolean weekendFlag){
		partyonWeekend = weekendFlag;
	}
	
	void isAddictedToTea(boolean teaFlag){
		addictedToTea = teaFlag;
	}
	
	void isAddictedToCoffee(boolean coffeeFlag){
		addictedToCoffee = coffeeFlag;
	}

	void isAddictedToAlcohol(boolean alcoholFlag){
		addictedToAlcohol = alcoholFlag;
	}
	
	void displayInformation(){
		System.out.println("Name of the employee is " + name);
		System.out.println("Does employee party ion weekend ? "+ partyonWeekend);
		System.out.println("Is employee addicted to Tea ? "+ addictedToTea);
		System.out.println("Is employee addicted to Coffee ? "+ addictedToCoffee);
		System.out.println("Is employee addicted to Alcohol ? "+ addictedToAlcohol);
	}
	
	public static void main(String[] args){
		ITProfessional employee = new ITProfessional();
		employee.empName("Sai Krishna NK");
		employee.doesPartyOnWeekend(true);
		employee.isAddictedToTea(false);
		employee.isAddictedToCoffee(false);
		employee.isAddictedToAlcohol(false);
		employee.displayInformation();
	}
}