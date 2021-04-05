package radha.Assigment12;

public class Assignment12 {
	
	double sum(double num1, double num2, double num3) {
		double sum = num1+num2+num3;
		return sum;
	}
	
	double average(double num1, double num2, double num3) {
		double sum2 = sum(num1,num2,num3);
		double answer = sum2/3;
		System.out.println("Average is: "+answer);
		return answer;
	}
	
	boolean isAnswerAboveExpectation(double answer) {
		if(answer>50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double answer) {
		if((answer>50) || (answer%2==0)) {
			System.out.println("Candidate is Eligible.");
			return true;
		}
		else {
			System.out.println("Candidate is not Eligible.");
			return false;
		}
	}
	
	static String getYourGrade(double answer) {
		if(answer>80) 
			return "A grade";
		else			
			return "B grade";	
	}
	
	public static void main(String[] args) {
		System.out.println("Candidate Grade & Eligibility is - ");
		Assignment12 assignment12 = new Assignment12();              //object1
		double answer = assignment12.average(10, 20, 30);
		//boolean isAboveExpectation = assignment12.isAnswerAboveExpectation(answer);
		isEligible(answer);
		String grade = Assignment12.getYourGrade(answer);
		System.out.println("Candidate obtained "+grade);
		System.out.println();
		
		System.out.println("Candidate Grade & Eligibility is - ");
		Assignment12 assign = new Assignment12();					//object2
		double answer1 = assign.average(80, 85, 90);
		isEligible(answer1);
		String grade1 = Assignment12.getYourGrade(answer1);
		System.out.println("Candidate obtained "+grade1);		
	}
}
