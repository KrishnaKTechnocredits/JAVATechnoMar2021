package meenu;

/* Assignment_3 -> Program_3: Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
*/	

class Human{
	String name;
	boolean canTalk;
	int age;

	void humanName(String personName){
		name = personName;
	}

	void canSpeak(boolean speak){
		canTalk = speak;
    }

	void humanAge(int personAge){
		age = personAge;
	}

	void showDetails(){
		System.out.println("Name             :- "+name);
		System.out.println("Age              :- "+age);
		System.out.println("Person can Speak :- "+canTalk);
	}

	public static void main(String[] args){
		Human human1 = new Human();
		human1.humanName("Paki Manhas");
		human1.humanAge(26);
		human1.canSpeak(true);
		human1.showDetails();
	}
}	
 



//3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
   // a. humanName()  
	//b. canSpeak()  
	//c. humanAge()  
	//d. showDetails() 
//Hint: One String, one boolean, one int variable needed. 
 