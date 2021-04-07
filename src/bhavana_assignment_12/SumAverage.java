package bhavana_assignment_12;

public class SumAverage {
	
	double sum(double num1,double num2) {
		double answer=num1+num2;
		return answer;
	}
	
	double average(double sumReturn) {
		return sumReturn/2;
	}
	
	boolean isAnswerAboveExpectation(double averageReturnAns) {
		if(averageReturnAns>50) 
			return true;
		else 
			return false;
	}

	static boolean isEligible(double avgReturn) {
		if(avgReturn>50||avgReturn%2==0) 
			System.out.println("Candidate is eligible");
			return true;
		
	}
	
	static String getYourGrade(double avgReturn) {
		if(avgReturn>80) {
			System.out.println("Candidate got Grade A");
			return "Grade A";
		}	
		else {
			System.out.println("Candidate got grade B");
			return "Grade B";
		}
	}
	
	public static void main(String[] args) {
		SumAverage sa=new SumAverage();
		double sumReturn=sa.sum(90, 20);
		double avgReturn=sa.average(sumReturn);
		sa.isAnswerAboveExpectation(avgReturn);
		isEligible(avgReturn);
		getYourGrade(avgReturn);
	}
}

