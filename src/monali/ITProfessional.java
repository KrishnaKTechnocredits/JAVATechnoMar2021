package monali;

class ITProfessional{
	String name;
	boolean doesparty;
	boolean addtotea;
	boolean addtocofee;
	boolean addtoalcohol;
	
	void empName(String empname){
		name = "empname";
	}
	
	void doesPartyOnWeekend(boolean flag1){
		doesparty = flag1;
	}
	
	void isAddictedToTea(boolean flag2){
		addtotea = flag2;
	}
	
	void isAddictedToCofee(boolean flag3){
		addtocofee = flag3;
	}
	
	void isAddictedToAlcohol(boolean flag4){
		addtoalcohol = flag4;
	}
	
	void displayInfo(){
		System.out.println("name of emp is "+name);
		System.out.println("emp does party on weekend "+doesparty);
		System.out.println("emp is addicted to tea "+addtotea);
		System.out.println("emp is addicted to cofee "+addtocofee);
		System.out.println("emp is addicted to alcohol "+addtoalcohol);
	}
	
	public static void main(String[] a){
		ITProfessional itprofessional = new ITProfessional();
		itprofessional.empName("empname");
		itprofessional.doesPartyOnWeekend(true);
		itprofessional.isAddictedToTea(false);
		itprofessional.isAddictedToCofee(true);
		itprofessional.isAddictedToAlcohol(false);
		itprofessional.displayInfo();
	}
}
		
		
