package sangeeta;

public class StaticNonStaticConcepts {
	
	double sum(double x, double y, double z) {
		double answer = x+y+z;
		return answer;
	}
	
	double average() {
		double sum = sum(10,20,30);
		double answer = sum/3;
		return answer;
	}
	
	boolean isAnswerAboveExpectation() {
		double answer = average();
		if(answer > 50) {
			return true;
		} else 
			return false;
	}
	
	static boolean isEligible() {
		StaticNonStaticConcepts staticNonStaticConcepts = new StaticNonStaticConcepts();
		double answer = staticNonStaticConcepts.average();
		if(answer > 50 || answer%2 == 0)
			return true;
			return false;
	}
	
	static String getYourGrade() {
		StaticNonStaticConcepts staticNonStaticConcepts = new StaticNonStaticConcepts();
		double answer = staticNonStaticConcepts.average();
		if(answer > 80)
			return "A Grade";
		else
			return "B Grade";
	}
	
	public static void main(String[] a) {
		StaticNonStaticConcepts staticNonStatic = new StaticNonStaticConcepts();
		staticNonStatic.average();
		staticNonStatic.isAnswerAboveExpectation();
		boolean Eligibility = isEligible();
		if(Eligibility == true)
			System.out.println(" Candidate is Eligible");
		else
			System.out.println(" Candidate is not Eligible");
		String Grade = getYourGrade();
		if(Grade.equals("A Grade"))
			System.out.println(" Candidate obtained " +Grade);
		else
			System.out.println(" Candidate obtained " +Grade);
		
	}
	

}