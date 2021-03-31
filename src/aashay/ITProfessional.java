package aashay;
/*
 * Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed
 */

class ITProfessional{
	String empName;
	boolean partyWeekEnd, addictedT, addictedC,addictedAl;
	
	void empName(String nm){
		empName = nm;
	}  
    void doesPartyOnWeekend(boolean party){
		partyWeekEnd = party;
	}  
    void isAddictedToTea(boolean t){
		addictedT = t;
	}  
    void isAddictedToCoffee(boolean c){
		addictedC = c;
	}
    void isAddictedToAlcohol(boolean al){
		addictedAl = al;
	}
    void displayInformation(){
		System.out.println("Employe Name:"+empName+"\nDoes party on weekend? :"+partyWeekEnd+"\nIs addicted to Tea? :"+addictedT+"\nIs addicted to Coffee? :"+addictedC+"\nIs addicted to Alcohol? :"+addictedAl);
	}
	
	public static void main(String[] args){
		ITProfessional it = new ITProfessional();
		it.empName("Ankit Kumar");
		it.doesPartyOnWeekend(true);
		it.isAddictedToAlcohol(true);
		it.isAddictedToTea(false);
		it.isAddictedToCoffee(true);
		it.displayInformation();
	}
}