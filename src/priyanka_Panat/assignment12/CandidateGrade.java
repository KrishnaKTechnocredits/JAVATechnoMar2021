package priyanka_Panat.assignment12;

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

public class CandidateGrade {
	double sum(double a, double b, double c) {
		double sum=a+b+c;
		return sum;
	}

	double average(double a, double b, double c) {
		double sum1=sum(a,b,c);
		double avgResult=sum1/3;
		return avgResult;
	}

	boolean isAnswerAboveExpectation(double avgResult) {
		if(avgResult > 50)	
			return true;
		else
			return false;
	}

	static boolean isEligible(double avgResult) {
		CandidateGrade c1= new CandidateGrade ();
		if((c1.isAnswerAboveExpectation(avgResult))||(avgResult % 2 == 0))
			return true;
		else
			return false;		
	}

	static String getYourGrade(double avgResult) {
		if(avgResult > 80)
			return "A Grade";
		else
			return "B Grade";
	}

	public static void main(String[] args) {
		CandidateGrade c2 = new CandidateGrade();
		double avgResult1 = c2.average(10,20,30);
		c2.isAnswerAboveExpectation(avgResult1);
		if((CandidateGrade.isEligible(avgResult1)))
			System.out.println("Candidate is eligible.");
		else
			System.out.println("Candidate is not eligible.");
		String grade = CandidateGrade.getYourGrade(avgResult1);
		System.out.println("Candidate obtained "+ grade);
		
		CandidateGrade c3 = new CandidateGrade();
		double avgResult2 = c3.average(100,100,90);
		c3.isAnswerAboveExpectation(avgResult2);
		if((CandidateGrade.isEligible(avgResult2)))
			System.out.println("Candidate is eligible.");
		else
			System.out.println("Candidate is not eligible.");
		String grade1 = CandidateGrade.getYourGrade(avgResult2);
		System.out.println("Candidate obtained "+ grade1);
	}
}

