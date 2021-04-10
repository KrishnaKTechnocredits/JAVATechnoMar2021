package milind.Assignment_12;

public class TestStaticNonStatic {
	double sum(double num1, double num2, double num3) {
		double sum= num1+num2+num3;
		return sum;
	}
	double avarage(double num1, double num2, double num3) {
		double totalVal = sum(num1,num2,num3);
		double avarage=totalVal/3;
		System.out.println(avarage);
		return avarage;
	}
	
	boolean isAnsAboveExpecation(double num) {
		if(num>50) {
			return true;
		}
		return false;
	}
	
	static String isEligible(double num) {
		if(num>50 && num%2==0) {
			String elegMessage = "Candidate is Eligible";
			return elegMessage;
		}
		String elegMessage="Candidate is not Eligible";
		return elegMessage;
	}
	
	static String getYourGrade(double num) {
		if(num>80) {
			String grade = " Grade A";
			return grade;
		}
		String grade = "Grade B";
		return grade;
	}
	public static void main(String[] args) {
		TestStaticNonStatic testStaticNonStatic=new TestStaticNonStatic();
		double avarage=testStaticNonStatic.avarage(90,90,90);
		testStaticNonStatic.isAnsAboveExpecation(avarage);
		System.out.println(getYourGrade(avarage));
		System.out.println(isEligible(avarage));
	}
}
