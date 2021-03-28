package krishna;
class ITProfessional{
	String empName;
	boolean weekendparty;
	boolean teaaddiction;
	boolean coffeeaddiction;
	boolean alcoholaddiction;
		
	void empName(String name){
		empName=name;
	}
	void doesPartyOnWeekend(boolean party){
		weekendparty=party;
	}
	void isAddictedToTea(boolean teaaddict){
		teaaddiction=teaaddict;
	}
	void isAddictedToCoffee(boolean coffeeaddict){
		coffeeaddiction=coffeeaddict;
	}
	void isAddictedToAlcohol(boolean alcoholaddict){
		alcoholaddiction=alcoholaddict;
	}
	void displayInformation(){
		System.out.println("Name of employee is :"+empName);
		System.out.println("Does employee Party On Weekend :"+weekendparty);
		System.out.println("Is employee is addicted to Tea :"+teaaddiction);
		System.out.println("Is employee is addicted to Coffee :"+coffeeaddiction);
		System.out.println("Is employee is addicted to Alcohol :"+alcoholaddiction);
	}
	public static void main(String[] args){
		ITProfessional itprofessional= new ITProfessional();
		itprofessional.empName("krishna sawner");
		itprofessional.doesPartyOnWeekend(false);
		itprofessional.isAddictedToTea(true);
		itprofessional.isAddictedToCoffee(false);
		itprofessional.isAddictedToAlcohol(false);
		itprofessional.displayInformation();
	}
}