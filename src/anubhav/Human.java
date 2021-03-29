// Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
// 	a. humanName()  
// 	b. canSpeak()  
// 	c. humanAge()  
// 	d. showDetails() 
// Hint: One String, one boolean, one int variable needed. 

package anubhav;

class Human{
	String name;
	boolean canSpeak;
	int age;
	
	void humanName(String hname){
		name= hname;
	}
	
	void canSpeak(boolean flag){
		canSpeak=flag;
	}
	
	void humanAge(int hAge){
		 age= hAge;
	}
	
	void showDetails(){
		System.out.println("Human name is: " + name);
		System.out.println("Can " + name + " speak? :" + canSpeak);
		System.out.println("Age of " + name + " is :" + age);
	}
	
	public static void main (String[] args){
		Human human= new Human ();
		human.humanName("Ronak Singh");
		human.canSpeak(true);
		human.humanAge(28);
		human.showDetails();
	}
} 