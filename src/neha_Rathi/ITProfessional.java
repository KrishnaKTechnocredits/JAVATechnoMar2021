/*
 * Assignment 3_4
 * Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
 */
package neha_Rathi;

class ITProfessional {
	String empName;
	boolean partyOnWeekend;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean addictedToAlcohol;

	void empName(String name) {
		empName = name;
	}

	void doesPartyOnWeekend(boolean flag) {
		partyOnWeekend = flag;
	}

	void isAddictedToTea(boolean flag) {
		addictedToTea = flag;
	}

	void isAddictedToCoffee(boolean flag) {
		addictedToCoffee = flag;
	}

	void isAddictedToAlcohol(boolean flag) {
		addictedToAlcohol = flag;
	}

	void displayInformation() {
		System.out.println("Employee Name is: " + empName);
		System.out.println("does " + empName + " Party On Weekend ? " + partyOnWeekend);
		System.out.println("Is " + empName + " addicted to tea ? " + addictedToTea);
		System.out.println("Is " + empName + " addicted to coffee ? " + addictedToCoffee);
		System.out.println("Is " + empName + " addicted to alcohol? " + addictedToAlcohol);
	}

	public static void main(String[] args) {
		ITProfessional professional = new ITProfessional();
		professional.empName("Neha");
		professional.doesPartyOnWeekend(true);
		professional.isAddictedToTea(false);
		professional.isAddictedToCoffee(false);
		professional.isAddictedToAlcohol(false);
		professional.displayInformation();
	}
}