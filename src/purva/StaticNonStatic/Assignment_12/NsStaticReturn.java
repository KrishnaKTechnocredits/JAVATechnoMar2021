package purva.StaticNonStatic.Assignment_12;

public class NsStaticReturn {
	
	int answer;
	
	/*double sum(double number1, double number2, double number3){
		double sumAnswer = number1 + number2 + number3;
		return sumAnswer;
		}*/
	
	double sumAverage(double number1, double number2, double number3) {
		double sumAnswer = number1 + number2 + number3;
		double avgAnswer = sumAnswer/3;
		
		return avgAnswer;
	}
	
	boolean isAnswerAboveExpectation(double returnavgAnswer)
	{
		if(returnavgAnswer == 50) 
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double avgAnswer) 
	{
		if (avgAnswer == 50 || avgAnswer%2==0) {
			System.out.println("Candidate is eligible");
			return true;
		}
		else
			return false;
		
	}
	
	static String getYourGrade(double avgAnswer) 
	{
		if(avgAnswer >=80) 
		{
			System.out.println("candidate obtained grade A");
			return "A grade";
			
		 }
		else 
		{
			System.out.println("candidate obtained grade B");
			return "B grade";
		 }
		
	  }
	public static void main(String[] args) {
		NsStaticReturn nsStaticReturn = new NsStaticReturn();
		double avg = nsStaticReturn.sumAverage(10,20,30);
		nsStaticReturn.isAnswerAboveExpectation(avg);
		isEligible(avg);
		getYourGrade(avg);
		
		NsStaticReturn nsStaticReturn1 = new NsStaticReturn();
		double avg1 = nsStaticReturn1.sumAverage(80,90,70);
		nsStaticReturn.isAnswerAboveExpectation(avg);
		isEligible(avg1);
		getYourGrade(avg1);
		
	}
}