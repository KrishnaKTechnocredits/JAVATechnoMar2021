package monika.Assignment12;
/*Assignment 12 : 5th April 2021

Design to test static, non static, return type concepts.
1) Method sum() - non static method, accept 3 parameters of type double & return answer
2) Method average()- non static method, accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer 
which you received from average method) and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) 
return true if value is more then 50 or divisible by 2. 
Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) return 
"A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.
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
public class StaticNonStaticwithReturnType {
	double sum(double num1, double num2, double num3){
		double answer = num1+num2+num3;
		return answer;
	}
	double average(double a, double b, double c) {
		double answer = sum(a,b,c)/3;
		return answer;
	}
	boolean isAnswerAboveExpecation(double d) {
		//double answer = average(10, 20, 30);
		if(d > 50)
			return true;
		else
			return false;
	}
	static boolean isEligible(double d) {
		StaticNonStaticwithReturnType obj = new StaticNonStaticwithReturnType();
		if(obj.isAnswerAboveExpecation(d) || d % 2 == 0)
			return true;
		else
			return false;
	}
	static char getYourGrade(double d) {
		if(d > 80 )
			return 'A';
		else
			return 'B';
	}
	public static void main(String[] args) {
		StaticNonStaticwithReturnType obj = new StaticNonStaticwithReturnType();
		System.out.println("Sample input1 :");
		double answer = obj.average(10, 20, 30);
		
		if(isEligible(answer))
			System.out.println("Candidate is eligible");
		else
			System.out.println("Candidate is not eligible");
		char c = getYourGrade(answer);
			System.out.println("Candidate obtained "+c+" grade");
		
		StaticNonStaticwithReturnType obj1 = new StaticNonStaticwithReturnType();
		System.out.println("\n"+"Sample input2 :");
		double answer1 = obj1.average(90,82,90);
		if(isEligible(answer1))
			System.out.println("Candidate is eligible");
		else
			System.out.println("Candidate is not eligible");
		
		char c1 = getYourGrade(answer1);
		System.out.println("Candidate obtained "+c1+" grade");	
	}
}
