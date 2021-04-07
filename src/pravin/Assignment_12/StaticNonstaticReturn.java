/*Assignment_12
 * Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received 
from average method) and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) 
return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) 
return "A Grade" if average is more then 80 else "B grade", main method will print grade received from 
getYourGrade() method.

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

Note : Sum method should not be called from main method, it should be called from Average method 
(think about code reusability).
 */
	package pravin.Assignment_12;
	public class StaticNonstaticReturn {
		double sum(double num1,double num2,double num3) {
			double Totalsum = num1+num2+num3;
			return Totalsum;
		}
		double average(double Totalsum) {
			double Totalavg = (Totalsum)/3;
			return Totalavg;		
		}
		boolean isAnswerAboveExpecation(double Totalavg) {
			if(Totalavg>50) {
				return true;
			}else 
				return false;	
		}
	
		static boolean isEligible (double Totalavg) {
			if((Totalavg>50) || (Totalavg/2==0 )) {
				System.out.println("Candidate is eligible");
				return true;
			}else 
				System.out.println("Candidate is eligible");			
			return false;	
		}
		static String getYourGrade (double Totalavg) {
			if(Totalavg>80)  {
				System.out.println("Candidate obtained A grade");
				return "A Grade";
			}else 
				System.out.println("Candidate obtained B grade");
			return "B Grade";
		}
		public static void main (String[]args) {
			StaticNonstaticReturn staticNonstaticReturn = new StaticNonstaticReturn();
			double sum = staticNonstaticReturn.sum(70, 90, 90);
			double avg = staticNonstaticReturn.average(sum);
			staticNonstaticReturn.isAnswerAboveExpecation(avg);
			isEligible(avg);
			getYourGrade(avg);
		}
	}
