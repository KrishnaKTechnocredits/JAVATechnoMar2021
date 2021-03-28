package trupti;
/*Assignment 3: Create a class named as ITProfessional which contain below methods  
        a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed*/
class ITProfessional{
	String employeeName;
	boolean partyOnWeekend;
	boolean addictedToTea;
	boolean addictedToCoffee;
	boolean addictedToAlcohol;
	
		void empName(String ename){
			employeeName=ename;
		}
		
		void doesPartyOnWeekend(boolean partyWeekend){
			partyOnWeekend=partyWeekend;
		}
		
	    void isAddictedToTea(boolean addictToTea){
			addictedToTea=addictToTea;
		}
		
        void isAddictedToCoffee(boolean addictToCoffee) {
			addictedToCoffee=addictToCoffee;
		}
		
        void isAddictedToAlcohol(boolean addictToAlcohol){
			addictedToAlcohol=addictToAlcohol;
		}
		
        void displayInformation(){
			System.out.println("Employee name is : "+employeeName);
			System.out.println(employeeName+" does party on weekend : "+partyOnWeekend);
			System.out.println(employeeName+" is addicted to Tea : "+addictedToTea);
			System.out.println(employeeName+" is addicted to Coffee : "+addictedToCoffee);
			System.out.println(employeeName+"is addicted to Alcohol : "+addictedToAlcohol);
		}
		
		public static void main(String[] args){
			ITProfessional itprof=new ITProfessional();
			itprof.empName("Seema");
			itprof.doesPartyOnWeekend(false);
			itprof.isAddictedToTea(false);
			itprof.isAddictedToCoffee(true);
			itprof.isAddictedToAlcohol(false);
			itprof.displayInformation();
		}	
        
       
}