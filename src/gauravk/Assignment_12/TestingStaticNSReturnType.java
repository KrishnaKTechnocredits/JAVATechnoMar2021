package gauravk.Assignment_12;

import java.util.Scanner;

/*
 * Assignment 12 : 5th April 2021
Design to test static, non static, return type concepts.
1) Method sum() - non static method, accept 3 parameters of type double & return answer
2) Method average()- non static method, accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method.
5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", 
main method will print grade received from getYourGrade() method.
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
public class TestingStaticNSReturnType {
	static double avgx;
	//double sumx;
	
	double sum(double a, double b, double c) {
		return (a+b+c);
	}
	
	double average(double x, double y, double z) {
		return (sum(x,y,z))/3;
	}
	
	boolean isAnswerAboveExpecation(double avg) {
		if(avg>50)
			return true;
		else return false;
	}
	
	static boolean isEligible(double avg) {
		if(avg > 50 || avg%2==0)
			return true;
		else return false;
	}
	
	static String getYourGrade(double avg){
		if(avg>80)
			return "A grade";
		else return "B grade";
		
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		TestingStaticNSReturnType testingStaticNSReturnType1 = new TestingStaticNSReturnType();
		avgx = testingStaticNSReturnType1.average(x,y,z);
		boolean ans = testingStaticNSReturnType1.isAnswerAboveExpecation(avgx);
		boolean ans1 = testingStaticNSReturnType1.isEligible(avgx);
		System.out.println("Candidate is Eligible: "+ans);
		String grade = getYourGrade(avgx);
		System.out.println("Candidate obtained "+grade);
	}
	
}
