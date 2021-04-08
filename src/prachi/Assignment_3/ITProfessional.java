package prachi.Assignment_3;

//Assignment_3_Program_4
//4. Create a class named as ITProfessional which contain below methods  
//       a. empName()  
//       b. doesPartyOnWeekend()  
//      c. isAddictedToTea()  
//       d. isAddictedToCoffee()  
//      e. isAddictedToAlcohol() 
//       f. displayInformation()
//Hint: One String, 4 boolean variable needed

class ITProfessional{
	
	String Name;
	boolean PartyOnWeekend, AddictedToTea, AddictedToCoffee, AddictedToAlcohol;

    void empName(String empname){
		Name=empname;
	}

    void  doesPartyOnWeekend(boolean party){
		PartyOnWeekend=party;
	}
	
	void isAddictedToTea(boolean tea){
		AddictedToTea=tea;
	}
	
	void isAddictedToCoffee(boolean coffee){
		AddictedToCoffee=coffee;
	}
	
	void isAddictedToAlcohol(boolean alcohol){
		AddictedToAlcohol=alcohol;
	}
	
	void displayInformation(){
        System.out.println("Employee Name is: "+Name);
		System.out.println("Does we have party on weekend?: "+PartyOnWeekend);
		System.out.println("Is Addicted to Tea?: "+AddictedToTea);
		System.out.println("Is Addicted to Coffee?: "+AddictedToCoffee);
		System.out.println("Is Addictedto Alcohol?: "+AddictedToAlcohol);
	}
	
	public static void main(String[] args){
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.empName("Prachi Lonkar");
		itprofessional.doesPartyOnWeekend(true);
		itprofessional.isAddictedToTea(false);
		itprofessional.isAddictedToCoffee(false);
		itprofessional.isAddictedToAlcohol(true);
		itprofessional.displayInformation();
	}
}