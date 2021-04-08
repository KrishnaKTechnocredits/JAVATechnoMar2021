package gaurav;

public class StaticNonStatic {
	double sum(double a, double b, double c) {
		double answer = a + b + c;
		return answer;
	}

	double average(double x, double y, double z) {
		double sum1 = sum(x, y, z);
		double avg = sum1 / 3;
		return avg;
	}

	boolean answerAboveExpecation(double avg) {
		if (avg > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double avg) {
		if (avg > 50 || avg % 2 == 0)
			return true;
		else
			return false;
	}

	static String getYourGrede(double avg) {
		if (avg > 80)
			return "A Grade";
		else
			return "B Grade";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStatic S1 = new StaticNonStatic();
		double avg = S1.average(10, 20, 30);
		boolean isAnswer = S1.answerAboveExpecation(avg);
		boolean IsEligible = StaticNonStatic.isEligible(avg);
		if (IsEligible)
			System.out.println("Candidate is Eligible");
		else
			System.out.println("Candidate is Not Eligible");
		String grade = StaticNonStatic.getYourGrede(avg);
		System.out.println("Candidate Obtained " + grade);

		double avg2 = S1.average(50, 20, 20);
		boolean isAnswer2 = S1.answerAboveExpecation(avg2);
		boolean isEligible2 = StaticNonStatic.isEligible(avg2);
		if (isEligible2)
			System.out.println("Candidate is Eligible");
		else
			System.out.println("Candidate is Not Eligible");
		String grade2 = StaticNonStatic.getYourGrede(avg2);
		System.out.println("Candidate Obtained " + grade2);
	}

}
