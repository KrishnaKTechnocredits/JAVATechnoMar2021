package anubhav.staticandnonstaticexamples;

/*
Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) 
	and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if 
	value is more then 50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) 
	return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Sample input1 : 
10,20,30
Sample output1 : 
Candidate is Eligible
Candidate obtained B grade.

Note : Sum method should not be called from main method, it should be called from Average method (think about code reusability).*/

public class CandidateGrade {
	
	double sum (double n1, double n2, double n3) { // sum of numbers
		double sumOfNumbers= (n1 + n2 +n3);
		return sumOfNumbers;
	}

	double average (double n1, double n2, double n3) { // average of sum of numbers
		double averageOfNumbers= (sum(n1, n2, n3)/3);
		return averageOfNumbers;
	}
	
	boolean isAnswerAboveExpectation (double avg) { //avg > 50 condition
		if (avg>50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible (double avg) { // avg > 50 or avg%2 condition
		if ((avg>50) || (avg%2==0)) {
			//System.out.println("Candidate is eligible");
			return true;
		}else {
			//System.out.println("Candidate is not eligible");
			return false;
		}
	}
	
	static String getYourGrade(double avg) { // grade condition
		if (avg>80)
			return "A Grade";
		else 
			return "B Grade";
	}
	
	public static void main (String[] args) { // main method
		System.out.println("--------Candidate Grade--------");
		CandidateGrade candidateGrade = new CandidateGrade();
		double avg= candidateGrade.average(10,20,35);
		boolean isEligible= isEligible(avg);
		if (isEligible)
			System.out.println("Candidate is Eligible");
		else 
			System.out.println("Candidate is not Eligible");
		String grade= candidateGrade.getYourGrade(avg);
		System.out.println("Candidate obtained " + grade);
		
		System.out.println("--------Candidate Grade--------");
		CandidateGrade candidateGrade1 = new CandidateGrade();
		double avg1= candidateGrade1.average(100,200,35);
		boolean isEligible1= isEligible(avg1);
		if (isEligible1)
			System.out.println("Candidate is Eligible");
		else 
			System.out.println("Candidate is not Eligible");
		String grade1= candidateGrade1.getYourGrade(avg1);
		System.out.println("Candidate obtained " + grade1);
		
	}
}