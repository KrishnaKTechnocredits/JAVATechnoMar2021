//Assignment 3

package rupali;
class ITProfessional{
	String ename;
	boolean party,tea,coffee,alcohol;
	
	void empname(String name){
		ename=name;
	}
	
	void isAddictedToTea(boolean t){
		tea=t;
	}
	void doesPartyOnWeekend(boolean p){
		party=p;
	}
	
	void isAddictedToCoffee(boolean c){
		coffee=c;
	}
	
	void isAddictedToAlcohol(boolean a){
		alcohol=a;
	}
	
	void displayinformation(){
		System.out.println("Name of employee is"+ename);
		System.out.println("Is This weekend Party:"+party);
		System.out.println("Is he/she addicted to tea:"+tea);
		System.out.println("Is he/she addicted to coffee:"+coffee);
		System.out.println("Is he/she addicted to alcohol:"+alcohol);
	}
	
	public static void main(String[] args){
		ITProfessional itprofessional=new ITProfessional();
		
		itprofessional.empname("Rupali");
		itprofessional.doesPartyOnWeekend(true);
		itprofessional.isAddictedToTea(true);
		itprofessional.isAddictedToCoffee(false);
		itprofessional.isAddictedToAlcohol(false);
		itprofessional.displayinformation();
	}
}