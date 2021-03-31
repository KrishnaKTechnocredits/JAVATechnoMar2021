package aashay;
/*
 * Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed.
 */

class Human{
	String name;
	boolean speak;
	int age;
	
	void humanName(String nme){
		name = nme;
	}  
	void canSpeak(boolean spk){
		speak = spk;
	}    
	void humanAge(int ag){
		age = ag;
	}    
	void showDetails(){
		System.out.println("Human name:"+name+"\nCan Human speak?:"+speak+"\nHuman Age is:"+age);
	}  
	
	public static void main(String[] args){
		Human hmn = new Human();
		hmn.humanName("Aashay");
		hmn.canSpeak(true);
		hmn.humanAge(25);
		hmn.showDetails();
	}
}