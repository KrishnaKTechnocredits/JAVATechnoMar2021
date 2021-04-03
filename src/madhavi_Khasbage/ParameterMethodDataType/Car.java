package madhavi_Khasbage.ParameterMethodDataType;

class Car
{
	String companyName;
	boolean flag;
	double carSpeed;
	
	void setCompanyName(String cname){
		companyName=cname;
	}
	
	void setIsCarAutomatic(boolean flag1){
		flag=flag1;
	}
	
	void setCarSpeed(double cSpeed){
		carSpeed=cSpeed;
	}
	
	void displaySpecification(){
		System.out.println("Company name = " + companyName);
		System.out.println("Is car automatic = " + flag);
		System.out.println("Car speed  = " + carSpeed + " mph");
	}
	   
	public static void main(String[] agrs){
		Car objCar=new Car();
		objCar.setCompanyName("Audi A6");
		objCar.setIsCarAutomatic(true);
		objCar.setCarSpeed(155);
		objCar.displaySpecification();
	}
	
}