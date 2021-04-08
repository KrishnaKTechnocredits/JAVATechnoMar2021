package parakh;

public class ITProfessional{
      String empName;
	  boolean doesPartyOnWeekend, isAddictedToTea, isAddictedToCoffee, isAddictedToAlcohol;
	  
	  void empName(String name){
	       empName = name;
	  }
	  
	  void doesPartyOnWeekend(boolean partyOnWeekend){
	       doesPartyOnWeekend = partyOnWeekend;
	  }
	  
	  void isAddictedToTea(boolean addictedToTea){
	       isAddictedToTea = addictedToTea;
	  }
	  
	  void isAddictedToCoffee(boolean addictedToCoffee){
	       isAddictedToCoffee = addictedToCoffee;
	  }
	  
	  void isAddictedToAlcohol(boolean addictedToAlcohol){
	       isAddictedToAlcohol = addictedToAlcohol;
	  }
	  
	  void displayInformation(){
	       System.out.print("Employee Name: " +empName +"\n" +"Does he party On Weekend: " +doesPartyOnWeekend +"\n" +"Is he addicted to Tea: " + isAddictedToTea +"\n" +"Is he addicted to Coffee: " +isAddictedToCoffee +"\n" +"Is he addicted to Alcohol: " +isAddictedToAlcohol);
	  }
	  
	  public static void main(String args[]){
	      ITProfessional iTProfessional = new ITProfessional();
		  iTProfessional.empName("Rohit");
		  iTProfessional.doesPartyOnWeekend(true);
		  iTProfessional.isAddictedToTea(true);
		  iTProfessional.isAddictedToCoffee(false);
		  iTProfessional.isAddictedToAlcohol(false);
		  iTProfessional.displayInformation();
		  }
}