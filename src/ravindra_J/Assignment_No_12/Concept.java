/* Assignment 12 : 5th April 2021

Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Sample input1 : 
10,20,30
Sample output1 : 
Candidate is Eligible
Candidate obtained B grade.

Sample input2 : 
50,20,20
Sample output2 : 
Candidate is Eligible
Candidate obtained A grade.

Note : Sum method should not be called from main method, it should be called from Average method (think about code reusability).

Complete this assignment by Monday EOD.
 */

package ravindra_J.Assignment_No_12;

public class Concept {

	double sum(double num1, double num2, double num3) {	
		return num1+num2+num3;
	}
	
	double average(double num1, double num2, double num3) {
		return (num1+num2+num3)/3;	
	}
	
	boolean isAnswerAboveExpecation(double ave) {
		if(ave > 50)
			return true ;
		else
			return false;		
	}
	
	static boolean isEligible(double ave) {
		if(ave > 50 || ave % 2 ==0)
			return true ;
		else
			return false;		
	}
	
	static String getYourGrade(double ave) {
		if(ave > 80)
			return "A Grade" ;
		else
			return "B grade";		
	}
	
	public static void main(String[] args) {
		Concept concept = new Concept();
		concept.sum(10, 20, 5);
		double ave = concept.average(90, 75, 64);
		concept.isAnswerAboveExpecation(ave);
		boolean flag = Concept.isEligible(ave);
		if(flag == true) {
			System.out.println("Candidats is Eligible");
		}
		String grade = Concept.getYourGrade(ave);
		if(grade.equals("A Grade"))
			System.out.println("Candidate obtained A grade");
		else
			System.out.println("Candidate obtained B grade"); // B grade
	}
	
	
}
