package milind;
/* Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable neede
 * 
 */
class Example6{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	void s_empName(String name){
		empName=name;
	}
	void s_doesPartyOnWeekend(boolean partyOnWeekend){
		doesPartyOnWeekend=partyOnWeekend;
	}
	void s_isAddictedToTea(boolean addictedToTea){
		isAddictedToTea=addictedToTea;
	}
	void s_isAddicatedToCoffee(boolean addictedToCoffee){
		isAddictedToCoffee=addictedToCoffee;
	}
	void s_isAddictionToAlcohol(boolean addictedToAlcohol){
		isAddictedToAlcohol=addictedToAlcohol;
	}
	void displayInformation(){
		System.out.println("Employee name is: "+empName);
		System.out.println("Does employee party on weekend: "+doesPartyOnWeekend);
		System.out.println("Is employee addicted to tea: "+isAddictedToTea);
		System.out.println("Is employee addicted to coffee: "+isAddictedToCoffee);
		System.out.println("Is employee addicted alcohol: "+isAddictedToAlcohol);
	}
	public static void main(String[] args){
		Example6 itProfessional=new Example6();
		itProfessional.s_empName("Milind");
		itProfessional.s_doesPartyOnWeekend(true);
		itProfessional.s_isAddictedToTea(true);
		itProfessional.s_isAddicatedToCoffee(true);
		itProfessional.s_isAddictionToAlcohol(false);
		itProfessional.displayInformation();
	}
}