package krati_Shukla;

class ITProfessional
{
	String name;
	boolean partyOnWeekend;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean addictedToAlcohol;
	
	void empName(String eName){
		name = eName;
	}
	void doesPartyOnWeekend(boolean flag1){
		partyOnWeekend = flag1;
	}
	void isAddictedToTea(boolean flag2){
		addictedToTea = flag2;
	}
	void isAddictedToCoffee(boolean flag3){
		addictedToCoffee = flag3;
	}
	void isAddictedToAlcohol(boolean flag4){
			addictedToAlcohol = flag4;
	}
	void displayInformation(){
		System.out.println("Name of the employee is ="+name);
		System.out.println("Does "+name+" Paty on weekend ="+partyOnWeekend);
		System.out.println("Is "+name+" addicted to Tea ="+addictedToTea);
		System.out.println("Is "+name+" addicted to Coffee ="+addictedToCoffee);
		System.out.println("Is "+name+" addicted to Alcohol ="+addictedToAlcohol);
	}
	public static void main (String[] a)
	{
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Krati");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToTea(true);
		itProfessional.displayInformation();
	}
}
	
	

	