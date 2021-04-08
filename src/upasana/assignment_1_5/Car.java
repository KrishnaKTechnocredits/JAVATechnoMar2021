package upasana.assignment_1_5;

class Car{
	String companyName;
	boolean isCarAutomatic;
	double setCarSpeed;
	
	void setcompanyName(String cName){
		companyName = cName;
	}
	
	void setIsCarAutomatic(boolean isAutomatic){
		isCarAutomatic = isAutomatic;
	}
	
	void setCarSpeed(double setSpeed){
		setCarSpeed = setSpeed;
	}
	
	void displaySpecification(){
		System.out.println("CompanyName is "+companyName);
		System.out.println("Is Car Automatic ? "+isCarAutomatic);
		System.out.println("Speed of car is "+setCarSpeed);
	}
	
	public static void main(String[] args){
		Car car = new Car();
		car.setcompanyName("TATA");
		car.setIsCarAutomatic(false);
		car.setCarSpeed(87.98);
		car.displaySpecification();
	}
}

			
		
		