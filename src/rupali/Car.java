//Assignment 3

package rupali;
class Car{

	String companyname;
	boolean automatic;
	double speed;
	
	void setCompanyname(String cname){
		companyname=cname;
	}
	
	void setCarAutomatic(boolean flag){
		automatic=flag;
	}
	
	void setCarSpeed(double sp){
		speed=sp;
	}
	
	void display(){
		System.out.println("Company name of car is:"+companyname);
		System.out.println("The speed of car is:"+speed);
		System.out.println("The car is automatic is "+automatic+" statement");
	}
	
	public static void main(String[] args){
	Car car= new Car();
	car.setCompanyname("Tatamotors");
	car.setCarAutomatic(true);
	car.setCarSpeed(80);
	car.display();
	
	car.setCompanyname("Maruti");
	car.setCarAutomatic(false);
	car.setCarSpeed(70.5);
	car.display();
	}
}