package prachi.Assignment_3;

//Assignment3_Program3
//3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
//	a. humanName()  
//	b. canSpeak()  
//	c. humanAge()  
//	d. showDetails() 
//Hint: One String, one boolean, one int variable needed. 

class Human{
	String Name;
	boolean CanSpeak;
	int HumanAge;
	
	void humanName(String hName){
		Name=hName;
	}
	
	void canSpeak(boolean speak){
		CanSpeak=speak;
	}
	
	void humanAge(int hAge){
		HumanAge=hAge;
	}
	
	void ShowDetails(){
		System.out.println("Human Name is: "+Name);
		System.out.println("Human can speak?:"+CanSpeak);
		System.out.println("Human age is: "+HumanAge);
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.humanName("Prachi");
		human.canSpeak(true);
		human.humanAge(25);
		human.ShowDetails();
	}
}