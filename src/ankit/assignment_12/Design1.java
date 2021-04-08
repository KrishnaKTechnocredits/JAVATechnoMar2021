/*
 Assignment 12 : 5th April 2021

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

package ankit.assignment_12;

public class Design1 {
	
	double sum(double num1, double num2, double num3) {
		double sum = num1+num2+num3;
		return sum;
	}
	double average(double num1, double num2, double num3) {
		double totalVal = sum(num1, num2, num3);
		double average = totalVal/3;
		System.out.println(average);
		return average;
	}
	boolean isAnswerAboveExpecation(double num) {
		if(num > 50){
		return true;
		}
		return false;
	}
	static String isEligible(double num) {
		if(num>50 && num%2==0) {
			String elegMessage = "Candidate is Eligible";
			return elegMessage;
		}
		String elegMessage = "Candidate is not Eligible";
		return elegMessage;
	} 
	static String getYourGrade(double num) {
		if(num>80) {
			String grade =  "Grade A";
			return grade;
		}
		String grade =  "Grade B";
		return grade;
	}
	 public static void main(String[] args){
		 Design1 design1 = new Design1();
		 double average = design1.average(90, 90, 90);
		 design1.isAnswerAboveExpecation(average);
		 System.out.println(getYourGrade(average));
		 System.out.println(isEligible(average));		 
	}
}
