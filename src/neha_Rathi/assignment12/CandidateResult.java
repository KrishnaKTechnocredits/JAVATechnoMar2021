package neha_Rathi.assignment12;

public class CandidateResult {

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
		if (avg >= 50 || avg % 2 == 0)
			return true;
		return false;
	}

	String getYourGrade(double avg) {
		if (avg >= 80)
			return "A grade.";
		else
			return "B grade.";
	}

	public static void main(String[] args) {
		CandidateResult candidateResult = new CandidateResult();
		double avg = candidateResult.average(10, 20, 30);
		boolean isEligible = isEligible(avg);
		if (isEligible)
			System.out.println("Candidate is Eligible");
		else
			System.out.println("Candidate is not Eligible");
		String grade = candidateResult.getYourGrade(avg);
		System.out.println("Candidate obtained " + grade);
		CandidateResult candidateResult1 = new CandidateResult();
		double avg1 = candidateResult1.average(90, 80, 90);
		boolean isEligible1 = isEligible(avg1);
		if (isEligible1)
			System.out.println("Candidate is Eligible");
		else
			System.out.println("Candidate is not Eligible");
		String grade1 = candidateResult1.getYourGrade(avg1);
		System.out.println("Candidate obtained " + grade1);
	}
}
