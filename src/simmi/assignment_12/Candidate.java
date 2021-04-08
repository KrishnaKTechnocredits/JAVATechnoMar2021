/*Assignment 12 : 5th April 2021

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
*/

package simmi.assignment_12;

public class Candidate {
	static double averageAnswer;
	
	double sum(double num1, double num2, double num3) {
		double sumAnswer = num1 + num2 + num3;
		return sumAnswer;
	}
	
	double average(double num1, double num2, double num3) {
		Candidate candidate = new Candidate();
		double sumAnswer =	candidate.sum(num1, num2, num3);
		averageAnswer = sumAnswer/3;
		System.out.println();
		System.out.println("The average is : " + averageAnswer);
		return averageAnswer;
	}
	
	boolean isAnswerAboveExpecation(double averageAnswer) {
		if (averageAnswer > 50)
			 return true;
		else
			return false;
	}
	
	static boolean isEligible(double averageAnswer) {
		if(averageAnswer > 50 || averageAnswer%2 == 0)
			return true;
		else
			return false;
	}
	
	static String getYourGrade(double averageAnswer) {
		if(averageAnswer > 80) {
			String grade = "A Grade";
			return grade;
		}
		else {
			String grade = "B Grade";
			return grade;
		}
	}
	
	public static void main(String[] args) {
		Candidate candidate = new Candidate();
		candidate.average(50,40,50);
		candidate.isAnswerAboveExpecation(averageAnswer);
		System.out.println("Eligibilty is " + isEligible(averageAnswer)+".");
		System.out.println("Candidate obtained " + getYourGrade(averageAnswer)+".");
		System.out.println();
		
		System.out.println("Input 2 : ");
		Candidate candidate1 = new Candidate();
		candidate1.average(100,80,90);
		candidate1.isAnswerAboveExpecation(averageAnswer);
		System.out.println("Eligibilty is " + Candidate.isEligible(averageAnswer)+".");
		System.out.println("Candidate obtained " + Candidate.getYourGrade(averageAnswer)+".");
		}
}
