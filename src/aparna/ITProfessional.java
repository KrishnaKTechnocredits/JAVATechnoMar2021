/*4.Create a class named as ITProfessional which contain below methods a. empName()  b. doesPartyOnWeekend()  c. isAddictedToTea()  d. isAddictedToCoffee()  
e. isAddictedToAlcohol() f. displayInformation()Hint: One String,4 boolean variable needed*/
package aparna;

class ITProfessional {
	String employeeName;
	boolean partyOnWeekend, addictedToTea, addictedToCoffee, addictedToAlcohol;

	void empName(String name) {
		employeeName = name;
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
		System.out.println("IT Professional Employee Name is:->" + employeeName);
		System.out.println("Is Employee do party On Weekends?:->" + partyOnWeekend);
		System.out.println("Is Employee is Addicted to Tea?:->" + addictedToTea);
		System.out.println("Is Employee is Addicted to Coffee?:->" + addictedToCoffee);
		System.out.println("Is Employee is Addicted to Alcohol?:->" + addictedToAlcohol);
	}

	public static void main(String[] args) {
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Jyoti Singh Baghel");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToTea(false);
		itProfessional.isAddictedToCoffee(true);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
	}
}