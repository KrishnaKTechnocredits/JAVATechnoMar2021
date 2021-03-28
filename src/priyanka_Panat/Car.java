package priyanka_Panat;

/*
 Assignment 3
 */

class Car{
	String companyname;
	Boolean carAutomatic;
	double cspeed;
	
	void setCompanyName(String cname){
		companyname=cname;
	}
	
	void setIsCarAutomatic(boolean automatic){
		carAutomatic=automatic;
	}
	
	void carSpeed(double speed){
		cspeed=speed;
	}
	
	void displaySpecification(){
		System.out.println("Name of Car's company is : "+ companyname);
		System.out.println("Is car automatic :"+ carAutomatic);
		System.out.println("Speed of car is : "+ cspeed);
	}
	
	public static void main(String[] args){
		Car c1=new Car();
		c1.setCompanyName("Hyundai");
		c1.setIsCarAutomatic(true);
		c1.carSpeed(151.52);
		c1.displaySpecification();
	}
}
