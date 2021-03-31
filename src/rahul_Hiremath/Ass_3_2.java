package rahul_Hiremath;

class Ass_3_2
{
	String carName;
	boolean isAutomatic;
	double speed;
	void setCompanyName(String cName){
		carName = cName;
	}
	void setIsCarAutomatic(boolean automatic){
		isAutomatic = automatic;
	}
	void setCarSpeed(double cSpeed){
		speed = cSpeed;
	}
	void displaySpecification(){
		System.out.println("Car company name is: " + carName);
		System.out.println("Is automatic: " + isAutomatic);
		System.out.println("Is automatic: " + speed);
	}
	public static void main (String[] args){
		Ass_3_2 car = new Ass_3_2();
		car.setCompanyName("VW");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(149.96);
		car.displaySpecification();
	}
}