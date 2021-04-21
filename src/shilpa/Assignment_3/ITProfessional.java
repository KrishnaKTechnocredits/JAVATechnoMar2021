//4. Create a class named as ITProfessional which contain below methods  
//        a. empName()  
//        b. doesPartyOnWeekend()  
//        c. isAddictedToTea()  
//        d. isAddictedToCoffee()  
//        e. isAddictedToAlcohol() 
//        f. displayInformation()
//Hint: One String, 4 boolean variable needed

package shilpa.Assignment_3;

class ITProfessional{
	String EmployeeName;
	boolean PartyOnWeekend;
	boolean AddictedToTea;
	boolean AddictedToCoffee;
	boolean AddictedToAlcohol;
		
	void empName(String name){		
		EmployeeName = name;
	}
	
	void doesPartyOnWeekend(boolean weekendparty){		
		PartyOnWeekend = weekendparty;
	}
	
	void isAddictedToTea(boolean addictedtotea){
		AddictedToTea = addictedtotea;
	}
	
	void isAddictedToCoffee(boolean addictedtocoffee){
		AddictedToCoffee = addictedtocoffee;
	}
	
	void isAddictedToAlcohol(boolean addictedtoalcohol){
		AddictedToAlcohol = addictedtoalcohol;
	}
	
	void ShowDetails(){		
		
		System.out.println("Employee Name is :                        "+ EmployeeName);
		System.out.println("Does this employee party on Weekend :     "+PartyOnWeekend);
		System.out.println("Does this employee addicted to Tea: :     "+ AddictedToTea);
		System.out.println("Does this employee addicted to Coffee:    "+ AddictedToCoffee);
		System.out.println("Does this employee addicted to Alcohol:   "+ AddictedToAlcohol);
	}
	
	public static void main(String[] args){
		ITProfessional ITprofessional = new ITProfessional();
		ITprofessional.empName("Sahil");
		ITprofessional.doesPartyOnWeekend(true);
		ITprofessional.isAddictedToTea(true);
		ITprofessional.isAddictedToCoffee(false);
		ITprofessional.isAddictedToAlcohol(false);
		ITprofessional.ShowDetails();
	}
}
		
	
