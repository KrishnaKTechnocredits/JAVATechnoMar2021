// create a class ITProfessional which contain method 
// a. empName(),  b.doesPartyweekend(), c. isAddictedToTea(), d. isAddictedToCoffee(), e. isAddictedToAlcohol(), f.displayInformantion().

package ashwini;

class ITProfessional{
	String empName;
	boolean doesPartyweekend, isAddictedToTea, isAddictedToCoffee, isAddictedToAlcohol;
	
	void empName(String name){
		empName = name;
	}
	
	void doesPartyweekend(boolean b1){
		doesPartyweekend = b1;
	}
	
	void isAddictedToTea(boolean b2){
		isAddictedToTea = b2;
	}
	void isAddictedToCoffee(boolean b3){
		isAddictedToCoffee = b3;
	}
	
	void isAddictedToAlcohol(boolean b4){
		isAddictedToAlcohol = b4;
	}
	
	void displayInformantion(){
		System.out.println("Name of employee: "+ empName);
		System.out.println("does employee party at weekend :"+ doesPartyweekend);
		System.out.println("Is employee addicted to tea: "+ isAddictedToTea);
		System.out.println("Is employee addicted to coffee:" + isAddictedToCoffee);
		System.out.println("Is employee addicted to alcohol:" + isAddictedToAlcohol);
	}
	
	public static void main(String args[]){
		ITProfessional ITProfessional = new ITProfessional();
		ITProfessional.empName("Ashwini Jadhav");
		ITProfessional.doesPartyweekend(true);
		ITProfessional.isAddictedToTea(true);
		ITProfessional.isAddictedToCoffee(false);
		ITProfessional.isAddictedToAlcohol(false);
		ITProfessional.displayInformantion();
	}
}