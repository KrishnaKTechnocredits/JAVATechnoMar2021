package aashay.staticNonStaticMethods;

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

Note : Sum method should not be called from main method, it should be called from Average method (think about code reusability).		
 */
	
public class StaticNonStaticReturnTypes {
	
	double sum(double num1, double num2, double num3) {
		double sum = num1+num2+num3;
		return sum;
		
	}
	double average(double num1, double num2, double num3) {
		double addition=  sum(num1,num2,num3);
		double average = addition/3;
		return average;
	}
	static boolean isAnswerAboveExpecation(double avrge) {
		if(avrge >50 ) {
			return true ;
		}else
			return false;
	}
	static boolean booleanisEligible(double avrge) {
		if(avrge >50 || (avrge%2 ==0)) {
			return true ;
		}else
			return false;
	}
	static String getYourGrade(double avrge) {
		if (avrge > 80 )		
			return "A garde";
		else
			return "B Grade";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticReturnTypes staticNonStaticReturnTypes = new StaticNonStaticReturnTypes();
		double avrge = staticNonStaticReturnTypes.average(10,20,30);
		//boolean isAnswerAboveExpe = StaticNonStaticReturnTypes.isAnswerAboveExpecation(avrge);
		boolean isEligible =  StaticNonStaticReturnTypes.booleanisEligible(avrge);
			if(isEligible== true)
				System.out.println("Candidate is eligible");
			else
				System.out.println("Candidate is not eligible");
		String yourGrade = StaticNonStaticReturnTypes.getYourGrade(avrge);
		System.out.println("Candidate obtained "+yourGrade);
		
		avrge = staticNonStaticReturnTypes.average(50,20,20);
		//boolean isAnswerAboveExpe = StaticNonStaticReturnTypes.isAnswerAboveExpecation(avrge);
		isEligible =  StaticNonStaticReturnTypes.booleanisEligible(avrge);
			if(isEligible== true)
				System.out.println("Candidate is eligible");
			else
				System.out.println("Candidate is not eligible");
		yourGrade = StaticNonStaticReturnTypes.getYourGrade(avrge);
		System.out.println("Candidate obtained "+yourGrade);
		
		
		
		}

}
