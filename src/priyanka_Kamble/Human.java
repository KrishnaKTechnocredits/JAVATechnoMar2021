package priyanka_Kamble;

/**
3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. 
 **/
 
 class Human{
	 String hName;
	 boolean cnSpeak;
	 int hAge;
	 
	 void humanName(String name){
		 hName= name;
	 }
	  
	  void canSpeak(boolean speak){
		 cnSpeak= speak;
	 }
	   
	   void humanAge(int age){
		 hAge= age;
	 }
	 
	 void showDetails(){
		System.out.println("Name of the Human is " +hName);
		System.out.println("Is the person able to speak ? " +cnSpeak);
		System.out.println("Age of the Human is " +hAge);
	 }
	 
	 public static void main(String args[]){
		 Human h = new Human();
		  h.humanName("Alex");
		  h.canSpeak(true);
		  h.humanAge(25);
		 h.showDetails();
	 } 
 }