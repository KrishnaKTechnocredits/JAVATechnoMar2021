package sourabh;

class Car{
	String companyName;
	boolean carautomatic;
	double speed;
	
	void setcompanyName(String companyName1){
		companyName= companyName1;
	}
	void setIsCarAutomatic(boolean flag){
		carautomatic= flag;
	}
	void setCarSpeed(double speed1){
		speed= speed1;	
	}
	void displaySpecification(){
		System.out.println("Company Name is: "+companyName);
		System.out.println("Car Automatic: "+carautomatic);
		System.out.println("Car Speed is "+speed+" KM/H");	
		
	}
	public static void main(String[] args){
		Car car= new Car();
		car.setcompanyName("Aulto");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(250);
		car.displaySpecification();
	}
}