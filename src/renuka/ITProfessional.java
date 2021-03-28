/*Assignment-3 :Create aclass named as ITProfessional which contain below methods*/

package renuka;

class ITProfessional{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
    void empName(String name){
	  empName = name;
	}
	
	void doesPartyOnWeekend(boolean party){
	  doesPartyOnWeekend = party;
	}
	
	void isAddictedToTea(boolean tea){
	  isAddictedToTea = tea;
	}
	
	void isAddictedToCoffee(boolean coffee){
	  isAddictedToCoffee = coffee;
	}
	
	void isAddictedToAlcohol(boolean alcohol){
		isAddictedToAlcohol = alcohol;
	}
	
	void displayInformation(){
	  System.out.println("Employee Name is: " +empName);
	  System.out.println("Employee does Party on Weekend: " +doesPartyOnWeekend);
	  System.out.println("Employee Addicted to Tea: " +isAddictedToTea);
	  System.out.println("Employee Addicted to Coffee: " +isAddictedToCoffee);
	  System.out.println("Employee Addicted to Alcohol: " +isAddictedToAlcohol);
	}
	
	public static void main(String[] args){
	  ITProfessional itProfessional = new ITProfessional();
	  itProfessional.empName("Renuka");
	  itProfessional.doesPartyOnWeekend(true);
	  itProfessional.isAddictedToTea(false);
	  itProfessional.isAddictedToCoffee(false);
	  itProfessional.isAddictedToAlcohol(false);
	  itProfessional.displayInformation();
	}
}