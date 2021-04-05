//Assignment 3- program 4
package kajal.Kajal_Package_Folder;

class ITProfessional{
	String name;
	boolean doespartyonweekend;
	boolean isaddictedtotea;
	boolean isaddictedtocoffee;
	boolean isaddictedtoalcohol;
	
	void empName(String empname){
		name = empname;
	}
	
	void doesPartyonWeekend(boolean doesparty){
		doespartyonweekend = doesparty;
	}
	
	void isAddictedtoTea(boolean addicttea){
		isaddictedtotea = addicttea;
	}
	
	void isAddictedtoCoffee(boolean addictcoffee){
		isaddictedtocoffee = addictcoffee;
	}
	
	void isAddictedtoAlcohol(boolean addictalcohol){
		isaddictedtoalcohol = addictalcohol;
	}
	
	void displayInformation(){
	System.out.println("Employee name is " +name);
	System.out.println("Employee doing party on weekend? " +doespartyonweekend);
	System.out.println("Employee is addicted to tea? " +isaddictedtotea);
	System.out.println("Employee is addicted to coffee? " +isaddictedtocoffee);
	System.out.println("Employee is addicted to alcohol? " +isaddictedtoalcohol);
	}
	public static void main(String [] args){
	
	ITProfessional itprofessional = new ITProfessional();
	itprofessional.empName("Komal");
	itprofessional.doesPartyonWeekend(false);
	itprofessional.isAddictedtoTea(true);
	itprofessional.isAddictedtoCoffee(false);
	itprofessional.isAddictedtoAlcohol(false);
	itprofessional.displayInformation();
	}
}

