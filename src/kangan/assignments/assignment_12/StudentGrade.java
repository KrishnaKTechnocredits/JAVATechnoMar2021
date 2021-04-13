package kangan.assignments.assignment_12;

public class StudentGrade {
	    static double averageres1;
	  
	double sum(double num1, double num2, double num3) {
		double sum = num1+num2+num3;
		System.out.println(sum);
		return sum;
	}

	double average(double num1, double num2, double num3) {
		//double averageres = (num1+num2+num3)/3;
		double result= sum(num1,num2,num3);
		double averageres = result/3;
		System.out.println(averageres);
		averageres1 = averageres;
		return averageres;
		
	}
	boolean isAnswerAboveExpecation(double averageres) {
		if (averageres>50) {
			System.out.println("Above expectation");
			return true;
		}
		else {
			System.out.println("Below expectation");
			return false;
		}
	}
	static boolean isEligible(double averageres) {
		if (averageres>50 || averageres%2==0) {
			System.out.println("Eligible");
			return true;
		}
		else {
			System.out.println("Not Eligible");
			return false;
		}
		
	}
	static String getYourGrade(double averageres) {
		if (averageres>80) {
			System.out.println("Grade A");
			return "A grade";
		}
		else {
			System.out.println("Grade B");
			return "B grade";
		}
	}
	public static void main(String[] args) {
		
		StudentGrade studentGrade1 = new StudentGrade();
		studentGrade1.average(100,100,90);
		
		StudentGrade studentGrade2 = new StudentGrade();
	    studentGrade2.isAnswerAboveExpecation(averageres1);
		
	    StudentGrade.isEligible(averageres1);
	    StudentGrade.getYourGrade(averageres1);
		
	}
}
