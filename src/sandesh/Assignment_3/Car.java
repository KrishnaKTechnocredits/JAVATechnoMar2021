package sandesh.Assignment_3;

public class Car {
	String compNameInstance;
	boolean isAutoInstance;
	double speedInstance;
	
	void setCompanyName(String compName) {
		compNameInstance = compName;
	}
	
	void setIsCarAutomatic(boolean isAutomated) {
		isAutoInstance = isAutomated;
	}
	
	void setCarSpeed(double speedData) {
		speedInstance = speedData;
	}
	
	void displaySpecification() {
		System.out.println("Brand name of Car is :- " + compNameInstance);
		System.out.println("Car is Automatic :- " + isAutoInstance);
		System.out.println("Speed of Car is :- " + speedInstance);
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		String companyName = "TATA";
		boolean isAutomatic = true;
		double speed = 200.5;
		c1.setCompanyName(companyName);
		c1.setIsCarAutomatic(isAutomatic);
		c1.setCarSpeed(speed);
		c1.displaySpecification();
	}
}
