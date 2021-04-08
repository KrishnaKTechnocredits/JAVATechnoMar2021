/*Java Assignment 12: 5th April 2021

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

package vaibhav.Assignment12;

public class StaticNonStaticReturnType {

	double sum(double num1, double num2, double num3) {
		double sumAns = num1 + num2 + num3;
		return sumAns;
	}

	double average(double num1, double num2, double num3) {

		double avgAns = sum(num1, num2, num3) / 3;
		return avgAns;
	}

	boolean isAnswerAboveExpectation(double num1, double num2, double num3) {
		double y = average(num1, num2, num3);

		if (y > 50) {
			return true;
		} else
			return false;
	}

	static boolean isEligible(double num1, double num2, double num3) {
		StaticNonStaticReturnType staticNonStaticReturnType = new StaticNonStaticReturnType();
		double z = staticNonStaticReturnType.average(num1, num2, num3);

		if ((z > 50) || (z % 2 == 0)) {
			return true;
		} else
			return false;
	}

	static String getYourGrade(double num1, double num2, double num3) {
		StaticNonStaticReturnType staticNonStaticReturnType = new StaticNonStaticReturnType();
		double w = staticNonStaticReturnType.average(num1, num2, num3);
		if (w > 80) {
			return "A Grade";
		} else
			return "B Grade";
	}

	public static void main(String[] args) {

		// ==================================//
		// First Print Statement //
		// ==================================//

		boolean a = StaticNonStaticReturnType.isEligible(10, 20, 30);
		if (a) {
			System.out.println("Candidate is Eligible");
		} else {
			System.out.println("Candidate is NOT Eligible ");
		}
		String b = StaticNonStaticReturnType.getYourGrade(10, 20, 30);
		System.out.println("Candidate obtained " + b);

		// ==================================//
		// Second Print Statement //
		// ==================================//

		boolean c = StaticNonStaticReturnType.isEligible(50, 20, 20);
		if (c) {
			System.out.println("Candidate is Eligible");
		} else {
			System.out.println("Candidate is NOT Eligible ");
		}

		String d = StaticNonStaticReturnType.getYourGrade(80, 90, 95);
		System.out.println("Candidate obtained " + d);

	}

}
