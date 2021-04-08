package prachi.Assignment_12;

/*Design to test static, non static, return type concepts.
1) Method sum() - non static method, accept 3 parameters of type double & return answer
2) Method average()- non static method, accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received
from average method) and return true if value is more then 50 else false.
4) Method isEligible() - static method,take one parameter (answer which you received from average method) 
return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) 
return "A Grade" if average is more then 80 else "B grade", main method will print grade received from 
getYourGrade() method.

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

Note : Sum method should not be called from main method, it should be called from Average method 
(think about code re-usability).*/

public class StaticNonStatic {

	double sum(double num1, double num2, double num3){
		double sumTotal = num1+num2+num3;
		System.out.println("Sum of three numbers is: "+sumTotal);
		return sumTotal;		
	}

	double average(double num1, double num2, double num3) {
		double averageOfNums= (num1+num2+num3)/3;
		System.out.println("Average of three numbers is: "+averageOfNums);
		return averageOfNums;
	}

	boolean isAnswerAboveExpecation(double answer) {
		if (answer>50) {
			return true;
		}else {
			return false;
		}
	}

	//we need to use divisible function not modular.
	//if value is more than 50 or divisible by 2. Eligibility will be printed in main method.
	
	static String isEligible(double eAnswer) {
		if(eAnswer>50 || eAnswer/2	==0) { 
			String printMessage = "The Candidate is Elligible.";
			return printMessage;
		}else {
			String printMessage = "The Candidate is not Elligible.";
			return printMessage;
		}
	}

	static char getYourGrade(double gAnswer) {
		if(gAnswer>80) {
			char grade = 'A';
			return grade;
		}else {
			char grade = 'B';
			return grade;
		}
	}

	public static void main(String[] args) {
		StaticNonStatic sns= new StaticNonStatic();
		double average1 = sns.average(0, 90, 70);
		sns.isAnswerAboveExpecation(average1);    
		System.out.println(isEligible(average1));
		System.out.println("Candidate Obtained : "+getYourGrade(average1)+ " Grade");
	}
}