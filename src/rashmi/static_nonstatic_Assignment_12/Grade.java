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

	Note : Sum method should not be called from main method, it should be called from Average method (think about code reusality).

	Complete this assignment by Monday EOD.*/

package rashmi.static_nonstatic_Assignment_12;

public class Grade {

	double sum(double a,double b,double c){
		return a+b+c;
	}
		
	double average(double num1, double num2, double num3){
		double sumAns = sum(num1,num2,num3);
		double avgAns = sumAns/3;
		return avgAns;
	}
		
	boolean isAnswerAboveExpecation(double avgAns){
		if(avgAns>50){
			return true;
		}
		else{
			return false;
		}
	}
		
	static boolean isEligible(double avgAns){
		if(avgAns>50 || (avgAns%2 == 0)){
			return true;
		}
		else{
			return false;
		}
	}
		
	static String getYourGrade(double avgAns){
		if(avgAns > 80){
			return "A Grade";
		}
		else{
				return "B Grade";
		}
	}
		
	public static void main(String[] args){
		Grade grade = new Grade();
		double averageAns = grade.average(10,20,30);
		boolean eligibility = Grade.isEligible(averageAns);
		if(eligibility==true){
			System.out.println("Candidate is eligible");
		}
		else{
			System.out.println("candidate is not eligible");
		}
		String gradeStd = Grade.getYourGrade(averageAns);
		System.out.println("Canditate obtained "+ gradeStd );
		averageAns = grade.average(12,20,25);
		eligibility = Grade.isEligible(averageAns);
		if(eligibility==true){
			System.out.println("Candidate is eligible");
		}
		else{
			System.out.println("candidate is not eligible");
		}
		gradeStd = Grade.getYourGrade(averageAns);
		System.out.println("Canditate obtained "+ gradeStd );
			
	}
}



			
				
		
		


			
		
		





