//Create a class named as ITProfessional which contain below methods  
// a. empName()  
// b. doesPartyOnWeekend()  
// c. isAddictedToTea()  
// d. isAddictedToCoffee()  
// e. isAddictedToAlcohol() 
// f. displayInformation()
// Hint: One String, 4 boolean variable needed

package komal;

class ITProfessional{
	String Name;
	boolean PartyOnWeekend,AddictedToTea,AddictedToCoffee,AddictedToAlcohol;
	
	void empName(String empname){
		Name = empname;
	}
	void doesPartyOnWeekend(boolean Party){
		PartyOnWeekend = Party;
	}
	void isAddictedToTea(boolean Tea){
		AddictedToTea = Tea;
	}
	void isAddictedToCoffee(boolean Coffee){
		AddictedToCoffee = Coffee;
	}
	void isAddictedToAlcohol(boolean Alcohol){
		AddictedToAlcohol = Alcohol;
	}
	void displayInformation(){
		System.out.println("Emp name is :" +Name);
		System.out.println("Is Party on weekend ? : " +PartyOnWeekend);
		System.out.println("Is Addicted To Tea ? : " +AddictedToTea);
		System.out.println("Is Addicted To Coffee ? : " +AddictedToCoffee);
		System.out.println("Is Addicted To Alcohol ? : " +AddictedToAlcohol);
	}
	public static void main(String[] args){
		ITProfessional itpl = new ITProfessional();
		itpl.empName("Komal");
		itpl.doesPartyOnWeekend(true);
		itpl.isAddictedToTea(false);
		itpl.isAddictedToCoffee(true);
		itpl.isAddictedToAlcohol(false);
		itpl.displayInformation();
	}
}
