package amruta.Assignment_12;

public class Example2StaticNonStatic {
	double N1, N2, N3;

	double sum(double num1, double num2, double num3) {
		N1 = num1;
		N2 = num2;
		N3 = num3;
		// System.out.println(" Input Numbers : " +N1+ " , "+N2+" , "+N3);
		double sum1 = N1 + N2 + N3;
		System.out.println(" Sum is = " + sum1);
		return sum1;
	}

	double average(double num1, double num2, double num3) {
		sum(num1, num2, num3);
		System.out.println(" Input Numbers : " + N1 + " , " + N2 + " , " + N3);
		double avg = sum(N1, N2, N3) / 3;
		System.out.println(" Avarage = " + avg);
		// getYourGrade(avg);
		return avg;
	}

	boolean isAnswerAboveExpecation(double avg) {
		if (avg > 50) {
			System.out.println(" Avarage is greater than 50 ");
			Example2StaticNonStatic.isEligible(avg);
			return true;
		} else {
			System.out.println(" Avarage is Less than 50 ");
			Example2StaticNonStatic.isEligible(avg); 
			return false;
		}
	}

	static boolean isEligible(double avg) {
		if (avg > 50 || (avg % 2) == 0) {
			System.out.println(" Candidate is Eligible ");
			getYourGrade(avg);
			return true;
		}
		System.out.println(" Candidate is Not Eligible ");
		getYourGrade(avg);
		return false;
	}

	static String getYourGrade(double avg) {
		// isEligible(avg);
		if (avg > 80) {
			System.out.println(" Candidate obtained A Grade ");
			return " Candidate obtained A Grade ";
		} else {
			System.out.println(" Candidate obtained B Grade ");
			return "Candidate obtained B Grade";
		}
	}

	public static void main(String[] args) {
		Example2StaticNonStatic ex2 = new Example2StaticNonStatic();
		// ex2.sum(10,20,30);
		System.out.println("--------------- Input 1 --------------------");
		double A1 = ex2.average(10, 20, 30);
		ex2.isAnswerAboveExpecation(A1);
		System.out.println("--------------- Input 2 --------------------");
		Example2StaticNonStatic ex3 = new Example2StaticNonStatic();
		double A2 = ex3.average(50, 20, 20);
		ex2.isAnswerAboveExpecation(A2);
	}
}
