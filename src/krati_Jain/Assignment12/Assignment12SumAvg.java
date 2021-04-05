package krati_Jain.Assignment12;

public class Assignment12SumAvg {
	
	double sum(double num1, double num2, double num3) {
		double sumResult = num1 + num2 + num3;
		//System.out.println("Sum " + sumResult);
		return sumResult;
	}
	
	double  average(double num1, double num2, double num3) {
		Assignment12SumAvg assignment12SumAvg = new Assignment12SumAvg();
		double avgResult = ((assignment12SumAvg.sum(num1, num2, num3))/3);
		//System.out.println("Average " + avgResult);
		return avgResult;
	}
	
	boolean isAnswerAboveExpecation(double checkingExpectation) {
		if (checkingExpectation > 50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double eligibilityCheck) {
		//System.out.println("checking divide 2 or not " +  eligibilityCheck%2);
		Assignment12SumAvg assignment12SumAvg = new Assignment12SumAvg();
		boolean eligibilityFlag = assignment12SumAvg.isAnswerAboveExpecation(eligibilityCheck);
		if (eligibilityFlag || (eligibilityCheck%2)==0)
			return true;
		else
			return false;		
	}
	
	static String getYourGrade(double gradeCheck) {
		if (gradeCheck > 80)
			return "A grade";
		else
			return "B grade";
	}
	
	public static void main(String[] args) {
		Assignment12SumAvg assignment12SumAvg = new Assignment12SumAvg();
		double finalAverage = assignment12SumAvg.average(60, 3, 64);
		
		if (Assignment12SumAvg.isEligible(finalAverage))
			System.out.println("Candidate is Eligible");
		else	
			System.out.println("Candidate is Not Eligible");
		
		String gradeCheck = Assignment12SumAvg.getYourGrade(finalAverage);
		System.out.println("Candidate obtained " + gradeCheck);
	}
		
}
