package dhanshri.Assignment_12;

public class StaticNonstaticReturnType {

	double sum(double x, double y, double z) {
		double answer = x + y + z;
		return answer;

	}

	double average(double sumreturn) {
		double avgAns = sumreturn / 3;
		return avgAns;

	}

	boolean isAnswerAboveExpecation(double averageReturn) {
		if (averageReturn > 50)
			return true;
		else {
			return false;
		}
	}

	static boolean isEligible(double avgexception) {
		if (avgexception > 50 || avgexception % 2 == 0)
			System.out.println("Candidate is eligible");
		return true;

	}

	static String getYourGrade(double avgGrade) {
		if (avgGrade > 80) {
			System.out.println("Candidate obtain A grade");
			return "A grade";
		}

		else {
			System.out.println("Candidate obtain B grade");
			return "B grade";
		}

	}

	public static void main(String[] args) {
		StaticNonstaticReturnType staticNonstaticReturnType = new StaticNonstaticReturnType();
		double sumAns = staticNonstaticReturnType.sum(70, 80, 90);
		double avg = staticNonstaticReturnType.average(sumAns);
		staticNonstaticReturnType.isAnswerAboveExpecation(avg);
		isEligible(avg);
		getYourGrade(avg);

	}

}
