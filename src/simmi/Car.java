package simmi;

class Car{
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
	
	void setCompanyName(String c_companyName){
		companyName = c_companyName;
	}
	
	void setIsCarAutomatic(boolean flag){
		isCarAutomatic = flag;
	}
	
	void setCarSpeed(double c_carSpeed){
		carSpeed = c_carSpeed;
	}
	
	void displaySpecification(){
		System.out.println(" Car company name is :" + companyName);
		System.out.println(" Car is automatic :" + isCarAutomatic);
		System.out.println(" Car speed is :" + carSpeed + "mph");
	}
	
	public static void main(String[] args){
		Car c = new Car();
		c.setCompanyName("Tesla");
		c.setIsCarAutomatic(true);
		c.setCarSpeed(200);
		c.displaySpecification();
	}
}
		