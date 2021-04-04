/*Assignment no 3
 * 2. Create a class named Car, which contains method like below
a. setcompanyName
b. setIsCarAutomatic
c. setCarSpeed
d. displaySpecification
Hint: One String, one boolean and one double variable needed.*/
package pravin.Assignment3; 
class CarDetails {
	String companyName;
	boolean isCarAutomatic;
	double CarSpeed;

	void setDetails (String CN,boolean auto,double sp){

		companyName = CN;
		isCarAutomatic = auto;
		CarSpeed = sp;
	}
	void display(){

		System.out.println("Company Name is :"+companyName);
		System.out.println("IsCarAutomatic :"+isCarAutomatic);
		System.out.println("CarSpeed is :"+CarSpeed);

	}
	public static void main (String[]args){
		CarDetails carDetails = new CarDetails();
		carDetails.setDetails("Maruti",true,75.28);
		carDetails.display();
	}
}
