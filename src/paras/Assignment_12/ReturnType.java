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
Candidate is Eligible1
Candidate obtained A grade.

Note : Sum method should not be called from main method, it should be called from Average method (think about code re usability).

*/

package paras.Assignment_12;

public class ReturnType {
	
	double sum(double num1, double num2, double num3) {
		double sumAnswer = num1 + num2 +num3;
		return sumAnswer;
	}
	
	double average(double num1, double num2, double num3) {
		double averageAnswer =  sum(num1, num2, num3);
		return averageAnswer;
	}
	
	boolean isAnswerAboveExpecation(double averageAnswer) {
		if (averageAnswer > 50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double answerAverage) { // Static Method
		ReturnType returntype = new ReturnType();			// Here, From Static method(isEligible) Called Non Static method(isAnswerAboveExpecation), and for that Need to create object.
		boolean answer = returntype.isAnswerAboveExpecation(answerAverage);
		if(answer || answerAverage/2 == 0) {
			System.out.println("Candidate is Eligible");
			return true;
		}else {
			System.out.println("\nCandidate is not Eligible");
			return false;
		}
	}
	
	static boolean getYourGrade(double answerAverage){
		if(answerAverage>80) {
			System.out.println("Candidate obtained A grade.");
			return true;
	}else{
			System.out.println("Candidate obtained B grade.");
			return false;
		}
	}
	
	public static void main(String[] args){
		ReturnType returnjava = new ReturnType();
		double answerAverage = returnjava.average(10, 20, 30);
		ReturnType.isEligible(answerAverage);
		ReturnType.getYourGrade(answerAverage);
		
		ReturnType returnjava1 = new ReturnType();
		double answerAverage1 = returnjava1.average(50, 20, 20);
		ReturnType.isEligible(answerAverage1);
		ReturnType.getYourGrade(answerAverage1);

		
	}
}