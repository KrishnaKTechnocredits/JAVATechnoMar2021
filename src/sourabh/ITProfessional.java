package sourabh;

class ITProfessional{
	String name;
	boolean party;
	boolean tea;
	boolean coffee;
	boolean alcohol;
	void empName(String name1){
		name= name1;
	}
	void doesPartyOnWeekend(boolean flag){
		party= flag;
	}
	void isAddictedToTea(boolean flag){
		tea= flag;
	}
	void isAddictedToCoffee(boolean flag){
		coffee= flag;
	}
	void isAddictedToAlcohol(boolean flag){
		alcohol= flag;
	}
	void displayInformation(){
		System.out.println("Emp Name: "+name);
		System.out.println("Does Party On Weekend: "+party);
		System.out.println("Addicted To Tea: "+tea);
		System.out.println("Addicted To Coffee: "+coffee);
		System.out.println("Addicted To Alcohol: "+alcohol);
	}
	public static void main(String[] args){
		ITProfessional info= new ITProfessional();
		info.empName("Abhi");
		info.doesPartyOnWeekend(true);
		info.isAddictedToTea(false);
		info.isAddictedToCoffee(true);
		info.isAddictedToAlcohol(false);
		info.displayInformation();
	}
}