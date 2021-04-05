package komal.assignment_12;
/*AssignmentNo_12 
Design to test static, non static, return type concepts.
1) Method sum() - non static method, accept 3 parameters of type double & return answer
2) Method average()- non static method, accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received 
    from average method) and return true if value is more then 50 else false.
4) Method isEligible() - static method,take one parameter (answer which you received from average method)
   return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade() - static method, take one parameter (answer which you received from average 
   method) return "A Grade" if average is more then 80 else "B grade", main method will print grade 
   received from getYourGrade() method.
Sample input1 : 
10,20,30
Sample output1 : 
Candidate is Eligible
Candidate obtained B grade.
Sample input2 : 
50,20,20
Sample output2 : 
Candidate is Eligible
Candidate obtained A grade.
Note : Sum method should not be called from main method, it should be called from Average method (think about code reusability).
*/

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
			if (averageValue > 50 || averageValue/2 == 0) {
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
