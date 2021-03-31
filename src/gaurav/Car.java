package gaurav;

//Create a class named Car, which contains method like below
//Assignment 3

class Car{
	String companyname;
	boolean automatic;
	double 	speed;
	
	void setCompanyName(String name,boolean flag,double speed1){
		companyname	= name;
		automatic = flag;
		speed = speed1;
	}
	
	void displaySpecification(){
		System.out.println("Company name "	+companyname);
		System.out.println("Is car automatic"	+automatic);
		System.out.println("Car Speed is"	+speed);
	}
	
	public static void main(String[]args){
		Car c1 = new Car();
		c1.setCompanyName("Hyundai",true,40.12);
		c1.displaySpecification();
	}
}	
	
	