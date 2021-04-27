package ami.Assignment_3;

/*
Create a class named as ITProfessional which contain below methods  
a. empName()  
b. doesPartyOnWeekend()  
c. isAddictedToTea()  
d. isAddictedToCoffee()  
e. isAddictedToAlcohol() 
f. displayInformation()
*/

public class ITProfessional {

	String empName;
	boolean party;
	boolean tea;
	boolean coffee;
	boolean alcoho;

	void empName(String empName1) {
		empName = empName1;
	}

	void doesPartyOnWeekend(boolean Party1) {
		party = Party1;
	}

	void isAddictedToTea(boolean Tea1) {
		tea = Tea1;
	}

	void isAddictedToCoffee(boolean Coffee1) {
		coffee = Coffee1;
	}

	void isAddictedToAlcohol(boolean Alcohol) {
		alcoho = Alcohol;
	}

	void displayInformation() {
		System.out.println("Your Company Name : " + empName);
		System.out.println("Party On Weekend : " + party);
		System.out.println("Addicted To Tea : " + tea);
		System.out.println("Addicted To Coffee :" + coffee);
		System.out.println("Addicted To Alcohol :" + alcoho);
	}

	public static void main(String[] a) {
		ITProfessional iTProfessional = new ITProfessional();
		iTProfessional.empName("Ami Lakkad");
		iTProfessional.doesPartyOnWeekend(false);
		iTProfessional.isAddictedToTea(true);
		iTProfessional.isAddictedToCoffee(true);
		iTProfessional.isAddictedToAlcohol(false);
		iTProfessional.displayInformation();
	}

}