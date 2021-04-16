package sandesh.Assignment_3;

public class ITProfessional {
	String empNameInstance;
	boolean weekendPartyInstance;
	boolean teaAddictInstance;
	boolean coffeeAddictInstance;
	boolean alcoholAddictInstance;
	
	void setEmployeeName(String empNameData) {
		empNameInstance = empNameData;
	}
	
	void doesPartyOnWeekend(boolean weekendPartyData) {
		weekendPartyInstance = weekendPartyData;
	}
	
	void isAddictedToTea(boolean teaAddictData) {
		teaAddictInstance = teaAddictData;
	}
	
	void isAddictedToCoffee(boolean coffeeAddictData) {
		coffeeAddictInstance = coffeeAddictData;
	}
	
	void isAddictedToAlcohol(boolean alcoholAddictData) {
		alcoholAddictInstance = alcoholAddictData;
	}		
	
	void displayInformation() {
		System.out.println("Name of Employee is :- " + empNameInstance);
		System.out.println("Does Employee " + empNameInstance + " party on weekend :- " + weekendPartyInstance);
		System.out.println("Is Employee " + empNameInstance + " addicted to Tea :- " + teaAddictInstance);
		System.out.println("Is Employee " + empNameInstance + " addicted to Coffee :- " + coffeeAddictInstance);
		System.out.println("Is Employee " + empNameInstance + " addicted to Alcohol :- " + alcoholAddictInstance);
	}
	
	public static void main(String[] args) {
		ITProfessional itp1 = new ITProfessional();
		String employeeName = "Suresh";
		boolean partysOnWeekend = true;
		boolean teaAddict = true;
		boolean coffeeAddict = true;
		boolean alcoholAddict = false;
		
		itp1.setEmployeeName(employeeName);
		itp1.doesPartyOnWeekend(partysOnWeekend);
		itp1.isAddictedToTea(teaAddict);
		itp1.isAddictedToCoffee(coffeeAddict);
		itp1.isAddictedToAlcohol(alcoholAddict);
		itp1.displayInformation();
	}
}
