package priyanka_Panat;

/*
 Assignment 3
 */

class ITProfessional{
	String empname;
	boolean partyOnWeekend;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean addictedToAlcohol;
	
	void empName(String ename){
		empname=ename;
	}
	
	void doesPartyOnWeekend(boolean Weekend){
		partyOnWeekend=Weekend;
	}
	
	void isAddictedToTea(boolean Tea){
		addictedToTea=Tea;
	}
	
	void isAddictedToCoffee(boolean Coffee){
		addictedToCoffee=Coffee;
	}
	
	void isAddictedToAlcohol(boolean Alcohol){
		addictedToAlcohol=Alcohol;
	}
	
	void displayInformation(){
		System.out.println("Name of Employee  is : "+ empname);
		System.out.println("Does employee party on Weekend : "+ partyOnWeekend);
		System.out.println("Is employee addicted to Tea : "+ addictedToTea);
		System.out.println("Is employee addicted to Coffee : "+ addictedToCoffee);
		System.out.println("Is employee addicted to Alcohol : "+ addictedToAlcohol);
	}
		
	public static void main(String[] args){
		ITProfessional p1=new ITProfessional();
		p1.empName("Priyanka");
		p1.doesPartyOnWeekend(true);
		p1.isAddictedToTea(false);
		p1.isAddictedToCoffee(true);
		p1.isAddictedToAlcohol(false);
		p1.displayInformation();
	}
}
		
		
	