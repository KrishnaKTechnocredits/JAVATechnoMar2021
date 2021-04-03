package rashmi;
public class Car{
	String name;
	double speed;
	boolean b;
	
	void setcompanyName(String carName){
		name = carName;
	}
	
	void setIsCarAutomatic(boolean val){
		b = val;
	}
	
	void setCarSpeed(double carSpeed){
		speed = carSpeed;
	}
	
	void displaySpecification(){
		System.out.println("Car name is : " + name);
		System.out.println("Car is automatic : " + b);
		System.out.println("Speed of my car is : " + speed);
	}
	
	public static void main(String[] args){
		 Car car = new Car();
		 car.setcompanyName("Breeza");
		 car.setIsCarAutomatic(false);
		 car.setCarSpeed(120.66);
		 car.displaySpecification();
	}
}
		