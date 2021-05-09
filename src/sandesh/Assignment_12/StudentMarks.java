package sandesh.Assignment_12;

public class StudentMarks {
	
	double sum(double num1, double num2, double num3) {
		return(num1 + num2 + num3);
	}
	
	double averageOfMarks(double num1, double num2, double num3) {
		return(sum(num1, num2, num3)/3);
	}
	
	boolean isAnswerAboveExpectation(double avgValue) {
		if(avgValue > 50)	
			return true;
		else
			return false;
	}
	
	static boolean isStudentEligible(double avgValue) {
		StudentMarks sm1 = new StudentMarks();
		if((sm1.isAnswerAboveExpectation(avgValue)) || (avgValue % 2 == 0))
			return true;
		else
			return false;		
	}
	
	static String getYourGrade(double avgValue) {
		if(avgValue > 80)
			return "A Grade";
		else
			return "B Grade";
	}
	
	public static void main(String[] args) {
		StudentMarks sm1 = new StudentMarks();
		double averageValue = sm1.averageOfMarks(50, 20, 20);
		sm1.isAnswerAboveExpectation(averageValue);
		if((StudentMarks.isStudentEligible(averageValue)))
			System.out.println("Candidate is eligible.");
		else
			System.out.println("Candidate is not eligible.");
		if(StudentMarks.getYourGrade(averageValue).equals("A Grade"))
			System.out.println("Student's Grade is A");
		else
			System.out.println("Student's Grade is B");
	}
}
