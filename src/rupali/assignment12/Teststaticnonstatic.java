/*
 * Assignment 12 : 5th April 2021

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
 */
package rupali.assignment12;

public class Teststaticnonstatic {
	double sum(double a,double b,double c) {
		return (a+b+c);
	}
	
	double average(double a,double b, double c) {
		return ((a+b+c)/3);
		
	}
	
	static boolean isAnswerAboveExpectation(double temp) {
		if(temp>50)
			return true;
		else
			return false;
	}
	
	static char isEligible(double temp) {
		if(temp>80)
			return 'A';
		else
			return 'B';
	}
	
	public static void main(String[] args) {
		Teststaticnonstatic teststaticnonstatic= new Teststaticnonstatic();
		double ans1=teststaticnonstatic.sum(10, 20, 30);
		System.out.println("Marks of candidate1 are 10,20,30");
		System.out.println("Candidate1 Result:");
		double ans2=teststaticnonstatic.average(10, 20, 30);
		boolean answer1=Teststaticnonstatic.isAnswerAboveExpectation(ans1);
			if (answer1==true)
				System.out.println("Candidate1 is Eligible");
			else
				System.out.println("Candidate1 is not Eligible");
		char answer2=Teststaticnonstatic.isEligible(ans2);
		System.out.println("Cadidate1 grade is "+answer2);	
		
		Teststaticnonstatic teststaticnonstatic_1= new Teststaticnonstatic();
		ans1=teststaticnonstatic_1.sum(50, 20, 20);
		System.out.println("Marks of candidate2 are 50,20,20");
		System.out.println("Candidate2 Result:");
		ans2=teststaticnonstatic_1.average(50, 20, 20);
		answer1=Teststaticnonstatic.isAnswerAboveExpectation(ans1);
			if (answer1==true)
				System.out.println("Candidate2 is Eligible");
			else
				System.out.println("Candidate2 is not Eligible");
		answer2=Teststaticnonstatic.isEligible(ans2);
		System.out.println("Cadidate2 grade is "+answer2);

	}
}

