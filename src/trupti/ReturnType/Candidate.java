package trupti.ReturnType;
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
 */

public class Candidate {



	double sumOfNum(double num1,double num2,double num3) {
		double sum;
		sum=num1+num2+num3;
		return sum;
	}

	double average(double num1,double num2,double num3) {
		double avg,ans;
		ans=sumOfNum(num1,num2,num3);
		avg=ans/3;
		return avg;
	}

	boolean isAnswerAboveExpectation(double aveg){
		if(aveg>50) {
			return true;
		}
		else {
			return false;	
		}
	}

	static boolean isEligible(double x) {
		if(x >50 || x %2==0) {
			return true;
		}
		else {
			return false;
		}
	}

	static String getYourGrade(double y) {
		if(y >80) {
			return "A Grade";
		}
		else {
			return "B Grade";
		}
	}


	public static void main(String[] args) {
		Candidate candidate=new Candidate();
		double avg1;
		boolean ans1, answer;
		String grade;

		avg1=candidate.average(10,20,30);  

		ans1=candidate.isAnswerAboveExpectation(avg1);

		answer=Candidate.isEligible(avg1);
		if(answer) {
			System.out.println("Candidate is eligible");
		}
		else {
			System.out.println("Candidate is not eligible");
		}

		grade=Candidate.getYourGrade(avg1);
		System.out.println("Candidate obtained "+grade);

	}

}
