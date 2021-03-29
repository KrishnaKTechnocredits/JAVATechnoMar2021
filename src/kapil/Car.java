package kapil;

class Car{
    String name;
	boolean num1;
	double speed;
	
	void setcompanyName(String cusName, boolean cus, double cusSpeed){
	     name = cusName;
         num1 = cus;
         speed = cusSpeed;
	   
		 }
	void displaySpecification(){
         System.out.println("company Name is " +name);
		 System.out.println("Car is atomatic " +num1);
		 System.out.println("Car speed is " +speed);
		 } 
                
     public static void main(String[] args){
      Car car1 = new Car();
      car1.setcompanyName("Tata", true, 75.52);
      car1.displaySpecification();
    }
}	