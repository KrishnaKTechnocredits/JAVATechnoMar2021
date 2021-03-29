 
//*4. Create a class named as ITProfessional which contain below methods*  
//      a. empName()  
//        b. doesPartyOnWeekend()  
//        c. isAddictedToTea()  
//        d. isAddictedToCoffee()  
//        e. isAddictedToAlcohol() 
//        f. displayInformation()
//Hint: One String, 4 boolean variable needed

package krati_Jain;

class ITProfessional {
	String professionalName;
	boolean professionalPartyHabit;
	boolean professionalTeaAddict;
	boolean professionalCoffeeAddict;
	boolean professionalAlcoholAddict;

	void empName(String name) {
		professionalName = name;
	}
			
	void doesPartyOnWeekend(boolean flag1) {
		professionalPartyHabit = flag1;
	}

	void professionalTeaAddict(boolean flag2) {
		professionalTeaAddict = flag2;
	}
	
	void professionalCoffeeAddict(boolean flag3) {
		professionalCoffeeAddict = flag3;
	}
	
	void professionalAlcoholAddict(boolean flag4) {
		professionalAlcoholAddict = flag4;
	}

	void displayInformation() {
		System.out.println ("Name of the IT Professional : " + professionalName);
		System.out.println ("Does Professional likes to party on Weekend? : " + professionalPartyHabit);
		System.out.println ("Is Professional addicted to Tea? : " + professionalTeaAddict);
		System.out.println ("Is Professional addicted to Coffee? : " + professionalCoffeeAddict);
		System.out.println ("Is Professional addicted to Alcohol? : " + professionalAlcoholAddict);
	}
	
	public static void main(String[] a) {
		ITProfessional iTProfessional = new ITProfessional();
		iTProfessional.empName("Krati Jain");
		iTProfessional.doesPartyOnWeekend(true);
		iTProfessional.professionalTeaAddict(true);
		iTProfessional.professionalCoffeeAddict(false);
		iTProfessional.professionalAlcoholAddict(false);
		iTProfessional.displayInformation();
	}
}