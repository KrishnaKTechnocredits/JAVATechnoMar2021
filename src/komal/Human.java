//Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
    //a. humanName()  
	//b. canSpeak()  
	//c. humanAge()  
	//d. showDetails() 
	//Hint: One String, one boolean, one int variable needed. 
package komal;

class Human{
	boolean canSpeak;
	String Name;
	int age;
	
	void humanName(String hName){
		Name = hName;
	}
	void canSpeak(boolean speak){
		canSpeak = speak;
	}
	void humanAge(int hage){
		age = hage;
	}
	void showDetails(){
		System.out.println("humanName is :" + Name);
		System.out.println("humanAge is :" + age);
		System.out.println("human can Speak? :" + canSpeak);
	}
	public static void main(String[] args){
		Human h_1 = new Human();
		h_1.humanName("komal");
		h_1.canSpeak(true);  
		h_1.humanAge(24); 
		h_1.showDetails();
	}
}
		


