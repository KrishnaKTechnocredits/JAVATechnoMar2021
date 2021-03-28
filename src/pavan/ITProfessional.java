/*
4. Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed
 */

package pavan;
class ITProfessional{
	
	String empName;
	boolean doesPartyOnWeekend, isAddicatedtotea, isAddicatedtocoffee, isAddicatedtoalcohole;
	
	void name(String Nm){
		empName= Nm;
	}
	
	void behaviour(boolean party, boolean tea, boolean coffee,boolean alcohole){
		doesPartyOnWeekend= party;
		isAddicatedtotea= tea;
		isAddicatedtocoffee= coffee;
		isAddicatedtoalcohole= alcohole;
	}
	
	void displayInformation(){
		System.out.println("Employee name is ?"+ empName);
		System.out.println ("Party on Weekends ? "+doesPartyOnWeekend);
		System.out.println("Addicted to tea ? "+ isAddicatedtotea);
		System.out.println("Addicted to coffee ? " +isAddicatedtocoffee);
		System.out.println ("Addicted to alcohol ? "+ isAddicatedtoalcohole);	
	}
	
	public static void main(String[]args){
		ITProfessional itp= new ITProfessional();
		itp.name("Ramesh");
		itp.behaviour(true,false,true,false);
		itp.displayInformation();
	}
} 