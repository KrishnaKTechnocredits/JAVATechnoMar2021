//Create a class named ITProfessional which contains below methods.
//1)empName() 2)doesPartyOnWeekend() 3)isAddictedToTea() 4)isAddictedtoCoffee() 5) isAddictedToAlcohol() 6)displayInfo.
//Hint: One String, 4 boolean varable needed.
package sangeeta;
class ITProfessional{
	String empName;
	boolean weekendParty;
	boolean teaAddicted;
	boolean coffeeAddicted;
	boolean alcoholAddicted;
	void empName(String name){
		empName = name;
	}
	void doesPartyOnWeekend(boolean flag){
		weekendParty = flag;
	}
	void isAddictedToTea(boolean flag){
		teaAddicted = flag;	
	}
	void isAddictedToCoffee(boolean flag){
		coffeeAddicted = flag;	
	}
	void isAddictedToAlcohol(boolean flag){
		alcoholAddicted = flag;	
	}
	void displayInfo(){
		System.out.println(" Employee name is "+empName);
		System.out.println(" Does party on Weekend? "+weekendParty);
		System.out.println(" Is employee addicted to Tea? "+teaAddicted);
		System.out.println(" Is employee addicted to coffee? "+coffeeAddicted);
		System.out.println(" Is employee addicted to alcohol? "+alcoholAddicted);
	}
	public static void main(String[] a){
		ITProfessional ITProfessional = new ITProfessional();
		ITProfessional.empName("Shiva");
		ITProfessional.doesPartyOnWeekend(true);
		ITProfessional.isAddictedToTea(true);
		ITProfessional.isAddictedToCoffee(false);
		ITProfessional.isAddictedToAlcohol(true);
		ITProfessional.displayInfo();
	}
}