package monali;

class Car{
	String company;
	boolean isAutomatic;
	double speed;
	
	void setCompanyName(String name){
		company = name;
	}
	
	void setIsCarAutomatic(boolean flag){
		isAutomatic = flag;
	}
	
	void setCarSpeed(double carspeed){
		speed = 30; 
	}
	
	void displaySpecification(){
		System.out.println("company name of car is "+company);
		System.out.println("car is automatic "+isAutomatic);
		System.out.println("speed of car is "+speed);
	}
	
	public static void main(String[] a){
		Car car = new Car();
		car.setCompanyName("Honda");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(30);
		car.displaySpecification();
	}
		
}