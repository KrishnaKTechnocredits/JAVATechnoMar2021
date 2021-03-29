//assignment 3 program 2-- one string, one boolean and one double variable needed

package kajal;

class Car{
	String cmpname;
	boolean isautomatic;
	double setspeed;
		void setcompanyName(String companyname){
		cmpname= companyname;
	
		}
		void setIsCarAutomatic(boolean iscarautomatic){
		isautomatic= iscarautomatic;
		
		}
		void setCarSpeed(double speed){
		setspeed= speed;
		
		}
		void displayspecification(){
		System.out.println("Company name is " +cmpname);
	    System.out.println("car speed is " +setspeed);
		System.out.println("Car is automatic - " +isautomatic);
		}
		
		public static void main(String [] args){
			Car car= new Car();
			car.setcompanyName("Mahindra");
			car.setCarSpeed(80);
			car.setIsCarAutomatic(true);
			car.displayspecification();
		}
				
		}