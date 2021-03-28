package monika;

/*Assignment3
4. Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed

Note: In Console Print statement in a proper way. */

class ITProfessional{
String name;
boolean partyWeekendAnswer;
boolean addictToTeaAnswer;
boolean addictToCoffeeAnswer;
boolean addictToAlcoholAnswer;

void empName(String empName){
	name = empName;
}
void doesPartyOnWeekend(boolean partyWeekend){
	partyWeekendAnswer = partyWeekend;
}
void isAddictedToTea(boolean addictToTea){
	addictToTeaAnswer = addictToTea;
}
void isAddictedToCoffee(boolean addictToCoffee){
	addictToCoffeeAnswer = addictToCoffee;
}
void isAddictedToAlcohol(boolean addictToAlcohol){
	addictToAlcoholAnswer = addictToAlcohol;
}
void displayInformation(){
	System.out.println("Employee Name is "+name);
	System.out.println("Does Employee do Party On weekend: "+partyWeekendAnswer);
	System.out.println("Does Employee is addicted to tea: "+addictToTeaAnswer);
	System.out.println("Does Employee is addicted to coffee: "+addictToCoffeeAnswer);
	System.out.println("Does Employee is addicted to coffee: "+addictToCoffeeAnswer);

}
public static void main(String[] args){
	ITProfessional itProfessional = new ITProfessional();
	itProfessional.empName("Monika");
	itProfessional.doesPartyOnWeekend(false);
	itProfessional.isAddictedToTea(false);
	itProfessional.isAddictedToCoffee(false);
	itProfessional.isAddictedToAlcohol(false);
	itProfessional.displayInformation();
}
}