package dipali;

public class TestReturnType {
	
	public double sum(double num1 , double num2,double num3) {
		double answer=num1+num2+num3;
		return answer;
	}
	
	public double average(double num1 , double num2,double num3) {
		double answer=sum(num1,num2,num3);
		return answer;
	}
	
	public boolean isAnswerAboveExpectation(double answer) {
		if(answer>50)
			return true;
		else
			return false;
	}
	
	public static boolean isEligible(double answer) {
		TestReturnType testreturntype=new TestReturnType();
		boolean val=testreturntype.isAnswerAboveExpectation(answer);
		if(val || (answer/2==0)) {
			System.out.println("Candidate is Eligible ");
			return true;
		}
		else {
			System.out.println("Candidate is not Eligible ");
			return false;
			}
	}
	
	public static String getyourGrade(double answer) {
		if(answer>80) {
			System.out.println("Candidate obtained A Grade ");
			return "A Grade";	
		}else {
			System.out.println("Candidate obtained B Grade ");
			return "B Grade";	
		}	
	}
	
	

	public static void main(String[] args) {
		TestReturnType testreturntype=new TestReturnType();
		double answer =testreturntype.average(10,20,30);
		TestReturnType.isEligible(answer);
		TestReturnType.getyourGrade(answer);
		
		TestReturnType testreturntype1=new TestReturnType();
		double answer1 =testreturntype1.average(50,20,20);
		TestReturnType.isEligible(answer1);
		TestReturnType.getyourGrade(answer1);
	}
}
