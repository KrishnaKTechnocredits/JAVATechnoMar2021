package pallavi.Assignment_12;


/*
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
Candidate obtained B grade.*/

public class StaticExample {
	
	 double sum(double a, double b, double c) {
		 double ans= a+b+c;
		 return ans;
	 }
	
	 double average(double a, double b, double c) {
		 StaticExample staticExample= new StaticExample();
		double sumAns= staticExample.sum(a,b,c);
		 double ans= sumAns/3;
		 return ans;
	 }
	
	 boolean isAnswerAboveExpecation(double aveAns) {
		 if(aveAns>50) {
			return true;
			 
		 }else
			 return false;
	 }
	 
	static String isEligible(double aveAns) {
		String mess;
		 if(aveAns>50 || aveAns%2==0) {
			 mess= "Eligible";
			return mess;
		 }else {
			 mess="Not Eligible";
		 return mess;
		 }
		
	 }
	
	static String getYourGrade(double avgAns) {
		String message;
		if(avgAns>80) {
			message="A Grade";
		return message;
		}
		else
			message="B Grade";
			return message;
			
		
	}

	public static void main(String[] args) {
		 StaticExample staticExample= new StaticExample();
		 double averageAnswer=staticExample.average(10,20,30);
		 staticExample.isAnswerAboveExpecation(averageAnswer);
		 System.out.println("candidate is : " +StaticExample.isEligible(averageAnswer));
		 System.out.println("Candidate obtained : "+StaticExample.getYourGrade(averageAnswer));
		 
		 StaticExample staticExample1= new StaticExample();
		 double averageAnswer1=staticExample1.average(10,20,30);
		 staticExample1.isAnswerAboveExpecation(averageAnswer1);
		 System.out.println("candidate is : " +StaticExample.isEligible(averageAnswer1));
		 System.out.println("Candidate obtained : "+StaticExample.getYourGrade(averageAnswer1));

	}

}
