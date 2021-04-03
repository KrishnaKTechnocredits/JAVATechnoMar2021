//4. Create a class named as ITProfessional which contain below methods  
//        a. empName()  
//        b. doesPartyOnWeekend()  
//        c. isAddictedToTea()  
//        d. isAddictedToCoffee()  
//        e. isAddictedToAlcohol() 
//        f. displayInformation()
//Hint: One String, 4 boolean variable needed

/*
Assignment 3 - Program 4 - Program Statement : Create a class named as ITProfessional which contain below methods.
*/

package paras.Assignment_3;

class ITProfessional{
	
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void employeeName(String name){
		empName = name;
	}
	
	void doesPartyOnWeekend(boolean weekendParty){
		doesPartyOnWeekend = weekendParty;
	}
	
	void isAddictedToTea(boolean teaAddicted){
		isAddictedToTea = teaAddicted;
	}
	
	void isAddictedToCoffee(boolean coffeeAddicted){
		isAddictedToCoffee = coffeeAddicted;
	}
	
	void isAddictedToAlcohol(boolean alcoholAddicted){
		isAddictedToAlcohol = alcoholAddicted;
	}
	
	void displayInformation(){
		System.out.println("Employee Name is - " + empName);
		System.out.println("Party on Weekend - " + doesPartyOnWeekend);
		System.out.println("Is Addicted to Tea - " + isAddictedToTea);
		System.out.println("Is Addicted to Coffee - " + isAddictedToCoffee);
		System.out.println("Is Addicted to Alcohol - " + isAddictedToAlcohol);
		
	}
	
	public static void main(String[] args){
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.employeeName("Paras");
		itprofessional.doesPartyOnWeekend(true);
		itprofessional.isAddictedToTea(true);
		itprofessional.isAddictedToCoffee(true);
		itprofessional.isAddictedToAlcohol(false);
		itprofessional.displayInformation();
	}
}