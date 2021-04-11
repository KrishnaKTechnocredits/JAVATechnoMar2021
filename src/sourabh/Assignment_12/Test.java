package sourabh.Assignment_12;

public class Test {
	
	double sum(double firstNumber, double secondNumber, double thirdNumber) {
		double totalNumber=firstNumber+secondNumber+thirdNumber;
		return totalNumber;
	}
	double average(double firstNumber, double secondNumber, double thirdNumber) {
		Test test= new Test();
		double averageAns= test.sum(firstNumber, secondNumber, thirdNumber)/3;
		System.out.println("The Average is : "+averageAns);
		return averageAns;
	}
	boolean isAnswerAboveExpecation(double averageAns){
		if(averageAns>50)
			return true;
		else
			return false;
	}
	static String isEligible(double averageAns) {
		String candidate;
		if(averageAns>50 || averageAns %2==0) {
			candidate ="Eligible";
		}
		else
			candidate ="Not Eligible";
		return candidate;
	}
	static String getYourGrade(double averageAns) {
		if (averageAns>80)
			return "A Grade";
		else
			return "B Grade";
	}
	public static void main(String[] args) {
		Test test= new Test();
		double averageAns= test.average(10, 30, 30);
		test.isAnswerAboveExpecation(averageAns);
		System.out.println("Candidate is "+Test.isEligible(averageAns));
		System.out.println("Candidate obtained "+Test.getYourGrade(averageAns));				
	}
}
