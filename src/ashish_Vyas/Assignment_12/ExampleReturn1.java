/*Assignment 12 : 5th April 2021
Design to test static, non static, return type concepts.
Sample input1 : 
10,20,30
Sample output1 : 
Candidate is Eligible
Candidate obtained B grade. 
 * 
 */

package ashish_Vyas.Assignment_12;

public class ExampleReturn1 {

	//1. Method sum() - non static method, accept 3 parameters of type double & return answer
	double sum(double x, double y, double z){
		return z+x+y ;
	}
	
	//2. Method average()- non static method, accept 3 parameters of type double & return answer
	double average(double x, double y, double z){
		
		return (z+x+y)/2 ;
	}
	
	//3. Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
	boolean isAnswerAboveExpecation(double averageAnsweer) {
		if (averageAnsweer >50){
			return true;
		}
		return false ;
	}	
	//4. Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
	
	static boolean isEligible(double averageReturn){
		if (averageReturn > 50 || averageReturn % 2 ==0) {
			System.out.println("Candidate is Eligible");
			ExampleReturn1.getYourGrade(averageReturn);
			return true;
		}else 
			return false;
		}
	//5. Method getYourGrade() - static method, take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.
	static void getYourGrade(double averageReturn) {
		if (averageReturn > 80 ) {
			System.out.println("Candidate obtained A Grade");
			return ;
		}else {
			System.out.println("Candidate obtained B Grade");
			return ;
		}
	}
	
	public static void main(String[] arg) {
		ExampleReturn1 exampleReturn1 =new ExampleReturn1();
		exampleReturn1.sum(5, 5, 5);
		double averageValue = exampleReturn1.average(95,90,88);
		ExampleReturn1.isEligible(averageValue);
		
	}
	
}