package rahul_Hiremath.assignment_12;

public class Ass_12 {
	double sumAns;
	static double avg;

	double sum(double num1, double num2, double num3) {
		sumAns = num1 + num2 + num3;
		return sumAns;
	}

	double average(double avgNum1, double avgNum2, double avgNum3) {
		sum(avgNum1, avgNum2, avgNum3);
		avg = sumAns / 3;
		return avg;
	}

	boolean isAnswerAboveExpecation() {
		if (avg > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible() {
		if (avg > 50 || avg % 2 == 0)
			return true;
		else
			return false;
	}

	static String getYourGrade() {
		String above80 = "A Grade";
		String below80 = "B Grade";
		if (avg > 80)
			return above80;
		else
			return below80;
	}

	public static void main(String[] args) {

		Ass_12 ass_12 = new Ass_12();
		ass_12.average(10, 10, 10);
		ass_12.isAnswerAboveExpecation();
		boolean flag = Ass_12.isEligible();
		if (flag == true)
			System.out.println("Candidate is Eligible");
		else
			System.out.println("Candidate is not Eligible");
		String grade = Ass_12.getYourGrade();
		System.out.println("Candidate obtained " + grade);
	}
}
