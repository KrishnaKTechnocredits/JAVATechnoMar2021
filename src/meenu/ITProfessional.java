package meenu;

/*Assignment_3 -> Program_4: Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
    */    

class ITProfessional{
	String employeeName;
	boolean partyOnWeekend;
	boolean isTeaAddicted;
	boolean isCoffeeAddicted;
	boolean isAlcoholAddicted;
	
	void empName(String name){
		employeeName = name;
	}

	void doesPartyOnWeekend(boolean weekendParty){
		partyOnWeekend = weekendParty;	
	}

	void isAddictedToTea(boolean teaAddicted){
		isTeaAddicted = teaAddicted;
	}

	void isAddictedToCoffee(boolean cofeeAddicted){
		isCoffeeAddicted = cofeeAddicted;
	}

	void isAddictedToAlcohol(boolean alcoholAddicted){
		isAlcoholAddicted = alcoholAddicted;
	}

	void displayInformation(){
		System.out.println("Name of employee      : "+employeeName);
		System.out.println("Does party on weekend : "+partyOnWeekend);
		System.out.println("Is Addicted to Tea    : "+isTeaAddicted);
		System.out.println("Is Addicted to Coffee : "+isCoffeeAddicted);
		System.out.println("Is Addicted to Alcohol: "+isAlcoholAddicted);
	}

	public static void main(String[] args){
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Paras");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToTea(false);
		itProfessional.isAddictedToCoffee(true);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
	}
}	


//Create a class named as ITProfessional which contain below methods         
    // a. empName()  
    //b. doesPartyOnWeekend()          
   //c. isAddictedToTea()  
   //d. isAddictedToCoffee()  
   //e. isAddictedToAlcohol() 
   //f. displayInformation()
//Hint: One String, 4 boolean variable needed
//Note: In Console Print statement in a proper way. 