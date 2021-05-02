package rikin.assignment3;

class Car{
	String CompanyName;
	boolean IsCarAutomatic;
	double CarSpeed;
	
	void setData(String CarCompanyName, boolean automatic, double speedOfCar){
		CompanyName = CarCompanyName;
		IsCarAutomatic = automatic;
		CarSpeed = speedOfCar;
	}
	
	void displaySpecification(){
		System.out.println("Comany name is " + CompanyName );
		System.out.println("iS Car Automatic : " + IsCarAutomatic );
		System.out.println("Car speed is " + CarSpeed );
	}
	
	public static void main (String [] args){
		Car car = new Car();
		car.setData("Maruti Suzuki", true, 100.5);
		car.displaySpecification();
	}
}