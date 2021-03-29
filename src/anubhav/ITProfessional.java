/*Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed */
package anubhav;

class ITProfessional{
	String employeeName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void empName(String c_employeeName){
		employeeName= c_employeeName;
	}
	
	void doesPartyOnWeekend(boolean c_doesPartyOnWeekend){
		doesPartyOnWeekend= c_doesPartyOnWeekend;
	}
	
	void isAddictedToTea(boolean c_isAddictedToTea){
		isAddictedToTea= c_isAddictedToTea;
	}
	
	void isAddictedToCoffee(boolean c_isAddictedToCoffee){
		isAddictedToCoffee= c_isAddictedToCoffee;
	}
	
	void isAddictedToAlcohol(boolean c_isAddictedToAlcohol){
		isAddictedToAlcohol= c_isAddictedToAlcohol;
	}
	
	void displayInformation(){
		System.out.println("Name of employee is " + employeeName);
		System.out.println("Does " + employeeName + " party on weekend? :" + doesPartyOnWeekend);
		System.out.println("Is " + employeeName + " addicted to Tea? :" + isAddictedToTea);
		System.out.println("Is " + employeeName + " addicted to Coffee? :" + isAddictedToCoffee);
		System.out.println("Is " + employeeName + " addicted to Alcohol? :" + isAddictedToAlcohol);
	}
	
	public static void main (String[] args){
		ITProfessional c_itProfessional = new ITProfessional();
		c_itProfessional.empName("Bob Watson");
		c_itProfessional.doesPartyOnWeekend(true);
		c_itProfessional.isAddictedToTea(true);
		c_itProfessional.isAddictedToCoffee(false);
		c_itProfessional.isAddictedToAlcohol(false);
		c_itProfessional.displayInformation();
	}
}

