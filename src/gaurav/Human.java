package gaurav;

//Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak
//Assignment 3

class Human{
	String humanname;
	boolean canSpeak;
	int	humanage;
	
	void humanName(String name,boolean flag,int age){
	humanname = name;
	canSpeak = true;
	humanage = age;
	}
	
	void showDetails(){
	System.out.println("Human name is " +	humanname);
	System.out.println("Can he speeak "	+	true);
	System.out.println("Human age	  " +	humanage);
	}
	
	public static void main(String[]args){
	Human h1=new Human();
	h1.humanName("Gaurav",true,30);
	h1.showDetails();
	}
}	