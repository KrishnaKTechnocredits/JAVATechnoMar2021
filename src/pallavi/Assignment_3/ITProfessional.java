package pallavi.Assignment_3;

class ITProfessional {
	String empName;
	boolean doesPartyOnWeekend;
	boolean isAddictedToTea;
	boolean isAddictedToCoffee;
	boolean isAddictedToAlcohol;
	
	void setEmpName(String name){
		empName=name;
	}
	
	void doesPartyOnWeekend(boolean flag){
		doesPartyOnWeekend=flag;
	}
	
	void isAddictedToTea(boolean flag){
		isAddictedToTea=flag;
	}

	void isAddictedToCoffee(boolean flag){
		isAddictedToCoffee=flag;
	}
	
	void isAddictedToAlcohol(boolean flag){
		isAddictedToAlcohol=flag;
	}
	
	void displayInformation(){
		System.out.println("Employeee name is " + empName);
		System.out.println("Employeee does Party on Weekend ? " + doesPartyOnWeekend);
		System.out.println("Employeee is Addicted to  Tea ? " + isAddictedToCoffee);
		System.out.println("Employeee is Addicted to Alcohol ? " + isAddictedToAlcohol);
		
		
	}
	
	public static void main(String args[]){
		ITProfessional itProfessional=new ITProfessional();
		itProfessional.setEmpName("Pallavi");
		itProfessional.doesPartyOnWeekend(true);
		itProfessional.isAddictedToTea(true);
		itProfessional.isAddictedToCoffee(true);
		itProfessional.isAddictedToAlcohol(false);
		itProfessional.displayInformation();
			
	}
	
}