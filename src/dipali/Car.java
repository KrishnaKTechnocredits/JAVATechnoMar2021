package dipali;

public class Car{
	String companyName;
	double speed;
	boolean value;
	
	void setCompanyName(String companyName){
		this.companyName=companyName;	
	}
	
	void setIsCarAutomatic(boolean value){
		this.value=value;
	}
	
	void setCarspeed(double speed){
		this.speed=speed;
	}
	
	void dispalySpecification(){
		System.out.println("Car company name is ["+companyName+"]");
		System.out.println("["+value+"] , car is automatic");
		System.out.println("Car speed is ["+speed+"]");
	}
	
	public static void main(String args[]){
		Car c=new Car();
		c.setCompanyName("Skoda");
		c.setIsCarAutomatic(true);
		c.setCarspeed(1800);
		c.dispalySpecification();
	}
}