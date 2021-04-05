package mayur.assignment12;

public class StaticNonStaticReturnTypeConcept {

		double sum(double a, double b, double c){
			
			double sum = a+b+c;
			System.out.println("Sum of three numbers is: " +sum);
			return sum;	
		}

		double average(double a, double b, double c) {
			
			double average= (a+b+c)/3;
			System.out.println("Average of three numbers is: " +average);
			return average;
		}

		boolean isAnswerAboveExpecation(double averageValue){
			
			if (averageValue > 80)
				return true;
			else
				return false;
		}
 
		static boolean isEligible(double averageValue) {
			
			if (averageValue > 80 || averageValue%2 == 0) {
				
				System.out.println("Candidate is Eligible");
				return true;
			}
			
			else {
				
				System.out.println("Candidate is not Eligible");
				return false;
			}
		}

		static String getYourGrade(double averageValue) {
			
			if (averageValue > 80) 
				return "A grade";
			else
				return "B grade";

		}
		public static void main(String[] args) {
			
			StaticNonStaticReturnTypeConcept sns = new StaticNonStaticReturnTypeConcept();
			double averageValue = sns.average(70,60,50);
			sns.isAnswerAboveExpecation(averageValue);
			sns.isEligible(averageValue);
			System.out.println("Candidate obtain "+ sns.getYourGrade(averageValue));
			averageValue = sns.average(90,80,70);
			sns.isEligible(averageValue);
			System.out.println("Candidate obtain " +sns.getYourGrade(averageValue));
		}
	}

