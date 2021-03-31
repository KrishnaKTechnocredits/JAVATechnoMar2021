package bhushan;
class Car{
	String companyName;
	boolean flag;
	double carSpeed;
	void setcompanyName(String compName){
		companyName = compName;	
	}
	void setIsCarAutomatic(boolean flg){
		flag = flg;
	}
	void setCarSpeed(double Speed){
		carSpeed = Speed;
	}
	void displaySpecification(){
		System.out.println("Car Details: "+companyName+ "\nIsCarAutomatic: "+flag+ "\nCarSpeed is: "+carSpeed);
	}
	public static void main(String[] args){
		Car car1 = new Car();
		car1.setcompanyName("Maruti Suzuki");
		car1.setIsCarAutomatic(true);
		car1.setCarSpeed(80.2);
		car1.displaySpecification();
	}
}