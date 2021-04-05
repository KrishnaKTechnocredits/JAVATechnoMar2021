package komal.assignment_12;

public class ReturnTypeConcept {
	double sum(double x, double y, double z){
			return(x+y+z);
		}

		double average(double x, double y, double z) {
			return sum(x,y,z)/3;
		}

		boolean isAnswerAboveExpecation(double averageValue){
			if (averageValue>50)
				return true;
			else
				return false;
		}

		static boolean isEligible(double averageValue) {
			if (averageValue > 50 || averageValue%2 == 0) {
				System.out.println("Candidate is Eligible");
				return true;
			}else {
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
			ReturnTypeConcept returnTypeConcept = new ReturnTypeConcept();
			double averageValue = returnTypeConcept.average(10,20,30);
			returnTypeConcept.isAnswerAboveExpecation(averageValue);
			ReturnTypeConcept.isEligible(averageValue);
			System.out.println("Candidate obtain "+ReturnTypeConcept.getYourGrade(averageValue));
			averageValue = returnTypeConcept.average(150,20,120);
			ReturnTypeConcept.isEligible(averageValue);
			System.out.println("Candidate obtain "+ReturnTypeConcept.getYourGrade(averageValue));
		}
	}
