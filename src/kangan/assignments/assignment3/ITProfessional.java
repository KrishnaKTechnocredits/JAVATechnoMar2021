package kangan.assignments.assignment3;

public class ITProfessional {
	String eName;
	boolean ans;
	boolean ans1;
	boolean ans2;
	boolean ans3;
	
	void empName(String name) {
		eName = name;
	}
	void doesPartyOnWeekend(boolean flag) {
		ans = flag;
	}
	void isAddictedToTea(boolean flag1) {
		ans1 = flag1;
	}
	void isAddictedToCoffee(boolean flag2) {
		ans2 = flag2;
	}
	void isAddictedToAlcohol(boolean flag3) {
		ans3 = flag3;
	}
	void displayInformation() {
		System.out.println("Employee name is " + eName);
		System.out.println(eName + " party on weekend : " + ans);
		System.out.println(eName + " is Addicted to tea : " + ans1);
		System.out.println(eName + " is Addicted to coffee : " + ans2);
		System.out.println(eName + " is Addicted to alcohol : " + ans3);
	}

	public static void main(String[] args) {
		ITProfessional itProfessional = new ITProfessional();
		itProfessional.empName("Kangan");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(false);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
	}
}
