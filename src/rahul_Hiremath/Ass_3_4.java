package rahul_Hiremath;

class Ass_3_4{
	String empName;
	boolean empParty;
	boolean empAddictedToTea;
	boolean empAddictedToCoffee;
	boolean empAddictedToAlcohol;
	void eName(String name){
		empName = name;
	}
	void doesPartyOnWeekend(boolean party){
		empParty = party;
	}
	void isAddictedToTea(boolean tea){
		empAddictedToTea = tea;
	}
	void isAddictedToCoffee(boolean coffee){
		empAddictedToCoffee = coffee;
	}
	void isAddictedToAlcohol(boolean alcohol){
		empAddictedToAlcohol = alcohol;
	}
	void displayInformation(){
		System.out.println("Employee name is: " + empName);
		System.out.println("Employee name is: " + empParty);
		System.out.println("Employee name is: " + empAddictedToTea);
		System.out.println("Employee name is: " + empAddictedToCoffee);
		System.out.println("Employee name is: " + empAddictedToAlcohol);	
	}
	public static void main (String[] args){
		Ass_3_4 ITProfessional = new Ass_3_4();
		ITProfessional.eName("Rahul Hiremath");
		ITProfessional.doesPartyOnWeekend(true);
		ITProfessional.isAddictedToTea(false);
		ITProfessional.isAddictedToCoffee(false);
		ITProfessional.isAddictedToAlcohol(false);
		ITProfessional.displayInformation();
	}
}