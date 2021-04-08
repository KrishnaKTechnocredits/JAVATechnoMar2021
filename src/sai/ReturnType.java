package sai;

public class ReturnType {

		double sum(double num1, double num2, double num3){
				
			double total = num1+num2+num3;
			return total;
		}
		
		double average(double num1, double num2, double num3){

			double avg  = (num1+num2+num3)/3;
			return avg;
		}
		
		boolean isAnswerAboveExpecation(double avg){
			if(avg>50){
				return true;
			}
			else
				return false;
		}
		
		static boolean isEligible(double avg){
			if(avg>50 || avg%2==0){
				System.out.println("Candidate is eligible");
				return true;
			}
			else{
				System.out.println("Candidate is not eligible");
				return false;
			}
		}
		
		static String getYourGrade(double avg){
			if(avg>=80)
				return "A Grade";
			else
				return "B Grade";
			
		}
		
		public static void main(String[] args){
			
		ReturnType returntype = new ReturnType();
		double avg = returntype.sum(50,60,70);
		returntype.isAnswerAboveExpecation(avg);
		returntype.isEligible(avg);
		System.out.println(returntype.getYourGrade(avg));
		
		ReturnType returntype1 = new ReturnType();
		double avg1 = returntype1.sum(10,20,30);
		returntype1.isAnswerAboveExpecation(avg1);
		returntype1.isEligible(avg1);
		System.out.println(returntype1.getYourGrade(avg1));
		
		}
}
