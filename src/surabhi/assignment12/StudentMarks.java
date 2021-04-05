package surabhi.assignment12;

public class StudentMarks {

		double sum(double num1, double num2, double num3) {
			return num1+num2+num3;
		}
		
		double average(double num1, double num2, double num3) {
			return sum(num1, num2, num3)/3;
		}
		
		boolean isAnswerAboveExpecation(double avg) {
			if(avg>=50) {
				return true;
			}else {
				return false;
			}

		}
		
		static boolean isEligible(double avg) {
			if(avg>=50 || avg%2==0) {
				return true;
			}else
				return false;		
		}
		
		static String getYourGrade(double avg) {
			
			if(avg>=80) {
				return "A Grade";
			}else if(avg>=50) {
				return "B Grade";	
			}
			return " ";
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks studentMarks=new StudentMarks();
		double avg=studentMarks.average(90, 60, 90);
		
		//can avoid calling isAnswerAboveExpecation to reduce complexity. we can acheive same output.
		if(studentMarks.isAnswerAboveExpecation(avg)) {
			if(isEligible(avg)) {
				System.out.println("Candidate is Eligible");
			}else {
				System.out.println("Candidate is not Eligible");
			}
		}else {
			System.out.println("Average Mark is less than 50");
		}
		String grade=getYourGrade(avg);
		if(!grade.equals(" ")) {
			System.out.println("Candidate obtained " +grade);
		}
	}

}
