/*
 Assignment 03
 Program 04
 Create a class named as ITProfessional which contain below methods
	a. empName()
	b. doesPartyOnWeekend()
	c. isAddictedToTea()
	d. isAddictedToCoffee()
	e. isAddictedToAlcohol()
	f. displayInformation()
	Hint: One String, 4 boolean variable needed
 */

package madhavi_Raut;

class ITProfessional {
	String empName;
	boolean doesPartyOnWeekend, isAddictedToTea, isAddictedToCoffee, isAddictedToAlcohol;

	void empName(String name) {
		empName = name;
	}

	void doesPartyOnWeekend(boolean partyOnWeekend) {
		doesPartyOnWeekend = partyOnWeekend;
	}

	void isAddictedToTea(boolean addictedToTea) {
		isAddictedToTea = addictedToTea;
	}

	void isAddictedToCoffee(boolean addictedToCoffee) {
		isAddictedToCoffee = addictedToCoffee;
	}

	void isAddictedToAlcohol(boolean addictedToAlcohol) {
		isAddictedToAlcohol = addictedToAlcohol;
	}

	void displayInformation() {
		System.out.println("Employee Name: " + empName + "\n" + "Does he party on weekend: " + doesPartyOnWeekend + "\n"
				+ "Is he addicted to Tea: " + isAddictedToTea + "\n" + "Is he addicted to Coffee: " + isAddictedToCoffee
				+ "\n" + "Is he addicted to Alcohol: " + isAddictedToAlcohol);
	}

	public static void main(String[] args) {
		ITProfessional iTProfessional = new ITProfessional();
		iTProfessional.empName("Daniel");
		iTProfessional.doesPartyOnWeekend(true);
		iTProfessional.isAddictedToTea(true);
		iTProfessional.isAddictedToCoffee(false);
		iTProfessional.isAddictedToAlcohol(false);
		iTProfessional.displayInformation();
	}
}
