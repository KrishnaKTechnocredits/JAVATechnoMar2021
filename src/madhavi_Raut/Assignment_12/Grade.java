package madhavi_Raut.Assignment_12;
/*Assignment 12
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

Note : Sum method should not be called from main method, it should be called from Average method (think about code reusability).*/

public class Grade {
	
	double sum(double num1, double num2, double num3) {
		return(num1 + num2 + num3);
	}
	
	double average(double num1, double num2, double num3) {
		return(sum(num1, num2, num3)/3);
	}
	
	boolean isAnswerAboveExpectation(double avgValue) {
		if(avgValue > 50)	
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double avgValue) {
		Grade grade = new Grade();
		if((grade.isAnswerAboveExpectation(avgValue))||(avgValue % 2 == 0))
			return true;
		else
			return false;		
	}
	
	static String getYourGrade(double avgValue) {
		if(avgValue > 80)
			return "A Grade";
		else
			return "B Grade";
	}
	
	public static void main(String[] args) {
		Grade grade = new Grade();
		//Storing the value returned by average method in variable avgValue 
		double avgValue = grade.average(10, 20, 30);
		grade.isAnswerAboveExpectation(avgValue);
		//To check and print whether candidate is eligible.
		if((Grade.isEligible(avgValue)))
			System.out.println("Candidate is eligible.");
		else
			System.out.println("Candidate is not eligible.");
		//To check and print the grade obtained by student
		if(Grade.getYourGrade(avgValue).equals("A Grade"))
			System.out.println("candidate obtained A Grade");
		else
			System.out.println("candidate obtained B Grade");
	}
}
