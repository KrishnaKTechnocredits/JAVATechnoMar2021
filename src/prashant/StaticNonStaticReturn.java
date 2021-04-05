//Assignment 12 : 5th April 2021
//Design to test static, non static, return type concepts.
//1) Method sum() - non static method, accept 3 parameters of type double & return answer
//2) Method average()- non static method, accept 3 parameters of type double & return answer
//3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
//4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
//5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.
//Sample input1 : 
//10,20,30
//Sample output1 : 
//Candidate is Eligible
//Candidate obtained B grade.

package prashant;

public class StaticNonStaticReturn {

	double sum(double num1, double num2, double num3) {
		double add = num1 + num2 + num3;
		return add;
	}

	double avg(double num1, double num2, double num3) {
		double Totalsum = sum(num1, num2, num3);
		double avg = Totalsum / 3;
		return avg;
	}

	boolean isAnswerAboveExpecation(double avg) {
		if (avg > 50) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isEligible(double avg) {
		if (avg > 50 || avg % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static String getYourGrade(double avg) {
		if (avg > 80) {
			return "Grade A";
		} else {
			return "Grade B";
		}
	}

	public static void main(String[] args) {

		StaticNonStaticReturn candidate = new StaticNonStaticReturn();
		double Avg = candidate.avg(20, 50, 50);
		boolean Answer = candidate.isAnswerAboveExpecation(Avg);
		boolean eligible = candidate.isEligible(Avg);
				if (eligible==true)
					System.out.println("Candidate is eligible");
				else
					System.out.println("Candidate is eligible");
		String grade = candidate.getYourGrade(Avg);
		System.out.println("Candidate obtained " + grade);

	}

}
