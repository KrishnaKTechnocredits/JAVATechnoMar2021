package parakh;

public class Car{
   
      String companyName;
	  boolean carAutomatic;
	  double carSpeed;
	  
	  void setCompanyName(String compName){
	       companyName = compName;
	  }
	  
	  void setIsCarAutomatic(boolean carAuto){
	       carAutomatic = carAuto;
	  }
	  
	  void setCarSpeed(double speed){
	       carSpeed = speed;
	  }
	  
	  void displaySpecification(){
	       System.out.println("CompanyName: " +companyName +"\n" +"Is Car Automatic: "+carAutomatic +"\n" +"Car Speed: " +carSpeed);
	  }
	  
	  public static void main(String args[]){
	       Car Car = new Car();
		   Car.setCompanyName("Honda");
		   Car.setIsCarAutomatic(false);
		   Car.setCarSpeed(150.4);
		   Car.displaySpecification();
	  }
}