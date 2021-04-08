/*
 Assignment 12 : 5th April 2021

Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average
 														method) and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) return
 						true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) 
		return "A Grade" if average is more then 80 else "B grade", main method will print grade received
		 from getYourGrade() method.

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
package upasana.assignment_12;

public class Candidate {
	double sum(double x,double y,double z) {
		double sum = x+y+z;
		return sum;
	}
	
	double average(double x,double y,double z) {
		double avg = sum(x,y,z)/3;
		return avg;
	}
	
	boolean isAnswerAboveExpecation(double avg){
		if(avg>50)
			return true;
		else
			return false;
			
	}
	 static boolean isEligible(double avg){
		 if(avg > 50 || avg % 2 == 0)
				return true;
		return false;
			
	}
	 static char getYourGrade(double avg){
		 if(avg>80)
				return 'A';
			else
				return 'B';
	}
	
	public static void main(String[] args) {
		Candidate candidate = new Candidate();
		//double average = candidate.average(10, 20, 30);
		double average = candidate.average(50, 20, 20);
		candidate.isAnswerAboveExpecation(average);
		boolean b=Candidate.isEligible(average);
		if(b==true) 
			System.out.println("Candidate is Eligible");
		char grade =Candidate.getYourGrade(average);
		System.out.println("Candidate obtained "+grade +" grade");
		
	}
}
