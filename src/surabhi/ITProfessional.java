package surabhi;

/*
 * Assignment No 5
 * 
 * */
class ITProfessional{
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void empName(String name){
		empName=name;
	}
	
	void doesPartyOnWeekend(boolean party){
		doesPartyOnWeekend=party;
	}
	
	void isAddictedToTea(boolean tea){
		isAddictedToTea=tea;
	}
	
	void isAddictedToCoffee(boolean coffee){
		isAddictedToCoffee=coffee;
	}
	
	void isAddictedToAlcohol(boolean alcohol){
		isAddictedToAlcohol=alcohol;
	}
	
	void displayInformation(){
		System.out.println("Employee name is :" +empName);
		System.out.println("Employee do party on weekends :" +doesPartyOnWeekend);
		System.out.println("Employee is addicted to tea :" +isAddictedToTea);
		System.out.println("Employee is addicted to coffee :" +isAddictedToCoffee);
		System.out.println("Employee is addicted to alcohol :" +isAddictedToAlcohol);
	}
	
	public static void main(String[] args){
		ITProfessional itProfessional=new ITProfessional();
		itProfessional.empName("Surabhi");
		itProfessional.doesPartyOnWeekend(false);
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(false);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();	
	}

}