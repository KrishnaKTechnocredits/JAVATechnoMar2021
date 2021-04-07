/*Assignment 12 : 5th April 2021

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

package kapil.StatictoNonstatic;

public class StaticNonstaticReturntype { 
	
	double sum(double number1, double number2, double number3) {
		double total = (number1 + number2 + number3);
		return  total;	
	}
	double avg(double num1, double num2 ,double num3) { 
	    double totalavg = (num1 + num2 + num3)/3;
	    StaticNonstaticReturntype staticnonstaticreturntype = new StaticNonstaticReturntype();
	    staticnonstaticreturntype.sum(100, 200, 300 );
		return totalavg;   
	}
	boolean AnswerAboveExecation(double avg) {
		if(avg > 50) 
			return true;
		else 
			return false;
		}
	 static  boolean eligible(double avg) {
		 if(avg >50 || avg/2 == 0) {
				 System.out.println("Candidate is eligible ");
			 return true;}
			 else {  
				 System.out.println("Candidate is eligible");
			 return false;
		 }
		}
	 static double getYourGrade(double avg) {
		if(avg > 80) {
			 System.out.println("Condidate obtain Grade A");
			 return avg;
		 }else 
			 System.out.println("Condidate obtain Grade B");
			 return avg;	 
	 }
	 
	public static void main(String[] Args) {
		StaticNonstaticReturntype staticnonstaticreturntype = new StaticNonstaticReturntype();
		double avg =staticnonstaticreturntype.avg(100, 200, 300);
		boolean AnswerAboveExecation = staticnonstaticreturntype.AnswerAboveExecation(avg);
	    boolean eligible = staticnonstaticreturntype.eligible(avg);
	    double getYourGrade = staticnonstaticreturntype.getYourGrade(avg);
	    
	    StaticNonstaticReturntype staticnonstaticreturntype2 = new StaticNonstaticReturntype();
		double avg2 =staticnonstaticreturntype2.avg(50,50,50);
		boolean AnswerAboveExecation2 = staticnonstaticreturntype2.AnswerAboveExecation(avg2);
	    boolean eligible2 = staticnonstaticreturntype2.eligible(avg2);
	    double getYourGrade2 = staticnonstaticreturntype2.getYourGrade(avg2);
	}
}
