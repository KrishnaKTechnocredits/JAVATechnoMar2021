package pavan.Assignment12;

public class Assignment12 {
double avg;
	
	double sum(double num1, double num2, double num3) {
		double addition = num1 + num2 + num3;
		return addition;
	}

	double average(double sum) {
		avg = (sum) / 3;
		return avg;
	}
	boolean isAnswerAboveExpecation(double avg) {
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

	static void getYourGrade(double avg) {
		if (avg > 80)
			System.out.println("Candidate obtained A grade");
		else
			System.out.println("Candidate obtained B grade");
	}

	public static void main(String[] Args) {
		Assignment12 assignment12 = new Assignment12();
		double sum = assignment12.sum(10, 10, 80);
		double average = assignment12.average(sum);

		if (isEligible(average) == true)
			System.out.println("Candidate is Eligible");
		else
			System.out.println("Candidate is not Eligible");

		getYourGrade(average);
	}

}
