/* 
 Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter 
(answer which you received from average method) and 
return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter 
(answer which you received from average method) return true if value is more then 
50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter 
(answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.
*/
package ami.Assignment_12;

public class Grade {
	double sum(double num1, double num2, double num3) {
		double total = num1 + num2 + num3;
		return total;
	}

	double average(double num1, double num2, double num3) {
		double y = sum(num1, num2, num3);
		double avg = y / 3;
		System.out.println("Total of average: " + avg);
		return avg;

	}

	boolean isAnswerAboveExpecation(double marks) {
		if (marks > 50) {
			System.out.println("Avarage is greater than 50.");
			return true;
		} else {
			System.out.println("Avarage is Less than 50.");
			return false;
		}
	}

	static boolean isEligible(double marks) {
		if (marks > 50 || marks / 2 == 0) {
			System.out.println("Candidate is Eligible.");
			return true;
		} else {
			System.out.println("Candidate is not Eligible.");
			return false;
		}
	}

	static String getYourGrade(double marks) {
		if (marks > 80) {
			System.out.println("Candidate obtained A Grade.");
			return "Candidate obtained A grade";
		} else {
			System.out.println("Candidate obtained B Grade.");
			return "Candidate obtained B Grade";
		}

	}

	public static void main(String[] a) {
		Grade grade = new Grade();
		System.out.println("-------- Sample input1 ----------");
		double x = grade.average(10, 20, 30);
		grade.isAnswerAboveExpecation(x);
		grade.isEligible(x);
		grade.getYourGrade(x);
		System.out.println("-------- Sample input2 ----------");
		Grade grade2 = new Grade();
		double q = grade2.average(50, 20, 20);
		grade2.isEligible(q);
		grade2.getYourGrade(q);
		System.out.println("-------- Sample input3 ----------");
		Grade grade3 = new Grade();
		double w = grade2.average(100, 50, 20);
		grade2.isEligible(w);
		grade2.getYourGrade(w);
	}

}
