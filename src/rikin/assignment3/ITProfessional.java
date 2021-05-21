package rikin.assignment3;

class ITProfessional{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void setData(String nameOfEmp, boolean weekendParty, boolean addictedToTea, boolean addictedToCoffee, boolean addictedToAlcohol){
		empName = nameOfEmp;
		doesPartyOnWeekend = weekendParty;
		isAddictedToTea = addictedToTea;
		isAddictedToCoffee = addictedToCoffee;
		isAddictedToAlcohol = addictedToAlcohol;
	}
	
	void displayInformation(){
		System.out.println("Employee name is " + empName );
		System.out.println("Is doing party on weekend? : " + doesPartyOnWeekend );
		System.out.println("Is addicted to Tea? : " + isAddictedToTea );
		System.out.println("Is addicted to coffee? : " + isAddictedToCoffee );
		System.out.println("Is addicted to alcohol? : " + isAddictedToAlcohol );
	}
	
	public static void main (String [] args){
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.setData("RIKIN", false, true, true, false);
		itProfessional.displayInformation();
	}
}