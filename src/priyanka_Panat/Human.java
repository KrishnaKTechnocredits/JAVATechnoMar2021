package priyanka_Panat;

/*
 Assignment 3
 */

class Human{
	String humanname;
	boolean canspeak;
	int humanage;
	
	void humanName(String hname){
		humanname=hname;
	}
	
	void canSpeak(boolean flag){
		canspeak=flag;
	}
	
	void humanAge(int age){
		humanage=age;
	}
	
	void showDetails(){
		System.out.println("Name of human is : "+ humanname);
		System.out.println("Can human speak : "+ canspeak);
		System.out.println("Age of human is "+ humanage);
	}
	
	public static void main(String[] args){
		Human h1=new Human();
		h1.humanName("Priyanka Panat");
		h1.canSpeak(true);
		h1.humanAge(24);
		h1.showDetails();
	}
}
		
		
		
		