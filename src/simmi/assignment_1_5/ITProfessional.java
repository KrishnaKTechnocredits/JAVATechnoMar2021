/*Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed*/

package simmi.assignment_1_5;

class ITProfessional{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void employeeName(String e_empName){
		empName = e_empName;
	}
	
	void doesPartyOnWeekend(boolean flag){
		doesPartyOnWeekend = flag;
	}
	
	void isAddictedToTea(boolean flag1){
		isAddictedToTea = flag1;
	}
	
	void isAddictedToCoffee(boolean flag2){
		isAddictedToCoffee = flag2;
	}
	
	void isAddictedToAlcohol(boolean flag3){
		isAddictedToAlcohol = flag3;
	}
	
	void displayInformation(){
		System.out.println("Employee name is : " + empName);
		System.out.println("Employee does party on weekends : " + doesPartyOnWeekend);
		System.out.println("Employee is addicted to Tea : " + isAddictedToTea);
		System.out.println("Employee is addicted to Coffee : " + isAddictedToCoffee);
		System.out.println("Employee is addicted to Alcohol : " + isAddictedToAlcohol);
	}
	
	public static void main(String[] args){
		ITProfessional it = new ITProfessional();
		it.employeeName("David");
		it.doesPartyOnWeekend(true);
		it.isAddictedToTea(false);
		it.isAddictedToCoffee(false);
		it.isAddictedToAlcohol(true);
		it.displayInformation();
	}
}
		
	