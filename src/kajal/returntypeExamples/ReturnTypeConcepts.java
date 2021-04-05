/*

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
Candidate obtained B grade.*/

package kajal.returntypeExamples;

public class ReturnTypeConcepts {

	double sum(double num1, double num2, double num3) {
		return (num1 + num2 + num3);
	}

	double average(double num1, double num2, double num3) {
		return sum(num1, num2, num3) / 3;
	}

	boolean isAnswerAboveExpecation(double avg) {
		if (avg > 50)
			return true;
			return false;
	}

	static boolean isEligible(double avg) {
		if (avg >= 50 || avg % 2 == 0) {
			System.out.println("Candidate is Eligible");
		return true;
		}
		else
			System.out.println("Candidate is not Eligible");
			
		return false;
	}

	String getYourGrade(double avg) {
		if (avg >= 80)
			return "A grade.";
		else
			return "B grade.";
	}
	
	public static void main(String [] args) {
		ReturnTypeConcepts returntype = new ReturnTypeConcepts();
		double average = returntype.average(10,20,30);
		boolean isEligible = isEligible(average);
		
		String grade = returntype.getYourGrade(average);
		System.out.println("Candidate obtained " + grade);
		
		ReturnTypeConcepts returntype2 = new ReturnTypeConcepts();
		double avg = returntype2.average(90, 80, 90);
		boolean isEligible1 = isEligible(avg);
				
		String grade1 = returntype2.getYourGrade(avg);
		System.out.println("Candidate obtained " + grade1);
	}
}


