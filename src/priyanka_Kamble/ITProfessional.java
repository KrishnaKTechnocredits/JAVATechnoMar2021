package priyanka_Kamble;

/**
4. Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed
*/

class ITProfessional{
	String empName;
	boolean party,tea,coffee,alcohol;
		
	void empName(String name){
		 empName= name;
	 }
	 void doesPartyOnWeekend(boolean partyonweekend){
		 party= partyonweekend;
	 }
	 void isAddictedToTea(boolean isTea){
		 tea= isTea;
	 }
	 void isAddictedToCoffee(boolean isCoffee){
		 coffee= isCoffee;
	 }
	 void isAddictedToAlcohol(boolean isAlcohol){
		 alcohol= isAlcohol;
	 }
	 void displayInformation(){
		System.out.println("Employee Name " +empName);
		System.out.println("Are you a Party Person " +party);
		System.out.println("Are you a Tea Person " +tea);
		System.out.println("Are you a Coffee Person " +coffee);
		System.out.println("Are you a Alcoholic Person " +alcohol);
	 }
	 public static void main(String args[]){
		 ITProfessional i = new ITProfessional();
		  i.empName("Alex");
		  i.doesPartyOnWeekend(true);
		  i.isAddictedToTea(false);
		  i.isAddictedToCoffee(true);
		  i.isAddictedToAlcohol(false);
		 i.displayInformation();
	 } 
}

