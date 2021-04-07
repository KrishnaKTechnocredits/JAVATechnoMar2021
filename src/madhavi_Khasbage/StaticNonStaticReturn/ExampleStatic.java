package madhavi_Khasbage.StaticNonStaticReturn;
/*Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer
2) Method average()- non static method, accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation() - non static method, take one parameter
 (answer which you received from average method)
 and return true if value is more then 50 else false.
4) Method isEligible() - static method,take one parameter 
(answer which you received from average method) return true if value is more then 50 or
 divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade() - static method, take one parameter 
(answer which you received from average method) return
 "A Grade" if average is more then 80 else "B grade", main method will print grade received 
 from getYourGrade() method.
Sample input1 : 
10,20,30
Sample output1 : 
Candidate is Eligible
Candidate obtained B grade.
*/

public class ExampleStatic {
	
	double sum(double num1,double num2,double num3) {		
		double total=num1+num2+num3;			
		return total; 
	}
	
	double average(double num1,double num2,double num3) {		
		double avg=(sum(num1,num2,num3))/3;			
		return avg;
	}
	
	boolean isAnswerAboveExpecation(double avg) {		
		boolean  status=false;
		if(avg>50) {
			status=true;
		}		
		return status;
	}
	
	static boolean isEligible(double avg) {		
		boolean  status=false;		
		if((avg>50) || (avg%2==0)) {
			status=true;			
		}		
		return status;
	}
	
	static String getYourGrade(double avg) {		
		String grade;
		if(avg>80) {
			grade="A Grade";
		}else {
			grade="B Grade";
		}
		return grade;
	}
	
	void getResult(int numOfCandidate,double num1, double num2, double num3) {
		System.out.println("Sample input "+ numOfCandidate + ":\n" + num1 + " " + num2 + " " + num3);
		System.out.println("Sample output "+ numOfCandidate  +":");
		double totalAverage= average(num1,num2,num3);
		if(ExampleStatic.isEligible(totalAverage))
		{
			System.out.println("Candidate is eligible");
			System.out.println("Candidate obtained "+ ExampleStatic.getYourGrade(totalAverage));				
		}else {
			System.out.println("Candidate is not eligible");		 	
		}
		System.out.println("=====================================================================");
	}

	public static void main(String args[]) {		
		ExampleStatic estatis1= new ExampleStatic();	
		estatis1.getResult(1,40,40,60);
		estatis1.getResult(2,45,80,75);
	}	
}

