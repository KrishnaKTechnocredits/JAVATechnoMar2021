package kangan.assignments.assignment_12;

public class StudentGrade {
	   
	double sum(double num1, double num2, double num3) {
		double sum = num1+num2+num3;
		return sum;
	}

	double average(double num1, double num2, double num3) {
		double avg = sum(num1,num2,num3)/3;
		return avg;
		
	}
	boolean isAnswerAboveExpecation(double avg) {
		if (avg>50) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isEligible(double avg) {
		if (avg>50 || avg%2==0) {
			System.out.println("Eligible");
			return true;
		}
		else {
			System.out.println("Not Eligible");
			return false;
		}
		
	}
	static String getYourGrade(double avg) {
		if (avg>80) {
			return "A grade";
		}
		else {
			return "B grade";
		}
	}
	public static void main(String[] args) {
		
		StudentGrade studentGrade1 = new StudentGrade();
		double finalAvg = studentGrade1.average(0,10,90);
		System.out.println(finalAvg);
		
		StudentGrade.isEligible(finalAvg);
		System.out.println(StudentGrade.isEligible(finalAvg));
		
		StudentGrade.getYourGrade(finalAvg);
		System.out.println(StudentGrade.getYourGrade(finalAvg));
		
		studentGrade1.isAnswerAboveExpecation(finalAvg);
		System.out.println(studentGrade1.isAnswerAboveExpecation(finalAvg));
		
	}
}
