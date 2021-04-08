package shivani.Assignment_12;
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
Note : Sum method should not be called from main method, it should be called from Average method (think about code reusability).
*/

public class StaticNonStaticAss2 {

	double sum(double x, double y, double z) {
		double sumresult = x + y + z;
		return sumresult;
	}

	double average(double x, double y, double z) {

		double sumResults = sum(x, y, z);
		double avgResults = sumResults / 3;

		return avgResults;
	}

	boolean isAnswerAboveExpecation(double isavgResultsexpected) {

		if (isavgResultsexpected > 5) {
			return true;
		} else

			return false;
	}

	static boolean isEligible(double eligiblecheck) {

		StaticNonStaticAss2 saticNonStaticAss2 = new StaticNonStaticAss2();
		boolean eligible = saticNonStaticAss2.isAnswerAboveExpecation(eligiblecheck);
		if (eligible || (eligiblecheck % 2) == 0) {
			return true;
		} else
			return false;
	}

	static String getYourGrade(double grade1) {

		if (grade1 > 80)
			return "A Grade";

		else
			return "B Grade";
	}

	public static void main(String[] args) {
		StaticNonStaticAss2 staticNonStaticAss2 = new StaticNonStaticAss2();

		double avg = staticNonStaticAss2.average(50, 20, 20);
		if (staticNonStaticAss2.isEligible(avg))
			System.out.println("candidate is eligible");

		else
			System.out.println("Candidate not eligible");

		String gradeCheck = staticNonStaticAss2.getYourGrade(avg);
		System.out.println("Candidate obtained " + gradeCheck);
		StaticNonStaticAss2 staticNonStaticAss3 = new StaticNonStaticAss2();
		double avg1 = staticNonStaticAss3.average(150, 120, 350);
		if (staticNonStaticAss3.isEligible(avg1))
			System.out.println("customer is eligible");

		else
			System.out.println("Customer not eligible");

		String gradeCheck1 = staticNonStaticAss3.getYourGrade(avg1);
		System.out.println("Candidate obtained " + gradeCheck1);

	}

}
