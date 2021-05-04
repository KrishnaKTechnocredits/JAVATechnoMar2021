/*Design to test static, non static, return type concepts.
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
Complete this assignment by Monday EOD.
*/
package shashank_assignment_12;

public class GetYourGrade {

	public double sum(double a, double b, double c) {
		double sum = a + b + c;
		return sum;
	}

	public double average(double num1, double num2, double num3) {
		double temp = sum(num1, num2, num3);
		double avg = temp / 3;
		return avg;
	}

	public boolean isAnswerAboveExpectation(double avg) {
		if (avg > 50)
			return true;
		else
			return false;

	}

	public static boolean isEligible(double avg) {
		if (avg > 50 || (avg % 2 == 0))
			return true;
		else
			return false;
	}

	public static String getYourGrade(double avg) {
		if (avg > 80)
			return "A Grade";
		else
			return "B Grade";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetYourGrade getYourGrade = new GetYourGrade();
		double num1 = 10, num2 = 20, num3 = 30;
		double avg = getYourGrade.average(num1, num2, num3);
		boolean isEligiblity = isEligible(avg);
		if (isEligiblity)
			System.out.println("Candidate is Eligible");
		else
			System.out.println("Candidate is not Eligible");
		String grade = getYourGrade(avg);
		System.out.println("Candidate obtained " + grade);
	}

}
