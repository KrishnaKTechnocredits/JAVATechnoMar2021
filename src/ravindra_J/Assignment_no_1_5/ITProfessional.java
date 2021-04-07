/*4. Create a class named as ITProfessional which contain below methods  
  		a. empName()  
        b. doesPartyOnWeekend()  
        c. isAddictedToTea()  
        d. isAddictedToCoffee()  
        e. isAddictedToAlcohol() 
        f. displayInformation()
Hint: One String, 4 boolean variable needed
Note: In Console Print statement in a proper way.  
 */
       
package ravindra_J.Assignment_no_1_5;

class ITProfessional{
	String empName;
	boolean isPartyAtWeekend;
	boolean isTeaAddict;
	boolean isCoffeeAddict;
	boolean isAlcoholAddict;
	
	void empName(String name) {
		empName = name;
	}
	void doesPartyOnWeekend(boolean flag1) {
		isPartyAtWeekend = flag1;
	}
	void isAddictedToTea(boolean flag2) {
		isTeaAddict = flag2;
	}
	void isAddictedToCoffee(boolean flag3) {
		isCoffeeAddict = flag3;
	}
	void isAddictedToAlcohol(boolean flag4) {
		isAlcoholAddict = flag4;
	}
	void displayInformation() {
		System.out.println("ITProfessional name is ->"+empName);
		System.out.println(empName+" is doing party at weekend ? ->"+isPartyAtWeekend);
		System.out.println(empName+" is tea addicted ? ->"+isTeaAddict);
		System.out.println(empName+" is coffee addicted ? ->"+isCoffeeAddict);
		System.out.println(empName+" is alcohol addicted ? ->"+isAlcoholAddict);

	}
	public static void main(String []args)
	{
		ITProfessional itprof = new ITProfessional();
		itprof.empName("Rav");
		itprof.doesPartyOnWeekend(false);
		itprof.isAddictedToTea(true);
		itprof.isAddictedToCoffee(false);
		itprof.isAddictedToAlcohol(false);
		itprof.displayInformation();
	}
}