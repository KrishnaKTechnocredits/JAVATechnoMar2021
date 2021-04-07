package krishna.Assignment12;
//Design to test static, non static, return type concepts.
public class ReturnConcept {
	//double summation;
	double sum(double a, double b, double c){
		double summation = (a + b + c);
		//System.out.println("Sum of 3 numbers a,b,c is :"+summation);
		return summation;
	}
	
	double average(double a, double b, double c) {
		double summation =sum(a, b, c);
		double avg = (summation/3);
		//System.out.println("Average is :"+avg);
		return avg;
	}
	
	boolean isAnswerAboveExpecation(double avg) {
		if(avg>50) {
			return true;
		}else {
			return false;
		}
		 
	}
	
	 static boolean isEligible(double avg) {
		if(avg>50 || avg%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	static String getYourGrade(double avg) {
		if (avg>80) {
			return "A Grade";
		}else {
			return "B grade";
		}
	}
	public static void main(String[] args) {
		ReturnConcept returnConcept = new ReturnConcept();
		double avg =returnConcept.average(90,90,90);
		boolean aboveExpectation =returnConcept.isAnswerAboveExpecation(avg);
		boolean eligible =isEligible(avg);
		
		if(eligible == true) {
			System.out.println("Candidate is Eligible");
		}
		
		String grade =getYourGrade(avg);
		System.out.println("Candidate obtained "+grade);
		}

}
