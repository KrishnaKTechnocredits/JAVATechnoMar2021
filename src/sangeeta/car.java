//Creat a class named carr,which contains method like below
//1) setCompanyName 2) setIsCarAutomatic 3) setCarSpeed 4)displaySpecification.
//Hint: One String, One boolean and one double variable needed.
package sangeeta;
class car{
	String companyName;
	boolean isCarAutomatic;
	double carSpeed;
		void setCompanyName(String compName){
			companyName = compName;
		}
		void setIsCarAutomatic(boolean flag){
			isCarAutomatic = flag;
		}
		void setCarSpeed(double speed){
			carSpeed = speed;
		}
		void displayInfo(){
			System.out.println(" Company Name is "+companyName);
			System.out.println(" Is Car Automatic: "+isCarAutomatic);
			System.out.println(" Car Speed is "+carSpeed);	
		}
	public static void main(String[] a){
		car car = new car();
		car.setCompanyName("Maruti");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(90);
		car.displayInfo();
	}
}