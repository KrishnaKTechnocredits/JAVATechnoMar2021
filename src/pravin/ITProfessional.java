/*Assignment no 3
4. Create a class named as ITProfessional which contain below methods
a. empName()b. doesPartyOnWeekend()c. isAddictedToTea()d. isAddictedToCoffee()e. isAddictedToAlcohol()f. displayInformation()
Hint: One String, 4 boolean variable needed
Note: In Console Print statement in a proper way.*/

package pravin; 

class ITProfessional {
	String empName;
	boolean doesPartyOnWeekend,isAddictedToTea,isAddictedToCoffee,isAddictedToAlcohol;

	void setDetails (String name,boolean party,boolean tea,boolean Coffee,boolean Alcohol){
		empName = name;
		doesPartyOnWeekend = party;
		isAddictedToTea = tea;
		isAddictedToCoffee = Coffee;
		isAddictedToAlcohol = Alcohol;
	}

	void display (){
		System.out.println("EmpName is --"+empName);
		System.out.println("Does he Party On Weekend--"+doesPartyOnWeekend);
		System.out.println("Does he Addicted To Tea--"+isAddictedToTea);
		System.out.println("Does he Addicted To Coffee--"+isAddictedToCoffee);
		System.out.println("Does he Addicted To Alcohol--"+isAddictedToAlcohol);
	}

	public static void main(String[]args){
		ITProfessional iTProfessional = new ITProfessional ();
		iTProfessional.setDetails("Pravin",false,true,false,false);
		iTProfessional.display();
	}
}

